package bridgepattern;

/**
 * Created by Heyha on 2017/1/3.
 */
public class WinImageImpl implements ImageImpl {
    @Override
    public void doPaint(Matrix m) {
        System.out.print("在window中显示图像:");
    }
}
