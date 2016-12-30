package adapterpattern;

import createpattern.open.XmlUtil;

/**
 * 适配器模式:将一个接口转换成客户希望的另一个接口，使接口不兼容的那些类可以一起工作，其别名为包装器(Wrapper)。
 * 适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。
 * ScoreOperation:面向客户端的接口
 * BinarySearch、QuickSort已经有的接口（方法）
 * OperationAdapter:客户端接口的具体类，在该类中调用已有的接口，这样就将两个接口连接起来了
 * Created by Heyha on 2016/12/30.
 */
public class HomeMain {
    public static void main(String[] args) {
        ScoreOperation scoreOperation;
        scoreOperation = (ScoreOperation) XmlUtil.getINSTANCE().getBean("adapterpattern.","adapterType");
        int scores[] = {84,50,96,78,92,55,99,86,84};
        int result[];
        int score;
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
