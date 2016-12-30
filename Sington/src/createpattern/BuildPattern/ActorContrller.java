package createpattern.BuildPattern;

/**
 * Created by Heyha on 2016/12/30.
 */
public class ActorContrller {
    public Actor construct(ActorBuilder actorBuilder){
        Actor actor;
        //组装顺序
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        actorBuilder.buildHairstyle();
        //创建角色
        actor = actorBuilder.createActor();
        return actor;
    }
}
