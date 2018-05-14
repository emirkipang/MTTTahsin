package com.restuibu.emir.mtttahsin.model;

import java.util.ArrayList;

public class Hijaiyah {
    private String nama;
    private Integer img;
    private String makhraj;
    private String sifat;
    private Integer index;
    private Integer record;
    private Integer kalimat;

    public Hijaiyah(String nama, Integer img, String makhraj, String sifat, Integer index, Integer record, Integer kalimat) {
        this.nama = nama;
        this.img = img;
        this.makhraj = makhraj;
        this.sifat = sifat;
        this.index = index;
        this.record = record;
        this.kalimat = kalimat;
    }


    public Hijaiyah() {
    }

    public Integer getKalimat() {
        return kalimat;
    }

    public Integer getIndex() {
        return index;
    }

    public String getNama() {
        return nama;
    }

    public Integer getImg() {
        return img;
    }

    public String getMakhraj() {
        return makhraj;
    }

    public String getSifat() {
        return sifat;
    }

    public Integer getRecord() {
        return record;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public void setMakhraj(String makhraj) {
        this.makhraj = makhraj;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public void setRecord(Integer record) {
        this.record = record;
    }

    public void setKalimat(Integer kalimat) {
        this.kalimat = kalimat;

    }
}
