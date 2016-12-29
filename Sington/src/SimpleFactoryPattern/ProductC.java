package SimpleFactoryPattern;

/**
 * Created by Heyha on 2016/12/29.
 */
public class ProductC implements AbstractProduct {
    @Override
    public void name() {
        System.out.println("I am product C");
    }

    @Override
    public void price() {
        System.out.println("My price is 1230$");
    }

    @Override
    public void year() {
        System.out.println("My year is always");
    }
}
