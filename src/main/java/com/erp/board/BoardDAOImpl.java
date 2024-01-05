package com.erp.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {
	// mybatis의 핵심클래스인 SqlSession을 이용해서 sql문이 실행
	SqlSession sqlSession;
	
	@Autowired
	public BoardDAOImpl(SqlSession sqlSession) {
		super();
		this.sqlSession = sqlSession;
	}

	@Override
	public int insert(BoardDTO board) {
		return sqlSession.insert("com.erp.board.write", board);
	}

	// mapper에 등록한 쿼리를 selectList의 정보로 설정
	@Override
	public List<BoardDTO> boardList() {
//		정석대로면 아래 보다는 이렇게 단계별로 코드를 작성하는 것이 맞다.
		List<BoardDTO> boardList = sqlSession.selectList("com.erp.board.selectall");
		System.out.println("dao => " + boardList);
		return boardList;
//		return sqlSession.selectList("com.erp.board.selectall");
	}

	@Override
	public BoardDTO read(String board_no) {
		return sqlSession.selectOne("com.erp.board.read", board_no);
	}

	@Override
	public int update(BoardDTO board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String board_no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardDTO> search(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> search(String tag, String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> findByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
