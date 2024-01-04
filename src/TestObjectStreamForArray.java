import java.io.*;

public class TestObjectStreamForArray {
    public static void main(String[] args) throws ClassNotFoundException, IOException {

        int[] numbers = {1, 2, 3, 4, 5};
        String[] strings = {"John", "Susan", "Ann"};
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("array.dat", true))) {
            outputStream.writeObject(numbers);
            outputStream.writeObject(strings);
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("array.dat"))) {
                int[] newNumbers = (int[]) (inputStream.readObject());
                String[] newStrings = (String[]) (inputStream.readObject());

                for (int i = 0; i < newNumbers.length; i++) {
                    System.out.print(newNumbers[i] + " ");
                }
                System.out.println();
                for (int i = 0; i < newStrings.length; i++) {
                    System.out.print(newStrings[i] + " ");
                }


            }

        }

    }
}
