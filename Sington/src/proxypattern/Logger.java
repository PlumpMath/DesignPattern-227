package proxypattern;

/**业务类
 * Created by Heyha on 2017/1/4.
 */
public class Logger {
    public void log(String userid){
        System.out.println("更新数据库，用户" + userid + "查询次数加1");
    }
}
