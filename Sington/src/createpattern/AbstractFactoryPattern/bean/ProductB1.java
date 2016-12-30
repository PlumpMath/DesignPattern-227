package createpattern.AbstractFactoryPattern.bean;

import createpattern.AbstractFactoryPattern.abstractBean.AbstractProductB;

/**
 * Created by Heyha on 2016/12/30.
 */
public class ProductB1 implements AbstractProductB {
    @Override
    public void show() {
        System.out.println("I am ProductB1");
    }
}
