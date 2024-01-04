import java.io.*;
import java.util.Date;
class TestObjectInputStream{
    public static void main(String[] args) throws ClassNotFoundException , IOException{

        try {
            try (ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("temp.dat"))))
            {
                output.writeUTF("John");
                output.writeDouble(23.34);
                output.writeObject(new java.util.Date());
            }



        try (ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream("temp.dat"))))
        {
            String name = input.readUTF();
            double score = input.readDouble();
            java.util.Date date = (java.util.Date) input.readObject();

            System.out.println(name + " " + score + " " + date);
        }


    }
        catch (ClassNotFoundException ex)
        {
            System.out.println("not found");
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }

    }
}
