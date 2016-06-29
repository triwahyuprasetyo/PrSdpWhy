package com.triwahyuprasetyo.prsdpwhy.oop;

public abstract class Minuman {

    protected String nama;
    protected String suhu;
    protected String warna;
    protected Tekstur tekstur;

    public enum Tekstur{

        CAIR, KENTAL,LEMBUT
    };

    public Minuman() {
    }

    public Minuman(String nama) {
        this.nama = nama;
    }

    public void setProperties(String suhu) {
        this.suhu = suhu;
    }

    public void setProperties(String suhu, String warna) {
        this.suhu = suhu;
        this.warna = warna;
    }

    public abstract Tekstur getTekstur();

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getSuhu() {
        return suhu;
    }

    public String getWarna() {
        return warna;
    }

    public String toString(){
        return getNama() + " : " + getSuhu() + ", " + getWarna() + ", " + getTekstur().toString().toLowerCase();
    }
}
