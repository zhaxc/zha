package com.zw.mapper;

import com.zw.entity.Company;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import util.BaseTest;

import static org.junit.Assert.fail;

public class CompanyMapperTest extends BaseTest{

	@Autowired
	private CompanyMapper companyMapper;

	@Test
	public void testInsert() {
		Company company = new Company();
		company.setAddress("高压小区");
		company.setCompanyName("zw");
		this.companyMapper.insert(company);
	}

	@Test
	public void testInsertAllColumn() {
		Company company = new Company();
		company.setId("2");
//		company.setAddress("高压小区");
		company.setCompanyName("zw");
		this.companyMapper.insertAllColumn(company);
	}

	@Test
	public void testDeleteById() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteBatchIds() {
		fail("Not yet implemented");
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
