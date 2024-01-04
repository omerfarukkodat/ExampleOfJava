import java.io.*;

public class TestDataStream {
    public static void main(String[] args) throws IOException {

        try(DataOutputStream output = new DataOutputStream( new BufferedOutputStream(new FileOutputStream("temp.dat"))))
        {
            output.writeUTF("John");
            output.writeDouble(23.34);
            output.writeUTF("Jim");
            output.writeDouble(34.23);
            output.writeUTF("George");
            output.writeDouble(34.45);
        }
        try (DataInputStream input = new DataInputStream (new BufferedInputStream(new FileInputStream("temp.dat"))))
        {
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());

        }

    }

}
