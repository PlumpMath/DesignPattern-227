package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.abstractBean.AbstractProductA;
import AbstractFactoryPattern.abstractBean.AbstractProductB;
import AbstractFactoryPattern.abstractFactory.AbstractFactory;
import AbstractFactoryPattern.bean.ProductA2;
import AbstractFactoryPattern.bean.ProductB2;

/**
 * Created by Heyha on 2016/12/30.
 */
public class Factory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
