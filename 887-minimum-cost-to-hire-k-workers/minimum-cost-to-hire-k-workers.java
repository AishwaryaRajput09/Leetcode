class Solution {
    class Worker{
        int quality;
        double wagePerQuality;

        Worker(int quality,int wage){
            this.quality = quality;
            this.wagePerQuality = (double) wage / quality; 
        }
    }
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
         int n  = quality.length;
         Worker[] workers = new Worker[n];
         for(int i = 0; i < n; i++){
            workers[i] = new Worker(quality[i],wage[i]);
         }

         Arrays.sort(workers, (a,b) -> Double.compare(a.wagePerQuality,b.wagePerQuality));
         double minCost = Integer.MAX_VALUE;
         int sumQuality = 0;
         PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
         for(Worker worker : workers){
            maxHeap.offer(worker.quality);
            sumQuality += worker.quality;
         if(maxHeap.size() > k){
            sumQuality -= maxHeap.poll();
         }
         if(maxHeap.size() == k){
            minCost = Math.min(minCost,sumQuality * worker.wagePerQuality);
         }
         }
         return minCost;
    }
}
