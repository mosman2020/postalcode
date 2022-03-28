/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Postalcode;
import com.example.demo.domain.Range;
/**
 * @author mohamedosman
 *
 */
public interface PostalcodeService {
	List<Postalcode> getAll();
	int saveBulk(List<Postalcode> postalcodeList);
	boolean save(Postalcode postalcode);
	List<String> getSuburbnames(Range range);
}
