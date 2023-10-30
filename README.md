# Aplikasi Mengkonversi Kilometer ke Meter

**KilometerToMeterConverter** adalah kelas java dimana proses perhitungan konversi nilai Kilometer ke bentuk Meter terjadi, Kilometer adalah satuan panjang yang besarnya sama dengan 1.000 meter jadi rumus yang kita gunakan untuk pengkonversian adalah kilometer * 1000. Kelas KilometerToMeterConverter mencakup metode perhitungan konversi ke dalam meter 

## Atribut:
**kilometers (double)**: Atribut ini digunakan untuk menyimpan nilai dalam kilometer yang akan dikonversi menjadi meter.
## Konstruktor:
**KilometerToMeterConverter(double kilometers)**: Konstruktor ini digunakan untuk membuat objek KilometerToMeterConverter dengan menginisialisasi nilai kilometers sesuai dengan parameter yang diberikan.
## Metode:
**convertToMeters()**: Metode ini digunakan untuk melakukan konversi dari kilometer ke meter. Metode ini mengalikan nilai dalam kilometer dengan 1000 (karena 1 kilometer sama dengan 1000 meter) dan mengembalikan hasilnya dalam bentuk meter.
## Kelas Main
Kelas Main merupakan kelas utama program yang digunakan untuk menerima input dari pengguna, melakukan konversi, dan menampilkan hasilnya.

## Metode main:
**main(String[] args)**: Metode ini merupakan metode utama yang dijalankan ketika program dimulai. Berikut adalah langkah-langkah yang dilakukan dalam metode main:
1. Membuat objek Scanner untuk menerima input dari pengguna.
2. Meminta pengguna untuk memasukkan nilai dalam kilometer.
3. Membuat objek KilometerToMeterConverter dengan menggunakan nilai yang dimasukkan oleh pengguna.
4. Memanggil metode convertToMeters pada objek converter untuk melakukan konversi.
5. Menampilkan hasil konversi dalam bentuk pesan ke layar, mencantumkan nilai dalam kilometer dan hasil konversi dalam meter.
6. Menutup objek Scanner untuk menghindari kebocoran sumber daya.
## Cara Penggunaan Program:
1. Program akan meminta pengguna untuk memasukkan nilai dalam kilometer. Pengguna diminta untuk memasukkan nilai numerik dalam kilometer.
```Java
System.out.print("Masukkan nilai dalam kilometer: ");
        double kilometers = input.nextDouble();
```

2. Setelah pengguna memasukkan nilai, program akan mengkonversi nilai tersebut ke meter dengan menggunakan objek KilometerToMeterConverter.

```Java
class KilometerToMeterConverter {
    private double kilometers;
    public KilometerToMeterConverter(double kilometers) {

        this.kilometers = kilometers;
    }
    public double convertToMeters() {

        return kilometers * 1000;
    }
}
public class Main {
    ....
     KilometerToMeterConverter converter = new KilometerToMeterConverter(kilometers);

        double meters = converter.convertToMeters();
    ....
}
```

3. Hasil konversi dalam meter akan ditampilkan ke layar bersama dengan nilai dalam kilometer yang dimasukkan oleh pengguna.

```Java
System.out.println(kilometers + " kilometer sama dengan " + meters + " meter.");
```

4. Program akan berakhir setelah menampilkan hasil konversi, dan objek Scanner akan ditutup.

```Java
input.close();
```

**Contoh Penggunaan Program**
```Java
Masukkan nilai dalam kilometer: 5.5
5.5 kilometer sama dengan 5500.0 meter.
```



