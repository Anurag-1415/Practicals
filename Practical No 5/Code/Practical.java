class Practical5{

      //Using For Loop
      int factorial1(int number){
            if(number<0) {
            System.out.println("Can't find the factorial of negative number!"); 
            return 0;
            }
            if(number<2) return 1;
            int factorial=2;
            for(;2<number;){
                  factorial*=number--;
            }
            return factorial;
      }
      
      //using While Loop
      int factorial2(int number){
            if(number<0) System.out.println("Can't find the factorial of negative number!");
            if(number<2) return 1;
            int factorial=2;
            while(number>2){
            factorial*=number--;
            }
            return factorial;
      }
      
      
      //Using Recursion
      int factorial3(int number){
            if(number<0) System.out.println("Can't find the factorial of negative number!");
            if(number<2) return 1;
            int factorial=2;
            factorial=number*factorial3(number-1);
            return factorial;
      }
      
      //Sum of all Array Elements using Recursion            
      int getSum(int[] array,int index){
            if(index==array.length) return 0;
            int sum=0;
            sum+=array[index]+getSum(array,index+1);
            return sum;
      }
      
      //Main Method
      public static void main(String[] args){
              
      
            //Call for factorial using For Loop
            Practical5 f1=new Practical5();
            int fact1=f1.factorial1(7);
            System.out.println("The factorial of your given number is: "+fact1);
            
            //Call for factorial using While Loop
            Practical5 f2=new Practical5();
            int fact2=f2.factorial2(8);
            System.out.println("The factorial of your given number is: "+fact2);
            
            //Call for factorial using Recursion
            Practical5 f3=new Practical5();
            int fact3=f3.factorial3(4);
            System.out.println("The factorial of your given number is: "+fact3);
            
            //Call for Sum of Array Elements using Recursion
            Practical5 arraySum=new Practical5();
            int[] array={1,2,3,4,5,6,7,8,9,10};
            int sum=arraySum.getSum(array,3);
            System.out.println("The sum of your given array elements are: "+sum);
      
      
      
      }

}
