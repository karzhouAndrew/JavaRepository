package jd03.lab05;

import java.util.ResourceBundle;

public class Util {
    public static final String CONFIG_FILE_PATH = "jd03.lab05.DBConfig";

    static String getDBURL() {
        return ResourceBundle.getBundle(CONFIG_FILE_PATH).getString("DBURL");
    }

    static String getUserName() {
        return ResourceBundle.getBundle(CONFIG_FILE_PATH).getString("username");
    }

    static String getPassword() {
        return ResourceBundle.getBundle(CONFIG_FILE_PATH).getString("password");
    }
}
