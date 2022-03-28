/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

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
	
	@Autowired
    PostalcodeService postalcodeService;
	
	@GetMapping("/getAll")
	public List<Postalcode> getAll() {
		return postalcodeService.getAll();
	}
	
	@PostMapping("/save")
	public boolean savePostalcode(@RequestBody Postalcode postalcode) {
		System.out.println("Postalcode : "+postalcode);
		return postalcodeService.save(postalcode);
	}
	
	@PostMapping("/bulksave")
	public int savePostalcode(@RequestBody List<Postalcode> postalcodes) {
		return postalcodeService.saveBulk(postalcodes);
	}
	
	@GetMapping("/getSuburbnames")
	public List<String> getSuburbNames(@RequestBody Range range) {
		System.out.println("range = "+ range);
	 return postalcodeService.getSuburbnames(range);
	}

}
