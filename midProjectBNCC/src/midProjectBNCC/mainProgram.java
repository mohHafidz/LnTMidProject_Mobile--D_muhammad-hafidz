package midProjectBNCC;

import java.util.ArrayList;
import java.util.Scanner;


public class mainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<kendaraan> kendaraanList = new ArrayList<kendaraan>();
		
		int input;
		do {
			System.out.println("======PT Meksiko======");
			System.out.println("1. list kendaraan");
			System.out.println("2. input list kendaraan");
			System.out.println("3. exit");
			System.out.print(">>");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input){
				case 1:
					
					System.out.println("|-----|---------------|---------------|");
					System.out.println("|no   |type           |name           |");
					System.out.println("|-----|---------------|---------------|");
					
					if(kendaraanList.size() == 0) {
						System.out.println("|     |               |               |");
						System.out.println("|-----|---------------|---------------|");
						
						System.out.println("");
						System.out.println("press \"enter\" go back to menu");
						sc.nextLine();
					}else {
						for(int i = 0; i < kendaraanList.size(); i++) {
							if(kendaraanList.get(i).tipe.equals("car")) {
								System.out.println("|"+(i+1)+"    |" + kendaraanList.get(i).tipe+"            |" + kendaraanList.get(i).nama);
							}else {
								System.out.println("|"+(i+1)+"    |" + kendaraanList.get(i).tipe+"     |" + kendaraanList.get(i).nama);
							}
							System.out.println("|-----|---------------|---------------|");
						}
						String input2;
						System.out.println("menampilkan list kendaraan [Yes | No]");
						System.out.print(">>");
						input2 = sc.nextLine();
						while(input2.equals("Yes")){
							
							int input3 = sc.nextInt();
							System.out.println("Brand: " + kendaraanList.get(input3-1).merk);//merk
							System.out.println("Name: "+kendaraanList.get(input3-1).nama);
							System.out.println("License Plate: "+kendaraanList.get(input3-1).noPlat);
							System.out.println("Type : "+kendaraanList.get(input3-1).jenis);
							System.out.println("Gas Capacity :"+kendaraanList.get(input3-1).bahanBakar);
							System.out.println("Top Speed: "+kendaraanList.get(input3-1).topSpeed);
							System.out.println("Wheel(s): "+kendaraanList.get(input3-1).ban);
							if(kendaraanList.get(input3-1).tipe.equals("car")) {
								System.out.println("Entertaiment System: "+kendaraanList.get(input3-1).sound);
							}else {
								System.out.println("Helm: "+kendaraanList.get(input3-1).sound);
								
							}
							System.out.println("menampilkan list kendaraan lagi [Yes | No]");
							System.out.print(">>");
							input2 = sc.nextLine();
						};
					}
					
				
				break;
				
				case 2:
					
					
					System.out.print("Input type [car | Motorcycle]: ");
					String tipe = sc.nextLine();
					
					if(tipe.equals("car")) {
						
						System.out.print("Input Brand [>= 5]: ");
						String merk = sc.nextLine();
						System.out.print("Input name [>= 5]: ");
						String nama = sc.nextLine();
						System.out.print("Input license: ");
						String noPlat = sc.nextLine();
						System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
						int Speed = sc.nextInt();
						sc.nextLine();
						System.out.print("Input gas capacity [30 <= gascap <= 60]: ");
						int tangkiBahan = sc.nextInt();
						sc.nextLine();
						System.out.print("Input wheel [4 <= wheel <= 6]: ");
						int ban = sc.nextInt();
						sc.nextLine();
						System.out.print("Input Type [SUV | Supercar | Minivan]: ");
						String jenis = sc.nextLine();
						System.out.print("Input entertainment system amount [>=1]: ");
						int sound = sc.nextInt();
						sc.nextLine();
						
						kendaraanList.add(new mobil(tipe,merk,nama,noPlat,Speed,tangkiBahan,ban,jenis,sound));
					}else if(tipe.equals("Motorcycle")) {
						
						System.out.print("Input Brand [>= 5]: ");
						String merk = sc.nextLine();
						System.out.print("Input name [>= 5]: ");
						String nama = sc.nextLine();
						System.out.print("Input license: ");
						String noPlat = sc.nextLine();
						System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
						int Speed = sc.nextInt();
						sc.nextLine();
						System.out.print("Input gas capacity [30 <= gascap <= 60]: ");
						int tangkiBahan = sc.nextInt();
						sc.nextLine();
						System.out.print("Input wheel [2 <= wheel <= 3]: ");
						int ban = sc.nextInt();
						sc.nextLine();
						System.out.print("Input Type [Manual | Automatic]: ");
						String jenis = sc.nextLine();
						System.out.print("Input helm amount [>=1]: ");
						int helm = sc.nextInt();
						sc.nextLine();
						kendaraanList.add(new motor(tipe,merk,nama,noPlat,Speed,tangkiBahan,ban,jenis,helm));
					}
					
				break;
			}
		}while(input != 3);

	}

}
