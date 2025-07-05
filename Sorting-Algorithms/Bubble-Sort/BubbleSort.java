import java.util.ArrayList;
public class BubbleSort{
    private static void bubbleSort(ArrayList<Integer> list){
		boolean flag = false; 
        for (int i=0 ; i<list.size() ; i++){
            for (int j=0 ; j< list.size()-i-1 ; j++){
                if (list.get(j) > list.get(j+1)){
		    		flag = true;			
                    int temp = list.get(j);
                    list.set(j , list.get(j+1));
                    list.set(j+1 , temp);
                }
            }
			if(flag == false){
				return;
			}
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(6);
        list.add(3);
        list.add(1);
        list.add(2);

        bubbleSort(list);

        for (int i : list){
            System.out.print(i + " ");
        }
    }
}
