import java.util.ArrayList;

public class ArrayListFloat {

	public static void main(String[] args) {
	ArrayList <Float> BeratBadan = new ArrayList<Float>();
	BeratBadan.add((float) 50.03);
	BeratBadan.add((float) 49.50);
	BeratBadan.add((float) 52.35);
	
	System.out.println("Berapa Banyak Data : " + BeratBadan.size());
	System.out.println("Berat Badan : " + BeratBadan);
	BeratBadan.set(0, (float) 45.50);
	BeratBadan.set(2, (float) 50.44);
	System.out.println("Berat Badan : " + BeratBadan);
	}

}
