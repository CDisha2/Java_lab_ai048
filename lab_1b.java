package D_BM23AI048;

public class chess_board {
    public static void main(String[] args){
        int size=8;
        for(int i=0; i<size;i++){
            for(int j=0; j<size; j++){
                if((i+j)%2==0){
                    System.out.print("**");
                }
                else{
                    System.out.print("  ");
                }

            }System.out.print("\n");
        }
    }
}
