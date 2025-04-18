public class ArraySubset {

    static

    static boolean isSubset(int[] a , int[] b){
        int[] arr = new int[a.length];
        boolean val = false;

        for (int i=0 ; i<b.length ; i++){
            for (int j=0 ; j< a.length ; j++){
                if (b[i]==a[j]){
                    arr[i]=1;
                    val = true;
                }
            }
            if (!val){
                arr[i] = -1;
            }
        }
        return
    }

    public static void main(String[] args) {

    }
}
