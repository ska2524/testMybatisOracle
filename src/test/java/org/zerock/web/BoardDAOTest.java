package org.zerock.web;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.zerock.domain.BoardVO;
import org.zerock.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardDAOTest {
	
	
	private static Logger logger = Logger.getLogger(BoardDAOTest.class);
	
	@Inject
	BoardDAO dao;
	
	
	
	@Test
	public void Delete(){
		
		BoardVO vo=new BoardVO();
		
		vo.setBno(192);

		dao.delete(vo);
		
	}
	
	
	
	@Test
	public void Update(){
		BoardVO vo=new BoardVO();
		
		vo.setTitle("자바자바");
		vo.setBno(199);
		dao.update(vo);
		
		
	}
	
	
	@Test
	public void select(){
	
		List<BoardVO> vo = dao.select();
		
		//vo.forEach( -> System.out.println());
		
		
		logger.info("#####vovovovovovo"+vo);
		
	}
	
	@Test
	public void InsertTest(){
	
		BoardVO vo = new BoardVO();
		
		vo.setTitle("하하하");
		vo.setContent("기모띠");
		vo.setWriter("성춘");
		
		
		dao.insert(vo);
		
		}
		
		
		
		
		
	}
	
	
	
	

