package bridgepattern;

/**
 * Created by Heyha on 2017/1/3.
 */
public class PngImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        impl.doPaint(matrix);
        System.out.println(fileName + "文件格式为.PNG");
    }
}
