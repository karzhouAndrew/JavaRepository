package jd3task7.dao.impl;

import jd3task7.dao.ReceiverDAO;
import jd3task7.dao.pool.ConnectionPool;
import jd3task7.dbutil.DBUtils;
import jd3task7.entity.Receiver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Master on 02.07.2015.
 */
public class JDBCReceiverDAOImpl implements ReceiverDAO {
    private static final String SQL_INSERT_RECEIVER = "INSERT INTO receivers (num, name) values (?,?)";
    private static final String SQL_GET_RECEIVERS = "SELECT * FROM receivers";


    public List<Receiver> getReceivers() throws ClassNotFoundException {
        List<Receiver> receivers = null;
        Connection connection = null;
        ConnectionPool connectionPool = new ConnectionPool();
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = connectionPool.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL_GET_RECEIVERS);
            receivers = initReceivers(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(statement, resultSet, connection);
        }
        return receivers;
    }

    private List<Receiver> initReceivers(ResultSet resultSet) throws SQLException {
        List<Receiver> receivers = new ArrayList<Receiver>();
        while (resultSet.next()) {
            Receiver receiver = new Receiver();
            receiver.setNum(resultSet.getInt(1));
            receiver.setName(resultSet.getString(2));
            receivers.add(receiver);
        }
        return receivers;
    }

    public void addReceiver(Receiver receiver) throws ClassNotFoundException {
        Connection connection = null;
        ConnectionPool connectionPool = new ConnectionPool();
        PreparedStatement preparedStatement = null;

        try {
            connection = connectionPool.getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT_RECEIVER);
            preparedStatement.setInt(1, receiver.getNum());
            preparedStatement.setString(2, receiver.getName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(preparedStatement, connection);
        }
    }

}
