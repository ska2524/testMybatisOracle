package org.zerock.persistence;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class timeDAO {

	private SqlSessionTemplate session;

	public String getTime() {
		return session.selectOne("org.zerock.TimeMapper.getTime");
	}

}
