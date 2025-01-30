//Practical of Printing Name in the form of Patterns
//Using String return type

import java.util.*;
class Practical7{

      String getA(int line,int size){
            int star=0;
            String Character,symbol,spa;
                  Character="";
                  spa="";
                  symbol="";
                        if(line==1) {
                              spa+="  ";
                              star=2*size-3;
                        }
                        else star=2*size-1;
                        
                              //loop for width
                              for(;star>0;star--){
                                    //for line 1st and at sizeth position
                                    if(line==1||line==size) {
                                          symbol+="* "; //System.out.print("* ");
                                          if(line==1 && star==1) symbol+="  ";
                                    }
                                    //for remaining lines
                                    else {
                                          //for 1st and last star of the same line
                                          if(star==2*size-1||star==1) symbol+="* "; //System.out.print("* ");
                                          else symbol+="  "; //System.out.print("  ");
                                    }
                              }
                        Character+=spa+symbol;
                        return Character;
      }
      
      String getN(int line,int size){
            String Character,symbol,spa;
                  Character="";
                  spa="";
                  symbol="";
            
                  //loop for width
                  for(int star=1;star<=2*size-1;star++){
                        //for 1st last and at lineth position for star
                        if(star==1||star==line||star==2*size-1) symbol+="* "; //System.out.print("* ");
                        else symbol+="  "; //System.out.print("  ");
                  
                  }
                        Character+=symbol+spa;
                        return Character;
      }
      
      String getU(int line,int size){
            String Character,symbol,spa;
                  Character="";
                  spa="";
                  symbol="";
            
                  //loop for width
                  for(int star=1;star<=2*size-1;star++){
                        //for all lines except last
                        if(line<2*size-1){
                              if(star==1||star==2*size-1) symbol+="* "; //System.out.print("* ");
                              else symbol+="  "; //System.out.print("  ");
                        //for last line
                        }else {
                              symbol+="  "; //System.out.print("  ");
                              for(int starN=1;starN<2*size-2;starN++){
                                    symbol+="* "; //System.out.print("* ");
                              }
                              symbol+="  "; //System.out.println("  ");
                              Character+=symbol;
                              return Character;
                        }
                  }
                        Character+=symbol;
                        return Character;
      }
      
      String getR(int line,int size){
            int star=0;
            String Character,symbol,spa;
                  Character="";
                  spa="";
                  symbol="";
            
                        if (line==1||line==size) star=2*size-2;
                        else if (line>1 && line<size || line>size) star=2*size-1;
                        
                              //loop for width
                              for(;star>0;star--){
                                    //for line 1st and at sizeth position
                                    if(line==1||line==size) {
                                          symbol+="* "; //System.out.print("* ");
                                          if(star==1) symbol+="  ";
                                    }
                                    //for line between 1st and at sizeth position
                                    else if(line>1 && line<size){
                                          if(star==2*size-1||star==1) symbol+="* "; //System.out.print("* ");
                                          else symbol+="  "; //System.out.print("  ");
                                    //for line below sizeth position
                                    }else {
                                          if(star==2*size-1 || star==2*(((2*size-1)-line)+1)-1) symbol+="* "; //System.out.print("* ");
                                          else symbol+="  "; //System.out.print("  ");
                                    }
                                    
                              }
                        Character+=symbol;
                        return Character;
      }
      
      String getG(int line,int size){
            int star=0;
            String Character,symbol,spa;
                  Character="";
                  spa="";
                  symbol="";
                        //for line 1st and last
                        if(line==1||line==2*size-1) {
                              spa+="  "; //System.out.print("  ");
                              star=2*size-3;
                        }else if(line>1 && line<2*size-1) star=2*size-1;
                        
                              ///loop for width
                              for(;star>0;star--){
                                    if(line==1||line==2*size-1) {
                                          symbol+="* "; //System.out.print("* ");
                                          if(star==1) symbol+="  "; //System.out.print("  ");
                                    }else if(line==2){
                                          if(size>=4){
                                                if(star==2*size-1 || star==1) symbol+="* "; //System.out.print("* ");
                                                else symbol+="  "; //System.out.print("  ");
                                          }else {
                                                if(star==2*size-1) symbol+="* "; //System.out.print("* ");
                                                else symbol+="  "; //System.out.print("  ");
                                          }
                                    }else if(line>2 && line<size){
                                          if(star==2*size-1) symbol+="* "; //System.out.print("* ");
                                          else symbol+="  "; //System.out.print("  ");
                                    }else if(line==size){
                                          if(star==2*size-1 || star<=size) symbol+="* "; //System.out.print("* ");
                                          else symbol+="  "; //System.out.print("  ");
                                    }else {
                                          if(star==2*size-1 || star==1) symbol+="* "; //System.out.print("* ");
                                          else symbol+="  "; //System.out.print("  ");
                                    }
                                    
                              }
                              Character+=spa+symbol+"\n";
                              return Character;
      }
      

      public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            Practical7 p=new Practical7();
          
           System.out.print("Enter size in number to print my name('ANURAG') : ");
           int size=sc.nextInt();
           System.out.println("My name is : ");
           for(int line=1;line<=2*size-1;line++){
                System.out.print(p.getA(line,size)+"  "+p.getN(line,size)+"  "+p.getU(line,size)+"  "+p.getR(line,size)+"  "+p.getA(line,size)+"  "+p.getG(line,size));
           }
           
           
      }
}
