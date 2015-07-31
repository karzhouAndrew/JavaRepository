package ex6.components;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by champion on 07.07.15.
 */
public class ConnectionPool {
    private static ConnectionPool instance;
    private BasicDataSource dataSource;

    private ConnectionPool() {
        dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("");
    }

    public synchronized static ConnectionPool getInstance(){
        if(instance==null){
            instance = new ConnectionPool();
        }
        return  instance;
    }
    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
    public void closeConnection() throws SQLException {
        dataSource.close();
    }
}
