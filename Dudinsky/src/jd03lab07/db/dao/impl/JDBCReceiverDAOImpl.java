package jd03lab07.db.dao.impl;

import jd03lab07.db.dao.ReceiverDAO;
import jd03lab07.db.pool.ConnectionPool;
import jd03lab07.entities.Receiver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCReceiverDAOImpl implements ReceiverDAO {

    private static final String SELECT_RECEIVER_TEMPLATE = "SELECT * FROM receivers WHERE num = ?";
    private static final String NUM_COLUMN_LABEL = "num";
    private static final String NAME_COLUMN_LABEL = "name";
    private static final String SELECT_ALL_QUERY = "SELECT * FROM receivers";
    private static final String INSERT_QUERY_TEMPLATE = "INSERT INTO receivers (num, name) VALUES(?,?)";

    @Override
    public Receiver retrieveReceiver(final int num) {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Receiver receiver = null;
        try (
                Connection connection = connectionPool.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_RECEIVER_TEMPLATE);
        ) {
            preparedStatement.setInt(1, num);
            ResultSet resultSet = preparedStatement.executeQuery();
            receiver = initReceiver(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return receiver;
    }

    private Receiver initReceiver(ResultSet resultSet) throws SQLException {
        Receiver receiver = new Receiver();
        if (resultSet.next()) {
            receiver.setNum(resultSet.getInt(NUM_COLUMN_LABEL));
            receiver.setName(resultSet.getString(NAME_COLUMN_LABEL));
        }
        return receiver;
    }

    @Override
    public List<Receiver> retrieveAllReceivers() {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        List<Receiver> receivers = null;
        try (
                Connection connection = connectionPool.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(SELECT_ALL_QUERY)
        ) {
            receivers = initAllReceivers(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return receivers;
    }

    private List<Receiver> initAllReceivers(ResultSet resultSet) throws SQLException {
        List<Receiver> receivers = new ArrayList<>();
        while (resultSet.next()) {
            Receiver receiver = new Receiver();
            receiver.setNum(resultSet.getInt(NUM_COLUMN_LABEL));
            receiver.setName(resultSet.getString(NAME_COLUMN_LABEL));
            receivers.add(receiver);
        }
        return receivers;
    }

    @Override
    public int insertReceiver(final Receiver receiver) {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        int rowsAffected = 0;
        try (
                Connection connection = connectionPool.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY_TEMPLATE);
        ) {
            preparedStatement.setInt(1, receiver.getNum());
            preparedStatement.setString(2, receiver.getName());
            rowsAffected = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }
}