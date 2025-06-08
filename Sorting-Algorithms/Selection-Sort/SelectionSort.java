import java.util.ArrayList;
public class SelectionSort{
    private static void Sort(ArrayList<Integer> list){
	int n = list.size();
	for(int i=0 ; i<n-1 ; i++){
	    for(int j=i+1 ; j<n ; j++){
		if(list.get(i)>list.get(j)){
		    int temp = list.get(i);
		    list.set(i , list.get(j));
		    list.set(j , temp);
		}
	    }
	}
    }

    public static void main(String[] args){
	ArrayList<Integer> list = new ArrayList<>();

	list.add(5);
	list.add(4);
	list.add(3);
	list.add(2);
	list.add(1);

	Sort(list);

	for(int i : list){
	    System.out.print(i + " ");
	}
    }
}

    
  
