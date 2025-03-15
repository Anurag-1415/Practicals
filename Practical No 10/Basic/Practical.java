class Practical10Game {

      static String[][] layout;

      static void generateGrid(String[][] layout){
            int r=0;
            int c=0;
            for(int row = 0;row<layout.length * 2 + 1;row++){
                  for(int col = 0;col<layout.length * 2 + 1;col++){
                        if(row%2!=0 && col%2==0) System.out.print("|");
                        else if(col%2!=0 && row%2==0) System.out.print("-".repeat(Integer.toString(layout.length).length()));
                        else if(col%2!=0 && row%2!=0) System.out.print(String.format("%"+Integer.toString(layout.length).length()+"s",layout[r][c++ % layout.length]));
                        else System.out.print(" ");
                  }
                        if(row%2!=0) r++;
                        System.out.println();
            }
            
            generateGame(layout);
      }
      
      static void generateGame(String[][] layout){
            for(int i=0;i<2*layout.length;i++){
                  layout[(int)(System.nanoTime() % layout.length)][(int)(System.nanoTime() % layout.length)] = " ".repeat(Integer.toString(layout.length).length());
            }
            
            int r=0;
            int c=0;
            for(int row = 0;row<layout.length * 2 + 1;row++){
                  for(int col = 0;col<layout.length * 2 + 1;col++){
                        if(row%2!=0 && col%2==0) System.out.print("|");
                        else if(col%2!=0 && row%2==0) System.out.print("-".repeat(Integer.toString(layout.length).length()));
                        else if(col%2!=0 && row%2!=0) System.out.print(String.format("%"+Integer.toString(layout.length).length()+"s",layout[r][c++ % layout.length]));
                        else System.out.print(" ");
                  }
                        if(row%2!=0) r++;
                        System.out.println();
            }
            
      }
      
      public static void main(String[] args){
            int size = Integer.parseInt(args[0]);
            layout = new String[size][size];
                  int index = 1;
            for(int row=0;row<size;row++){
                  for(int col=0;col<size;col++){
                      layout[row][col] = args[index++];
                  }
            }
            generateGrid(layout);
      }
}
