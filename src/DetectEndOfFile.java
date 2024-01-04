import java.io.*;

public class DetectEndOfFile {
    public static void main(String[] args) {
        try {
            try(DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat")))
            {
                output.writeDouble(12.23);
                output.writeDouble(23.34);
                output.writeDouble(23.45);
            }
            try(DataInputStream input = new DataInputStream(new FileInputStream("temp.dat")))
            {
                while (true){
                    System.out.println(input.readDouble());
                }
            }


        }

        catch (EOFException ex){
            System.out.println("All data were read.");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
