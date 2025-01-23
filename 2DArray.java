   public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
    int Max_Sum=Integer.MIN_VALUE;
    for(int i=0;i<=3;i++){
        for(int j=0;j<=3;j++){
            int currentSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) // Top row
                               + arr.get(i + 1).get(j + 1)                                     // Middle
                               + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2); // Bottom row
            Max_Sum=Math.max(Max_Sum,currentSum);
        }
    }
    return Max_Sum;

    }

}
