package com.example.sd18102.repository;

import com.example.sd18102.model.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CuaHangRepository extends JpaRepository<CuaHang, UUID> {
}
