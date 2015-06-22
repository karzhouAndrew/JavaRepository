package jd02.lab03;

import java.io.IOException;

public class ExceptionGenerator {
    public static String exception;

    public String getMessageIOException() {
        try {
            throw new IOException();
        } catch (IOException e) {
            exception = e.toString();
        }
        return exception;
    }

    public String getMessageClassCastException() {
        try {
            throw new ClassCastException();
        } catch (ClassCastException e) {
            exception = e.toString();
        }
        return exception;
    }

    public String getMessageNullPointerException() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            exception = e.toString();
        }
        return exception;
    }
}
