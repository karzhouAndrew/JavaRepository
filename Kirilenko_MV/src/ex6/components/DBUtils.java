package ex6.components;

import java.sql.*;

/**
 * Created by champion on 06.07.15.
 */
public class DBUtils {

    public static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){
        try {
            if(resultSet!=null){
                resultSet.close();
            }
            if(preparedStatement!=null){
                preparedStatement.close();
            }
            if(connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void close(Connection connection, PreparedStatement preparedStatement){
        close(connection,preparedStatement,null);
    }
}
