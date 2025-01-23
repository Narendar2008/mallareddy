import java.util.*;
public class SparseArrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String[] arr=new String[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.next();
        }
        HashMap<String,Integer> freqMap=new HashMap<>();
        for(int i=0;i<size;i++){
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
        }
        int queries=sc.nextInt();
        for(int i=0;i<queries;i++){
            String str=sc.next();
            System.out.println(freqMap.getOrDefault(str,0));
        }
    }
}
