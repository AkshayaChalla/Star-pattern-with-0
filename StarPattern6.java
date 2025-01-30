public class StarPattern6{
    public static void main(String[] args) {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
              
                if ((i == 1 && j == 2) ||
                    (i == 2 && (j == 1 || j == 3)) || 
                    (i == 3 && j == 2)) { 
                    System.out.print("O ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}