# Tugas PBO Pertemuan 11

Nama: Muhammad Dhaffa Ardhana Rianto Putra

NIM: 312110029

Kelas: TI.21.C.2

---

Disini saya akan menunjukkan tutorial membuat Relasi Class

## Buat file dan kode Java

- Buat file dengan nama bebas seperti `Utama` dengan ekstensi file `.java`
- Tulis kode java seperti berikut

```
public class Utama {
	public static void main(String[] args) {
	
	}
}
```

### Buat file Panci class

- Untuk membuat super class constructor, buat file di folder yang sama dengan nama `Panci.java`
- Tulis kode java seperti berikut

```
public class Panci {
	public String merek;
	public int diameter;
}
```

- Lalu buat Method sebagai berikut

```
public void isiMinyak(Minyak minyak) {
	minyak.isiMinyak();
}

public void goreng(Minyak minyak) {
	minyak.goreng();
}

public void matang() {
	System.out.println("Masakan Matang!");
}
```

### Buat file Minyak sebagai subclass dari Panci

- Setelah diawal telah membuat super class, sekarang kita akan membuat sub class dengan menggunakan syntac `extend` setelah nama sub class.
- Buat file baru dengan nama `Minyak.java` dan ketik kode tersebut


```
public class Minyak extends Panci {

}
```

- Lalu buat variabel dan method


```
public int berat;

public void isiMinyak() {
	System.out.println("Mengisi dengan minyak...");
}

public void goreng() {
	System.out.println("Menggoreng.");
}
```

### Di dalam file `Utama.java`

- Tambahkan kode didalam `main()` dengan kode sebagai berikut, untuk menambahkan objek baru dari class yang sudah dibuat
- Variabel kiloan sebagai Minyak dan sanyo sebagai Panci

```
Minyak kiloan = new Minyak();
kiloan.berat = 1000;

Panci sanyo = new Panci();
sanyo.merek = "Sanyo";
sanyo.diameter = 10;
```

### Cetak hasil koding

- Print hasil dengan menggunakan method dan isi parameternya

```
sanyo.isiMinyak(kiloan);
sanyo.goreng(kiloan);
sanyo.matang();
```

- Save semua file
- Buka cmd (Command Prompt)
- Pergi menuju folder yang sudah dibuat dengan menggunakan `cd ...`
- Lalu eksekusi dengan mengetik `javac` lalu file yang akan di kompile yaitu `Utama.java`, `Panci.java` dan `Minyak.java`.
- Jika berhasil dan tidak ada error, ketik

```
java Utama
```

- Tampilan nya akan seperti ini

```
Mengisi dengan minyak...
Menggoreng.
Masakan Matang!
```

[Klik disini untuk melihat Hasil screenshot](./img.png)

___
Terima kasih telah mengikuti tutorial dari saya, kurang lebihnya mohon maaf.
