package createpattern.PrototypePattern;

/**
 * Created by Heyha on 2016/12/30.
 */
public class Protortype implements Cloneable {

    private String name;
    private String data;
    private String content;
    private Attachment attachment;

    @Override
    public String toString() {
        return "Protortype{" +
                "name='" + name + '\'' +
                ", data='" + data + '\'' +
                ", content='" + content + '\'' +
                ", attachment=" + attachment +
                '}';
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
