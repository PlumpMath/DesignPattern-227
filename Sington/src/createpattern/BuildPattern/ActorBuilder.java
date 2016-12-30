package createpattern.BuildPattern;

/**
 * Created by Heyha on 2016/12/30.
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    //工厂方法，返回一个完整的英雄角色对象
    public Actor createActor(){
        return actor;
    }
}
