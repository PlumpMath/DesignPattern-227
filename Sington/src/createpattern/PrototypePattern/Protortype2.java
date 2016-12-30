package createpattern.PrototypePattern;

import java.io.*;

/**
 * Created by Heyha on 2016/12/30.
 */
public class Protortype2 implements Serializable,Cloneable {
    private String name;
    private String data;
    private String content;
    private Attachment2 attachment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Attachment2 getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment2 attachment) {
        this.attachment = attachment;
    }

    @Override
    protected Object clone() {
        try {
            //将对象写入流中
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(bao);
            oo.writeObject(this);

            //将对象从流中取出
            ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bai);
            return oi.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
