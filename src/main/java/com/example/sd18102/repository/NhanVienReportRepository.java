package com.example.sd18102.repository;

import com.example.sd18102.model.viewmodel.NhanVienReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienReportRepository extends JpaRepository<NhanVienReport, String> {

    @Query(value = "SELECT nv.ma, nv.ten, nv.gioi_tinh , hd.ma as ma_hoa_don\n" +
            " FROM nhan_vien nv JOIN hoa_don hd\n" +
            " ON nv.id = hd.id_nv", nativeQuery = true)
    List<NhanVienReport> findAll();
}
