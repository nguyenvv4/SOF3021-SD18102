package com.example.sd18102.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "chi_tiet_sp")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SanPhamChiTiet {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private UUID idSp;
}
