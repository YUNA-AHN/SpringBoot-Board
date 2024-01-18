package com.study.board.entity;

import jakarta.persistence.*;
import lombok.Data;

// 클래스 명은 테이블 명과 일치하게 해주는 것이 좋다 !
// Entity : 테이블을 의미  JPA 에서 이 클래스가 DB에 있는 테이블을 의미
// 생성해둔 컬럼의 형식과 이름에 맞춰 작성
// JPA가 이걸 읽어들임
@Entity
@Data // data 읽어들일 수 있음
public class Board {
    
    @Id // PK 의미하는 어노테이트
    // IDENTITY : MySql, SEQUENCE : Oracle, Auto : 알아서 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column // 생략 가능
    private String title;

    @Column
    private String content;
}
