import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        int[] arr= new int[n];
        
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        
        int find= sc.nextInt();
        int count=0;
        
        for(int j=0; j<arr.length; j++){
            if(find==arr[j]){
                count++;
            }
        }
        
        System.out.println(count);
    }
}