import java.util.Stack;
import java.util.Scanner;

public class Stacks {

    public static void main(String[] args){

        Scanner Keyboard = new Scanner (System.in);
        Stack<Character> charStack = new Stack<Character>();
        String reversedStr = "";

        System.out.println("Enter a String > ");
        String inputStr = Keyboard.nextLine();

        int i = 0;
        while(i < inputStr.length()){
            charStack.push(inputStr.charAt(i));
            i++;
        }

        System.out.println("Stack contents" + charStack);


        while(!charStack.empty()){
            reversedStr += charStack.pop();

        }
        System.out.printf("%s reversed is %s\n", inputStr , reversedStr);
        if (reversedStr.equals(inputStr)){
            // U can also do: if (reversedStr.compateToIgnoreCase(inputStr) == 0)
            // this will show the strings are equal regarding if char is capital or s.
            System.out.printf("%s is palindrome", inputStr);
        }
    }
}
