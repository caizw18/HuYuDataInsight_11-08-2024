import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G3 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

        String str = bfn.readLine();

        int it = Integer.parseInt(bfn.readLine());

        System.out.println("Entered String : " + str);

        System.out.println("Entered Integer : " + it);


    }
}
