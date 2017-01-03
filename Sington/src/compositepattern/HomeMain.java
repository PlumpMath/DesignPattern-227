package compositepattern;

/**
 * 组合模式（Composite Pattern）：组合多个对象形成树形结构，组合模式对单个对象（即叶子对象）和组合对象（即容器对象）的使用具有一致性。
 * 组件包含：Component（抽象构件）;为叶子构件和容器构件对象声明接口,包含所有子类共有行为的声明和实现
 * Leaf（叶子构件）:实现了在抽象构件中定义的行为。对于那些访问及管理子构件的方法，可以通过异常等方式进行处理
 * Composite（容器构件）：实现了在抽象构件中定义的行为
 *
 * 透明方式：抽象构件中声明Leaf和Composite需要实现的方法的并集，导致Leaf和Composite具有一致的行为接口
 * 安全方式：抽象构件中生命Leaf和Composite需要实现的方法的交集，导致Leaf没有管理子对象的方法
 *
 * 该示例使用的是透明方式
 *
 * Android View的应用使用的组合模式，
 * Created by Heyha on 2017/1/3.
 */
public class HomeMain {
    public static void main(String[] args) {
        Component f1,f2,f3,f4,f5,f6;
        f1 = new Composite("f1");
        f2 = new Composite("f2");

        f3 = new Leaf("leaf1");
        f4 = new Leaf("leaf2");
        f5 = new Leaf("leaf3");
        f6 = new Leaf("leaf4");

        f1.add(f2);
        f1.add(f5);
        f1.add(f6);
        f2.add(f3);
        f2.add(f4);

        f1.operation();

    }
}
