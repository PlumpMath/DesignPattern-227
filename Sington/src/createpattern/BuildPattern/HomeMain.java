package createpattern.BuildPattern;

/**
 * 建造者模式（组装游戏角色）:将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示；
 * 使用相同的构建过程构建不同的产品
 * Actor:角色的基类
 * ActorBuilder:角色构建抽象类，定义构建的方法，包含一个抽象角色对象（最后生成的角色）
 * HeroBuilder、AngelBuilder，角色构建具体类，实现抽象方法并调用ActorBuilder中的actor对象进行设值
 * ActorController：角色构建控制类，根据参数的类型，控制角色组装的流程，生成该类型的角色
 *引入钩子的概念，可以控制是否设置Actor的头发，
 * Created by Heyha on 2016/12/30.
 */
public class HomeMain {
    public static void main(String[] args) {
        ActorContrller actorContrller = new ActorContrller();
        Actor actor = actorContrller.construct(new AngelBuilder());

        System.out.println(actor.toString());
    }
}
