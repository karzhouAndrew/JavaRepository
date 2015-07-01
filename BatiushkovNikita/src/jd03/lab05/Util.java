package jd03.lab05;

import java.util.ResourceBundle;

public class Util {
    public static final String PROPERTIES_FILE_PATH = "jd03.lab05.DBConfig";

    static String getDBURL() {
        return ResourceBundle.getBundle(PROPERTIES_FILE_PATH).getString("DBURL");
    }

    static String getUserName() {
        return ResourceBundle.getBundle(PROPERTIES_FILE_PATH).getString("username");
    }

    static String getPassword() {
        return ResourceBundle.getBundle(PROPERTIES_FILE_PATH).getString("password");
    }
}
