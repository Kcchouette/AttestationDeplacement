package com.poupa.attestationdeplacement.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface AttestationDao {
    @Insert
    long insert(AttestationEntity attestation);

    @Update
    void update(AttestationEntity attestation);

    @Delete
    void delete(AttestationEntity attestation);

    @Query("SELECT * FROM attestations ORDER BY id DESC")
    List<AttestationEntity> getAll();

    @Query("SELECT * FROM attestations WHERE id = :id LIMIT 1")
    AttestationEntity find(long id);
}
