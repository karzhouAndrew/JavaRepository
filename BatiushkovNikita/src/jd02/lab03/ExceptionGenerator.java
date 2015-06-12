package jd02.lab03;

import java.io.IOException;

public class ExceptionGenerator {
    public static String exception;

    public String getIOException() {
        try {
            throw new IOException();
        } catch (IOException e) {
            exception = e.toString();
        }
        return exception;
    }

    public String getClassCastException() {
        try {
            throw new ClassCastException();
        } catch (ClassCastException e) {
            exception = e.toString();
        }
        return exception;
    }

    public String getNullPointerException() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            exception = e.toString();
        }
        return exception;
    }

}
