package Lambda.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Notebook", 2500));
        list.add(new Product("Teclado", 80));
        list.add(new Product("Mouse", 50));
        list.add(new Product("Playstation", 4500));
        list.add(new Product("TV", 3500));

        Predicate<Product> pred = p -> p.getPreco() >= 100;

 //       list.removeIf(Product :: staticProductPredicate);
        list.removeIf(pred);

        for (Product p : list){
            System.out.println(p);
        }

    }
}
