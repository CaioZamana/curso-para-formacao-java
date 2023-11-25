package Modulo_09_parte_01_java.io_Streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        try (InputStream input = new FileInputStream("arquivo.txt")) {
            int data;
            while ((data = input.read()) != -1) {
                // Processar o byte lido
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
