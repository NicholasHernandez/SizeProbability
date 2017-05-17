import java.util.ArrayList;

public class probabilityCalculator {
	private double[][] probs;
	private ArrayList<ArrayList<ArrayList<Integer>>> permutations;
	private ArrayList<ArrayList<Double>> probOfEach;
	permutationCalculator pCalc;
	private ArrayList<ArrayList<Double>> answers;

	private int currentSize;
	private inputReader in;
	public probabilityCalculator() {
		in = new inputReader(System.getProperty("user.dir") + "/"+"Sizes.txt");
		probs = in.parseFromFile();
		pCalc = new permutationCalculator(probs[0].length);
		permutations = pCalc.findPermutations(probs[0].length);
		answers = new ArrayList<ArrayList<Double>>();
	}

	public void not(ArrayList<Double> these) {

		for (int i = 0; i < these.size(); i++) {
			these.set(i, 1.0 - these.get(i));
		}

	}

	

	public double probOfN(int n) {
		double result = 0;
		for (int i = 0; i < permutations.get(n).size(); i++) {
			result += probOfThis( permutations.get(n).get(i));
		}
		return result; 
	}

	public double probOfThis(ArrayList<Integer> lst) {
		ArrayList<Double> happening = intToDouble(lst);
		ArrayList<Double> notHappening = intToDouble(getRemainingArray(lst));
		not(notHappening);
		double probability=1;
		for (int i = 0; i < happening.size(); i++) {
			probability*= happening.get(i);
		}
		for (int i = 0; i < notHappening.size(); i++) {
			probability*= notHappening.get(i);
		}
		return probability;
		
	}

	public void CalculateProbabilites() {

		ArrayList<Double> probForSize = new ArrayList<Double>();
		for (int i = 0; i < probs.length; i++) {
			currentSize = i;
			ArrayList<Double> temp = new ArrayList<Double>();
			
			for (int j = 0; j < probs[i].length; j++) {
				temp.add(probOfN(j));
			}
			answers.add(temp);
		}
		

		in.PrintArray(answers);
	}

	public ArrayList<Integer> getRemainingArray(ArrayList<Integer> input) {
		ArrayList<Integer> remainder = new ArrayList<Integer>();
		for (int i = 0; i <probs[currentSize].length ; i++) {
			remainder.add(i);
		}
		for (int i = input.size() - 1; i >= 0; i--) {
			remainder.remove(input.get(i));
		}

		return remainder;
	}

	public ArrayList<Double> intToDouble(ArrayList<Integer> input) {
		ArrayList<Double> tempList = new ArrayList<Double>();
		for (int i = 0; i < input.size(); i++) {
			tempList.add(probs[currentSize][input.get(i)]);
		}
		return tempList;
	}

}
