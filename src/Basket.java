import java.util.HashMap;
import java.util.Map;

public class Basket {
    HashMap<Product, Integer> productsHashMap = new HashMap<>();

    public void putProduct(Product p, int i) {
        if (i >= 1) {
            productsHashMap.put(p, i);
        } else {
            productsHashMap.put(p, 1);
        }
    }

    public float priceBasket() {
        float f = 0;
        for (Map.Entry<Product, Integer> product : productsHashMap.entrySet()) {
            f += product.getKey().getPrice() * product.getValue();
        }
        return f;
    }
}
