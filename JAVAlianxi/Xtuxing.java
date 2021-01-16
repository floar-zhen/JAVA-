import java.util.Scanner;
public class print {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        char[][] arr= new char[x][x];
        int i;
        int j;
        for(i=0;i<x;i++){ //将数组置空
            for(j=0;j<x;j++){
                    arr[i][j] = ' ';
                }
        }
        //设置*图案
        for(i=0;i<x;i++){
            int left=0;
            int right=x-1;
            for(;left<x&&right>=0;left++,right--){
                arr[i][i]='*';
                arr[left][right]='*';
            }
        }
        //打印
        for(i=0;i<x;i++){ //将数组置空
            for(j=0;j<x;j++){
                System.out.printf("%c", arr[i][j]);
            }
            System.out.println();
        }
    }

}