package actionpattern.chainofrespattern;

/**
 * 主任处理类
 * Created by Heyha on 2017/1/10.
 */
public class CongressApprover extends Approver {

    public CongressApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {

        System.out.println("董事会审批采购单" + ";采购额：" + purchaseRequest.getAmount() + ";采购单号：" + purchaseRequest.getNumber() +
                ";采购目的:" + purchaseRequest.getPurpose());

    }
}
