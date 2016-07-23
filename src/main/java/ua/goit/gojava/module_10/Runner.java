package ua.goit.gojava.module_10;

import java.io.*;
import java.util.Scanner;

public class Runner {
    private static String workingDir = System.getProperty("user.dir");

    public static void main(String[] args) throws IOException {
        String filename = "NewFile.txt";
        String absolutePath = workingDir + File.separator + filename;
        String content;
        int key = 5;

        File file = new File(absolutePath);

        if (!file.exists()) {
            file.createNewFile();
        }

        System.out.println("Please enter the text to encrypt and write into the file:");

        Scanner sc = new Scanner(System.in);

        content = sc.nextLine();

        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(absolutePath)))) {
            String encrypted = CesarAlgorithm.encrypt(content, key);
            out.writeUTF(encrypted);
            
            System.out.println("\nThe text is encoded and written to NewFile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(absolutePath)))) {
            String readText = in.readUTF();
            String decrypted = CesarAlgorithm.decrypt(readText, key);

            System.out.println("\nHere is the decrypted text:\n" + decrypted);
        }
    }
}