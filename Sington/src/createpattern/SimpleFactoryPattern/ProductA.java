package createpattern.SimpleFactoryPattern;

/**
 * Created by Heyha on 2016/12/29.
 */
public class ProductA implements AbstractProduct {
    @Override
    public void name() {
        System.out.println("I am product A");
    }

    @Override
    public void price() {
        System.out.println("My price is 30$");
    }

    @Override
    public void year() {
        System.out.println("My year is 2017");
    }
}
