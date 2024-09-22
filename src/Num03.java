import java.util.Scanner;

/**
 * ClassName: Num03
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author ymzhang
 * @Create 2024/9/21 00:41
 * @Version 1.0
 */
public class Num03 {
    public int method(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int oddCost =0,evenCost=0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(nums[i]%2==0){
                evenCost += nums[i]+1;
            }else{
                oddCost+= nums[i]+1;
            }
        }
        return Math.min(evenCost,oddCost);
    }
}
