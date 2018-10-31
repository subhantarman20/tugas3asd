
public class MainStackDouble {

	public static void main(String[] args) {
		
		StackDouble Tinggi = new StackDouble();
		Tinggi.cetak();
		
		Tinggi.push(150.40);Tinggi.cetak();
		Tinggi.push(156.30);Tinggi.cetak();
		Tinggi.push(170.15);Tinggi.cetak();
		
		Double keluaran1 = Tinggi.pop();Tinggi.cetak();
		System.out.println(keluaran1);
		Double keluaran2 = Tinggi.pop();Tinggi.cetak();
		System.out.println(keluaran2);
		Double keluaran3 = Tinggi.pop();Tinggi.cetak();
		System.out.println(keluaran3);

	}

}
