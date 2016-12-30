package createpattern.SimpleFactoryPattern;

/**
 * Created by Heyha on 2016/12/29.
 */
public class ProductB implements AbstractProduct {
    @Override
    public void name() {
        System.out.println("I am product B");
    }

    @Override
    public void price() {
        System.out.println("My price is 60$");
    }

    @Override
    public void year() {
        System.out.println("My year is 2018");
    }
}
