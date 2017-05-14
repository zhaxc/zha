package com.zw.mapper;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.zw.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import util.BaseTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.fail;

public class UserMapperTest extends BaseTest{

    @Autowired
    private UserMapper userMapper;

	@Test
	public void testInsert() {
        User user = new User();
        user.setName("王妮");
        user.setAge(18);
        this.userMapper.insert(user);
    }

	@Test
	public void testInsertAllColumn() {
		User user = new User();
		user.setName("王妮");
		user.setAge(18);
		this.userMapper.insertAllColumn(user);
	}

	@Test
	public void testDeleteById() {
		this.userMapper.deleteById(1);
	}

	@Test
	public void testDeleteByMap() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", "王妮");
		map.put("login_name","wang1");
		this.userMapper.deleteByMap(map);
	}

	@Test
	public void testDelete() {
		EntityWrapper<User> ew = new EntityWrapper<User>();
		ew.setEntity(new User());
		ew.where("name = {0} and age = {1}", "查", 18);
		this.userMapper.delete(ew);
	}

	@Test
	public void testDeleteBatchIds() {
		List<Integer> ids = new ArrayList<>();
		ids.add(1);
		ids.add(4);
		this.userMapper.deleteBatchIds(ids);
	}

	@Test
	public void testUpdateById() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateAllColumnById() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectById() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectBatchIds() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectOne() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectList() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectMaps() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectObjs() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectPage() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectMapsPage() {
		fail("Not yet implemented");
	}

}
