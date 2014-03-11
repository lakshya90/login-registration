/**
 * 
 */
package com.pradyothadavi.registration.model;

import java.io.Serializable;

/**
 * @author pradyot
 *
 */
public class Family implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String familyName;

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

}
