import OOP.Product;
import animals.Lion;
import zoo_cell.Zoo;

public class Main {
    public static void main(String[] args) {
        new Zoo();
        Lion firstLion = new Lion(10, 10, 10, 10);
        firstLion.feed(50);
        System.out.println(firstLion.getWeight());
        Product newProduct = new Product("орешки", 100);
        firstLion.feed(newProduct);
    }
}