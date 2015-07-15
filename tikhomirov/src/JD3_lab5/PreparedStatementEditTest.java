package JD3_lab5;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static JD3_lab5.DBUtils.*;

/**
 * Создать программу, получающую данные о расходах в качестве исходных параметров и добавляющую этот расход в базу,
 * после чего выводящую таблицу расходов на экран.Использовать прекомпилированные запросы.
 */
public class PreparedStatementEditTest {
    public static final String UPDATE_QUERY = "INSERT INTO  expenses VALUES (20,'2015-07-07',2,222222)";
    public static final String SELECT_QUERY = "SELECT * FROM expenses";

    public static void main(String[] args) {
        Statement statement = createStatement();
        try {
            statement.executeUpdate(UPDATE_QUERY);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String template = "SELECT * FROM expenses WHERE value>?";
        PreparedStatement preparedStatement = createPreparedStatement(template);
        try {
            preparedStatement.setInt(1, 100000);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet resultSet = null;
        try {
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(createConnection(), preparedStatement, resultSet);
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
