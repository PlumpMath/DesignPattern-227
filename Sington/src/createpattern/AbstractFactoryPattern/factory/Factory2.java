package createpattern.AbstractFactoryPattern.factory;

import createpattern.AbstractFactoryPattern.abstractBean.AbstractProductA;
import createpattern.AbstractFactoryPattern.abstractBean.AbstractProductB;
import createpattern.AbstractFactoryPattern.abstractFactory.AbstractFactory;
import createpattern.AbstractFactoryPattern.bean.ProductA2;
import createpattern.AbstractFactoryPattern.bean.ProductB2;

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
