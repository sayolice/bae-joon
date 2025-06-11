import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int Left = x;
        int Right = w - x;
        int Bottom = y;
        int Top = h - y;
        
        int result= Math.min(Math.min(Left, Right),Math.min(Bottom,Top));
        
        System.out.println(result);
    }
}