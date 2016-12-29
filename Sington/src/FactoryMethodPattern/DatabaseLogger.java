package FactoryMethodPattern;

/**
 * Created by Heyha on 2016/12/29.
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("Database write log.");
    }
}
