import java.util.ArrayList;

public class ArrayListObject {

	public static void main(String[] args) {
	ArrayList<Mahasiswa> Data = new ArrayList<Mahasiswa>();
	Data.add(new Mahasiswa("Mesing","D0243654","A","Kandeapi"));
	Data.add(new Mahasiswa("Ecing","D0243987","A","Sepang"));
	Data.add(new Mahasiswa("Susi","D0243435","A","lekopadis"));
	Data.add(new Mahasiswa("Leny","D0243675","A","pambusuang"));
	Data.forEach(data ->{
		System.out.println("Nama :" + data.getnama() + ", NIM : " + data.getnim() + " Kelas : " + data.getkelas() + ", Alamat : " + data.getalamat());
	});

}

}
