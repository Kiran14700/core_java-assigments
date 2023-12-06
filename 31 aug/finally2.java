import java.io.FileInputStream;
import java.io.IOException;

public class finally2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("d:/abc.txt");
        } catch (Exception e) {
            System.out.println("File not found");
        }
        finally{
        //cleanup code
        //it throws Io exception thathy we use IoException

        if(fis!=null)
        {
        fis.close();

        }
        System.out.println("File closed");
        }


        // finally {
        //     // cleanup code
        //     // if use didnt want to use Throws then you should try catch method in finally
        //     if (fis != null) {
        //         try 
        //         {
        //             fis.close();
        //         } 
        //         catch (Exception e)
        //          {

        //             System.out.println("File closed");

        //         }

        //     }
        // }
    }
}
