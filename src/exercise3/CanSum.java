package exercise3;

public class CanSum {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,7};
        boolean result = canSum(arr, 7, 0);
        System.out.println(result);
    }

    public static boolean canSum(int[] arr, int sum ,int n){
        if(sum==0){
            return true;
        }
        else if(sum<0){
            return false;
        }
        else{
            for (int i = n; i < arr.length; i++) {
                boolean b1 = canSum(arr, sum - arr[i],n++);
                boolean b2 = canSum(arr, sum,n++);
                if(b1 || b2){
                    return true;
                }
            }
            return false;
        }
    }

}
