import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        for(int i=1; i<=5; i++){
            int num= sc.nextInt();
            sum+=num*num;
        }
        sum%=10;
        System.out.println(sum);
    }
}