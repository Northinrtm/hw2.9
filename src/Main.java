import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    Map<String, Integer> map = new HashMap<>();

    public void putDo(String s, Integer i) {
        if (map.containsKey(s)) {
            if (map.get(s) == i) {
                throw new RuntimeException();
            } else {
                map.remove(s);
                map.put(s, i);
            }
        } else {
            map.put(s, i);
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        RandomName randomName = new RandomName();
        Random random = new Random();

        for (int i = 0; i <= 10; i++) {
            m.map.put(randomName.randomIdentifier() + " " + randomName.randomIdentifier(), random.nextInt());
        }
        System.out.println(m.map);
    }
}