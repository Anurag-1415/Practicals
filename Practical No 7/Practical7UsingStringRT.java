//Practical of Printing Name in the form of Patterns
//Using String return type

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
                                          symbol+="* "; 
                                          if(line==1 && star==1) symbol+="  ";
                                    }
                                    //for remaining lines
                                    else {
                                          //for 1st and last star of the same line
                                          if(star==2*size-1||star==1) symbol+="* "; 
                                          else symbol+="  "; 
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
                        if(star==1||star==line||star==2*size-1) symbol+="* "; 
                        else symbol+="  "; 
                  
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
                              if(star==1||star==2*size-1) symbol+="* "; 
                              else symbol+="  "; 
                        //for last line
                        }else {
                              symbol+="  "; 
                              for(int starN=1;starN<2*size-2;starN++){
                                    symbol+="* "; 
                              }
                              symbol+="  ";
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
                                          symbol+="* "; 
                                          if(star==1) symbol+="  ";
                                    }
                                    //for line between 1st and at sizeth position
                                    else if(line>1 && line<size){
                                          if(star==2*size-1||star==1) symbol+="* "; 
                                          else symbol+="  "; 
                                    //for line below sizeth position
                                    }else {
                                          if(star==2*size-1 || star==2*(((2*size-1)-line)+1)-1) symbol+="* "; 
                                          else symbol+="  "; 
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
                              spa+="  "; 
                              star=2*size-3;
                        }else if(line>1 && line<2*size-1) star=2*size-1;
                        
                              ///loop for width
                              for(;star>0;star--){
                                    if(line==1||line==2*size-1) {
                                          symbol+="* "; 
                                          if(star==1) symbol+="  "; 
                                    }else if(line==2){
                                          if(size>=4){
                                                if(star==2*size-1 || star==1) symbol+="* "; 
                                                else symbol+="  "; 
                                          }else {
                                                if(star==2*size-1) symbol+="* "; 
                                                else symbol+="  "; 
                                          }
                                    }else if(line>2 && line<size){
                                          if(star==2*size-1) symbol+="* "; 
                                          else symbol+="  "; 
                                    }else if(line==size){
                                          if(star==2*size-1 || star<=size) symbol+="* ";
                                          else symbol+="  "; 
                                    }else {
                                          if(star==2*size-1 || star==1) symbol+="* "; 
                                          else symbol+="  "; 
                                    }
                                    
                              }
                              Character+=spa+symbol+"\n";
                              return Character;
      }
      

      public static void main(String[] args){
            Practical7 p=new Practical7();

           int size=Integer.parseInt(args[0],10);
           System.out.println("My name is : ");
           for(int line=1;line<=2*size-1;line++){
                System.out.print(p.getA(line,size)+"  "+p.getN(line,size)+"  "+p.getU(line,size)+"  "+p.getR(line,size)+"  "+p.getA(line,size)+"  "+p.getG(line,size));
           }
           
           
      }
}
