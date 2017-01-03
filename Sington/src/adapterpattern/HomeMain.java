package adapterpattern;

import createpattern.open.XmlUtil;

/**
 * 适配器模式:将一个接口转换成客户希望的另一个接口，使接口不兼容的那些类可以一起工作，其别名为包装器(Wrapper)。
 * 适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。
 * ScoreOperation:面向客户端的接口
 * BinarySearch、QuickSort已经有的接口（方法）
 * OperationAdapter:客户端接口的具体类，在该类中调用已有的接口，这样就将两个接口连接起来了
 * 以上是对象适配器模式
 * 类适配器模式:类适配器模式和对象适配器模式最大的区别在于适配器和适配者之间的关系不同，对象适配器模式中适配器和适配者之间是关联关系，而类适配器模式中适配器和适配者是继承关系
 *
 * 缺省适配器模式(Default Adapter Pattern)：当不需要实现一个接口所提供的所有方法时，可先设计一个抽象类实现该接口，并为接口中每个方法提供一个默认实现（空方法），
 * 那么该抽象类的子类可以选择性地覆盖父类的某些方法来实现需求，它适用于不想使用一个接口中的所有方法的情况，又称为单接口适配器模式。
 * Created by Heyha on 2016/12/30.
 */
public class HomeMain {
    public static void main(String[] args) {
        ScoreOperation scoreOperation;
        scoreOperation = (ScoreOperation) XmlUtil.getINSTANCE().getBean("adapterpattern.","adapterType");
        int scores[] = {84,50,96,78,92,55,99,86,84};
//        int result[];
//        int score;
        //排序
        scoreOperation.sort(scores);
        for (int s : scores){
            System.out.print(s + ",");
        }
        System.out.println("");
        System.out.println("查找90...");
        if (scoreOperation.search(scores,90) != -1){
            System.out.println("找到90");
        }else {
            System.out.println("未找到90");
        }

    }
}
