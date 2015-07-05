package jd03.lab07.database.dao;

import jd03.lab07.database.pool.ConnectionPool;
import jd03.lab07.database.pool.DBUtils;
import jd03.lab07.entity.Receiver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReceiversDAOImpl implements ReceiversDAO {

    @Override
    public Receiver getReceiver(int num) {
        String query = "SELECT * FROM receivers WHERE num = ?";
        Receiver receiver = null;
        Connection connection = null;
        PreparedStatement pStatement = null;
        ResultSet resultSet = null;
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        try {
            connection = connectionPool.getConnection();
            pStatement = connection.prepareStatement(query);
            pStatement.setInt(1, num);
            resultSet = pStatement.executeQuery();
            while (resultSet.next()) {
                receiver = new Receiver(resultSet.getInt("num"), resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(connection, pStatement, resultSet);
        }
        return receiver;
    }

    @Override
    public List<Receiver> getReceivers() {
        String query = "SELECT * FROM receivers";
        List<Receiver> receivers = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        try {
            connection = connectionPool.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Receiver receiver = new Receiver(resultSet.getInt("num"), resultSet.getString("name"));
                receivers.add(receiver);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(connection, statement, resultSet);
        }
        return receivers;
    }

    @Override
    public int addReceiver(Receiver receiver) {
        int num = receiver.getNum();
        String query = "INSERT INTO receiver (num, name) VALUES (?, ?)";
        Connection connection = null;
        PreparedStatement pStatement = null;
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        try {
            connection = connectionPool.getConnection();
            pStatement = connection.prepareStatement(query);
            pStatement.setInt(1, num);
            pStatement.setString(2, receiver.getName());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(connection, pStatement);
        }
        return receiver.getNum();
    }
}
