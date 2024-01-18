package com.study.board.repository;

import com.study.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // 레포지토리임을 지정

// JpaRepository 상속 받음 제네릭으로 타입을 지정: DB와 PK 컬럼 타입
public interface BoardRepository extends JpaRepository<Board, Integer> {
}
