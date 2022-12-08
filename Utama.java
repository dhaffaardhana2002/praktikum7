public class Utama {
	public static void main(String[] args) {
		// Dependensi
		Minyak kiloan = new Minyak();
		kiloan.berat = 1000;

		Panci sanyo = new Panci();

		sanyo.merek = "Sanyo";
		sanyo.diameter = 10;
		sanyo.isiMinyak(kiloan);
		sanyo.goreng(kiloan);
		sanyo.matang();

	}
}