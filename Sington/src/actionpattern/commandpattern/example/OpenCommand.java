package actionpattern.commandpattern.example;

/**
 * Created by Heyha on 2017/1/11.
 */
public class OpenCommand implements Command {
    private MainBoardApi mainBoardApi;

    public OpenCommand(MainBoardApi mainBoardApi) {
        this.mainBoardApi = mainBoardApi;
    }

    @Override
    public void execute() {
        mainBoardApi.open();
    }
}
