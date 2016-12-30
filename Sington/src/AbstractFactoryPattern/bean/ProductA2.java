package AbstractFactoryPattern.bean;

import AbstractFactoryPattern.abstractBean.AbstractProductA;

/**
 * Created by Heyha on 2016/12/30.
 */
public class ProductA2 implements AbstractProductA {
    @Override
    public void display() {
        System.out.println("I am ProductA2");
    }
}
