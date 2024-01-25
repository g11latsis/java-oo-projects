package gr.aueb.ch20.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    private static final List<Product> products = Arrays.asList(
            new Product(1, "Orange", 15.50, 42),
            new Product(2, "Apple", 20.40, 25),
            new Product(3, "Banana", 12.30, 50)
    );

    public static void main(String[] args) {
        List<Product> filteredProducts = getFilteredProduct(products, product -> product.getId() == 2);
        List<Product> filteredProducts1 = getFilteredProduct(products, product -> product.getQuantity() > 25);
        List<Product> filteredProducts2 = getFilteredProduct(products, product -> product.getPrice() > 20);

        printProducts(filteredProducts, System.out::println);
        printProducts(filteredProducts1, System.out::println);
        printProducts(filteredProducts2, System.out::println);
    }

    public static List<Product> getFilteredProduct(List<Product> products, Predicate<Product> filter) {
        List<Product> productsToReturn = new ArrayList<>();
        for (Product product : products) {
            if (filter.test(product)) {
                productsToReturn.add(product);
            }
        }
        return productsToReturn;
    }

    public static void printProducts(List<Product> products, Consumer<Product> consumer) {
        for (Product product : products) {
            consumer.accept(product);
        }
    }
}
