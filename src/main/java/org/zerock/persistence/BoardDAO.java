package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.zerock.domain.BoardVO;
@Repository
public class BoardDAO {
	
	@Inject	
	private SqlSessionTemplate session;
	
	public void insert(BoardVO vo){
		
			session.insert("org.zerock.persistence.BoardDAO.insert", vo);
			
	}
	
	public List<BoardVO> select(){
		
		return session.selectList("org.zerock.persistence.BoardDAO.select");
		
	}
	
	
	public void update(BoardVO vo){
		
		session.update("org.zerock.persistence.BoardDAO.update", vo);
	}
	
	public void delete(BoardVO vo){
		session.delete("org.zerock.persistence.BoardDAO.delete", vo);
	}
	
	
}
