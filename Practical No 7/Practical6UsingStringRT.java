//Practical No 6 using String return type
      
class Practical6{

      String displayPattern1(int size){
            int space,symbol;
            String pattern,sym,spa;
                   pattern="";
                   
                  //loop for rows
                  for(int ln=1;ln<=2*size-1;ln++){
                        sym="";
                        spa="";
                        if(ln<=size) space=size-ln;
                        else space=ln-size;
            
                        //loop for space
                        for(;space>0;space--){
                        spa+="  ";
                        }
                              if(ln<=size) symbol=2*ln-1;
                              else symbol=2*((2*size-1)+1-ln)-1;
            
                              //loop for symbol
                              for(;symbol>0;symbol--){
                                    if(ln<=size){
                                    if(symbol%2==0) sym+="  ";
                                    else //System.out.print("+ ");
                                    sym+="+ ";
                                    }else {
                                          if(symbol%2==0) sym+="  ";
                                          else sym+="* ";
                                    }
                              }
                        pattern+=spa+sym+"\n";
            }
            return pattern;
      }
      
      String displayPattern2(int size){
            int space,plus;
            String pattern,sym,spa;
            pattern="";
            
           //loop for rows
           for(int ln=1;ln<=2*size-1;ln++){
                sym="";
                spa="";
                if(ln<=size) space=size-ln;
                else space=ln-size;
           
                //loop for space
                for(;space>0;space--){
                      spa+="  ";
                }
                      if(ln<=size) plus=2*ln-1;
                      else plus=2*((2*size-1)+1-ln)-1;
                
                      //loop for plus
                      for(;plus>0;plus--){
                      sym+="+ ";
                      }
                pattern+=spa+sym+"\n";
           }
          return pattern;
      }
      
      String displayPattern3(int size){
            int space,symbol;
            String pattern,sym,spa;
            pattern="";
            
            //loop for rows
            for(int ln=1;ln<=2*size;ln++){
                  sym="";
                  spa="";
                  if(ln<=size) space=size-ln;
                  else space=ln-(size+1);
                  
                  //loop for space
                  for(;space>0;space--){
                        spa+="  ";
                  }
                        if(ln<=size) symbol=2*ln-1;
                        else symbol=2*((2*size)+1-ln)-1;
            
                        //loop for symbol
                        for(;symbol>0;symbol--){
                              if((ln+symbol)%2!=0) //System.out.print("+ ");
                              sym+="+ ";
                              else sym+="* ";
                          
                        }
                  pattern+=spa+sym+"\n";
            }
            return pattern;
      }
      
      
      public static void main(String[] args){
      

            Practical6 p=new Practical6();

            System.out.println("This is Pattern 1:");
            String s1=p.displayPattern1(3);
            System.out.print(s1);
            
            System.out.println("This is Pattern 2:");
            String s2=p.displayPattern2(3);
            System.out.print(s2);
            
            System.out.println("This is Pattern 3:");
            String s3=p.displayPattern3(3);
            System.out.print(s3);
            
      }
      
      }
