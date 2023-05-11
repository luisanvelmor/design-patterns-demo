import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        Product apple = new Product("apple", Color.RED, Size.SMALL);
        Product bag = new Product("bag", Color.YELLOW, Size.MEDIUM);
        Product ball = new Product("ball", Color.RED, Size.MEDIUM);


        Filter<Product> productFilter = new ProductFilter();
        List<Product> products = List.of(apple, bag, ball);

        System.out.println(System.lineSeparator() + "RED PRODUCTS ARE: ");
        productFilter.filter(products, new ColorSpecification(Color.RED))
        .forEach(p -> System.out.println(" - " + p.getName() + ": is red"));

        System.out.println(System.lineSeparator() + "MEDIUM PRODUCTS ARE: ");
        productFilter.filter(products, new SizeSpecification(Size.MEDIUM))
        .forEach(p -> System.out.println(" - " + p.getName() + ": is medium"));


    }

}
