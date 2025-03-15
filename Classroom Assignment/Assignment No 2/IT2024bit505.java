class IT2024bit505 {
      
      static StringBuffer getSumByIteration(int number){
            int sum=0;
            int remainder=0;
            StringBuffer sb = new StringBuffer();
            
            while(number>9){
            remainder = number%10;
            sum += remainder;
            sb.insert(0,"+" + remainder);
            number/=10;
            }
            sum+=number;
            sb.insert(0,number);
            return sb.append("=" + sum);
            
      }
    
      static StringBuffer getSumByRecursion(int number) {
            if (number < 10) return new StringBuffer().append(number + "=" + number);
    
                  int remainder = number % 10;
    
                  StringBuffer sb = getSumByRecursion(number/10);  
                  int sum = Integer.parseInt((sb.substring(sb.indexOf("=")+1)) + remainder);
    
                  return sb.replace(sb.indexOf("="),sb.length(),"+" + remainder + "=" + sum);
      }
      
      static String isPalindromeByIteration(int number){
            String num = String.valueOf(number);
            int n = num.length();
            for(int i=0;i<n/2;i++){
                  if(num.charAt(i) != num.charAt(n - 1 - i)) 
                  return "The given number is not palindrome because " + num.charAt(i) + " at index no " + i + " and " + num.charAt(n - 1 - i) + " at index no " + (n-1-i) + 
                  " not matching!";
            }
            return "The given number is palindrome!";
      }
      
            static int index = 0;
      static String isPalindromeByRecursion(String num) {
            int n = num.length();
                  if (n == 1) return  "The given number is palindrome!";
    
                  if (num.charAt(0) != num.charAt(n -1)) return "The given number is not palindrome because " + num.charAt(0) + " at index no " + index + " and "
                  + num.charAt(n - 1) + " at index no " + (n - 1 + index) + " not matching!";
                  index++;
                 return isPalindromeByRecursion(num.substring(1,num.length()-1));
     }

      
      static int getCountOfPPSByIteration(String input){
            int count = 0;
            String sub="";
            for(int i=0;i<input.length();i++){
                  for(int j=i;j<input.length();j++){
                        sub=input.substring(i,j+1);
                              for(int k=0;k<sub.length();k++){
                                    if(sub.charAt(0) != sub.charAt(sub.length()-1-k)) count--; break; //Adjustment
                              }
                              count++;
                  } 
            }
            return count+1;
      }
            static int i=0,j=0,count=1;
      static int getCountOfPPSByRecursion(String input){
            if (i >= input.length()) return count;
            else if(j >= input.length()){
                        i++;
                        j=i;
                  }
            if (j < input.length()) {
                  StringBuilder subString = new StringBuilder();
                  subString.append(input.substring(i, j + 1));
                  if (subString.toString().equals(subString.reverse().toString())) count++;
                  j++;
              }     
            return getCountOfPPSByRecursion(input);
      }
      
      public static void main(String[] args){
              System.out.println("Using Iteration: " + getSumByIteration(Integer.parseInt(args[0])));
              System.out.println("Using Recursion: "+ getSumByRecursion(Integer.parseInt(args[0])));
              
              System.out.println("Using Iteration: " + isPalindromeByIteration(Integer.parseInt(args[0])));
              System.out.println("Using Recursion: "+ isPalindromeByRecursion(args[0]));
              
              System.out.println("Using Iteration: " + getCountOfPPSByIteration(args[0]));   
              System.out.println("Using Recursion: "+ getCountOfPPSByRecursion(args[0]));
      }
}
