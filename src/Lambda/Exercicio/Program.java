package Lambda.Exercicio;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("Digite o caminho para procurar o arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
                System.out.println("Mostrar os emails com base nos salários maiores que: ");
                double n = sc.nextDouble();

                Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> emails = list.stream()
                    .filter(p -> p.getSalario() >= n)
                    .map(Product::getEmail)
                    .sorted(comp)
                    .toList();
            emails.forEach(System.out::println);


            double str = list.stream()
                    .filter(p -> p.getNome().charAt(0) == 'M' )
                    .mapToDouble(Product::getSalario)
                    .sum();
            System.out.println("Salário dos nomes que começam com M: R$" + str);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
