package flyweightpattern;

/**
 * 享元模式(Flyweight Pattern)：运用共享技术有效地支持大量细粒度对象的复用。系统只使用少量的对象，而这些对象都很相似，状态变化很小，可以实现对象的多次复用。
 * 由于享元模式要求能够共享的对象必须是细粒度对象，因此它又称为轻量级模式，它是一种对象结构型模式。
 * 内部状态:存储在享元对象内部并且不会随环境改变而改变的状态，内部状态可以共享
 * 外部状态:随环境改变而改变的、不可以共享的状态
 * 角色包含：Flyweight（抽象享元类）：声明了具体享元类公共的方法，向外界提供享元对象的内部数据（内部状态），同时也可以通过这些方法来设置外部数据（外部状态）
 * ConcreteFlyweight（具体享元类）：实现了抽象享元类，其实例称为享元对象，具体享元类为内部状态提供了存储空间，结合单例模式来设计具体享元类，
 *                                为每一个具体享元类提供唯一的享元对象
 * UnsharedConcreteFlyweight（非共享具体享元类）：不是所有的抽象享元类的子类都需要被共享，当需要一个非共享具体享元类的对象时可以直接通过实例化创建
 * FlyweightFactory（享元工厂类（所谓的享元池））：用于创建并管理享元对象，针对抽象享元类编程，将各种类型的具体享元对象存储在一个享元池中，享元池一般设计为一个存储“键值对”的集合
 *                                （也可以是其他类型的集合），可以结合工厂模式进行设计；当用户请求一个具体享元对象时，享元工厂提供一个存储在享元池中已创建的实例或者
 *                                创建一个新的实例（如果不存在的话），返回新创建的实例并将其存储在享元池中
 * Created by Heyha on 2017/1/4.
 */
public class HomeMain {
    public static void main(String[] args) {
        IgoChessman b1,b2,b3,w1,w2;
        IgoChessmanFactory factory;

        factory = IgoChessmanFactory.getInstance();
        b1 = factory.getIgoChessman("b");
        b2 = factory.getIgoChessman("b");
        b3 = factory.getIgoChessman("b");

        w1 = factory.getIgoChessman("w");
        w2 = factory.getIgoChessman("w");
        System.out.println("b1是否等于b2:" + (b1 == b2));
        System.out.println("b1是否等于w1:" + (b1 == w1));

        b1.display(new Coordinates(1,2));
        b2.display(new Coordinates(2,3));
        b3.display(new Coordinates(4,5));
        w1.display(new Coordinates(1,9));
        w2.display(new Coordinates(3,9));
    }
}
