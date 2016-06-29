package com.triwahyuprasetyo.prsdpwhy.oop;

public class JusMelon extends Minuman implements Suhu, Warna {

    public JusMelon(String nama) {
        super(nama);
    }

    @Override
    public Tekstur getTekstur() {
        return Tekstur.KASAR;
    }

    @Override
    public void setJenisSuhu(int derajatSuhu) {
        suhu = "Dingin";
    }

    @Override
    public void setWarna(String warna) {
        this.warna = warna;
    }
}
