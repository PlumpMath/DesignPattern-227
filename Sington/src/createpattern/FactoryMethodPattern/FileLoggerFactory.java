package createpattern.FactoryMethodPattern;

/**
 * Created by Heyha on 2016/12/29.
 */
public class FileLoggerFactory implements Factory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
