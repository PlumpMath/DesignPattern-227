package LSPModel;

/**
 * Created by Heyha on 2016/12/29.
 */
public class CommonCustom extends Custom {

    public CommonCustom(String name, String phone) {
        super(name, phone);
    }

    @Override
    public void showType() {
        System.out.println("I am common custom");
    }
}
