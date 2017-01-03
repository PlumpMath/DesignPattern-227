package decoratorpattern;

/**具体构件类
 * Created by Heyha on 2017/1/3.
 */
public class Window extends Component {
    @Override
    public void display() {
        System.out.println("show window!");
    }
}
