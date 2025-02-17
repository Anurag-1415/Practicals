public class 2024bit505 {
      public static String reverse(String inputString){
            if(inputString.length()>0){
            return inputString.charAt(inputString.length()-1) + 
                  reverse(inputString.substring(0,inputString.length()-1));
            }
                  return "";
      }
      
      public static int sumOfDigits(int number){
            if(number == 0) return 0;
            return number%10 + sumOfDigits(number/10);
      }
      
      public static boolean isPalindrome(String inputString){
            if(inputString.length() <= 1) return true;
            if(inputString.charAt(0) != inputString.charAt(inputString.length()-1)) return false;
            return isPalindrome(inputString.substring(1,inputString.length()-1));
      }
      public static void main(String[] args){
            System.out.println("1st Task: \n"+"Input String: Anurag 1401");
            System.out.println("Reversed String: " +reverse("Anurag 1401"));
            
            System.out.println("2nd Task: \n"+"Input Number: 14012005");
            System.out.println("Sum of Digits: "+sumOfDigits(14012005));
            
            System.out.println("3rd Task: \n"+"Input String: NayaN");
            System.out.println("Is it Palindrome: "+isPalindrome("NayaN"));
      }
}
