import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName: Num06
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author ymzhang
 * @Create 2024/9/21 01:56
 * @Version 1.0
 */
public class Num06 {

    //判断是否为邮箱
    static public boolean isEmail(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\\.com$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    //判断是否为ip地址
    static public boolean isIp(String ip){
        Pattern pattern = Pattern.compile("^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$");
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
    //判断是否为电话
    static public boolean isPhone(String phone){
        Pattern pattern = Pattern.compile("^\\+\\d+-\\d+-[\\d#]+$");
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public void method(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        while(n-- >0){
            String input = scanner.nextLine();
            if(isEmail(input)){
                list.add("email");
            }
            else if(isIp(input)){
                list.add("ip");
            }
            else if(isPhone(input)){
                list.add("phone");
            }
            else{
                list.add("invalid");
            }
        }
        for(String item:list){
            System.out.println(item);
        }
        scanner.close();
    }
}
