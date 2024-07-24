package com.example.kbfinal.entity;

import jakarta.persistence.*;
import lombok.*;

// lombok 사용할것
@Entity
@Data
@Setter @Getter
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String password;

    // 추가로 3개의 attribute 를 만들기
    // !!!!!!!!!!!!!!!!!!!!!1
}
