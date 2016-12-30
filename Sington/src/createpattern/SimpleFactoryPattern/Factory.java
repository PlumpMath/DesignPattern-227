package createpattern.SimpleFactoryPattern;

/**
 * 简单工厂
 * Created by Heyha on 2016/12/29.
 */
public class Factory {
    public static AbstractProduct getProduct(String arg0){
        AbstractProduct product = null;
        switch (arg0){
            case "A":
                product = new ProductA();
                break;
            case "B":
                product = new ProductB();
                break;
            case "C":
                product = new ProductC();
                break;
            default:
                throw new UnknownError("不支持的类型");
        }
        return product;
    }
}
