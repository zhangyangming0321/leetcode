import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;

import java.util.Scanner;

/**
 * ClassName: Num08
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author ymzhang
 * @Create 2024/9/21 15:13
 * @Version 1.0
 */

//小虎在管理订单时，每个订单号都由一串字母和数字组成。
// 为了确保订单号的有效性，需要对其进行校验。
// 订单号的格式规定如下：
// 订单号的长度为10位。
// 前6位为字母，后4位为数字。
// 字母部分必须由大写字母组成，且不能有重复字母。
// 数字部分不能以“0”开头。
public class Num08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Num08 num08 = new Num08();
        boolean result = num08.method(str);
        if(result==true){
            System.out.println("合法");
        }
        else{
            System.out.println("不合法");
        }
    }
    public boolean method(String str){
        if(str.length()!=10){
            return false;
        }
        String part1 = str.substring(0,6);
        String part2 = str.substring(6);
        if(!isValidLetters(part1)){
            return false;
        }
        if(!isVliadNumbers(part2)){
            return false;
        }
        return true;
    }
    public boolean isValidLetters(String str){
        for(char ch : str.toCharArray()){
            if(!Character.isUpperCase(ch)) {
                return false;
            }
        }
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isVliadNumbers(String str){
        for(char ch : str.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }
        if(str.indexOf(0)=='0'){
            return false;
        }
        return true;
    }
}
