import java.util.Scanner;

public class 字母往前移 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine() ,newStr="";
        char ch;
        int key =sc.nextInt() ,strLeng=str.length();
        for (int i =0;i<strLeng ;i++){
            ch =(char)((int)str.charAt(i)-key );
            //+key是往後移
            newStr =newStr +Character .toString(ch);
        }
        System .out.println (newStr);
    }
}
