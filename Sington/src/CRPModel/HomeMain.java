package CRPModel;

/**
 * 合成复用原则（CRP）：尽量使用对象组合，而不是继承来达到复用的目的
 * 可以采用依赖注入的方式实现合成复用
 * 如果两个类之间是“Has-A”的关系应使用组合或聚合，如果是“Is-A”关系可使用继承
 * "Is-A"是严格的分类学意义上的定义，意思是一个类是另一个类的"一种"
 * "Has-A"则不同，它表示某一个角色具有某一项责任
 * Created by Heyha on 2016/12/29.
 */
public class HomeMain {
    public static void main(String[] args) {
        CustomDao customDao = new CustomDao();
        customDao.setDb(new OracleUtil());
        customDao.db.getConnection();
    }
}
