package jd3Task6.DAO.impl;

import jd3Task6.DAO.ReceiverDAO;
import jd3Task6.DTO.Receiver;
import jd3Task6.connection.ConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReceiverDAOImp implements ReceiverDAO {
    public static final String SQL_INSERT_TEMPLATE = "INSERT INTO RECEIVERS (NAME) VALUES (?);";
    public static final String SQL_SELECT = "SELECT * FROM RECEIVERS;";
    public static final String SQL_SELECT_ID = "SELECT * FROM RECEIVERS WHERE ID=?;";


    @Override
    public void addReceiver(Receiver receiver) {
        try (Connection connection = ConnectionPool.getInstance().getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT_TEMPLATE);
            preparedStatement.setString(1, receiver.getName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Receiver> obtainReceivers() {
        List<Receiver> receivers = null;
        try (Connection connection = ConnectionPool.getInstance().getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT);
            receivers = initReceivers(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return receivers;
    }

    @Override
    public Receiver obtainReceiver(int id) throws IndexOutOfBoundsException {
        List<Receiver> receivers = null;
        try (Connection connection = ConnectionPool.getInstance().getConnection()) {
            PreparedStatement prStatement = connection.prepareStatement(SQL_SELECT_ID);
            prStatement.setInt(1, id);
            ResultSet result = prStatement.executeQuery();
            receivers = initReceivers(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return receivers.get(0);
    }

    public List<Receiver> initReceivers(ResultSet resultSet) throws SQLException {
        List<Receiver> receivers = new ArrayList<>();
        while (resultSet.next()) {
            Receiver receiver = new Receiver();
            receiver.setID(resultSet.getInt("ID"));
            receiver.setName(resultSet.getString("NAME"));
            receivers.add(receiver);
        }
        return receivers;
    }
}
