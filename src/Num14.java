import java.math.BigInteger;
import java.util.Scanner;

/**
 * ClassName: Num14
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author ymzhang
 * @Create 2024/9/21 18:24
 * @Version 1.0
 */
public class Num14 {
    private static final int MOD = (int)1e9+7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startpos = sc.nextInt();
        int endpos = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(method(startpos,endpos,k));

    }
    public static int method(int startpos,int endpos,int k){
        int b = Math.abs(endpos-startpos);
        if(k<b) return 0;
        if((k-b)%2!=0) return 0;
        int[] fact = new int[10001];
        fact[0]=1;
        for (int i = 1; i < 10001; i++) {
            fact[i] = (int)((1L*fact[i-1]*i)%MOD);
        }
        return C(k,(k-b)/2,fact);
    }

    public static int C(int n,int m,int[] fact){
        if(n<m) return 0;
        int top = fact[n];
        int bottom = (int)((1L*fact[m]*fact[n-m])%MOD);
        return (int)((1L*top*modPow(bottom,MOD-2))%MOD);
    }

    public static int modPow(int a,int b){
        BigInteger base = BigInteger.valueOf(a);
        BigInteger result = base.modPow(BigInteger.valueOf(b),BigInteger.valueOf(MOD));
        return result.intValue();
    }
}
