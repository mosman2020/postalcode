/**
 * 
 */
package com.example.demo.domain;

/**
 * @author mohamedosman
 *
 */
public class Range {

	private int from;
	private int to;
	public int getFrom() {
		return from;
	}
	public void setFrom(int from) {
		this.from = from;
	}
	public int getTo() {
		return to;
	}
	public void setTo(int to) {
		this.to = to;
	}
	@Override
	public String toString() {
		return "Range [from=" + from + ", to=" + to + "]";
	}
	
}
