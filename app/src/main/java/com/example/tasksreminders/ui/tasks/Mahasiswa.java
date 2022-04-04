package com.example.tasksreminders.ui.tasks;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "mahasiswa")
public class Mahasiswa {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @NonNull
    private String nama;

    @NonNull
    private String kelas;

    public Mahasiswa(String nama, String kelas){
        this.nama = nama;
        this.kelas = kelas;
    }

    public String getNama(){return this.nama;}

    public String getKelas(){ return this.kelas;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
