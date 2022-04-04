package com.example.tasksreminders.ui.tasks;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MahasiswaDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Mahasiswa mahasiswa);

    @Delete
    void delete(Mahasiswa mahasiswa);

    @Update
    void update(Mahasiswa mahasiswa);

    @Query("DELETE FROM mahasiswa")
    void deleteAll();


}
