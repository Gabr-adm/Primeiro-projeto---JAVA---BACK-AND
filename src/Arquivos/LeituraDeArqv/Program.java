package Arquivos.LeituraDeArqv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        File file = new File("/home/gabriel.jose/Documentos/file/in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (sc != null){
                sc.close();
            }
        }
    }
}
