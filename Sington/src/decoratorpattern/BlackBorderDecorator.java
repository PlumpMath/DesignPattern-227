package decoratorpattern;

/**具体装饰类
 * Created by Heyha on 2017/1/3.
 */
public class BlackBorderDecorator extends ComponentDecorator {
    private Component component;

    @Override
    public void setComponent(Component component) {
        super.setComponent(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    private void setScrollBar() {
        System.out.println("为构件增加黑色边框!");
    }

    public void display2(){
        System.out.println("使用具体装饰类装饰");
    }
}
