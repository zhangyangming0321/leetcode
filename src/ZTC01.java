import java.util.Scanner;

/**
 * ClassName: ZTC01
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author ymzhang
 * @Create 2024/9/20 20:34
 * @Version 1.0
 */
public class ZTC01 {
    public int method(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        dp[0] = a[0];
        dp[1] = a[1];
        for (int i = 2; i < n ; i++) {
            if(i<n-1){
                dp[i] = Math.min(dp[i-1]+a[i],dp[i-2]+a[i]);
            }
            else{
                dp[i] = Math.min(dp[i-1],dp[i-2]+a[i]);
            }
        }
        return dp[n-1];
    }
}
