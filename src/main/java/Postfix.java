import java.util.ArrayList;

public class Postfix {
    private static boolean isNumber(String string)  {
// method checks if string can be parsed to Double
    try{
// tries to convert string to Double and returns true if success
        Double.parseDouble(string);
        return true;
// if trows exception catch it and return false because it is not a number
    } catch (NumberFormatException ex){
        return false;
    }
}
    public static String postfixClac(String input){
        ArrayList<Integer> numbers = new ArrayList<>();
        String[] maths = input.split(" ");
        for (String i:maths){
            if (isNumber(i)){
                numbers.add(Integer.valueOf(i));
            }
        }
        switch (maths[2]){
            case "+":
                return Integer.toString(numbers.get(0)+numbers.get(1));
            case "-":
                return Integer.toString(numbers.get(0)-numbers.get(1));
            case "*":
                return Integer.toString(numbers.get(0)*numbers.get(1));
            case "/":
                return Integer.toString(numbers.get(0)/numbers.get(1));
        }
        return "Something went wrong";
    }
}
