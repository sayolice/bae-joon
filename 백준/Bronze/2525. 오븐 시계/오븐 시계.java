import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int hour= sc.nextInt();
        int minute= sc.nextInt();
        int plus_m= sc.nextInt();
        
        minute+= plus_m;
        
        while(minute>=60){
            minute-=60;
            hour++;
            if(hour>=24){
                hour-=24;
            }
        }
        
        System.out.println(hour+" "+minute);
    }
}