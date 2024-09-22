import java.util.Scanner;

/**
 * ClassName: Num13
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author ymzhang
 * @Create 2024/9/21 17:41
 * @Version 1.0
 */
public class Num13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(method(str));

    }
    public static int method(String str)
    {
        int n = str.length();
        int b =0;
        for(char ch: str.toCharArray()){
            if(ch=='b'){
                b++;
            }
        }
        int ans = 0;
        int a = 0;
        for(int i =0;i<n-1;i++){
            if(str.charAt(i)=='a'){
                a++;
            }
            else {
                b--;
            }
            ans = Math.max(ans,a+b);
        }
        return ans;
    }
}
