
public class MainStackString {

	public static void main(String[] args) {
	StackString Nama = new StackString();
	Nama.cetak();
	
	Nama.push("Mesing");Nama.cetak();
	Nama.push("Ecing");Nama.cetak();
	Nama.push("Ecce");Nama.cetak();
	Nama.push("Lela");Nama.cetak();
	
	String keluaran1= Nama.pop();Nama.cetak();
	System.out.println(keluaran1);
	String keluaran2= Nama.pop();Nama.cetak();
	System.out.println(keluaran2);
	String keluaran3= Nama.pop();Nama.cetak();
	System.out.println(keluaran3);
	String keluaran4= Nama.pop();Nama.cetak();
	System.out.println(keluaran4);
	}
}
