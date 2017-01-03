package compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Heyha on 2017/1/3.
 */
public class Composite extends Component {
    private List<Component> list = new ArrayList<>();
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        System.out.println("we are in " + name);
        for (Object obj : list){
            ((Component)obj).operation();
        }
    }
}
