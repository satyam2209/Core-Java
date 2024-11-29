// continue statement
// continue statment only continue its immediate loop means inner loop not outer loop

public class Loop8 {
    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 3) {
                    continue;
                }
                if (j==3){
                    continue;
                }
                System.out.println("value is " + i + ", " + j);
            }

        }
    }
}
