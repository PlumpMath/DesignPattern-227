package actionpattern.commandpattern;

/**
 * 命令模式(Command Pattern)：将一个请求封装为一个对象，从而让我们可用不同的请求对客户进行参数化；对请求排队或者记录请求日志，以及支持可撤销的操作。
 *          命令模式是一种对象行为型模式，其别名为动作(Action)模式或事务(Transaction)模式。
 *          可以将请求发送者和接收者完全解耦，发送者与接收者之间没有直接引用关系，发送请求的对象只需要知道如何发送请求，而不必知道如何完成请求。(对比外观模式)
 * 角色包含：Command（抽象命令类）：声明了用于执行请求的execute()等方法，通过这些方法可以调用请求接收者的相关操作。
 * ConcreteCommand（具体命令类）：实现抽象命令类的方法，它对应具体的接收者对象，并绑定接收者的动作，实现execute（）方法时调用的就是接收者的方法。
 * Invoker（调用者）：请求发送者，它通过命令对象来执行请求，调用者并不需要在设计时确定其接收者，因此它只与抽象命令类之间存在关联关系。程序运行时可以将一个具体命令对象注入其中，
 *                  再调用具体命令对象的execute()方法，从而实现间接调用请求接收者的相关操作。
 * Receiver（接收者）：接收者执行与请求相关的操作，它具体实现对请求的业务处理。
 * 核心：命令模式的本质是对请求进行封装，一个请求对应于一个命令，将发出命令的责任和执行命令的责任分割开。
 * Created by Heyha on 2017/1/11.
 */
public class HomeMain {
    public static void main(String[] args) {
        //具体业务类(请求处理者)
        WindowHandler winhandler = new WindowHandler();
        HelpHandler helpHandler = new HelpHandler();
        //具体命令对象(命令)
        Command helpCom,winCom;
        helpCom = new HelpCommand(helpHandler);
        winCom = new WindowCommand(winhandler);
        //调用者
        FunctionButton button1,button2;
        button1 = new FunctionButton("功能键1");
        button1.setCommand(helpCom);
        button2 = new FunctionButton("功能键2");
        button2.setCommand(winCom);
        FBSettingWindow fbSettingWindow = new FBSettingWindow("功能键设置");
        fbSettingWindow.addFunctionButton(button1);
        fbSettingWindow.addFunctionButton(button2);
        fbSettingWindow.display();
        button1.onClick();
        button2.onClick();
    }
}
