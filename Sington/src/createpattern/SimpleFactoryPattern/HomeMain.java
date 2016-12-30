package createpattern.SimpleFactoryPattern;

import createpattern.open.XmlUtil;

/**
 * 简单工厂模式，提供一个简单工厂，根据传入的参数，返回一个具体的产品
 * 一个抽象产品类AbstractProduct
 * 一个工厂类Factory
 * 一个测试类HomeMain
 * 三个具体产品类
 *
 * 该产品类型直接写在配置文件中，修改时直接修改配置文件，避免修改后重新编译
 * XmlUtil是读取配置文件的类
 *
 * 不符合开闭原则，当需要增加新的产品时，需要修改工厂类
 * Created by Heyha on 2016/12/29.
 */
public class HomeMain {
    public static void main(String[] args) {
        AbstractProduct product = null;
        product = Factory.getProduct(XmlUtil.getINSTANCE().getType("charType"));
        product.name();
        product.price();
        product.year();
    }
}
