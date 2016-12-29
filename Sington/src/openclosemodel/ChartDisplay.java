package openclosemodel;

/**
 * Created by Heyha on 2016/12/29.
 */
public class ChartDisplay {
    private AbstractChart abstractChart;

    public void setDisplay(AbstractChart abstractChart) {
        this.abstractChart = abstractChart;
    }

    public void display(){
        abstractChart.display();
    }


}
