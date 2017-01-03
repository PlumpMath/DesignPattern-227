package decoratorpattern;

/**
 * 装饰模式(Decorator Pattern)：动态地给一个对象增加一些额外的职责，就增加对象功能来说，装饰模式比生成子类实现更为灵活。装饰模式是一种对象结构型模式。
 * 角色包含：Component（抽象构件）：具体构件和抽象装饰类的共同父类，声明了在具体构件中实现的业务方法，实现了客户端的透明操作
 * ConcreteComponent（具体构件）：抽象构件类的子类，用于定义具体的构件对象,装饰器可以给它增加额外的职责（方法）
 * Decorator（抽象装饰类）：抽象构件类的子类，用于给具体构件增加职责,具体职责在其子类中实现,维护一个指向抽象构件对象的引用，
 *                        通过该引用可以调用装饰之前构件对象的方法，并通过其子类扩展该方法，以达到装饰的目的
 * ConcreteDecorator（具体装饰类）：它是抽象装饰类的子类，负责向构件添加新的职责
 * 装饰者模式是一种用于替代继承的技术
 *
 * 透明装饰模式：要求客户端完全针对抽象编程，客户端程序不应该将对象声明为具体构件类型或具体装饰类型，而应该全部声明为抽象构件类型
 * 半透明装饰模式：为了能够调用到新增方法，调用具体装饰类来定义装饰之后的对象，而具体构件类型仍然使用抽象构件类型来定义
 * Created by Heyha on 2017/1/3.
 */
public class HomeMain {
    public static void main(String[] args) {
        Component component;
        component = new Window();  //装饰前具体构建
        component.display();

        ComponentDecorator component1;
        component1 = new BlackBorderDecorator();
        component1.setComponent(component);
        component1.display();  //增加黑色边框具体构件

        ComponentDecorator decorator2;
        decorator2 = new ScrollBarDecorator();
        decorator2.setComponent(component1);
        decorator2.display();   //黑色边框基础上增加滚动条具体构件
    }
}
