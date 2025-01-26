class Practical6{

      void displayPattern1(int size){
      
      //First Attempt
           /* int space=0;
            
            for(int ln=1;ln<=2*size-1;ln++){
            if(ln==1||ln==5) space=2;
            if(ln==2||ln==4) space=1;
            else space=0;
            
            for(;space>0;space--){
            System.out.print(" ");
            }
            
            if(ln==size+1) ln=size-1;
            if(ln==size+2) ln=size-2;
            
            for(int plus=2*ln-1;plus>0;plus--){
            
            if(plus%2==0) System.out.print(" ");
            if(ln<size) System.out.print("+ ");
            else System.out.print("* ");
            }
            if(ln==size-1) ln=size+1;
            if(ln==size-2) ln=size+2;
            System.out.println();
            }*/
            
      //Second Attepmt
            int space,symbol;
            //loop for rows
            for(int ln=1;ln<=2*size-1;ln++){
                  if(ln<=size) space=size-ln;
                  else space=ln-size;
            
            //loop for space
            for(;space>0;space--){
                  System.out.print("  ");
            }
                  if(ln<=size) symbol=2*ln-1;
                  else symbol=2*((2*size-1)+1-ln)-1;
            
            //loop for symbol
            for(;symbol>0;symbol--){
                  if(ln<=size){
                  if(symbol%2==0) System.out.print("  ");
                  else System.out.print("+ ");
            }
                  else {
                  if(symbol%2==0) System.out.print("  ");
                  else System.out.print("* ");
            }
            }
                  System.out.println();
            }
      }
      
      void displayPattern2(int size){
      
            int space,plus;
           //loop for rows
           for(int ln=1;ln<=2*size-1;ln++){
                if(ln<=size) space=size-ln;
                else space=ln-size;
           
           //loop for space
           for(;space>0;space--){
                System.out.print("  ");
           }
                if(ln<=size) plus=2*ln-1;
                else plus=2*((2*size-1)+1-ln)-1;
                
           //loop for plus
           for(;plus>0;plus--){
                System.out.print("+ ");
           }
                System.out.println();
           }
      
      }
      
      void displayPattern3(int size){
      
            //First Attempt
            /*int space,symbol;
            //loop for rows
            for(int ln=1;ln<=2*size;ln++){
                  if(ln<=size) space=size-ln;
                  else space=ln-size+1;
                  
            //loop for space
            for(;space>0;space--){
                  System.out.print("  ");
            }
                  if(ln<=size) symbol=2*ln-1;
                  else symbol=2*((2*size-1)+1-ln)-1;
            
            //loop for symbol
            for(;symbol>0;symbol--){
                  if((ln+symbol)%2!=0) System.out.print("+ ");
                  else System.out.print("* ");
            }
                  System.out.println();
      
            }*/
            
            //Second Attempt
            int space,symbol;
            //loop for rows
            for(int ln=1;ln<=2*size;ln++){
                  if(ln<=size) space=size-ln;
                  else space=ln-(size+1);
                  
            //loop for space
            for(;space>0;space--){
                  System.out.print("  ");
            }
                  if(ln<=size) symbol=2*ln-1;
                  else symbol=2*((2*size)+1-ln)-1;
            
            //loop for symbol
            for(;symbol>0;symbol--){
                  if((ln+symbol)%2!=0) System.out.print("+ ");
                  else System.out.print("* ");
            }
                  System.out.println();
      
            }
      
      }

      public static void main(String[] args){
            Practical6 p=new Practical6();
            System.out.println("This is Pattern 1:");
            p.displayPattern1(5);
            
            System.out.println("This is Pattern 2:");
            p.displayPattern2(5);
            
            System.out.println("This is Pattern 3:");
            p.displayPattern3(5);
      
      }
}
