import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int star= sc.nextInt();
        // 위쪽
        for (int i = 1; i <= star; i++) {
            // 공백
            for (int j = 1; j <= star - i; j++) {
                System.out.print(" ");
            }
            // 별
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // 아래쪽
        for (int i = star - 1; i >= 1; i--) {
            // 공백
            for (int j = 1; j <= star - i; j++) {
                System.out.print(" ");
            }
            // 별
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
