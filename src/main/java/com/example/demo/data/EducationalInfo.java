/**
 * 
 */
package com.example.demo.data;

import java.util.Date;

/**
 * @author Chiraj
 *
 */

public class EducationalInfo {
	
	private String firstName;
	private String lastName;
	private String middleName;
	private String fullName;
	private Date DOB;
	
	
	/**
	 * 
	 */
	public EducationalInfo() {
		super();
	}
	/**
	 * @param fullName
	 * @param dOB
	 */
	public EducationalInfo(String fullName, Date dOB) {
		super();
		this.fullName = fullName;
		DOB = dOB;
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param middleName
	 * @param dOB
	 */
	public EducationalInfo(String firstName, String lastName, String middleName, Date dOB) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		DOB = dOB;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the dOB
	 */
	public Date getDOB() {
		return DOB;
	}
	/**
	 * @param dOB the dOB to set
	 */
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	
	

}
