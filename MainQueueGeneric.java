public class MainQueueGeneric {



	public static void main(String[] args) {

		QueueGeneric<Integer> nilaiInteger = new QueueGeneric<Integer>();

		nilaiInteger.setNilai(12345);

		System.out.println(nilaiInteger.getNilai());

		

		QueueGeneric<String> nilaiString = new QueueGeneric<String>();

		nilaiString.setNilai("Nadra");

		System.out.println(nilaiString.getNilai());

	}





	}



