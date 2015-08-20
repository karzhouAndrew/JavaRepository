package jd03.lab07.database.pool;

import java.util.ResourceBundle;

public final class DBConfig {

    public static String configPath;

    public DBConfig(String configPath) {
        DBConfig.configPath = configPath;
    }

    static String getDriver() {
        return ResourceBundle.getBundle(configPath).getString("driver");
    }

    static String getDBURL() {
        return ResourceBundle.getBundle(configPath).getString("DBURL");
    }

    static String getUserName() {
        return ResourceBundle.getBundle(configPath).getString("username");
    }

    static String getPassword() {
        return ResourceBundle.getBundle(configPath).getString("password");
    }

}
