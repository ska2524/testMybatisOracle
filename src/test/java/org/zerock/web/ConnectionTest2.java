package org.zerock.web;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.zerock.persistence.timeDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ConnectionTest2 {

	private static Logger logger = Logger.getLogger(ConnectionTest2.class);
	
	@Inject
	private DataSource ds;
	
	@Inject
	ApplicationContext ctx;
	
	@Inject
	SqlSessionFactory sqlFactory;
	
	@Inject
	timeDAO dao;
	
	
	@Test
	public void testTime(){
		
		logger.info(dao.getTime());
		
	}
	
	
	@Test
	public void testSession(){
		SqlSession sess = sqlFactory.openSession();
		logger.info(sess);
		
		String time = sess.selectOne("org.zerock.TimeMapper.getTime");
		logger.info(time+"----------------------");
		sess.close();
		
	}
	
	
	
	@Test
	public void testCtx(){
		
		logger.info(ctx +"-----------------------------");
		
		Object obj = ctx.getBean("sqlSessionFactory");
		
		logger.info(obj + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

	
	
	
	
	
	@Test
	public void testLoding(){
				
		logger.info("test loading");
		logger.info(ds);
		
		try(Connection con = ds.getConnection()){
			
		logger.info(con);
			
		}catch (Exception e) {
		
		};
		
	}
	
	
	
	
	
	
	
}
