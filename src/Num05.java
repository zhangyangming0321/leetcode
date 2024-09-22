import java.util.Scanner;

/**
 * ClassName: Num05
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author ymzhang
 * @Create 2024/9/21 01:11
 * @Version 1.0
 */
public class Num05 {
    public int method(){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String delimiter = " ";
        String[] temp = a.split(delimiter);
        int ans = 0;
        for (int i = 0; i < temp.length; i++) {
            Character ch = temp[i].charAt(0);
            if(Character.isUpperCase(ch)){
                ans++;
            }
        }
        return ans;

    }
}
