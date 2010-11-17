package org.interview.codereview;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: ksipe
 */
public class Weight implements Serializable {

	private static final long serialVersionUID = 2665393171326242573L;

	private String type;
	private Integer value;
	private Date dateTaken;
	private String uom;
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		if (type != null) {
			if (!type.equals("baseline") &&
					!type.equals("current") &&
					!type.equals("other")) {
				throw new IllegalArgumentException("Invalid type value :" + type);
			}
		} else {
			throw new IllegalArgumentException(" type value cannot be NULL! ");
		}
		this.type = type;
	}
	/**
	 * @return the value
	 */
	public Integer getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(Integer value) {
		if (value == null) {
			throw new IllegalArgumentException(" value cannot be NULL! ");
		}
		this.value = value;
	}
	/**
	 * @return the dateTaken
	 */
	public Date getDateTaken() {
		return dateTaken;
	}
	/**
	 * @param dateTaken the dateTaken to set
	 */
	public void setDateTaken(Date dateTaken) {
		if (dateTaken == null) {
			throw new IllegalArgumentException(" dateTaken value cannot be NULL! ");
		}
		this.dateTaken = dateTaken;
	}
	/**
	 * @return the uom
	 */
	public String getUom() {
		return uom;
	}
	/**
	 * @param uom the uom to set
	 */
	public void setUom(String uom) {
		if (uom != null) {
			if (!uom.equals("lb") &&
					!uom.equals("kg")) {
				throw new IllegalArgumentException("Invalid uom value :" + uom);
			}
		} else {
			throw new IllegalArgumentException(" uom value cannot be NULL! ");
		}
		this.uom = uom;
	}

//	<apon:weight>
//    <apon:type>baseline</apon:type>
//    <apon:value>0</apon:value>
//    <apon:uom>lb</apon:uom>
//  </apon:weight>

	public String toXmlString() {
		StringBuilder sb = new StringBuilder("<apon:weight>");
		if (this.type != null) {
			// Mandatory one...
			sb.append("<apon:type>"+this.type+"baseline</apon:type>");
		} else {
			throw new IllegalArgumentException(" type cannot be NULL! ");
		}

		if (this.value != null) {
			// Mandatory one...
			sb.append("<apon:value>"+this.value+"</apon:value>");
		} else {
			throw new IllegalArgumentException(" value cannot be NULL! ");
		}

		if (this.uom != null) {
			// Mandatory one...
			sb.append("<apon:uom>"+this.uom+"</apon:uom>");
		} else {
			throw new IllegalArgumentException(" uom cannot be NULL! ");
		}
				
		sb.append("</apon:weight>");
		return sb.toString();
	}



}