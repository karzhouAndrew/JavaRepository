package jd03lab07.db.pool;

import jd03lab07.MainDBManager;
import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {

    private final String MYSQL_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/listexpenses";
    private final String NAME_INPUT_REQUEST = "Введите имя пользователя базы данных: ";
    private final String PASSWORD_REQUEST = "Введите пароль пользователя базы данных: ";

    private static ConnectionPool instance;
    private BasicDataSource dataSource;

    private ConnectionPool() {
        dataSource = new BasicDataSource();
        dataSource.setDriverClassName(MYSQL_DRIVER_CLASS);
        dataSource.setUrl(DB_URL);
        System.out.println(NAME_INPUT_REQUEST);
        dataSource.setUsername(MainDBManager.scan.nextLine());
        System.out.println(PASSWORD_REQUEST);
        dataSource.setPassword(MainDBManager.scan.nextLine());
    }

    public synchronized static ConnectionPool getInstance() {
        if (instance == null) {
            instance = new ConnectionPool();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}