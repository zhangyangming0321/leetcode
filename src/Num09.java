import java.util.Scanner;

/**
 * ClassName: Num09
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author ymzhang
 * @Create 2024/9/21 15:29
 * @Version 1.0
 */
public class Num09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- >0){
            int n = sc.nextInt();
            int result = method(n);
            System.out.println(result);
        }
    }

    public static int method(int n){
        if(n<=4) return n;
        int start = 1;
        while(true){
            int cal = (start+1)*start/2;
            if(cal<n-2){
                start++;
            }
            else{
                break;
            }
        }
        return start+2;
    }
}
