package createpattern.LSPModel;

/**
 * Created by Heyha on 2016/12/29.
 */
public class VipCustom extends Custom {

    public VipCustom(String name, String phone) {
        super(name, phone);
    }

    @Override
    public void showType() {
        System.out.println("I am VIP custom");
    }
}
