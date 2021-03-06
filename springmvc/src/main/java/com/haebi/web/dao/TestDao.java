package com.haebi.web.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import org.apache.ibatis.session.SqlSession;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.haebi.web.model.TestModel;

@Repository("TestDao")
public class TestDao {

	//@Autowired
	//SqlSession sqlSession;

	public List<TestModel> getEmpList() throws SQLException{
		//return sqlSession.selectOne("groupID.queryID", parameter); // if MyBaitis... but we don't prepare yet.
		
		// Here create sample data to return.
		List<TestModel> list = new ArrayList<TestModel>();
		
		TestModel data1 = new TestModel("kim", "Seoul, Korea", "010-1234-5678");
		TestModel data2 = new TestModel("nami", "Tokyo, Japan", "010-2345-6789");
		TestModel data3 = new TestModel("xie", "Beijing, China", "010-3456-7890");
		
		list.add(data1);
		list.add(data2);
		list.add(data3);
		
		return list;
	}
}