package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

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
		result.forEach(System.out::println);
		List<String> sortedList = result.stream().sorted().collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		long totalCharacters = sortedList.stream().toString().chars().filter(ch -> ch != ' ').count();
		sortedList.add(totalCharacters+"");
		return sortedList;
	}

}
