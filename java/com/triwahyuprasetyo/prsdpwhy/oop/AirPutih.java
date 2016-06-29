package com.triwahyuprasetyo.prsdpwhy.oop;

public class AirPutih extends Minuman implements Suhu, Warna {

    public AirPutih(String nama) {
        super(nama);
    }

    @Override
    public Tekstur getTekstur() {
        return Tekstur.CAIR;
    }

    @Override
    public void setJenisSuhu(int derajatSuhu) {
        if (derajatSuhu <= 10) {
            suhu = "Dingin";
        } else if (10 < derajatSuhu && derajatSuhu < 50) {
            suhu = "Hangat";
        } else {
            suhu = "Panas";
        }
    }

    @Override
    public void setWarna(String warna) {
        this.warna = warna;
    }

}
