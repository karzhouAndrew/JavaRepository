package JD3_lab4;

import java.sql.*;

import static JD3_lab4.DBUtils.*;

/**
 * Создать программу, получающую данные о расходах в качестве исходных параметров и добавляющую этот расход в базу,
 * после чего выводящую таблицу расходов на экран.
 */
public class BaseEditTest {
    public static final String UPDATE_QUERY = "INSERT INTO  expenses VALUES (111,'2015-07-17',2,45000)";
    public static final String SELECT_QUERY = "SELECT * FROM expenses";

    public static void main(String[] args) {
        Statement statement = createStatement();
        try {
            statement.executeUpdate(UPDATE_QUERY);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery(SELECT_QUERY);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(createConnection(), statement, resultSet);
        }
        try {
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("ID") + " paydate: " + resultSet.getString("paydate") +
                        " receiver: " + resultSet.getInt("receiver") + " value: " + resultSet.getInt("value"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
