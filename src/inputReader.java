import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class inputReader {
	Scanner in = null;

	public inputReader(String fileName) {

		File f1 = new File(fileName);

		try {
			in = new Scanner(f1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void PrintArray(ArrayList<ArrayList<Double>> answers){
		File f1 = new File("Output.txt");
		PrintWriter out;
		try {
			out = new PrintWriter(f1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		for(int i = 0; i<answers.size(); i++){
			
			for(int j= 0; j< answers.get(i).size();j++){
				out.println(answers.get(i).get(j));
				System.out.println(answers.get(i).get(j));
			}
			System.out.println();
			out.println();
		}
		out.flush();
		
		
	}

	public double[][] parseFromFile() {
		double[][] probs;
		if (in.hasNextLine()) {
			String firstLine = in.nextLine();
			int probsSize = Integer.parseInt(firstLine);
			
			probs = new double[7][probsSize];
			
			for (int i = 0; i < probsSize; i++) {
				for (int j = 0; j < 7 && in.hasNextLine(); j++) {
					String s1 = in.nextLine();
					//hmmm
					double temp = Double.parseDouble(s1);
					probs[j][i] = temp;
				}
				if (in.hasNextLine()) {
					String s1 = in.nextLine();
				}
			}
			return probs;
		}
	
		return null;
	}

	public inputReader() {
		// TODO Auto-generated constructor stub
	}

}
