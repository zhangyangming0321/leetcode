import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName: Num10
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author ymzhang
 * @Create 2024/9/21 16:36
 * @Version 1.0
 */
public class Num10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] start = new int[]{1,2,3,3};
        int[] end = new int[]{3,4,5,6};
        int[] profits = new int[]{50,10,40,70};
        int result = method(start,end,profits);
        System.out.println(result);
    }

    public static int method(int[] start,int[] end,int[] profits){
        int n = start.length;
        Project[] projects = new Project[n];
        for (int i = 0; i < n; i++) {
            projects[i] = new Project(start[i],end[i],profits[i]);
        }
        int[] dp = new int[n];
        Arrays.sort(projects,(a, b)->Integer.compare(a.end,b.end));
        dp[0] = projects[0].profit;
        for (int i = 1; i < n; i++) {
            int currentProfit = projects[i].profit;
            int lastindex = findNonConflict(projects,i);
            if(lastindex!=-1){
                currentProfit += dp[lastindex];
            }
            dp[i] = Math.max(dp[i-1],currentProfit);
        }
        return dp[n-1];
    }

    private static int findNonConflict(Project[] projects, int i) {
        int left = 0;
        int right = i-1;
        while(left<=right){
            int middle = (left+right)/2;
            if(projects[middle].end<=projects[i].start){
                if(projects[middle+1].end<=projects[i].start){
                    left = middle+1;
                }
                else{
                    return middle;
                }
            }
            else{
                right = middle-1;
            }
        }
        return -1;
    }

    private static class Project{
        int start;
        int end;
        int profit;
        Project(int start,int end,int profit){
            this.start=start;
            this.end=end;
            this.profit=profit;
        }
    }
}
