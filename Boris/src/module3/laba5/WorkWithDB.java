package module3.laba5;


import java.sql.*;

public class WorkWithDB {
    private String login = "root";
    private String password = "admin123";
    private String bdURL = "jdbc:mysql://localhost:3306/test_database";


    public StringBuilder seeTable() {
        String query = "SELECT paydate, value, name\n" +
                "FROM expenses, receivers r\n" +
                "WHERE receiver = r.num";
        return getResultSelect(query, false);
    }

    public void addRecording(String paydate, int receiver, double value) {
        String query = "INSERT INTO expenses (paydate, receiver, value)\n" +
                "VALUES ('" + paydate + "', " + receiver + ", " + value + ")";
        System.out.println(getResultSelect(query, true));
    }

    public void deleteRecording(int id) {
        String query = "DELETE FROM expenses \n" +
                "WHERE num = " + id;
        System.out.println(getResultSelect(query, true));
    }

    public void deleteLastRecording() {
        String query = "DELETE FROM expenses " +
                "ORDER BY num DESC " +
                "LIMIT 1";
        System.out.println(getResultSelect(query, true));
    }


    private StringBuilder getResultSelect(String query, boolean updateOrSelect) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading driver.");
        }
        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;
        StringBuilder strB = new StringBuilder();
        try {
            connection = DriverManager.getConnection(bdURL, login, password);
            statement = connection.createStatement();
            if (updateOrSelect) {
                strB.append(statement.executeUpdate(query));
            } else {
                result = statement.executeQuery(query);
                strB = getSelectQuery(result);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(connection, statement, result);
        }
        return strB;
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

    private void close(Connection connection, Statement statement, ResultSet result) {
        if (result != null) {
            try {
                result.close();
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
