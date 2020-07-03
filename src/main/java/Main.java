import java.util.ArrayList;
import java.util.Scanner;

public class Main {
/**Operators: + - * /
    Postfix Examples: 1 2 +
    Postfix Examples: 5 15 /
    Prefix Examples: - 2 4
    Prefix Examples: * 11 2
    # Postfix prefix calculator
    Use colors in the commandline prints(B) (Google it)
    Menu: 0-Choose between postfix prefix calculations
    Menu: 1-Save the result in a file(B) 2-Print the result on screen
    Menu: 3-Read from the file(B)
    Hints: 1- You should not use hardcoded nested if-else statements for choosing between operators.
    Hints: 2- You have to handle exceptions
    Hints: 3- Try to implement it with usage of generic types
 */
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    private static String result;
    static ArrayList<String> results = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to calculator.\nWhich calculator do you wish to use? (enter corresponding number)\n" +
                "1. "+RED+"Prefix"+RESET+" calculator ("+YELLOW+"iterator "+BLUE+"number number"+RESET+")"+
                "\n2."+RED+" Postfix"+RESET+" calculator ("+BLUE+"number number"+YELLOW+" iterator"+RESET+")");
        switch (scanner.nextLine()){
            case "1":
                System.out.println("Enter your iterator ("+YELLOW+"+, -, *, /"+RESET+") and numbers.("+YELLOW+"iterator "+BLUE+"number number"+RESET+")");
                result = Prefix.prefixClac(scanner.nextLine());
                results.add(result);
                System.out.println(result);
                break;
            case "2":
                System.out.println("Enter your numbers and iterator("+YELLOW+"+, -, *, /"+RESET+").("+BLUE+"number number"+YELLOW+" iterator"+RESET+")");
                result = Postfix.postfixClac(scanner.nextLine());
                results.add(result);
                System.out.println(result);
                break;
            default:
                System.out.println("Error! Wrong input.");
        }

    }
}
