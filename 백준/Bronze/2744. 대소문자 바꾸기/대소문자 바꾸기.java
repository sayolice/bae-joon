import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word= sc.next();
        
        StringBuilder sb= new StringBuilder();
        
        for(int i=0; i<word.length(); i++){
            char w= word.charAt(i);
            if(Character.isLowerCase(w)){
                sb.append(Character.toUpperCase(w));
            }
            else{
                sb.append(Character.toLowerCase(w));
            }
        }
        
        System.out.println(sb.toString());
    }
}
