package bridgepattern;

/**
 * Created by Heyha on 2017/1/3.
 */
public class UnixImageImpl implements ImageImpl {
    @Override
    public void doPaint(Matrix m) {
        System.out.print("在Unix系统中显示图像:");
    }
}
