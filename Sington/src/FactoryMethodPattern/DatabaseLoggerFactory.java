package FactoryMethodPattern;

/**
 * Created by Heyha on 2016/12/29.
 */
public class DatabaseLoggerFactory implements Factory {
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
