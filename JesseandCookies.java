 public static int cookies(int k, List<Integer> A) {
    // Write your code here
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    pq.addAll(A);
    int operations=0;
    while(pq.size()>1 && pq.peek()<k){
        int first=pq.poll();
        int second=pq.poll();
        int newCookie=first+2*second;
        pq.offer(newCookie);
        operations++;
    }
    if(pq.peek()>=k){
        return operations;
    }
return -1;
}
}
