package jd03lab05;

import java.sql.*;

public class DBProcessor {

    private static final String SELECT_ALL_PATTERN = "SELECT * FROM ";
    private static final String NAME_INPUT_REQUEST = "Введите имя пользователя базы данных: ";
    private static final String PASSWORD_REQUEST = "Введите пароль пользователя базы данных: ";
    private final String DB_URL;
    private final String USERNAME;

    public DBProcessor(final String MYSQL_DRIVER_CLASS_PATH, final String DB_URL) {
        this.DB_URL = DB_URL;
        try {
            Class.forName(MYSQL_DRIVER_CLASS_PATH);
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading driver: ");
            e.printStackTrace();
        }
        System.out.println(NAME_INPUT_REQUEST);
        this.USERNAME = DBManager.scan.nextLine();
    }

    public String readDBTable(final String DB_TABLE_NAME) {
        final String QUERY = SELECT_ALL_PATTERN + DB_TABLE_NAME + ';';
        StringBuilder readDBTableResult = new StringBuilder();
        System.out.println(PASSWORD_REQUEST);
        try (
                Connection connection = DriverManager.getConnection(DB_URL, USERNAME, DBManager.scan.nextLine());
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(QUERY)
        ) {
            int columnsQuantity = resultSet.getMetaData().getColumnCount();
            while (resultSet.next()) {
                for (int i = 1; i <= columnsQuantity; i++) {
                    readDBTableResult.append(resultSet.getString(i)).append("\t\t");
                }
                readDBTableResult.append('\n');
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return readDBTableResult.toString();
    }

    public int addExpenseRecord(final String QUERY) {
        int rowsAffected = 0;
        System.out.println(PASSWORD_REQUEST);
        try (
                Connection connection = DriverManager.getConnection(DB_URL, USERNAME, DBManager.scan.nextLine());
                Statement statement = connection.createStatement();
        ) {
            rowsAffected = statement.executeUpdate(QUERY);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }
}