public class KaryawanTest{
	public static void main(String[] args){
		System.out.println("Macam-macam Gaji Karyawan POLINDRA");
		System.out.println(" ");
		Desaigner a = new Desaigner();
		a.setNama("Ade Diana Apriliyani");
		a.setAlamat("Desa Ujungaris Blok Gejleg Rt 01 Rw 04");
		a.setGaji(80);

		System.out.println(" ");
		Pm b = new Pm();
		b.setNama("Tika Surtikayati");
		b.setAlamat("Majalengka");
		b.setGaji(90);

		System.out.println(" ");
		Programmer c = new Programmer();
		c.setNama("Fery Sandria");
		c.setAlamat("Indramayu");
		c.setGaji(80);

	}
}