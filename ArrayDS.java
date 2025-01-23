import java.util.*;
public class ArraysDS{
    private static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
int len=sc.nextInt();
int[] array=getArray(len);
int[]  reverseArr=reverse(array);
printArray(reverseArr);
    }
    public static int[] getArray(int len){
        int[] array=new int[len];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        return array;
    }
    public static int[] reverse(int[] array){
        int result[]=new int[array.length];
        for(int i=0;i<array.length;i++){
            result[i]=array[array.length-1-i];
        }
        return result;
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
