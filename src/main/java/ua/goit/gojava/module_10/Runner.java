package ua.goit.gojava.module_10;

import java.io.*;
import java.util.Scanner;

public class Runner {
    private static String workingDir = System.getProperty("user.dir");

    public static void main(String[] args) throws IOException {
        String filename = "newfile.txt";
        String absolutePath = workingDir + File.separator + filename;
        Scanner sc = new Scanner(System.in);

        File file = new File(absolutePath);

        if (!file.exists()) {
            file.createNewFile();
        }

        System.out.println("Please enter the text to encrypt and write into the file:");
        String content = sc.nextLine();

        System.out.println("Please enter the key length:");
        int key = sc.nextInt();

        if (key > 0) {
            try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(absolutePath)))) {
                DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(absolutePath)));

                String encrypted = CesarAlgorithm.encrypt(content, key);
                out.writeUTF(encrypted);

                System.out.println("The text is encrypted and written to newfile.txt");

                out.close();

                String readText = in.readUTF();
                String decrypted = CesarAlgorithm.decrypt(readText, key);

                System.out.println("\nHere is the decrypted text:\n" + decrypted);
            } catch (EOFException e) {
                System.out.println("Reached the end of the file");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Key should be a positive number");
        }
    }
}