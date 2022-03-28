/**
 * 
 */
package com.example.demo.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Postalcode;
import com.example.demo.domain.Range;
import com.example.demo.mybatis.mapper.PostalcodeMapper;

/**
 * @author mohamedosman
 *
 */
@Component
public class PostalcodeDao implements PostalcodeMapper{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Postalcode> getAllPostalcodes() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("getAllPostalcodes");
	}

	@Override
	public int saveBulkPostalcode(List<Postalcode> postalcodeList) {
		// TODO Auto-generated method stub
		return sqlSession.insert("saveBulkPostalcode", postalcodeList);
	}

	@Override
	public boolean savePostalcode(Postalcode postalcode) {
		return 1==sqlSession.insert("savePostalcode", postalcode);
	}

	@Override
	public List<String> getSuburbnames(Range range) {
		return sqlSession.selectList("getSuburbnames",range);
	}

}
