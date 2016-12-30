package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.abstractBean.AbstractProductA;
import AbstractFactoryPattern.abstractBean.AbstractProductB;
import AbstractFactoryPattern.abstractFactory.AbstractFactory;
import AbstractFactoryPattern.bean.ProductA1;
import AbstractFactoryPattern.bean.ProductB1;

/**
 * Created by Heyha on 2016/12/30.
 */
public class Factory1 implements AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}