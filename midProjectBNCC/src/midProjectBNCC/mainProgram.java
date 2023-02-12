package midProjectBNCC;

import java.util.ArrayList;
import java.util.Scanner;


public class mainProgram {
	
	static void menu () {
		System.out.println("======PT Meksiko======");
		System.out.println("1. list kendaraan");
		System.out.println("2. input list kendaraan");
		System.out.println("3. exit");
	}
	
	static void list() {
		System.out.println("|-----|---------------|---------------|");
		System.out.println("|no   |type           |name           |");
		System.out.println("|-----|---------------|---------------|");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<kendaraan> kendaraanList = new ArrayList<kendaraan>();
		
		int input;
		do {
			menu();
			System.out.print(">>");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input){
				case 1:
					
					list();
					
					if(kendaraanList.size() == 0) {
						System.out.println("|     |               |               |");
						System.out.println("|-----|---------------|---------------|");
						
						System.out.println("");
						System.out.println("press \"enter\" go back to menu");
						sc.nextLine();
					}else {
						int i = 0;
						for(kendaraan List : kendaraanList) {
							if(kendaraanList.get(i).tipe.equals("car")) {
								System.out.println("|"+(i+1)+"    |" + kendaraanList.get(i).tipe+"            |" + 
								kendaraanList.get(i).nama);
							}else {
								System.out.println("|"+(i+1)+"    |" + kendaraanList.get(i).tipe+"     |" + 
								kendaraanList.get(i).nama);
							}
							System.out.println("|-----|---------------|---------------|");
							i++;
						}
						System.out.println("");
						int  input2;
						System.out.print("Pick a vehicle number to test drive[Enter '\0\' to exit] >>");
						input2 = sc.nextInt();
						sc.nextLine();
						if(input2 != 0) {
							kendaraanList.get(input2-1).show();
						}
						sc.nextLine();
					}
				break;
				
				case 2:
					
					String tipe;
					do {						
						System.out.print("Input type [car | Motorcycle]: ");
						tipe = sc.nextLine();
					}while(!tipe.toUpperCase().equals("CAR") && !tipe.toUpperCase().equals("MOTORCYCLE"));
					
					String merk;
					do {
						System.out.print("Input Brand [>= 5]: ");
						merk = sc.nextLine();
					}while(merk.length()<5);
					
					String nama;
					do {							
						System.out.print("Input name [>= 5]: ");
						nama = sc.nextLine();
					}while(nama.length()<5);
					
					String noPlat;
					do {
						System.out.print("Input license: ");
						noPlat = sc.nextLine();
					}while(!LicenseNumberValidator.isValid(noPlat));
					
					int Speed;
					do {							
						System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
						Speed = sc.nextInt();
						sc.nextLine();
					}while(Speed < 100 || Speed > 250);
					
					int tangkiBahan;
					do {							
						System.out.print("Input gas capacity [30 <= gascap <= 60]: ");
						tangkiBahan = sc.nextInt();
						sc.nextLine();
					}while(tangkiBahan < 30 || tangkiBahan > 60);
					
					if(tipe.toUpperCase().equals("CAR")) {
						
						int ban;
						do {							
							System.out.print("Input wheel [4 <= wheel <= 6]: ");
							ban = sc.nextInt();
							sc.nextLine();
						}while(ban < 4 || ban > 6);
						
						String jenis;
						do {							
							System.out.print("Input Type [SUV | Supercar | Minivan]: ");
							jenis = sc.nextLine();
						}while(!jenis.toUpperCase().equals("SUV") && !jenis.toUpperCase().equals("SUPERCAR") && !jenis.toUpperCase().equals("MINIVAN"));
						
						int sound;
						do {							
							System.out.print("Input entertainment system amount [>=1]: ");
							sound = sc.nextInt();
							sc.nextLine();
						}while(sound < 1);
						
						mobil mobil1 = new mobil(tipe,merk,nama,noPlat,Speed,tangkiBahan,ban,jenis,sound);
						kendaraanList.add(mobil1);
					}else if(tipe.toUpperCase().equals("MOTORCYCLE")) {
						
						int ban;
						do {							
							System.out.print("Input wheel [2 <= wheel <= 3]: ");
							ban = sc.nextInt();
							sc.nextLine();
						}while(ban < 2 || ban >3);
						
						String jenis;
						do {							
							System.out.print("Input Type [Manual | Automatic]: ");
							jenis = sc.nextLine();
						}while(!jenis.toUpperCase().equals("MANUAL") && !jenis.toUpperCase().equals("AUTOMATIC"));
						
						int helm;
						do {
							System.out.print("Input helm amount [>=1]: ");
							helm = sc.nextInt();
							sc.nextLine();
						}while(helm < 1);
						kendaraanList.add(new motor(tipe,merk,nama,noPlat,Speed,tangkiBahan,ban,jenis,helm));
					}
					
				break;
			}
		}while(input != 3);

	}

}
