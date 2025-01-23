import java.util.*;
public class ArrayManipulation{
    static long arrayManipulation(int n,int[][] queries){
        long output[]=new long[n+2];
        for(int i=0;i<queries.length;i++){
            int a=queries[i][0];
            int b=queries[i][1];
            int k=queries[i][2];
            output[a]+=k;
            output[b+1]-=k;
        }
        long max=getMax(output);
        return max;
    }
    private static long getMax(long[] input){
        long max=Long.MIN_VALUE;
        long sum=0;
        for(int i=0;i<input.length;i++){
            sum+=input[i];
            max=Math.max(max,sum);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int queries[][]=new int[m][3];
        for(int i=0;i<m;i++){
            queries[i][0]=sc.nextInt();
            queries[i][1]=sc.nextInt();
            queries[i][2]=sc.nextInt();
            
        }
        long max=arrayManipulation(n,queries);
        System.out.println(max);
    }
}
