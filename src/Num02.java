import java.util.Scanner;

//小美有一个长度为n的数组，她每次操作会执行如下：
//选定一个ai，把这个数加上一个任意的x(x > 0)，花费的代价为ai + x。现在小美想要把整个数组变成全部奇数或者全部偶数的最小代价是多少？

public class Num02 {
    public void method(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int oddcost=0,evencost=0;
        for (int i = 0; i < n; i++) {
            if(a[i]%2==0){
                evencost+=a[i]+1;
            }
            else{
                oddcost+=a[i]+1;
            }
        }
        System.out.println(Math.min(evencost,oddcost));
    }
}
