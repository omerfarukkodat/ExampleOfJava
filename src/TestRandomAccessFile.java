import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
    public static void main(String[] args) throws IIOException {
        try (RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw")) {
            inout.setLength(0);

            for (int i = 0; i < 200; i++) {
                inout.writeInt(i);
            }
            // Display the current length of the file
            System.out.println("Current file length is :" + inout.length());

            // Retrieve the first number
            inout.seek(0);
            System.out.println("The first number is " + inout.readInt());
            // Retrieve the second number
            inout.seek(1 * 4);
            System.out.println("The second number is " + inout.readInt());
            // Retrieve the tenth number
            inout.seek(9 * 4);
            System.out.println("The tenth number is " + inout.readInt());
            // Modify the eleventh number

            inout.writeInt(555);
            //Append a new number
            inout.seek(inout.length()); //Move the file pointer to the end
            inout.writeInt(999);
            System.out.println("The new length is " + inout.length());
            // Retrieve the new eleventh number
            inout.seek(10 * 4); // Move the file pointer to the eleventh number
            System.out.println("The eleventh number is " + inout.readInt());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
