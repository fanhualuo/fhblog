package com.hehe.fhblog;

import com.hehe.common.util.Encryption;
import com.hehe.fhblog.dao.FhUserDao;
import com.hehe.fhblog.model.FhUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FhblogApplicationTests {

	@Autowired
	FhUserDao fhUserDao;
	@Test
	public void contextLoads() {
		System.out.println(fhUserDao);
		FhUser user=new FhUser();
		user.setName("xieqinghe");
		user.setPhone("15854026443");
		user.setEmail("qinghe101@qq.com");
		user.setType(1);
		user.setStatus(1);
		user.setPassword(Encryption.encrypt("123456"));

		assertTrue(fhUserDao.create(user));
	}

	@Test
	public void find(){
		System.out.println(fhUserDao.findById(100l));
	}

	@Test
	public void delete(){
		assertTrue(fhUserDao.delete(101l));
	}


}
