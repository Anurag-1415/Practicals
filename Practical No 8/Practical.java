class Practical8{
      void pattern1(int line,int size){
            if(line<size+1){
                  System.out.println("* ".repeat(line));
                        pattern1(line+1,size);
            }
                  System.out.println("* ".repeat(line));
      }
      void pattern2(int line,int size){
            String symbol;
            if(line<(size+1)) symbol="* ";
            else symbol="+ ";
                  if(line<(size+1)){
                              System.out.print("  ".repeat((size+1)-line));
                              System.out.println(symbol.repeat(line));
                                    pattern2(line+1,size);
                              System.out.print("  ".repeat((size+1)-line));
                              System.out.println("/ ".repeat(line));
                        }
                        
                  if(line==(size+1))  System.out.println(symbol.repeat(line));
      }
      
              String symbol="";
     void pattern3(int line,int size){
           if(line<((size/2)+1)){
                System.out.print("  ".repeat(((size/2)+1)-line));
                System.out.println("* ".repeat(2*line-1));
                  symbol+="  ".repeat(size/2) + "+ \n";
                      pattern3(line+1,size);
           }
                System.out.print("  ".repeat(((size/2)+1)-line));
                System.out.println("* ".repeat(2*line-1));
                symbol+="  ".repeat(size/2) + "+ \n";
                      if(line==1) System.out.print(symbol);
     }
     
      void pattern4(int line,int size){
                  if(line<size+1){
                        System.out.print("  ".repeat(size-line));
                  if(line%2==0){
                        System.out.println("/ ".repeat(2*line-1));
                  }else System.out.println("* ".repeat(2*line-1));
                              pattern4(line+1,size);
                        System.out.print("  ".repeat(size-line));
                  if(line%2!=0){
                        System.out.println("/ ".repeat(2*line-1));
                  }else System.out.println("* ".repeat(2*line-1));
                  
                  }      
     }
     

    
      public static void main(String[] args){         
      Practical8 P = new Practical8();
            System.out.println("1st Pattern:");
            P.pattern1(1,3);
            System.out.println("2nd Pattern:");
            P.pattern2(1,3);
            System.out.println("3rd Pattern:");
            P.pattern3(1,5);
            System.out.println("4th Pattern:");
            P.pattern4(1,4);
            
      }
}
