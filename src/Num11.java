import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName: Num11
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author ymzhang
 * @Create 2024/9/21 17:01
 * @Version 1.0
 */
public class Num11 {
    public static void main(String[] args) {
        System.out.println(method());
    }

    public static int method(){
        String str = "[(10,20),(15,30),(5,10),(8,25),(12,15)],30,40";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        ArrayList<Integer> list = new ArrayList<>();
        while(matcher.find()){
            list.add(Integer.parseInt(matcher.group()));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        int maxWeight = list.get(list.size()-2);
        int maxHeight = list.get(list.size()-1);
        int num = (list.size()-2)/2;
        Point[] points = new Point[num];
        for(int i=0;i<num;i++){
            Point point = new Point(list.get(i*2),list.get(i*2+1));
            points[i] = point;
        }
        int[][] dp = new int[maxWeight+1][maxHeight+1];
        for(Point point:points){
            int weight = point.x;
            int height = point.y;
            for(int i =maxWeight;i>=height;i--){
                for (int j = maxHeight; j>=height ; j--) {
                    dp[i][j] = Math.max(dp[i][j],dp[i-height][j-weight]+1);
                }
            }
        }
        return dp[maxWeight][maxHeight];
    }
    private static class Point{
        int x;
        int y;
        public Point(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
}
