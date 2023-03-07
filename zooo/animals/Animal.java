package zooo.animals;

import Seminar1.Product;

public abstract class Animal {

    protected int age;
    protected int weight;

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public abstract int getMaxWeight();

    public abstract String getType();

    public void feed(int foodWeight) {
        if (this.weight + foodWeight <= getMaxWeight()) {
            this.weight += foodWeight;
        } else {
            this.weight = getMaxWeight();
            System.out.println("Max weight exceeded");
        }
    }

    public void feed(Product product) {
        System.out.println("Don't feed the " + this.getType() + " " + product.getName() + " from the vending machine");
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}