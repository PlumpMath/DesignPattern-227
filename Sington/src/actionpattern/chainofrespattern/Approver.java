package actionpattern.chainofrespattern;

/**抽象处理类
 * Created by Heyha on 2017/1/10.
 */
public abstract class Approver {
    protected Approver successor; //下一家指针
    protected String name;  //当前名字

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
