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
	private String familyDescription;
	private long headOfFamily;
	private int totalMembersOfFamily;
	
	/**
	 * @return the familyName
	 */
	public String getFamilyName() {
		return familyName;
	}
	/**
	 * @param familyName the familyName to set
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	/**
	 * @return the familyDescription
	 */
	public String getFamilyDescription() {
		return familyDescription;
	}
	/**
	 * @param familyDescription the familyDescription to set
	 */
	public void setFamilyDescription(String familyDescription) {
		this.familyDescription = familyDescription;
	}
	/**
	 * @return the headOfFamily
	 */
	public long getHeadOfFamily() {
		return headOfFamily;
	}
	/**
	 * @param headOfFamily the headOfFamily to set
	 */
	public void setHeadOfFamily(long headOfFamily) {
		this.headOfFamily = headOfFamily;
	}
	/**
	 * @return the totalMembersOfFamily
	 */
	public int getTotalMembersOfFamily() {
		return totalMembersOfFamily;
	}
	/**
	 * @param totalMembersOfFamily the totalMembersOfFamily to set
	 */
	public void setTotalMembersOfFamily(int totalMembersOfFamily) {
		this.totalMembersOfFamily = totalMembersOfFamily;
	}
	
}
