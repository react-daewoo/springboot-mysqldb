package com.groovy.mysqldb.mapper;

import com.groovy.mysqldb.vo.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {
    int boardCount();

    List<Board> boardList();

    Board getOneBoard(int bno);

    List<Board> getBoard(int page);

    int updateBoard(Board board);

    int deleteBoard(int bno);

    int updateCounts(int bno);
}
