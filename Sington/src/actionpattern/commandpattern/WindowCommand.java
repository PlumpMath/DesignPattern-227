package actionpattern.commandpattern;

/**
 * 具体命令类
 * Created by Heyha on 2017/1/11.
 */
public class WindowCommand implements Command {
    private WindowHandler windowHandler;

    public WindowCommand() {
        this.windowHandler = new WindowHandler();
    }

    @Override
    public void execute() {
        windowHandler.miniWindow();
    }
}
