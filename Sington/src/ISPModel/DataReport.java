package ISPModel;

/**
 * Created by Heyha on 2016/12/29.
 */
public class DataReport implements DataHandler,ReportHandler {
    @Override
    public void dataRead() {
        System.out.println("data read");
    }

    @Override
    public void createReport() {
        System.out.println("create report");
    }

    @Override
    public void displayReport() {
        System.out.println("display report");
    }
}
