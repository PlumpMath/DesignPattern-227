package createpattern.LSPModel;

/**LSP抽象层
 * Created by Heyha on 2016/12/29.
 */
public abstract class Custom {
    public String name;
    public String phone;

    public Custom(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public abstract void showType();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
