package actionpattern.commandpattern.example;

/**
 * Created by Heyha on 2017/1/11.
 */
public class Box {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void openButtonPress(){
        command.execute();
    }
}
