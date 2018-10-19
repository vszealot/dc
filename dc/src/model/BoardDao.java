package model;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.BoardInfo;

@Repository
public class BoardDao {
	@Autowired
	private SqlSessionFactory factory;

	public boolean createBoard(BoardInfo boardInfo) {
		int n = factory.openSession().insert("boardspace.createBoard", boardInfo);
		return n > 0 ? true : false;
	}
	
	
}
