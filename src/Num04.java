import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ClassName: Num04
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author ymzhang
 * @Create 2024/9/21 00:51
 * @Version 1.0
 */
public class Num04 {
    public void method(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] deg = new int[n];
        for (int i = 0; i < n-1; i++) {
            int u,v;
            u=sc.nextInt()-1;
            v=sc.nextInt()-1;
            deg[u]++;
            deg[v]++;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(i==0) map.put(deg[i],map.getOrDefault(deg[i],0)+1);
            map.put(deg[i]-1,map.getOrDefault(deg[i]-1,0)+1);
        }
        int ans = 0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int value = entry.getValue();
            ans += value*(value-1)/2;
        }
        System.out.println(ans);
    }
}
