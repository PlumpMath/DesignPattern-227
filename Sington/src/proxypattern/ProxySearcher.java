package proxypattern;

/**代理类,使用ProxySearcher代理realSearcher对象，执行doSearch（）操作，执行操作之前或者之后，做一些其他的附加操作
 * Created by Heyha on 2017/1/4.
 */
public class ProxySearcher implements Searcher {
    private RealSearcher realSearcher = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;


    @Override
    public String doSearch(String userid, String keyword) {
        if (doValidate(userid)){
            String result = realSearcher.doSearch(userid,keyword);
            doLog(userid);
        }
        return null;
    }

    private boolean doValidate(String userid){
        validator = new AccessValidator();
        return validator.validate(userid);
    }

    private void doLog(String userid){
        logger = new Logger();
        logger.log(userid);
    }
}
