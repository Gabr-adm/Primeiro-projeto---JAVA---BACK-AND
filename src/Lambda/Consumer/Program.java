package Lambda.Consumer;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Notebook", 2500));
        list.add(new Product("Teclado", 80));
        list.add(new Product("Mouse", 50));
        list.add(new Product("Playstation", 4500));
        list.add(new Product("TV", 3500));


        list.forEach(new PriceUpdate());

        list.forEach(Product :: staticPricceUpdate);

        list.forEach(System.out::println);

    }
}
