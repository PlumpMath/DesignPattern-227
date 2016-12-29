package FactoryMethodPattern;


import open.XmlUtil;

/**
 * 工厂方法模式
 * 一个日志记录接口Logger,两个日志记录具体类FileLogger,DatabaseLogger
 * 一个工厂接口Factory，两个工厂具体类DatabaseLoggerFactory,FileLoggerFactory，分别对应两个具体记录类
 *
 * 客户端中：需要什么工厂就实例化什么工厂，最后实现业务
 * 本例中将具体工厂放在xml文件中，通过读取xml文件，获得具体工厂名，再通过反射机制生成具体工厂类
 * Created by Heyha on 2016/12/29.
 */
public class HomeMain {
    public static void main(String[] args) {
        Logger logger = null;
        Factory factory = null;
        //通过读取配置文件获取工厂实例
        factory = (Factory) XmlUtil.getINSTANCE().getBean("className");
//        factory = new DatabaseLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
