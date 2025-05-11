import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        int[] arr= new int[n+1];
        for(int a=1; a<=n; a++){
            arr[a]=a;
        }
        
        int m= sc.nextInt();
        
        for(int a=1; a<=m; a++){
            int i= sc.nextInt();
            int j= sc.nextInt();
            
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        
        for(int a=1; a<arr.length; a++){
            System.out.print(arr[a]+" ");
        }
    }
}