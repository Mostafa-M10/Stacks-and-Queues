public class CardTest {

    public static void main (String[] args){
//        Card card1 = new Card();
//        Card card2 = new Card();
//
//        if(card1.isBiggerThan(card2)){
//            System.out.println(card1);
//            System.out.println(card2);
//        } else {
//            System.out.println(card2);
//            System.out.println(card1);
//
//        }


//        Deck deck = new Deck();
//        System.out.println(deck);

//        System.out.println(deck.deal());
//        System.out.println(deck.deal());
//        System.out.println(deck.deal());
//        System.out.println(deck.deal());
//        System.out.println(deck.deal());
//
//
//        System.out.println(deck);



        Card card1 = new Card();
        Card card2 = new Card();

        System.out.println("Card 1 is: " + card1);
        System.out.println("Card 2 is: " + card2);

        if(card1.compareTo(card2)> 0){
            System.out.println("Card one is bigger");

        } else if(card1.compareTo(card2) < 0){
            System.out.println("Card two is bigger");

        } else {
            System.out.println("Card one and Card two are equal!");
        }

    }
}





