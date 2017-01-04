package proxypattern;

/**
 * 业务类
 * Created by Heyha on 2017/1/4.
 */
public class AccessValidator {
    public boolean validate(String userid){
        if (userid.equals("杨过")){
            System.out.println(userid + "登陆成功");
            return true;
        }else {
            System.out.println("登陆失败");
            return false;
        }
    }
}
