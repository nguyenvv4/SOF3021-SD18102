package com.example.sd18102.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Table(name = "cua_hang")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CuaHang {

    @Id
//    @GeneratedValue(generator = "uuid")
//    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String ma;

    private String ten;

    private String diaChi;

    private String thanhPho;

    private String quocGia;
}
