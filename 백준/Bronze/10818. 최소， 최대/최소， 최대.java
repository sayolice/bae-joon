import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int num = sc.nextInt();
        int min = num, max = num;
        
        for (int i = 2; i <= n; i++) {
            num = sc.nextInt();
            min = (num < min) ? num : min;
            max = (num > max) ? num : max;
        }
        System.out.println(min + " " + max);
    }
}