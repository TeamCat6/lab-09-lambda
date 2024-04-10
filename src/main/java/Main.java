import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new FoodProduct("apple", 2, 0.5, 10, FoodType.FRUIT));
        products.add(new FoodProduct("pear", 1, 0.5, 10, FoodType.FRUIT));
        products.add(new FoodProduct("apple", 1, 0.5, 10, FoodType.FRUIT));
        products.add(new FoodProduct("blueberry", 1, 0.5, 10, FoodType.FRUIT));
        products.add(new FoodProduct("pear", 4, 0.5, 10, FoodType.FRUIT));

        System.out.println("Compare by name");
        Product[] productArrayCompareByName = products.toArray(new Product[]{});
        Arrays.sort(productArrayCompareByName, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        printProducts(productArrayCompareByName);

        System.out.println("Compare by reverse name");
        Product[] productArrayCompareByNameReverse = products.toArray(new Product[]{});
        Arrays.sort(productArrayCompareByNameReverse, new ByNameComparator().reversed());
        printProducts(productArrayCompareByNameReverse);

        System.out.println("Compare by name then by quantity");
        Product[] productArrayCompareByNameAndQuantity = products.toArray(new Product[]{});
        Arrays.sort(productArrayCompareByNameAndQuantity, new ByNameComparator().thenComparing(Product::getQuantity));
        printProducts(productArrayCompareByNameAndQuantity);

        System.out.println("Compare by name and null first/last");
        products.add(null);
        Product[] productArrayCompareByNameAndNulls = products.toArray(new Product[]{});
        Arrays.sort(productArrayCompareByNameAndNulls, Comparator.nullsFirst(new ByNameComparator()));
//        Arrays.sort(productArrayCompareByNameAndNulls, Comparator.nullsLast(new ByNameComparator()));
        printProducts(productArrayCompareByNameAndNulls);
    }

    private static void printProducts(Product[] products) {
        for (Product product : products) {
            if (product == null) {
                System.out.println("Null");
            } else {
                System.out.println("Name: " + product.getName() + " Quantity: " + product.getQuantity());
            }
        }
        System.out.println();
    }
}
