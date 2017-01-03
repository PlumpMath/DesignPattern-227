package compositepattern;

import java.util.IllegalFormatException;

/**
 * Created by Heyha on 2017/1/3.
 */
public class Leaf extends Component {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {
        throw new IllegalArgumentException("style not compaire");
    }

    @Override
    public void remove(Component c) {
        throw new IllegalArgumentException("style not compaire");
    }

    @Override
    public Component getChild(int i) {
        throw new IllegalArgumentException("style not compaire");
    }

    @Override
    public void operation() {
        System.out.println("I am an" + name);
    }
}
