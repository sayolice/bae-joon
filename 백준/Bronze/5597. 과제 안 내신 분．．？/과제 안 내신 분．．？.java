import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int n=31;
        boolean[] arr= new boolean[n];
        for(int a=1; a<=28; a++){
            int b=sc.nextInt();
            arr[b]=true;
        }
        
        for(int a=1; a<arr.length; a++){
            if(arr[a]==false){
                System.out.println(a);
            }
        }
    }
}