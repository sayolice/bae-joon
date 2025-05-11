import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        int find= sc.nextInt();
        int[] arr= new int[n];
        
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
            if(find>arr[i]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}