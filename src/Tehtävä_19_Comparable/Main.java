package Tehtävä_19_Comparable;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<TrafficCard> cardUsers = new ArrayList<>();
        RandomString rString = new RandomString(10);
        TrafficCard myCard;
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            myCard = new TrafficCard(r.nextInt(100), rString.nextString(), ((float) r.nextInt(1000) / 10));
            cardUsers.add(myCard);
        }
        System.out.println("\nGeneroidut Traffic Cards\n");
        cardUsers.forEach(System.out::println);

        System.out.println("\nKortit sortattu traveller number:n perusteella\n");
        Collections.sort(cardUsers);
        cardUsers.forEach(System.out::println);
    }
    
}
