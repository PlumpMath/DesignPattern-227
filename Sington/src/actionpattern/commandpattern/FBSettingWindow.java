package actionpattern.commandpattern;

import java.util.ArrayList;

/**
 * Created by Heyha on 2017/1/11.
 */
public class FBSettingWindow {
    private String title;
    private ArrayList<FunctionButton> functionButtons = new ArrayList<FunctionButton>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton functionButton) {
        functionButtons.add(functionButton);
    }

    public void removeFunctionButton(FunctionButton functionButton) {
        functionButtons.remove(functionButton);
    }

    public void display() {
        System.out.println("显示窗口:" + this.getTitle());
        System.out.println("显示功能键:");
        for (Object obj : functionButtons) {
            System.out.println(((FunctionButton) obj).getName());
        }
        System.out.println("------------------------");
    }
}
