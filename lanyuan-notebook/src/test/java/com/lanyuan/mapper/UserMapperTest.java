package com.lanyuan.mapper;

import static org.junit.Assert.fail;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.lanyuan.entity.UserFormMap;

public class UserMapperTest extends SpringDaoTestCase{
	
	@Inject 
	private UserMapper userMapper;
	
	@Test
	public void testFindUserPage() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByPage() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByWhere() {
		UserFormMap formMap = new UserFormMap();
		//formMap.put("where","id=1"); 
		List<UserFormMap> findByWhere = userMapper.findByWhere(formMap);
		
		System.out.println(findByWhere.size());
	}

	@Test
	public void testEditEntity() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByNames() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByAttribute() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByAttribute() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddEntity() {
		fail("Not yet implemented");
	}

	@Test
	public void testBatchSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByNames() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindbyFrist() {
		fail("Not yet implemented");
	}

}
