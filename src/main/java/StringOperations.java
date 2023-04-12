import java.util.Scanner;

class StringOperations {

    // Method to reverse the String
    public String reverse(String inputStr){
        if(isEmpty(inputStr)) {
            return "Invalid Input";
        }
        else {
            String reversedStatement = "";
            char letterOfWord;

            for (int index = 0; index < inputStr.length(); index++) {
                letterOfWord = inputStr.charAt(index);
                reversedStatement = letterOfWord + reversedStatement;
            }
            return reversedStatement;
        }
    }

    // Method to check if the String is empty
    public boolean isEmpty(String inputStr){
        if(inputStr.equals("")) {
            return true;
        }
        return false;
    }

    // Method to check if the String is Palindrome
    public boolean isPalindrome(String inputStr){
        if(isEmpty(inputStr)) {
            return false;
        }
        else {
            String reversedStatement = reverse(inputStr);
            if (inputStr.equals(reversedStatement)) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        StringOperations stringOperations =new StringOperations();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String userInput=input.nextLine(); // Taking input from user
        // Calling methods and storing the output returned by the method
        String reverseOutput= stringOperations.reverse(userInput);
        boolean isEmptyOutput= stringOperations.isEmpty(userInput);
        boolean palindromeOutput= stringOperations.isPalindrome(userInput);
        // Printing the output
        System.out.println("Reversed String: "+reverseOutput);
        System.out.println("isEmpty: "+isEmptyOutput);
        System.out.println("isPalindrome: "+palindromeOutput);
    }
}
