class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean isReserved;

    public Product(String name, String productionDate, String manufacturer,
                   String countryOfOrigin, double price, boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isReserved = isReserved;
    }

    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price);
        if (isReserved) System.out.println("Забронирован: Да");
        else System.out.println("Забронирован: Нет");
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 16 Pro", "15.01.2025", "Apple Inc.", "USA", 4899, false);
        productsArray[2] = new Product("Xiaomi 15", "10.03.2025", "Xiaomi", "China", 3299, true);
        productsArray[3] = new Product("Google Pixel 9", "05.02.2025", "Google", "USA", 4199, false);
        productsArray[4] = new Product("Huawei P70", "20.01.2025", "Huawei", "China", 4599, true);

        for (Product product : productsArray) {
            product.displayInfo();
        }
    }
}

class Park {
    private String parkName;
    private Attraction[] attractions;

    public Park(String parkName, int count) {
        this.parkName = parkName;
        this.attractions = new Attraction[count];
    }
    class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void displayInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price);
        }
    }

}