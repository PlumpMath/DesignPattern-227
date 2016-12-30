package createpattern.AbstractFactoryPattern.abstractFactory;

import createpattern.AbstractFactoryPattern.abstractBean.AbstractProductA;
import createpattern.AbstractFactoryPattern.abstractBean.AbstractProductB;

/**
 * Created by Heyha on 2016/12/30.
 */
public interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();
}
