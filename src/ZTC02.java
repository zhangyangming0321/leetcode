import sun.font.FontRunIterator;

import java.util.Scanner;

/**
 * ClassName: ZTC02
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author ymzhang
 * @Create 2024/9/20 20:38
 * @Version 1.0
 */
public class ZTC02 {

    public int method() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] ch = a.toCharArray();
        int blankIndex = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                blankIndex = i;
                break;
            }
        }
        String part1 = a.substring(0, blankIndex);
        String part2 = a.substring(blankIndex + 1,ch.length);
        int k =Integer.parseInt(part2);
        String[] temp;
        String delimiter = ",";
        temp = part1.split(delimiter);
        int[] tickets = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            tickets[i] = Integer.parseInt(temp[i]);
        }
        int result = 0;
        int index = 0;
        while(tickets[k]!=0){
            if(tickets[index]>0){
                tickets[index]--;
                result++;
            }
            index++;
            if(index==tickets.length) index=0;
        }
        return result;
    }

}
