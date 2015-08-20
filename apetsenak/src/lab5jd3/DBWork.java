package lab5jd3;


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

    private String processRequest(String query, boolean isSelectQuery) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        StringBuilder result = new StringBuilder();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL, login, password);
            statement = connection.createStatement();
            if (isSelectQuery) {
                resultSet = statement.executeQuery(query);
                result = processResult(resultSet);
            } else {
                statement.executeUpdate(query);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            close(resultSet, statement, connection);
        }
        return result.toString();
    }

    private void close(ResultSet resultSet, Statement statement, Connection connection) {
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
                "VALUES(" + paymentID + ",'" + payDate + "'," + receiverID + "," + value + ")";
        processRequest(query, false);
    }

    public String showTable() {
        String query = "SELECT name,paydate,value FROM receivers, costs WHERE receiver_id=id;";
        return processRequest(query, true);
    }
}
