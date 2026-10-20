import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;

public class Queues {

    public static void main(String[] args){

        Scanner Keyboard = new Scanner(System.in);
        Queue<Character> letters = new LinkedList<Character>();
        int[] occurrence = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        char thisChar;
        int arrayPos;

        System.out.println("Enter a phrase to test > ");
        String inputStr = Keyboard.nextLine();

        int i = 0;
        while(i < inputStr.length()){
            thisChar = inputStr.charAt(i);
            arrayPos = (int)thisChar - (int) 'a';
            System.out.printf("%c goes at %d\n", thisChar, arrayPos);
            occurrence[arrayPos]++;
            letters.add(thisChar);
            i++;
        }
        boolean finished = false;
        while(!letters.isEmpty() && !finished) {
            thisChar = letters.remove();
            arrayPos = (int) thisChar - (int) 'a';
            if (occurrence[arrayPos] == 1) {
                System.out.printf("First non-repeating character is %c\n", thisChar);
                finished = true;

            }
        }
        if(!finished)
            System.out.printf("there are no recurring characters");


    }


}
