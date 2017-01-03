package decoratorpattern;

/**
 * 抽象装饰类
 * 此处为半透明装饰类
 * Created by Heyha on 2017/1/3.
 */
public class ComponentDecorator extends Component {
    private Component component;  //维持抽象构件对象的引用

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
