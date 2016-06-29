package com.triwahyuprasetyo.prsdpwhy.oop;

public class SirupStrawberry extends Minuman implements Suhu, Warna {

    public SirupStrawberry(String nama) {
        super(nama);
    }

    @Override
    public Tekstur getTekstur() {
        return Tekstur.KENTAL;
    }

    @Override
    public void setJenisSuhu(int derajatSuhu) {
        if (derajatSuhu <= 30) {
            suhu = "Dingin";
        } else {
            suhu = "Panas";
        }
    }

    @Override
    public void setWarna(String warna) {
        this.warna = warna;
    }
}
