import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int divisor= 42;
        int count=0;
        int[] arr= new int[10];
        
        for(int i=0; i<=9; i++){
            arr[i]= sc.nextInt();
        }
        
        int[] remainarr= new int[10];
        
        for(int i=0;i<=9; i++){
            int remain=arr[i]%divisor;
            boolean already= false;
            
            for(int j=0; j<count; j++){
                if(remainarr[j]==remain){
                    already=true;
                    break;
                }
            }
            
            if(!already){
                remainarr[count]=remain;
                count++;
            }
        }
        
        System.out.println(count);
        
    }
}