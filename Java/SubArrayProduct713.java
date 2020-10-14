public class SubArrayProduct713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int counter_less_than_k=0;
        int product=1;
        int head=0,tail=0;

        while(head < nums.length && tail <= head){
            product*=nums[head];

            while (product >= k && tail <=head) {
                product=product/nums[tail];
                tail++;
            }
            counter_less_than_k+=head - tail +1;;
            head ++;
        }
        return counter_less_than_k;
    }
}
