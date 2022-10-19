import java.util.*;
import java.util.Map;

import static java.util.Arrays.asList;

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
        Map<String, List<Integer>> map1 = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map1.put(randomName.randomIdentifier(),
                    new ArrayList<>(asList(new Integer[]{random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)})));
        }
        System.out.println(map1);
        Map<String, Integer> map2 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> pair : map1.entrySet()) {
            map2.put(pair.getKey(), pair.getValue().get(0) + pair.getValue().get(1) + pair.getValue().get(2));
        }
        System.out.println(map2);
        Map<Integer, String> map3 = new LinkedHashMap<>();
        for (int i = 0;i<10;i++){
            int a = random.nextInt(100);
            System.out.print(a + " ");
            String s = randomName.randomIdentifier();
            System.out.print(s + " ");
            map3.put(a,s);
        }
        System.out.print("\n");
        for (Map.Entry<Integer,String> pair: map3.entrySet()) {
            System.out.print(pair + " ");
        }
    }
}