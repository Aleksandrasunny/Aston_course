import java.util.ArrayList;

class Animal {
    private static int animalCount = 0;
    protected String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void run(int distance) {}
    public void swim(int distance) {}
}

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. (максимум 500 м.)");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м. (максимум 10 м.)");
        }
    }
}

class Cat extends Animal {
    private static int catCount = 0;
    private boolean isHungry = true;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isHungry() {
        return isHungry;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. (максимум 200 м.)");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }

    public void eatFromBowl(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            isHungry = false;
            System.out.println(name + " поел из миски и теперь сыт!");
        } else {
            System.out.println(name + " не смог поесть. В миске недостаточно еды!");
        }
    }
}

class Bowl {
    private int foodAmount;

    public Bowl(int initialAmount) {
        this.foodAmount = initialAmount;
    }

    public boolean decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        foodAmount += amount;
        System.out.println("В миску добавлено " + amount + " еды. Теперь в миске: " + foodAmount);
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Cat cat3 = new Cat("Васька");

        dog1.run(300);
        dog1.swim(5);
        dog2.run(600);
        dog2.swim(15);

        cat1.run(150);
        cat1.swim(10);
        cat2.run(250);

        Bowl bowl = new Bowl(30);
        System.out.println("\nВ миске изначально: " + bowl.getFoodAmount() + " еды");

        Cat[] cats = {cat1, cat2, cat3};
        for (Cat cat : cats) {
            cat.eatFromBowl(bowl, 15);
        }

        System.out.println("\nСостояние котов:");
        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + !cat.isHungry());
        }

        bowl.addFood(20);
        cat3.eatFromBowl(bowl, 15);
        System.out.println(cat3.name + " сыт: " + !cat3.isHungry());

        System.out.println("\nВсего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());
    }
}