public class NearestSquareRoot {

    // through Linear Search
    private static int nearSqRootLinear(int x){
        int y = 0;
        while(y*y <= x){
            y++;
        }
        return y;
    }

    // through Binary Search
    private static int nearSqRoot(int x){
        int start = 0 , end = x;

        int ans = -1;

        while(start<=end){
            int mid = start + (end-start) / 2;

            int value = mid*mid;

            if (value == x){
                return mid;
            } else if (value < x) {
                ans = mid;
                start = mid + 1;
            }else {
                end = mid-1;
            }
        }

        return ans;
    }


    public static void main(String[] args){
        int x = 24;
        System.out.println("ANS : " + nearSqRoot(x));

    }
}
