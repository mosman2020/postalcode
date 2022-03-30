/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Postalcode;
import com.example.demo.domain.Range;
import com.example.demo.service.PostalcodeService;

/**
 * @author mohamedosman
 *
 */

@RestController
@RequestMapping("/api/postalcode")
public class PostalcodeController {
	
	private Logger logger = LoggerFactory.getLogger(PostalcodeController.class);
	
	@Autowired
    PostalcodeService postalcodeService;
	
	@GetMapping("/getAll")
	public List<Postalcode> getAll() {
		logger.info("Call of getAll() API");
		return postalcodeService.getAll();
	}
	
	@PostMapping("/save")
	public boolean savePostalcode(@RequestBody Postalcode postalcode) {
		logger.info("Call of savePostalcode API");
		logger.info("Postalcode : "+postalcode);
		return postalcodeService.save(postalcode);
	}
	
	@PostMapping("/bulksave")
	public int savePostalcode(@RequestBody List<Postalcode> postalcodes) {
		logger.info("Call of bulksave API");
		logger.info("inserted records :: "+ postalcodes.size());
		return postalcodeService.saveBulk(postalcodes);
	}
	
	@GetMapping("/getSuburbnames")
	public List<String> getSuburbNames(@RequestBody Range range) {
		logger.info("Call of getSuburbnames API");
		logger.info("range = "+ range);
	 return postalcodeService.getSuburbnames(range);
	}

}
