package OOP;

import java.util.ArrayList;

public class Task_01 {

    public static void main(String[] args) {
        VendingMachine<Product> firstMachine = new VendingMachine<>("first machine");
        Product first = new Product("орешки", 100);
        Product second = new Product("шоколад", 150);
        firstMachine.addProduct(first);
        firstMachine.addProduct(second);
        firstMachine.printProducts();
        System.out.println("---------");

        Drink firstDrink = new Drink("кола", 100, 100);
        Drink secondDrink = new Drink("квас", 150, 150);

        HotDrinkVendingMachine secondMachine = new HotDrinkVendingMachine("second machine");
        HotDrink firstHotDrink = new HotDrink("кофе", 200, 100, 90);
        HotDrink secondHotDrink = new HotDrink("какао", 180, 100, 85);
        secondMachine.addProduct(firstHotDrink);
        secondMachine.addProduct(secondHotDrink);
        System.out.println(secondMachine.getProduct("какао", 100, 85).getPrice());
        System.out.println("---------");

        ArrayList<Product> products = new ArrayList<>();
        products.add(first);
        products.add(second);
        products.add(firstDrink);
        products.add(secondDrink);
        products.add(firstHotDrink);
        products.add(secondHotDrink);
        for (Product el : products) {
            el.consume();
        }

        System.out.println("---------");
        VendingMachine<Product> crazyVendingMachine = new VendingMachine<>("crazy");
        crazyVendingMachine.setProductList(products);
        for (Product el : crazyVendingMachine.getProductList()) {
            crazyVendingMachine.getProduct(el.getName()).consume();
        }
    }
}