package actionpattern.chainofrespattern;

/**
 * 职责链模式(Chain of Responsibility  Pattern)：避免请求发送者和接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连成一个链，请求沿着这条链传递下去，
 * 直到有对象处理这个请求为止。职责链模式是对象行为型模式.
 * 角色包含：Handler（抽象处理者）：定义了一个处理请求的接口，一般为抽象类，包含一个抽象处理请求的方法，还有一个抽象处理者类型的对象，作为对下家的引用
 * ConcreateHandler（具体处理者）：抽象处理者的实现，可以处理请求，但是在处理请求之前需要判断自己是否有权利处理请求。
 * 注意：职责链模式并不创建职责链，职责链的创建工作必须由系统的其他部分来完成，一般是在使用该职责链的客户端中创建职责链。
 * Created by Heyha on 2017/1/10.
 */
public class HomeMain {
    public static void main(String[] args) {
        Approver zhang,wang,li,zhao;
        zhang = new DirectorApprover("张三");
        wang = new VicePresidentApprover("王二");
        li = new PresidentApprover("李四");
        zhao = new CongressApprover("董事会");

        //创建职责链
        zhang.setSuccessor(wang);
        wang.setSuccessor(li);
        li.setSuccessor(zhao);

        PurchaseRequest request = new PurchaseRequest(64018,123,"买剑");
        zhang.processRequest(request);

    }
}
