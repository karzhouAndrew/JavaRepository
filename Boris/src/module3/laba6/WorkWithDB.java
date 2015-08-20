package module3.laba6;


import java.sql.*;

public class WorkWithDB {
    private String login;
    private String password;
    private String bdURL;
    private Date paydate;
    private int receiver;
    private double value;

    public WorkWithDB(String login, String password, String bdURL) {
        this.login = login;
        this.password = password;
        this.bdURL = bdURL;
    }

    public StringBuilder seeTable() {
        String query = "SELECT paydate, value, name\n" +
                "FROM expenses, receivers r\n" +
                "WHERE receiver = r.num";
        return getResultSelect(query);
    }

    public void addRecording(Date paydate, int receiver, double value) {
        this.paydate = paydate;
        this.receiver = receiver;
        this.value = value;
        String templateQuery = "INSERT INTO expenses (paydate, receiver, value) " +
                "VALUES (?, ?, ?)";
        addRecord(templateQuery);
    }

    private StringBuilder getResultSelect(String query) {
        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;
        StringBuilder strB = new StringBuilder();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(bdURL, login, password);
            statement = connection.createStatement();
            result = statement.executeQuery(query);
            strB.append(getSelectQuery(result));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            close(connection, statement, result, null);
        }
        return strB;
    }


    private void addRecord(String query) {
        Connection connection = null;
        ResultSet result = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(bdURL, login, password);
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1, paydate);
            preparedStatement.setInt(2, receiver);
            preparedStatement.setDouble(3, value);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            close(connection, null, result, preparedStatement);
        }
    }

    private StringBuilder getSelectQuery(ResultSet result) throws SQLException {
        StringBuilder strB = new StringBuilder();
        while (result.next()) {
            strB.append(result.getString("paydate"))
                    .append("\t").append(result.getString("name"))
                    .append("\t").append(result.getDouble("value"))
                    .append("\n");
        }
        return strB;
    }

    private void close(Connection connection, Statement statement, ResultSet result, PreparedStatement preparedStatement) {
        if (result != null) {
            try {
                result.close();
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

}