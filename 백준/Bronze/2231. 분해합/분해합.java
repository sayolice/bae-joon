import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        
        int result=0;
        
        for(int i=1; i<n; i++){
            int sum=i;
            int m=i;
            
            while(m>0){
                sum+=m%10;
                m/=10;
            }
            
            if(n==sum){
                result=i;
                break;
            }
        }
        System.out.println(result);
    }
}