import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        String num= sc.next();
        sc.close();
        
        int sum=0;
        
        for(int i=0; i<n; i++){
            sum+=num.charAt(i)-48;
        }
        
        System.out.println(sum);
        
    }
}