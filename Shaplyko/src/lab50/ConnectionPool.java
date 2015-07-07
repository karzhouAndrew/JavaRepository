package lab50;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class ConnectionPool {
    private static ConnectionPool instance;
    private BasicDataSource dataSource = new BasicDataSource();

    private ConnectionPool() {
        this.dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        this.dataSource.setUrl("jdbc:mysql://localhost:3306/listexpenses");
        this.dataSource.setUsername("root");
        this.dataSource.setPassword("admin123");
    }

    public static synchronized ConnectionPool getInstance() {
        if (instance == null) {
            instance = new ConnectionPool();
        }

        return instance;
    }

    public Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

    public void closeConnection() throws SQLException {
        this.dataSource.close();
    }
}
