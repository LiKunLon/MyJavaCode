class RecentCounter {
    Queue<Integer> queue=new LinkedList<Integer>();
    public RecentCounter() {

    }
    
    public int ping(int t) {
        queue.offer(t);
        while(queue.peek()<t-3000){
            queue.poll();
        }
        return queue.size();
    }
}