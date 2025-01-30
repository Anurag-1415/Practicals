//Practical of Printing Name in the form of Patterns
//Using Void return type
      
class Practical7 {
      
      void displayA(int size){
            int star=0;
                  //loop for height
                  for(int ln=1;ln<=2*size-1;ln++){
                        if(ln==1) {
                              System.out.print("  ");
                              star=2*size-3;
                        }
                        else star=2*size-1;
                              //loop for width
                              for(;star>0;star--){
                                    //for line 1st and at sizeth position
                                    if(ln==1||ln==size) System.out.print("* ");
                                    //for remaining lines
                                    else {
                                          //for 1st and last star of the same line
                                          if(star==2*size-1||star==1) System.out.print("* ");
                                          else System.out.print("  ");
                                    }
                              }
                        System.out.println();
                  }
      }
      
      void displayN(int size){
            int space,star;
            ///loop for height
            for(int ln=1;ln<=2*size-1;ln++){
            
                  //loop for width
                  for(star=1;star<=2*size-1;star++){
                        //for 1st last and at lineth position for star
                        if(star==1||star==ln||star==2*size-1) System.out.print("* ");
                        else System.out.print("  ");
                  
                  }
                        System.out.println();
            }
      }
      
      void displayU(int size){
            //loop for height
            for(int ln=1;ln<=2*size-1;ln++){
            
                  //loop for width
                  for(int star=1;star<=2*size-1;star++){
                        //for all lines except last
                        if(ln<2*size-1){
                              if(star==1||star==2*size-1) System.out.print("* ");
                              else System.out.print("  ");
                        //for last line
                        }else {
                              System.out.print("  ");
                              for(int starN=1;starN<2*size-2;starN++){
                                    System.out.print("* ");
                              }
                              System.out.println("  ");
                              return;
                        }
                  }
                        System.out.println();
            }
      }
      
      void displayR(int size){
            int star=0;
            
                  //loop for height
                  for(int ln=1;ln<=2*size-1;ln++){
                        if (ln==1||ln==size) star=2*size-2;
                        else if (ln>1 && ln<size || ln>size) star=2*size-1;
                        
                              //loop for width
                              for(;star>0;star--){
                                    //for line 1st and at sizeth position
                                    if(ln==1||ln==size) System.out.print("* ");
                                    //for line between 1st and at sizeth position
                                    else if(ln>1 && ln<size){
                                          if(star==2*size-1||star==1) System.out.print("* ");
                                          else System.out.print("  ");
                                    //for line below sizeth position
                                    }else {
                                          if(star==2*size-1 || star==2*(((2*size-1)-ln)+1)-1) System.out.print("* ");
                                          else System.out.print("  ");
                                    }
                                    
                              }
                        System.out.println();
                  }
      }
      
      void displayG(int size){
            int star=0;
            
                  //loop for height
                  for(int ln=1;ln<=2*size-1;ln++){
                        if(ln==1||ln==2*size-1) {
                              System.out.print("  ");
                              star=2*size-3;
                        }else if(ln>1 && ln<2*size-1) star=2*size-1;
                        
                              ///loop for width
                              for(;star>0;star--){
                                    if(ln==1||ln==2*size-1) {
                                          System.out.print("* ");
                                          if(star==1) System.out.print("  ");
                                    }else if(ln==2){
                                          if(size>=4){
                                                if(star==2*size-1 || star==1) System.out.print("* ");
                                                else System.out.print("  ");
                                          }else {
                                                if(star==2*size-1) System.out.print("* ");
                                                else System.out.print("  ");
                                          }
                                    }else if(ln>2 && ln<size){
                                          if(star==2*size-1) System.out.print("* ");
                                          else System.out.print("  ");
                                    }else if(ln==size){
                                          if(star==2*size-1 || star<=size) System.out.print("* ");
                                          else System.out.print("  ");
                                    }else {
                                          if(star==2*size-1 || star==1) System.out.print("* ");
                                          else System.out.print("  ");
                                    }
                                    
                              }
                              
                        System.out.println();
                  }
      }
      
      public static void main(String[] args){
            Practical7 p = new Practical7();

           p.displayA(4);
           System.out.println("  ");
           p.displayN(4);
           System.out.println("  ");
           p.displayU(4);
           System.out.println("  ");
           p.displayR(4);
           System.out.println("  ");
           p.displayA(4);
           System.out.println("  ");
           p.displayG(4);
      }
      
}
