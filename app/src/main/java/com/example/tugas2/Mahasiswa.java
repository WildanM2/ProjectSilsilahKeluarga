package com.example.tugas2;


import android.graphics.drawable.Drawable;

public class Mahasiswa {
    public String nama ,nim ,angkatan;
    public Drawable gambar;


    public Drawable getGambar()
    {
        return gambar;
    }

    public void setGambar(Drawable gambar)
    {
        this.gambar = gambar;
    }

    public Mahasiswa(Drawable gambar, String nama, String nim, String angkatan) {
        this.gambar = gambar;
        this.nama = nama;
        this.nim = nim;
        this.angkatan = angkatan;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }
}
