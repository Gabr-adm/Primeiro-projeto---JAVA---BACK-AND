package Lambda.Comparator;

import java.util.ArrayList;
import java.util.List;

public class Programa {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        /*Product p1 = new Product("Notebook", 2500);
        Product p2 = new Product("Playstation", 4500);
        Product p3 = new Product("TV", 3500);
        list.add(p1);
        list.add(p2);
        list.add(p3);*/

       // Collections.sort(list);

        //list.sort(new MyComparator());

       /* Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
            }
        };*/

        list.add(new Product("Cotebook", 2500));
        list.add(new Product("Blaystation", 4500));
        list.add(new Product("AV", 3500));

       // Comparator<Product> comp = (p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());

        list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

        for (Product p: list){
            System.out.println(p);
        }

    }
}
