import java.util.ArrayList;
public class SelectionSort{
    private static void Sort(ArrayList<Integer> list){
		int n = list.size();
		for(int i=0 ; i<n-1 ; i++){
			int minIndex = i;
			for(int j=i+1 ; j<n ; j++){
				if(list.get(j) < list.get(minIndex)){
					minIndex = j;
				}
			}
		
			int temp = list.get(i);
			list.set(i, list.get(minIndex));
			list.set(minIndex, temp);

		}
		
		for(int i : list){
			System.out.print(i + " ");
		}
		
		
	}

    public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>();

		list.add(3);
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(2);

		Sort(list);


    }
}

    
  
