import java.util.Scanner;

public class 判斷大小 {
    public static void main(String[] args) {
       //寫法一
       /* Scanner  sc = new Scanner(System.in);
        float v1,max,min;
        v1 =sc.nextFloat() ;
        max=v1;
        min=v1;
        for (int i=0;i<9;i++){
            v1 =sc.nextFloat() ;
            if(v1 > max){
                max=v1;
            }
            else if (v1<min){
                min=v1;
            }
        }
        System .out.println("max="+max) ;
        System  .out.println("min="+min) ;*/
       //寫法二
        Scanner  sc = new Scanner(System.in);
        float v1,max=Float.MIN_NORMAL,min=Float.MAX_VALUE;
        for (int i=0;i<10;i++){
            v1 =sc.nextFloat() ;
            if(v1 > max){
                max=v1;
            }
            else if (v1<min){
                min=v1;
            }
        }
        System .out.println("max="+max) ;
        System .out.println("min="+min) ;
    }
}