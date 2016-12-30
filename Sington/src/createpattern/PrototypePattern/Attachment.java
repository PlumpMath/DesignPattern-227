package createpattern.PrototypePattern;

/**
 * Created by Heyha on 2016/12/30.
 */
public class Attachment implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download(){
        System.out.println("download attachment");
    }
}
