package org.interview.codereview;

import java.io.Serializable;

/**
 *  example of real code from 2010
 * code that is "similar" to client code I was asked to review
 */
public class Address implements Serializable {

	private static final long serialVersionUID = 5256885915241711097L;
	private String line1 ="";
	private String line2 ="";
	private String line3 ="";
	private String line4 ="";
	private String city ="";
	private String stateCode ="";
	private String zip5 ="";
	private String zip4 ="";
	/**
	 * @return the line1
	 */
	public String getLine1() {
		return line1;
	}
	/**
	 * @param line1 the line1 to set
	 */
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	/**
	 * @return the line2
	 */
	public String getLine2() {
		return line2;
	}
	/**
	 * @param line2 the line2 to set
	 */
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	/**
	 * @return the line3
	 */
	public String getLine3() {
		return line3;
	}
	/**
	 * @param line3 the line3 to set
	 */
	public void setLine3(String line3) {
		this.line3 = line3;
	}
	/**
	 * @return the line4
	 */
	public String getLine4() {
		return line4;
	}
	/**
	 * @param line4 the line4 to set
	 */
	public void setLine4(String line4) {
		this.line4 = line4;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the stateCode
	 */
	public String getStateCode() {
		return stateCode;
	}
	/**
	 * @param stateCode the stateCode to set
	 */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	/**
	 * @return the zip5
	 */
	public String getZip5() {
		return zip5;
	}
	/**
	 * @param zip5 the zip5 to set
	 */
	public void setZip5(String zip5) {
		this.zip5 = zip5;
	}
	/**
	 * @return the zip4
	 */
	public String getZip4() {
		return zip4;
	}
	/**
	 * @param zip4 the zip4 to set
	 */
	public void setZip4(String zip4) {
		this.zip4 = zip4;
	}

	/*
	  <apon:address>
		   <apon:line1>apon:line1</apon:line1>
	        <apon:line2>apon:line2</apon:line2>
	        <apon:line3>apon:line3</apon:line3>
	        <apon:line4>apon:line4</apon:line4>
	        <apon:city>apon:city</apon:city>
	        <apon:stateCode>apon:stateCode</apon:stateCode>
	        <apon:zip5>apon:zip5</apon:zip5>
	        <apon:zip4>apon:zip4</apon:zip4>
      </apon:address>
	 */
	public String toXmlString()
	{
		StringBuilder sb = new StringBuilder("<apon:address>");
		if (this.line1 != null) {
			//optional
			sb.append("<apon:line1>"+this.line1+"</apon:line1>");
		}

		if (this.line2 != null) {
			//optional
			sb.append("<apon:line2>"+this.line2+"</apon:line2>");
		}

		if (this.line3 != null) {
			//optional
			sb.append("<apon:line3>"+this.line3+"</apon:line3>");
		}

		if (this.line4 != null) {
			//optional
			sb.append("<apon:line4>"+this.line4+"</apon:line4>");
		}

		if (this.city != null) {
			//optional
			sb.append("<apon:city>"+this.city+"</apon:city>");
		}

		if (this.stateCode != null) {
			//optional
			sb.append("<apon:stateCode>"+this.stateCode+"</apon:stateCode>");
		}

		if (this.zip5 != null) {
			//optional
			sb.append("<apon:zip5>"+this.zip5+"</apon:zip5>");
		}

		if (this.zip4 != null) {
			//optional
			sb.append("<apon:zip4>"+this.zip5+"</apon:zip4>");
		}
		sb.append("</apon:address>");
		return sb.toString();
	}

}