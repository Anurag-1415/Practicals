import java.util.*;
class Practical10Advance{
      Scanner sc = new Scanner(System.in);
      String[][] layout;
      String[][] solution;
      int size;
      
      Practical10Advance(int size){
            this.size = size;
            this.layout = new String[size][size];
            this.solution = new String[size][size];
            
                  generateSol();
      }
      
      boolean checkSol(int sol,int row,int col){
                  for(int c=0;c<col;c++){
                        if(solution[row][c] != null && sol == Integer.parseInt(solution[row][c])) return false;
                  }
                  
                  for(int r=0;r<row;r++){
                        if(solution[r][col] != null && sol == Integer.parseInt(solution[r][col])) return false;
                  }
                  
                  return true;
      }
      
      void generateSol(){
            int sol=0;
                  for(int row=0;row<size;row++){
                        for(int col=0;col<size;col++){
                              do{
                                    sol = (int) (System.nanoTime() % size + 1);
                              }while (!checkSol(sol, row, col));
                              solution[row][col] = String.valueOf(sol);
                              layout[row][col] = String.valueOf(sol);
                        }
                  }
                  displaySolnGame(0);
                  generateGame();
      }
      
      void displaySolnGame(int access){
            int r=0;
            int c=0;
            for(int row = 0;row<size * 2 + 1;row++){
                  for(int col = 0;col<size * 2 + 1;col++){
                        if(row%2!=0 && col%2==0) System.out.print("|");
                        else if(col%2!=0 && row%2==0) System.out.print("-".repeat(Integer.toString(layout.length).length()));
                        else if(col%2!=0 && row%2!=0){
                              if(access == 0) System.out.print(String.format("%"+Integer.toString(size).length()+"s",solution[r][c++ % size]));
                              else System.out.print(String.format("%"+Integer.toString(size).length()+"s",layout[r][c++ % size]));
                        }else System.out.print(" ");
                  }
                        if(row%2!=0) r++;
                        System.out.println();
            }
      }
      
      String checkResult(){
            for(int row=0;row<size;row++){
                  for(int col=0;col<size;col++){
                        if(!layout[row][col].equals(solution[row][col])) return "You lost the game!\nbecause your input at row no. " + (row+1) + " and col no. " + (col+1) + 
                        " do not satisfy the result!\nDo you wanna try again? (y/n) : ";
                  }
            }
            
            return "Congrats! You won!\nWanna play next round? (y/n) : ";
      }
      
      int generateRow(int cell){
            return cell / size;
      }
      
      int generateColumn(int cell){
            return cell % size;
      }
      
      void generateGame(){
            int[] cell = new int[2 * layout.length];
            
            for(int i=0;i<2*size;i++){
                  cell[i] = (int)(System.nanoTime() % Math.pow(size,2));
            }
            
            cell = Arrays.stream(cell).distinct().toArray();
            
            for(int i=0;i<cell.length;i++){
                  layout[generateRow(cell[i])][generateColumn(cell[i])] = " ".repeat(Integer.toString(size).length());
            }
                  displaySolnGame(1);
            
            System.out.print("Are you ready to play! (y/n) : ");
            String in = sc.nextLine();
            int value;
                  if(in.equals("n")) return;
                  else{
                        int i=0;
                        while(i<cell.length){
                        System.out.print("\nGive your input for row no. " + (generateRow(cell[i])+1) + " and col no. " + (generateColumn(cell[i])+1) + " : ");
                        value = Integer.parseInt(sc.nextLine());
                        layout[generateRow(cell[i])][generateColumn(cell[i])] = String.valueOf(value);
                              if(value > layout.length || value < 1) System.out.println("Value must from 1 to " + size + "!");
                              else{
                              i++;
                              System.out.println("Your move! :");
                              displaySolnGame(1);
                              }
                        }
                 }

                 System.out.print(checkResult());
                 String fBack = sc.nextLine();
                 if(fBack.equals("y")) generateSol();
                 else return;
      }
        
      public static void main(String[] args){
            Practical10Advance p = new Practical10Advance(Integer.parseInt(args[0]));
      }
}
