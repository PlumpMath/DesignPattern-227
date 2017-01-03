package decoratorpattern;

/**具体装饰类
 * Created by Heyha on 2017/1/3.
 */
public class ScrollBarDecorator extends ComponentDecorator {
    public Component component;

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
        System.out.println("为构件增加滚动条!");
    }
}
