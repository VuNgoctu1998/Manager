package com.example.welcome.manager;

public class NhanVien {
    public int id;

    public NhanVien(int id, String ten, String sdt, byte[] anh) {
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
        this.anh = anh;
    }

    public String  ten;
    public String  sdt;
    public byte[]  anh;

}
