package com.example.sd18102.repository;

import com.example.sd18102.model.HoaDonChiTiet;
import com.example.sd18102.model.IdHoaDonChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoaDonChiTietRepository extends JpaRepository<HoaDonChiTiet, IdHoaDonChiTiet> {
}
