/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public abstract class BangunRuang {

    public abstract double hitungVolume();

    public abstract double hitungLuasPermukaan();
}

// Class Kubus
class Kubus extends BangunRuang {

    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }
}

// Class Balok
class Balok extends BangunRuang {

    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar +
                    panjang * tinggi +
                    lebar * tinggi);
    }
}

// Class Tabung
class Tabung extends BangunRuang {

    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jariJari *
               (jariJari + tinggi);
    }
}

// Class Bola
class Bola extends BangunRuang {

    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI *
               Math.pow(jariJari, 3);
    }

    @Override
    public double hitungLuasPermukaan() {
        return 4 * Math.PI *
               jariJari * jariJari;
    }
}