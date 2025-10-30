public class index{
    public static void main(String[] args) {
        Worker worker1 = new Worker("Dave",344,3);
        System.out.println(worker1.companyName);
        System.out.println(worker1.counter);
        try{
            int[] nums = {1,2,5};
            System.out.println(nums[10]);
        }
        catch(Exception e){
            System.out.printf("Something went wrong: %s",e);
        }
    }
}