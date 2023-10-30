package org.example;

import java.util.Scanner;

/**
 * Kelas yang mempresentasikan konversi kilometer ke meter
 */
class KilometerToMeterConverter {

    private double kilometers;

    /**
     * Constructor untuk objek kelas KilometerToMeterConverter
     *
     * @param kilometers
     */
    public KilometerToMeterConverter(double kilometers) {

        this.kilometers = kilometers;
    }

    /**
     * Mendapatkan kilometer
     * @return
     */
    public double convertToMeters() {

        return kilometers * 1000;
    }
    /**
     * Mengkonversi Kilometer ke bentuk Meter
     */
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai dalam kilometer: ");
        double kilometers = input.nextDouble();
        /**
         * Menginputkan nilai Kilometer yang ingin dikonversikan
         */


        KilometerToMeterConverter converter = new KilometerToMeterConverter(kilometers);

        double meters = converter.convertToMeters();

        System.out.println(kilometers + " kilometer sama dengan " + meters + " meter.");
        /**
         * Menampilkan hasil konversi KilometerToMeter
         */

        input.close();
    }
}
