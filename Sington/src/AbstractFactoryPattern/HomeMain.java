package AbstractFactoryPattern;

import AbstractFactoryPattern.abstractBean.AbstractProductA;
import AbstractFactoryPattern.abstractBean.AbstractProductB;
import AbstractFactoryPattern.abstractFactory.AbstractFactory;
import AbstractFactoryPattern.factory.Factory1;
import FactoryMethodPattern.Factory;
import open.XmlUtil;

/**
 * 抽象工厂模式（Abstract Factory Pattern）：提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类
 * 两个抽象产品AbstractProductA,AbstractProductB
 * 一个抽象工厂类AbstractFactory,提供创建两个抽象产品的抽象方法(创建一个产品族的方法)
 * 应用配置文件设置客户端应用哪种产品等级结构的工厂（应用的具体工厂）,实现动态设置
 *
 * 缺点：“开闭原则”的倾斜性：在抽象工厂模式中，增加新的产品族很方便，但是增加新的产品等级结构很麻烦(如增加AbstractProductC)
 * 优点：不用像工厂方法模式那样每个产品创建一个工厂类，减少类的数量
 *
 * Created by Heyha on 2016/12/30.
 */
public class HomeMain {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = null;
        AbstractProductA productA = null;
        AbstractProductB productB = null;

        abstractFactory = (AbstractFactory) XmlUtil.getINSTANCE().getBean("AbstractFactoryPattern.factory.","factoryType");
        productA = abstractFactory.createProductA();
        productB = abstractFactory.createProductB();

        productA.display();
        productB.show();



    }
}
