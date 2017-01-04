package proxypattern;

/**
 * Created by Heyha on 2017/1/4.
 */
public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String userid, String keyword) {
        System.out.println("用户" + userid + "使用关键字" + keyword + "查询商务信息");
        return "具体商务信息";
    }
}
