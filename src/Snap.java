import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

public class Snap {

    public static void main(String[] args){
        Deck deck = new Deck();

        int snapCount = 0;
        int superSnap = 0;
        Card previousCard = deck.deal();
        System.out.println(previousCard);

        for(int i = 0; i < 51; i++){
            Card currentCard = deck.deal();
            System.out.println(currentCard);
            if(currentCard.getRank().equals(previousCard.getRank()) && currentCard.getColour().equals(previousCard.getColour())){
                System.out.println("!SuperSnap \n");
                superSnap ++;

            } else if (currentCard.getRank().equals(previousCard.getRank())) {
                System.out.println("!SNAP\n");
                snapCount ++;

            }
            previousCard = currentCard;
        }
        System.out.println("The number of Snaps is: " + snapCount);
        System.out.println("The number of SuperSnaps is: " + superSnap);

    }

}
