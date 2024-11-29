// break statement
// break statment only break its immediate loop means inner loop not outer loop

public class Loop6 {
    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 3) {
                    break;
                }
                System.out.println("value is " + i + ", " + j);
            }

        }
    }
}
