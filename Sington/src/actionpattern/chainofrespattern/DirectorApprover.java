package actionpattern.chainofrespattern;

/**
 * 主任处理类
 * Created by Heyha on 2017/1/10.
 */
public class DirectorApprover extends Approver {

    public DirectorApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() < 50000) {
            System.out.println("主任:" + this.name + ";采购额：" + purchaseRequest.getAmount() + ";采购单号：" + purchaseRequest.getNumber() +
                    ";采购目的:" + purchaseRequest.getPurpose());
        } else {
            this.successor.processRequest(purchaseRequest);
        }
    }
}
