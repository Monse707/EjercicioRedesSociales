
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        File doc = new File("C:\\Users\\rodol\\Downloads\\presenciaredes.csv");
        List<String> myList = new ArrayList<String>();
            try (
                Scanner obj = new Scanner(doc)) {
                while (obj.hasNextLine())
                    myList.add(obj.nextLine());
            }catch (Exception e){

            }

            Tabla tabla = new Tabla (myList) ;
    }
}







