package com.test.bai_kt1;

public class CaSi {
    private int hinh;
    private String ten;
    private String ngheDanh;
    private int quocGia;
    private String soSao;

    public CaSi(int hinh, String ten, String ngheDanh, int quocGia, String soSao) {
        this.hinh = hinh;
        this.ten = ten;
        this.ngheDanh = ngheDanh;
        this.quocGia = quocGia;
        this.soSao = soSao;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgheDanh() {
        return ngheDanh;
    }

    public void setNgheDanh(String ngheDanh) {
        this.ngheDanh = ngheDanh;
    }

    public int getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(int quocGia) {
        this.quocGia = quocGia;
    }

    public String getSoSao() {
        return soSao;
    }

    public void setSoSao(String soSao) {
        this.soSao = soSao;
    }
}
