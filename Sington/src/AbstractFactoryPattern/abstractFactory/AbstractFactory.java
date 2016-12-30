package AbstractFactoryPattern.abstractFactory;

import AbstractFactoryPattern.abstractBean.AbstractProductA;
import AbstractFactoryPattern.abstractBean.AbstractProductB;

/**
 * Created by Heyha on 2016/12/30.
 */
public interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();
}
