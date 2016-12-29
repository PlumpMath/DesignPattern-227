package openclosemodel;

/**
 * 软件设计开闭原则的体现
 * AbstractChart抽象类
 * BarChart,LineChart,PieChart是具体类
 * ChartDisplay是具体类的表现
 * HomeMain是测试类
 * Created by Heyha on 2016/12/29.
 */
public class HomeMain {
    private static ChartDisplay chartDisplay = new ChartDisplay();
    public static void main(String[] args) {
        BarChart barChart = new BarChart();
        chartDisplay.setDisplay(barChart);
        chartDisplay.display();

        AbstractChart abstractChart = new PieChart();
        chartDisplay.setDisplay(abstractChart);
        chartDisplay.display();

        AbstractChart abstractChart1 = new LineChart();
        chartDisplay.setDisplay(abstractChart1);
        chartDisplay.display();
    }
}
