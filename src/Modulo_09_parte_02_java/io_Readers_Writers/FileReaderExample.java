package Modulo_09_parte_02_java.io_Readers_Writers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderExample {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir o fechamento automático do recurso
        try (Reader reader = new FileReader("arquivo.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Processar a linha lida
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
