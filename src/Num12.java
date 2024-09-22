import java.util.ArrayList;
import java.util.Arrays;

/**
 * ClassName: Num12
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author ymzhang
 * @Create 2024/9/21 17:35
 * @Version 1.0
 */
public class Num12 {
    public static void main(String[] args) {
        int[][] a = {{0,3},{5,9},{11,13}};
        int[][] b = {{2,6},{8,10}};
        ArrayList<ArrayList<Integer>> result = method(a,b);
        System.out.println(result);
    }

    private static ArrayList<ArrayList<Integer>> method(int[][] a, int[][] b){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0,j=0;i<a.length&&j<b.length;){
            int l1 = a[i][0];
            int r1 = a[i][1];
            int l2 = b[j][0];
            int r2 = b[j][1];
            if(r1<l2) {
                i++;
                continue;
            }
            else if(r2<l1){
                j++;
                continue;
            }
            else{
                int l = Math.max(l1,l2);
                int r = Math.min(r1,r2);

                result.add(new ArrayList<>(Arrays.asList(l,r)));
                if(r1<r2){
                    i++;
                }
                else{
                    j++;
                }
            }
        }
        return result;
    }
}
