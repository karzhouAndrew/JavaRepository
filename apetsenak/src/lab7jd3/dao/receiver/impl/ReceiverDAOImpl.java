package lab7jd3.dao.receiver.impl;


import lab7jd3.dao.receiver.ReceiverDAO;
import lab7jd3.entities.Receiver;
import lab7jd3.utils.DBUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReceiverDAOImpl implements ReceiverDAO {
    private static final String SQL_INSERT_RECEIVER = "INSERT INTO receivers (id,name) VALUES(?,?)";
    private static final String SQL_GET_RECEIVERS = "SELECT * FROM receivers";

    @Override
    public void addReceiver(Receiver receiver) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT_RECEIVER);
            preparedStatement.setInt(1, receiver.getID());
            preparedStatement.setString(2, receiver.getName());
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(preparedStatement, connection);
        }
    }

    @Override
    public List<Receiver> getReceivers() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<Receiver> receivers = null;
        try {
            connection = DBUtils.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL_GET_RECEIVERS);
            receivers = initReceivers(resultSet);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(statement, resultSet, connection);
        }
        return receivers;
    }

    private List<Receiver> initReceivers(ResultSet resultSet) {
        List<Receiver> receivers = new ArrayList<>();
        try {
            while (resultSet.next()) {
                Receiver receiver = new Receiver();
                receiver.setID(resultSet.getInt("id"));
                receiver.setName(resultSet.getString("name"));
                receivers.add(receiver);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return receivers;
    }
}
