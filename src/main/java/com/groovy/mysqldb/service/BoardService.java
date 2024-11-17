package com.groovy.mysqldb.service;

import com.groovy.mysqldb.mapper.BoardMapper;
import com.groovy.mysqldb.vo.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = false)
public class BoardService {
    private final BoardMapper boardMapper;

    public int boardCount(){
        int result = boardMapper.boardCount();
        return result;
    }

    public List<Board> boardList(){return boardMapper.boardList();}

    public Board getOneBoard(int bno) {
        return boardMapper.getOneBoard(bno);
    }

    public List<Board> getBoard(int page) {
        return boardMapper.getBoard(page);
    }

    public int updateBoard(Board board) {
        return boardMapper.updateBoard(board);
    }

    public int deleteBoard(int bno) {
        return boardMapper.deleteBoard(bno);
    }

    public int updateCounts(int bno) {
        return boardMapper.updateCounts(bno);
    }
}
