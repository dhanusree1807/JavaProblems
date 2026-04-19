import java.util.*;
public class Mirrorpyramidstar {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=5;i>n;i--){
            for(int j=0;j<(5-i);j++){
                System.out.print(" ");

            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
