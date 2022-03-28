/**
 * 
 */
package com.example.demo.domain;

/**
 * @author mohamedosman
 *
 */

public class Postalcode {

	
	private int id;
	private int postalcode;
	private String suburbname;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}
	public String getSuburbname() {
		return suburbname;
	}
	public void setSuburbname(String suburbname) {
		this.suburbname = suburbname;
	}
	@Override
	public String toString() {
		return "Postalcode [id=" + id + ", postalcode=" + postalcode + ", suburbname=" + suburbname + "]";
	}
	
	
	
}
