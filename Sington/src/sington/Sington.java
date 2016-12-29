package sington;

/**
 * IoDH单例模式，综合了懒汉式单例和饿汉式单例的优点
 * 延迟加载，线程安全
 * Created by Heyha on 2016/12/28.
 */
public class Sington {
    private Sington() {
    }

    private static class HolderClass{
        private static final Sington INSTANCE = new Sington();
    }

    public static Sington getInstance(){
        return HolderClass.INSTANCE;
    }

    public static void main(String[] args) {
        Sington s1,s2;
        s1 = Sington.getInstance();
        s2 = Sington.getInstance();
        System.out.println(s1 == s2);
    }
}
