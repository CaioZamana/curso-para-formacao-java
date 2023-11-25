package Modulo_09_parte_02_java.io_Readers_Writers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterExample {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir o fechamento automático do recurso
        try (Writer writer = new FileWriter("arquivo.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            String data = "Hello, Java Writers!";
            bufferedWriter.write(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
