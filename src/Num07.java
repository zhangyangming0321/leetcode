import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClassName: Num07
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author ymzhang
 * @Create 2024/9/21 02:18
 * @Version 1.0
 */
public class Num07 {

    //判断是否是素数
    static public boolean isPrime(int n){
        if(n<=1) return false;
        if(n<=3) return true;
        if(n%2==0||n%3==0) return false;
        for (int i = 5; i*i <= n ; i+=6) {
            if(n%i==0||n%(i+2)==0) return false;
        }
        return true;
    }

    //求最大公约数
    public static int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public void method(){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            list.add(sc.nextInt());
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int n:list){
            boolean isFound = false;
            for (int m = 2; m <=n ; m++) {
                if(isPrime(gcd(n,m))){
                    result.add(m);
                    isFound = true;
                    break;
                }
            }
            if(isFound==false) result.add(-1);
        }
        for(int n:result) System.out.println(n);
        sc.close();
    }
}
