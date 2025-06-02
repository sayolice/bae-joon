import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    
    int a = Integer.parseInt(input[0]);
    int b = Integer.parseInt(input[1]);
    int v = Integer.parseInt(input[2]);
    
    int days;
    if (v <= a) {
      days = 1;
    } else {
      // (v - a)를 하루의 즐가량인 (a - b)로 나눈 후 올림흐 첫날을 더한다
      days = (int)Math.ceil((v - a) / (double)(a - b)) + 1;
    }
    
    System.out.println(days);
  }
}