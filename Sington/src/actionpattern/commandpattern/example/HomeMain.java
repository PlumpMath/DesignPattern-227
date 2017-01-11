package actionpattern.commandpattern.example;

import createpattern.open.XmlUtil;

/**
 * 命令模式模拟电脑开机
 * Created by Heyha on 2017/1/11.
 */
public class HomeMain {
    public static void main(String[] args) {
        MainBoardApi boardApi;
        boardApi = (MainBoardApi) XmlUtil.getINSTANCE().getBean("actionpattern.commandpattern.example.","mainBoardType");

        Command command = new OpenCommand(boardApi);
        Box box = new Box();
        box.setCommand(command);

        box.openButtonPress();
    }
}
