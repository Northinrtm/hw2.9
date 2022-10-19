import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        RandomName randomName = new RandomName();
        RandomNumber randomNumber = new RandomNumber();
        for (int i = 0; i <= 20; i++) {
            phoneBook.put(randomName.randomIdentifier() + " " + randomName.randomIdentifier(), randomNumber.randomNumber());
        }
        System.out.println(phoneBook);
    }
}
