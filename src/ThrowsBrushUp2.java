import java.io.FileInputStream;
import java.io.FileNotFoundException;

 // Throws keyword is used to declare that this method will throw exception and caller method should handle this manually.
//  Throws keyword is used to declare only checked exception.

class ReadAndWrite{
     void readFile() throws FileNotFoundException
    {
        FileInputStream fs=new FileInputStream("d:/abc.txt");
    }

}
public class ThrowsBrushUp2 {

    public static void main(String[] args) {
        ReadAndWrite obj= new ReadAndWrite();
        try{
            obj.readFile();

        }
        catch (FileNotFoundException e){
            System.out.println("File is not available");
        }
        finally {
            System.out.println("*********");
        }

    }
}
