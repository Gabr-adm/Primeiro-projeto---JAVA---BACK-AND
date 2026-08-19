package Arquivos.FileReaderAndBufferedReader.BufferredWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        String[] lines = new String[] {"DACUEBINHHA","DACUEBA", "DACUEBAO"};

        String path = "/home/gabriel.jose/Documentos/file/out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line: lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
