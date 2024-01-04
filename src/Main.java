import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        try(FileOutputStream outputStream = new FileOutputStream("temp.dat"))
        {
         for (int i=1; i<=10;i++){
             outputStream.write(i);
         }

        }

        try(FileInputStream inputStream = new FileInputStream("temp.dat")){
            int value;
            while ((value = inputStream.read()) != -1){
                System.out.print(value + " ");
            }
        }


    }
}