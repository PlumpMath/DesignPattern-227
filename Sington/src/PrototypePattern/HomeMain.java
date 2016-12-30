package PrototypePattern;

/**
 * 原型模式也就是克隆模式,java自带clone(),但是为浅克隆
 * 浅克隆：对象被复制时只复制它本身和其中包含的值类型的成员变量，而引用类型的成员对象并没有复制
 * 深克隆：除了对象本身被复制外，对象所包含的所有成员变量也将复制
 * java中要实现深克隆需要将对象序列化，实现Serializable接口，然后将内容写入内存
 * Attachment、Protortype实现的是浅克隆方案
 * Attachment2、Protortype2实现的是深克隆方案
 * Created by Heyha on 2016/12/30.
 */
public class HomeMain {
    public static void main(String[] args) {
        Protortype protortype, newPrototype;
        Attachment attachment = new Attachment();
        protortype = new Protortype();
        protortype.setAttachment(attachment);
        protortype.setName("nali");
        protortype.setData("第13周");
        protortype.setContent("123");
        newPrototype = (Protortype) protortype.clone();
        System.out.println("浅克隆测试");
        System.out.println("Prototype是否相同？" + (protortype == newPrototype));
        System.out.println("Attachment是否相同？" + (protortype.getAttachment() == newPrototype.getAttachment()));

        Protortype2 protortype2, newProtortype2;
        Attachment2 attachment2 = new Attachment2();
        protortype2 = new Protortype2();
        protortype2.setAttachment(attachment2);
        protortype2.setName("wang");
        protortype2.setData("14周");
        protortype2.setContent("456");
        newProtortype2 = (Protortype2) protortype2.clone();
        System.out.println("深克隆测试");
        System.out.println("Protortype2是否相同？" + (protortype2 == newProtortype2));
        System.out.println("Attachment2是否相同？" + (protortype2.getAttachment() == newProtortype2.getAttachment()));

    }
}
