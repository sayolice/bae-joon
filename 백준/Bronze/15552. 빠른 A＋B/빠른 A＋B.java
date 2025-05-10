import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testCount = Integer.parseInt(br.readLine().trim());
        
        for (int i = 0; i < testCount; i++) {
        String line = br.readLine();
    
        while (line == null || line.trim().isEmpty()) {
            line = br.readLine();
        }
        String[] tokens = line.trim().split("\\s+");
        
        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[1]);

        bw.write((a + b) + "\n");
    }
        bw.flush();
        bw.close();
        br.close();
    }
}