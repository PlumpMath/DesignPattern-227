package createpattern.LSPModel;

/**
 * Created by Heyha on 2016/12/29.
 */
public class EmailSend {
    public void sendEmail(Custom custom){
        System.out.println("name:" + custom.getName());
        System.out.println("phone:" + custom.getPhone());
        custom.showType();
    }
}
