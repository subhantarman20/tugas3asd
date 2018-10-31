
public class MainStackFloat {

	public static void main(String[] args) {
		StackFloat Berat = new StackFloat();
		Berat.cetak();
		
		Berat.push((float)50.15);Berat.cetak();
		Berat.push((float)53.13);Berat.cetak();
		Berat.push((float)47.5);Berat.cetak();
		Berat.push((float)40.22);Berat.cetak();
		Berat.push((float)45.40);Berat.cetak();
		
		Float keluaran1 = Berat.pop();Berat.cetak();
		System.out.println(keluaran1);
		Float keluaran2 = Berat.pop();Berat.cetak();
		System.out.println(keluaran2);
		Float keluaran3 = Berat.pop();Berat.cetak();
		System.out.println(keluaran3);
		Float keluaran4 = Berat.pop();Berat.cetak();
		System.out.println(keluaran4);
		Float keluaran5 = Berat.pop();Berat.cetak();
		System.out.println(keluaran5);
	}

}
