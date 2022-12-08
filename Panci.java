public class Panci {
	public String merek;
	public int diameter;

	// Dependensi
	public void isiMinyak(Minyak minyak) {
		minyak.isiMinyak();
	}

	public void goreng(Minyak minyak) {
		minyak.goreng();
	}
	
	public void matang() {
		System.out.println("Masakan Matang!");
	}
}