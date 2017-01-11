package actionpattern.commandpattern.example;

/**
 * Created by Heyha on 2017/1/11.
 */
public class MsiMainBoard implements MainBoardApi {
    @Override
    public void open() {
        System.out.println("微星主板正在开机，请稍后.....");
        System.out.println("主板正在接通电源");
        System.out.println("主板正在自检");
        System.out.println("主板正在装载系统");
        System.out.println("机器已经打开，可以正常使用啦");
    }
}
