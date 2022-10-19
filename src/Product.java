import java.util.HashMap;
import java.util.Objects;

public class Product {
    private final String name;
    private float price;
    private float weight;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price > 0.0f) {
            this.price = price;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0.0f) {
            this.weight = weight;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public Product(String name, float price, float weight) {
        if (name != null) {
            this.name = name;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
        setPrice(price);
        setWeight(weight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getName().equals(product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.putProduct(new Product("Бананы", 1.11f, 1.11f), 2);
        basket.putProduct(new Product("Бананы", 1.11f, 1.11f), 2);
        basket.putProduct(new Product("Яблоки", 2.22f, 2.22f), 2);
        basket.putProduct(new Product("Киви", 3.33f, 3.33f), -2);
        System.out.println(basket.productsHashMap);
        System.out.println(basket.priceBasket());
    }
}

