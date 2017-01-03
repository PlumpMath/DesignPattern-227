package compositepattern;

/**
 * Created by Heyha on 2017/1/3.
 */
public abstract class Component {
    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract Component getChild(int i);
    public abstract void operation();
}
