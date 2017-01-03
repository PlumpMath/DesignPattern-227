package bridgepattern;

import createpattern.open.XmlUtil;

/**
 *桥接模式(Bridge Pattern)：将抽象部分与它的实现部分分离，使它们都可以独立地变化。它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(Interface)模式
 * 角色包含：
 * 1、Abstraction（抽象类）其中定义了一个Implementor（实现类接口）类型的对象并可以维护该对象，它与Implementor之间具有关联关系，
 * 它既可以包含抽象业务方法，也可以包含具体业务方法。
 * 2、Implementor（实现类接口）:仅提供基本操作,通过关联关系，在Abstraction中不仅拥有自己的方法，还可以调用到Implementor中定义的方法，使用关联关系来替代继承关系
 * 3、RefinedAbstraction（扩充抽象类）：Abstraction的具体类，实现抽象方法，也可以使用Implementor中的方法
 * 4、ConcreteImplementor（具体实现类）：Implementor的具体类，实现接口方法，通过里氏代换代替扩充抽象类中的接口
 *
 * Image:抽象类
 * ImageImpl:实现类接口
 * GifImage、JpegImage、PngImage：扩充抽象类
 * LinuxImageImpl、UnixImageImpl、WinImageImpl：具体实现类
 *
 * 优势：桥接模式为多维度变化的系统提供了一套完整的解决方案
 * Created by Heyha on 2017/1/3.
 */
public class HomeMain {
    public static void main(String[] args) {
        ImageImpl imageImpl = (ImageImpl) XmlUtil.getINSTANCE().getBean("bridgepattern.","sysType");
        Image image = (Image) XmlUtil.getINSTANCE().getBean("bridgepattern.", "imageType");
        image.setImpl(imageImpl);
        image.parseFile("123");
    }
}
