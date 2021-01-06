import java.util.*;
public class RPL_Kelompok1B{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner an = new Scanner(System.in);
		
		System.out.println("============*========*============");
		System.out.println("===========*RPL Berkah*===========");
		System.out.println("============*========*============");

		//Data yang tersedia untuk menguluarkan output
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String[] main = {"Lego","Hot Wheels","Mobil Remote", "Water gun","Tamiya","Gangsing","Yoyo","Playstation4","Barbie Doll","Tayo"};
		int[] harga = {120_000,150_000, 500_000, 500_000, 45_000, 30_000, 25_000, 3_000_000, 30_000, 30_000};
		int[] stock = {20, 20, 20, 20, 20, 20, 20, 20, 20, 20};

		//Variabel yang digunakan untuk menginput
		String awal = "";
		String awal1 = "";
		int pilih = 0;
		int pilih1 = 0;
		String yn = "";
		String uang1 = "";
		//Variabel yang digunakan untuk menampung data
		int temp = 0;
		int uang = 0;
		int beli = 0;
		String a = "";
		ArrayList<String> tamp = new ArrayList<String>();
		
		//Variabel
		int i = 0;

		System.out.print("Silahkan Masukkan Nama Anda: ");
		do{
			nama = in.next();
			if (!nama.matches("[a-zA-Z]+") ) {
				System.out.print("Inputan harus berupa huruf, Silahkan input ulang: ");
			}
		}while(!nama.matches("[a-zA-Z]+")  );
		System.out.println("List mainan yang dijual:\n");
		
		do{

			for (int z = 0; z<main.length ;z++)
				System.out.println(String.format("%-4s"+"%-14s"+"Rp."+"%-10s"+"Stok: "+stock[z], (arr[z]+"."),main[z],harga[z]));			

			do{
			System.out.print("Silahkan pilih mainan yang akan anda beli:");
				do{
					awal = an.next();
					if (!awal.matches("[0-9]+")) {
					System.out.print("Inputan harus berupa angka, Silahkan input ulang: ");
					}
				}while(!awal.matches("[0-9]+"));	
				pilih = Integer.parseInt(awal);
				if (pilih < 1 || pilih > 10)
					System.out.println("Tidak ada di menu");
			
			}while(pilih < 1 || pilih > 10);

			System.out.print("Berapa item yang akan anda beli:");
			do{
			awal1 = an.next();
				if (!awal1.matches("[0-9]+")) {
					System.out.print("Inputan harus berupa angka, Silahkan input ulang: ");
				}
			}while(!awal1.matches("[0-9]+"));	
			pilih1 = Integer.parseInt(awal1);
				for (;i < arr.length ;i++ ) {
					
					if (pilih == arr[pilih-1] ) {
				
						if (stock[pilih-1] < pilih1 ) {
							stock[pilih-1]=stock[pilih-1];
							System.out.println("Stok tidak tersedia");
						}
						else {
							stock[pilih-1]-=pilih1;
							temp += harga[pilih-1]*pilih1;																				
							a += main[pilih-1]+" "+pilih1+", ";
							tamp.add(main[pilih-1]);
							beli += pilih1;
						}	
					
						break;	
					}
				}
			
				System.out.print("Apakah anda ingin membeli lagi?(Y/N)");
				yn = in.next();
			
			}while(yn.equalsIgnoreCase("y"));

		if (yn.equalsIgnoreCase("y")||yn.equalsIgnoreCase("n")) {
			System.out.println("\nBarang yang anda beli: [ "+ a.substring(0,a.length()-2)+" ]");
			System.out.println("Jumlah Barang yang dibeli "+ beli);
		}
		
		System.out.println("Total harga: "+temp);
		
		do{

			System.out.print("Masukkan Jumlah Uang: ");
			do{
			uang1 = in.next();
				if (!uang1.matches("[0-9]+")) {
					System.out.print("Inputan harus berupa angka, Silahkan input ulang: ");
				}
			}while(!uang1.matches("[0-9]+"));
			uang = Integer.parseInt(uang1);
			if (uang < temp)
				System.out.println("Maaf uang anda tidak cukup.");
			else 
				System.out.println("Kembalian: "+(uang-temp));
		
		}while(uang < temp);

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("|= Terima kasih "+nama);
		System.out.println("|= Barang yang anda beli: "+ tamp);
		System.out.println("|= Total Jumlah barang yang anda beli: "+beli);
		System.out.println("|= Terima kasih telah berkunjung ke toko kamii :} ");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

	}
}
