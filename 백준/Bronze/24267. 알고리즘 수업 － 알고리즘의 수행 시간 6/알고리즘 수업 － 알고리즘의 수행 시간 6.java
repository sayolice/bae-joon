import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        long n= sc.nextLong();
        
        System.out.println((n - 2) * (n - 1) * n / 6+"\n3");
    }
}