package LSPModel;

/**里氏带换原则（SLP）的实现:所有引用基类（父类）的地方必须能透明地使用其子类的对象。
 * Custom基类
 * VipCustom,CommonCustom是基类的子类
 * EmailSend定义使用基类发送邮件，实际发送的时候是用的子类对象代替基类
 * HomeMain测试类
 * Created by Heyha on 2016/12/29.
 */
public class HomeMain {
    public static void main(String[] args) {
        Custom vipCustom = new VipCustom("Vip","110");
        Custom commonCustom = new CommonCustom("common","120");
        EmailSend emailSend = new EmailSend();
        emailSend.sendEmail(vipCustom);
        emailSend.sendEmail(commonCustom);
    }
}
