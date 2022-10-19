import java.util.Random;

public class RandomNumber {
    public String randomNumber(){
        StringBuilder builder = new StringBuilder();
        builder.append("+");
        Random random = new Random();
        for(int i = 0; i <= 11; i++){
            builder.append(random.nextInt(9));
        }
        return builder.toString();
    }
}
