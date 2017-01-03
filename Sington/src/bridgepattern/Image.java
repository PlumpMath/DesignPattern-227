package bridgepattern;

/**
 * Created by Heyha on 2017/1/3.
 */
public abstract class Image {
    protected ImageImpl impl;

    public void setImpl(ImageImpl impl) {
        this.impl = impl;
    }

    public abstract void parseFile(String fileName);
}
