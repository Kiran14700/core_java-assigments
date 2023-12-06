import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class Test {
    public void show() throws FileNotFoundException // by throws keyword we remove exception by giving exception name
    {
        FileInputStream fis = new FileInputStream("d:/xyz.txt");
    }

    public void save() throws FileNotFoundException // by throws keyword we remove exception by giving exception name
    {
        String text = "this is demo";
        FileOutputStream fis = new FileOutputStream("d:/zyx.txt");
    }

}

public class ExceptionThrows2 {
    public static void main(String[] args) {
        Test obj = new Test();

        try {

            obj.save();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("hello");

    }
}
