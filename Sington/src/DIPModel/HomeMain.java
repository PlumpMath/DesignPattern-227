package DIPModel;

/**依赖倒转原则（DIP）：抽象不应该依赖于细节，细节应当依赖于抽象。换言之，要针对接口编程，而不是针对实现编程
 * DataConvertor抽象
 * ExeclDataConvertor,TXTDataConvertor具体
 * 针对抽象层编程，而将具体类的对象通过依赖注入(DI)的方式注入到其他对象中
 * 依赖注入:指当一个对象要与其他对象发生依赖关系时，通过抽象来注入所依赖的对象
 * 注入方式：构造注入，设值注入（setter），接口注入
 * Created by Heyha on 2016/12/29.
 */
public class HomeMain {
    public static void main(String[] args) {
        DataConvertor dataConvertor = new TXTDataConvertor();
        DataConvertor dataConvertor1 = new ExeclDataConvertor();
        dataConvertor.readFile();
        dataConvertor1.readFile();
    }
}
