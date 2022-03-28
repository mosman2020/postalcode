/**
 * 
 */
package com.example.demo.mybatis.mapper;

import java.util.List;

import com.example.demo.domain.Postalcode;
import com.example.demo.domain.Range;

/**
 * @author mohamedosman
 *
 */
public interface PostalcodeMapper {
	
	List<Postalcode> getAllPostalcodes();
	int saveBulkPostalcode(List<Postalcode>  postalcodeList);
	boolean savePostalcode(Postalcode  postalcode);
	List getSuburbnames(Range range);

}
