
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenovo
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BangunRuang bangun = null;

        System.out.println("================================");
        System.out.println("    KALKULATOR BANGUN RUANG");
        System.out.println("================================");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("4. Bola");
        System.out.print("Pilih bangun ruang: ");

        int pilihan = input.nextInt();

        switch (pilihan) {

            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();

                bangun = new Kubus(sisi);
                break;

            case 2:
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();

                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();

                bangun = new Balok(panjang, lebar, tinggi);
                break;

            case 3:
                System.out.print("Masukkan jari-jari: ");
                double rTabung = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                double tTabung = input.nextDouble();

                bangun = new Tabung(rTabung, tTabung);
                break;

            case 4:
                System.out.print("Masukkan jari-jari: ");
                double rBola = input.nextDouble();

                bangun = new Bola(rBola);
                break;

            default:
                System.out.println("Pilihan tidak tersedia!");
                input.close();
                return;
        }

        System.out.println("\n================================");
        System.out.println("       HASIL PERHITUNGAN");
        System.out.println("================================");

        System.out.printf("Volume: %.2f cm3%n",
                bangun.hitungVolume());

        System.out.printf("Luas Permukaan: %.2f cm2%n",
                bangun.hitungLuasPermukaan());

        input.close();
    }
}