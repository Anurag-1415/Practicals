//Practical of Printing Name in the form of Patterns (Alternate logic)
//Using String return type

class Practical7{

      String getA(int line,int size){
            String Character,symbol,spa;
                  Character="";
                  spa="";
                  symbol="";
                        
                        //loop for width
                        for(int star=1;star<=2*size-1;star++){
                              if(line==1 && (star>=2 && star<2*size-1) || line==size || line>1 && (star==1 || star==2*size-1)) symbol+="* "; 
                              else symbol+="  "; 
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
                        if(line<2*size-1 && (star==1 || star==2*size-1) || line==2*size-1 && (star>=2 && star<2*size-1)) symbol+="* "; 
                        else symbol+="  "; 
                  }
                        Character+=symbol;
                        return Character;
      }
      
      String getR(int line,int size){
            String Character,symbol,spa;
                  Character="";
                  spa="";
                  symbol="";
            
                  for(int star=1;star<=2*size-1;star++){
                  if(star==1 || (line==1||line==size) && (star>=2 && star<2*size-1) || (line>1 && line<size) && star==2*size-1 || line>size && star==2*(line-size)+1) symbol+="* "; 
                  else symbol+="  "; 
                  }
                        Character+=symbol;
                        return Character;
      }
      
      String getG(int line,int size){
            String Character,symbol,spa;
                  Character="";
                  spa="";
                  symbol="";
                  
                  for(int star=1;star<=2*size-1;star++){
                  if((line==1||line==2*size-1) && (star>=2 && star<2*size-1)  || (line>1 && line<2*size-1) && star==1 || (line==2 || line>size && line<2*size-1) && star==2*size-1
                        || line==size && star>=size) symbol+="* "; 
                        
                  else symbol+="  "; 
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
