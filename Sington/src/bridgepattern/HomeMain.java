package bridgepattern;

import createpattern.open.XmlUtil;

/**
 * Created by Heyha on 2017/1/3.
 */
public class HomeMain {
    public static void main(String[] args) {
        ImageImpl imageImpl = (ImageImpl) XmlUtil.getINSTANCE().getBean("bridgepattern.","sysType");
        Image image = (Image) XmlUtil.getINSTANCE().getBean("bridgepattern.", "imageType");
        image.setImpl(imageImpl);
        image.parseFile("123");
    }
}
