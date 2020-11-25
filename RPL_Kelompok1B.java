import java.util.*;
public class RPL_Kelompok1B{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("============*========*============");
		System.out.println("===========*RPL Berkah*===========");
		System.out.println("============*========*============");

		byte pilih = 0;
		byte pilih1 = 0;
		String yn = "";
		int temp = 0;
		int uang = 0;
		int beli = 0;
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int stock[] = {20, 20, 20, 20, 20, 20, 20, 20, 20, 20};
		String[] main = {"Lego","Hot Wheels","Mobil Remote", "Water gun","Tamiya","Gangsing","Yoyo","Playstation4","Barbie Doll","Tayo"};
		int harga[] = {120000,150000, 500000, 500000, 45000, 30000, 25000, 3000000, 30000, 30000};
		ArrayList<String> tamp = new ArrayList<String>();
		ArrayList<String> tamp1 = new ArrayList<String>();

		System.out.println("List mainan yang dijual:\n");
		for (int z = 0; z<main.length ;z++) {
			System.out.println((z+1)+". "+main[z]+" Rp."+harga[z]+"\t\tStok yang tersedia "+stock[z]);
		}
		System.out.print("Silahkan pilih maianan yang akan anda beli:");
		pilih = in.nextByte();
		System.out.print("Berapa item yang akan anda beli:");
		pilih1 = in.nextByte();
		int i = 0;
		for (;i < arr.length ;i++ ) {
			if (pilih == arr[i]) {
				stock[i]-=pilih1;
				temp += harga[i]*pilih1;
				tamp.add(""+main[i]);
				beli += pilih1;
				break;	
			}
		}
		System.out.print("Apakah anda ingin membeli lagi?(Y/N)");
		yn = in.next();
		int z = 0;
		System.out.println(tamp);
		do{
		if (yn.equalsIgnoreCase("Y") ) {
			while (z < arr.length) {
				System.out.println((z+1)+". "+main[z]+" Rp."+harga[z]+"\t\tStok yang tersedia "+stock[z]);
				z++;			
			}
				System.out.print("Silahkan pilih maianan yang akan anda beli:");
				pilih = in.nextByte();
				System.out.print("Berapa item yang akan anda beli:");
				pilih1 = in.nextByte();
				for (;z < arr.length ;z++ ) {
					if (pilih == arr[z]) {
						stock[z]-=pilih1;
						temp += harga[z]*pilih1;
						tamp1.add(""+main[z]);
						beli = beli +pilih1;
						break;	
					}
				}
		}
				System.out.print("Apakah anda ingin membeli lagi?(Y/N)");
				yn = in.next();
		}while(yn.equalsIgnoreCase("Y"));
		if (yn.equalsIgnoreCase("N")||yn.equalsIgnoreCase("Y")) {
			System.out.println("Barang yang anda beli "+ tamp +tamp1);
			System.out.println("Jumlah Barang yang dibeli "+ beli);
		}
		if (stock[i]<1) {
			System.out.println("Maaf stok sudah habis");
		}
		System.out.println("Total harga: "+temp);
		System.out.print("Uang yang digunakan ");
		uang = in.nextInt();
		if (uang <= temp) {
			System.out.println("Maaf uang anda tidak cukup.");
		}else {
			
		System.out.println("Kembalian: "+(uang-temp));
		}
/*List mainan ama harga:
1.lego Rp.120.000
2.hotwheels Rp.150.000
3.mobil remot Rp.500.000
4.water gun Rp.50.000
5.tamiya Rp.45.000
6.gangsing Rp.30.000
7.yoyo Rp.25.000
8.playstation4 Rp. 3.000.000
7.barbie doll Rp.30.000*/

	}
}