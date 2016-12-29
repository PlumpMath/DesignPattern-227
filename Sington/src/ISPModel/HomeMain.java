package ISPModel;

/**
 *接口隔离原则（ISP）：使用多个专门的接口，而不使用单一的总接口，即客户端不应该依赖那些它不需要的接口
 * 注意接口的粒度，接口太大违背隔离原则，接口太小导致接口泛滥
 * Created by Heyha on 2016/12/29.
 */
public class HomeMain {
    public static void main(String[] args) {
        DataReport dataReport = new DataReport();
        dataReport.dataRead();
        dataReport.createReport();
        dataReport.displayReport();
    }
}
