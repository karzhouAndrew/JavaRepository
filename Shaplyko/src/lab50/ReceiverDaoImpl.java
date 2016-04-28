package lab50;

import java.sql.*;
import java.util.ArrayList;

public class ReceiverDaoImpl implements ReceiverDao {
    public static final String SQL_INSERT_RECEIVER = "INSERT INTO receivers (num, receiver) VALUES (?,?)";
    public static final String SQL_GET_RECEIVERS = "SELECT * FROM receivers";
    public static final String SQL_GET_RECEIVER = "SELECT * FROM receivers WHERE num=";

    @Override
    public Receiver getReceiver(int num) throws ClassNotFoundException {
        Receiver receiver = null;
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = connectionPool.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL_GET_RECEIVER + num);
            receiver = initReceiver(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(statement, resultSet, connection);
        }
        return receiver;
    }

    @Override
    public ArrayList<Receiver> getReceivers() throws ClassNotFoundException {
        ArrayList<Receiver> receivers = null;
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Connection connection = null;
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

    @Override
    public void addReceiver(Receiver receiver) throws ClassNotFoundException {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = connectionPool.getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT_RECEIVER);
            preparedStatement.setInt(1, receiver.getNum());
            preparedStatement.setString(2, receiver.getReceiver());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(preparedStatement, connection);
        }
    }

    private ArrayList<Receiver> initReceivers(ResultSet resultSet) throws SQLException {
        ArrayList<Receiver> receivers = new ArrayList<Receiver>();
        while (resultSet.next()) {
            Receiver receiver = new Receiver();
            receiver.setNum(resultSet.getInt(1));
            receiver.setReceiver(resultSet.getString(2));
            receivers.add(receiver);
        }
        return receivers;
    }

    private Receiver initReceiver(ResultSet resultSet) throws SQLException {
        Receiver receiver = new Receiver();
        while (resultSet.next()) {
            receiver.setNum(resultSet.getInt(1));
            receiver.setReceiver(resultSet.getString(2));
        }
        return receiver;
    }
}

