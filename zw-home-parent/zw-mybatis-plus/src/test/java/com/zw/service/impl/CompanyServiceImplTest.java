package com.zw.service.impl;

import com.zw.entity.Company;
import com.zw.service.ICompanyService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import util.BaseTest;

import java.util.UUID;

import static org.junit.Assert.fail;

public class CompanyServiceImplTest extends BaseTest{

	@Autowired
	private ICompanyService companyService;

	@Test
	public void testServiceImpl() {
		fail("Not yet implemented");
	}

	@Test
	public void testRetBool() {
		fail("Not yet implemented");
	}

	@Test
	public void testCurrentModleClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testSqlSessionBatch() {
		fail("Not yet implemented");
	}

	@Test
	public void testSqlStatement() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		Company company = new Company();
		company.setId(UUID.randomUUID().toString());
		company.setCompanyName("abc company");
		this.companyService.insert(company);
	}

	@Test
	public void testInsertAllColumn() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertBatchListOfT() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertBatchListOfTInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertOrUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertOrUpdateBatchListOfT() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertOrUpdateBatchListOfTInt() {
		fail("Not yet implemented");
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
	public void testUpdateBatchByIdListOfT() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateBatchByIdListOfTInt() {
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
	public void testSelectMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectObj() {
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
	public void testSelectPagePageOfT() {
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
	public void testSelectMapsPage() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectPagePageOfTWrapperOfT() {
		fail("Not yet implemented");
	}

}
