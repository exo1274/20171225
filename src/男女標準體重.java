import java.util.Scanner;

public class 男女標準體重 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int h =sc.nextInt() ;
        float sw =0.0f;
        int a =sc.nextInt() ;
        if (a==1){
            sw=Math.round((h-80)*0.7f*10)/10f;
        }
        else{
            sw=Math.round((h-70)*0.6f*10)/10f;
        }
        System .out .println(sw) ;
    }
}