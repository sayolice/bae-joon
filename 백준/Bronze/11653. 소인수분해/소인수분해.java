import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        int result=2;
        if(n==1){
            return;
        }
        while(true){
            if(n%result==0){
                System.out.println(result);
                n/=result;
                
            }
            else{
                result++;
                if(n<result){
                    break;
                }
            }
        }
    }
}