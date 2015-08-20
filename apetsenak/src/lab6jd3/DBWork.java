package lab6jd3;


import java.sql.*;

public class DBWork {
    private String login;
    private String password;
    private String dbURL;

    public DBWork(String login, String password, String dbURL) {
        this.login = login;
        this.password = password;
        this.dbURL = dbURL;
    }

    private String processSelectRequest(String query) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        StringBuilder result = new StringBuilder();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL, login, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            result = processResult(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            close(resultSet, statement, connection, null);
        }
        return result.toString();
    }

    private void close(ResultSet resultSet, Statement statement, Connection connection, PreparedStatement preparedStatement) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {

            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private StringBuilder processResult(ResultSet resultSet) throws SQLException {
        StringBuilder result = new StringBuilder();
        while (resultSet.next()) {
            result.append(resultSet.getString("name"));
            result.append("\t");
            result.append(resultSet.getDate("paydate"));
            result.append("\t");
            result.append(resultSet.getDouble("value"));
            result.append("\n");
        }
        return result;
    }

    public void addRecord(int paymentID, String payDate, int receiverID, double value) {
        String query = "INSERT INTO costs(payment_id, paydate, receiver_id, value) " +
                "VALUES(?,?,?,?)";
        processUpdateRequest(query, paymentID, payDate, receiverID, value);
    }

    private void processUpdateRequest(String query, int paymentID, String payDate, int receiverID, double value) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL, login, password);
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, paymentID);
            preparedStatement.setString(2, payDate);
            preparedStatement.setInt(3, receiverID);
            preparedStatement.setDouble(4, value);
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(null, null, connection, preparedStatement);
        }
    }

    public String showTable() {
        String query = "SELECT name,paydate,value FROM receivers, costs WHERE receiver_id=id;";
        return processSelectRequest(query);
    }
}
