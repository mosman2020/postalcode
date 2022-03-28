package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Postalcode;
import com.example.demo.domain.Range;
import com.example.demo.mybatis.dao.PostalcodeDao;
import com.example.demo.service.PostalcodeService;

@Service
public class PostalcodeServiceImpl implements PostalcodeService{

	@Autowired
	PostalcodeDao postalcodeDao;
	
	@Override
	public List<Postalcode> getAll() {
		return postalcodeDao.getAllPostalcodes();
	}

	@Override
	public boolean save(Postalcode postalcode) {
		return postalcodeDao.savePostalcode(postalcode);
	}

	@Override
	public int saveBulk(List<Postalcode> postalcodeList) {
		return postalcodeDao.saveBulkPostalcode(postalcodeList);
	}

	@Override
	public List<String> getSuburbnames(Range range) {
		List<String> result = postalcodeDao.getSuburbnames(range);
		System.out.println("result = "+result);
		String str = result.toString();
		result.add(""+str.length());
		return result;
	}

}
