package jd03.lab07.database.dao;

import jd03.lab07.database.pool.ConnectionPool;
import jd03.lab07.entity.Receiver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReceiversDAOImpl implements ReceiversDAO {

    @Override
    public Receiver getReceiver(int num) {
        Receiver receiver = null;
        String query = "SELECT * FROM receivers WHERE num = " + num;

        ConnectionPool connectionPool = ConnectionPool.getInstance();
        try (Connection connection = connectionPool.getConnection();
             PreparedStatement pStatement = connection.prepareStatement(query);
             ResultSet resultSet = pStatement.executeQuery()) {
            while (resultSet.next()) {
                receiver = new Receiver(resultSet.getInt("num"),
                        resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return receiver;
    }

    @Override
    public List<Receiver> getReceivers() {
        List<Receiver> receivers = new ArrayList<>();
        String query = "SELECT * FROM receivers";

        ConnectionPool connectionPool = ConnectionPool.getInstance();
        try (Connection connection = connectionPool.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Receiver receiver = new Receiver(resultSet.getInt("num"),
                        resultSet.getString("name"));
                receivers.add(receiver);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return receivers;
    }

    @Override
    public int addReceiver(Receiver receiver) {
        int num = receiver.getNum();
        String name = receiver.getName();
        String query = "INSERT INTO receivers (num, name) VALUES (" + num + ", " + "'" + name + "'" + ")";
        System.out.println(query);

        ConnectionPool connectionPool = ConnectionPool.getInstance();
        try (Connection connection = connectionPool.getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return num;
    }
}
