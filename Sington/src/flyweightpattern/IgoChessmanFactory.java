package flyweightpattern;

import java.util.Hashtable;

/**享元工厂类，使用单例模式进行设计
 * Created by Heyha on 2017/1/4.
 */
public class IgoChessmanFactory {
    private static volatile IgoChessmanFactory INSTANCE;
    private static Hashtable hashtable; //使用hashtable存储享元对象，充当享元池

    private IgoChessmanFactory(){
        hashtable = new Hashtable();
        IgoChessman black = new BlackIgoChessman();
        IgoChessman white = new WhiteIgoChessman();
        hashtable.put("b",black);
        hashtable.put("w",white);
    }




    public static IgoChessmanFactory getInstance(){
        if (INSTANCE == null){
            synchronized (IgoChessmanFactory.class){
                if (INSTANCE == null){
                    INSTANCE = new IgoChessmanFactory();
                }
            }
        }
        return INSTANCE;
    }

    public IgoChessman getIgoChessman(String color){
        return (IgoChessman) hashtable.get(color);
    }
}
