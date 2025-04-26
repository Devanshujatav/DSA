import java.lang.reflect.Array;
import java.util.ArrayList;

public class IndexesOfSubarraySum {
    static ArrayList<Integer> subarraySum(ArrayList<Integer> list , int target){
        int sum = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i=0 ; i<list.size() ; i++){
            for (int j=0 ; j< list.size() ; j++){
                sum+= list.get(j);
                if (sum == target){
                    int ith = i+1;
                    int jth = j+1;
                    ans.add(0 , ith);
                    ans.add(1, jth);

//                    System.out.println(ans.get(0));
//                    System.out.println(ans.get(1));

                }else if (sum > target){
                    break;
                }else {
                    continue;
                }
            }
        }

        if (ans.isEmpty()){
            ans.add(-1);
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(3);
        list.add(4);
//        list.add(40);
//        list.add(50);

        ArrayList<Integer> ans = new ArrayList<>();

        ans = subarraySum(list , 2);

        System.out.println(ans);

    }

}
