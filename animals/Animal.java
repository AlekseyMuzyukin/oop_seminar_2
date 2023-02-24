package animals;

public abstract class Animal {

    protected int age;
    protected int weight;
    protected int limbsCount;

    Animal(int age, int weight, int limbsCount) {
        this.age = age;
        this.weight = weight;
        this.limbsCount = limbsCount;
    }

    public abstract int getMaxWeight();

    public abstract String getType();

    public void feed(int foodWeight) {
        if (this.weight + foodWeight <= getMaxWeight()) {
            this.weight = +foodWeight;
        } else {
            System.out.println("Max weight exceeded");
        }
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

    public int getLimbsCount() {
        return this.limbsCount;
    }

    public void setLimbsCount(int limbsCount) {
        this.limbsCount = limbsCount;
    }
}