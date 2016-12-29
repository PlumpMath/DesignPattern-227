package CRPModel;

/**
 * Created by Heyha on 2016/12/29.
 */
public class CustomDao {
    DBUtil db;

    public void setDb(DBUtil db) {
        this.db = db;
    }

    public void addCustomer(){
        db.getConnection();
    }
}
