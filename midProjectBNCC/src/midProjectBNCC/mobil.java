package midProjectBNCC;

public class mobil extends kendaraan {
	
	int sound;

	public mobil(String tipe, String merk, String nama, String noPlat, int topSpeed, 
			int bahanBakar, int ban, String jenis, int sound) {
		this.tipe = tipe;
		this.merk = merk;
		this.nama = nama;
		this.noPlat = noPlat;
		this.topSpeed = topSpeed;
		this.bahanBakar = bahanBakar;
		this.ban = ban;
		this.jenis = jenis;
		this.sound = sound;
	}
	
	@Override
	public void show() {
		System.out.println("Brand: " + merk);
		System.out.println("Name: "+nama);
		System.out.println("License Plate: "+noPlat);
		System.out.println("Type : "+jenis);
		System.out.println("Gas Capacity :"+bahanBakar);
		System.out.println("Top Speed: "+topSpeed);
		System.out.println("Wheel(s): "+ban);
		System.out.println("Entertaiment System: "+sound); 
		System.out.println("Turning on entertaiment sytem...");
	}
	
}