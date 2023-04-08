import java.util.Scanner;

class StringUtils {

    // Method to reverse the String
    public String reverse(String inputString){
        if(isEmpty(inputString)) {
            return "Invalid Input";
        }
        else {
            String newString = "";
            char character;

            for (int indexOfString = 0; indexOfString < inputString.length(); indexOfString++) {
                character = inputString.charAt(indexOfString);
                newString = character + newString;
            }
            return newString;
        }
    }

    // Method to check if the String is empty
    public boolean isEmpty(String inputString){
        if(inputString.equals(""))
            return true;
        else
            return false;
    }

    // Method to check if the String is Palindrome
    public boolean isPalindrome(String inputString){
        if(isEmpty(inputString)) {
            return false;
        }
        else {
            String reversed = reverse(inputString);
            if (inputString.equals(reversed)) {
                return true;
            } else
                return false;
        }
    }

    public static void main(String[] args) {
        StringUtils stringUtils=new StringUtils();
        Scanner Input=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String UserInput=Input.nextLine(); // Taking input from user
        // Calling methods and storing the output returned by the method
        String reversedString=stringUtils.reverse(UserInput);
        boolean empty=stringUtils.isEmpty(UserInput);
        boolean palindrome=stringUtils.isPalindrome(UserInput);
        System.out.println("Reversed String: "+reversedString);
        // Printing the output
        System.out.println("isEmpty: "+empty);
        System.out.println("isPalindrome: "+palindrome);
    }
}
