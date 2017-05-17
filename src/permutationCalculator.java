import java.util.ArrayList;

public class permutationCalculator {
	public  ArrayList<ArrayList<ArrayList<Integer>>> permutations;
	
	
	public permutationCalculator(int size){
	
		
	}
	
	public  ArrayList<ArrayList<ArrayList<Integer>>>  findPermutations(int size){
		
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		for(int i =0; i <size; i++){
			l2.add((Integer) i);
		}
		findPermutations(l2);
		for(int i =0; i< permutations.size();i++){
			for(int j = 0; j< permutations.get(i).size(); j++){
				System.out.print(permutations.get(i).get(j) +" ");
			}
			System.out.println();
		}
		
		permutations.remove(0);
		return permutations;
	}
	private  void findPermutations(ArrayList<Integer> list){
		permutations = new ArrayList<ArrayList<ArrayList<Integer>>>();
		for(int i =0; i<= list.size();i++){
			permutations.add(new ArrayList<ArrayList<Integer>>());
		}
		ArrayList<Integer> empty = new ArrayList<Integer>();
		findPermutations(empty, list);
	}
	
	private  void findPermutations(ArrayList<Integer> current, ArrayList<Integer> remaining){
		if(current.size()!=0){
			permutations.get(current.size()).add(current);
		}
		for(int i = 0; i < remaining.size();i++){
			ArrayList<Integer> temp = (ArrayList<Integer>) current.clone();
			temp.add(remaining.remove((i)));
			i--;
			findPermutations(temp, (ArrayList<Integer>) remaining.clone());
		}
	}
}
