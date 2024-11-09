import java.util.Arrays;

public class G1 {
    
    public static void main(String[] args) {
        
        int[] c = {10, 20, 30, 40};

        int[] d = c;

        System.out.println("Initially:");
        System.out.println("Array c :" + Arrays.toString(c));
        System.out.println("Array d :" + Arrays.toString(d));

        d[1] = 50;

        System.out.println("After modification:");
        System.out.println("Array c :" + Arrays.toString(c));
        System.out.println("Array d :" + Arrays.toString(d));
    }
}
