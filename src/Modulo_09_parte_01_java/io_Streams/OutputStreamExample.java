package Modulo_09_parte_01_java.io_Streams;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("saida.txt")) {
            String data = "Hello, Java IO!";
            byte[] bytes = data.getBytes();
            output.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
