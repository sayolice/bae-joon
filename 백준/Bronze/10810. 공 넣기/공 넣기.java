import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        int[] arr= new int[n+1];
        int re= sc.nextInt();
        
        for(int a=1; a<=re; a++){
            int i= sc.nextInt();
            int j= sc.nextInt();
            int k= sc.nextInt();
            for(int b=i; b<=j; b++){
                arr[b]=k;
            }
        }
        for(int a=1; a<=n; a++){
            System.out.print(arr[a]+" ");
        }
    }
}