package actionpattern.chainofrespattern;

/**
 * 主任处理类
 * Created by Heyha on 2017/1/10.
 */
public class VicePresidentApprover extends Approver {

    public VicePresidentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() < 100000) {
            System.out.println("副董事长:" + this.name + ";采购额：" + purchaseRequest.getAmount() + ";采购单号：" + purchaseRequest.getNumber() +
                    ";采购目的:" + purchaseRequest.getPurpose());
        }else {
            this.successor.processRequest(purchaseRequest);
        }
    }
}
