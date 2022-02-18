/**
 * 
 */
package com.example.demo.services;

import com.example.demo.data.PersonalInfo;

/**
 * @author Chiraj
 *
 */
public interface IResumeService {
	
	public String getName();
	public Integer getAge();
	public PersonalInfo getDetails();
	public void setDetails(PersonalInfo personalInfo);
	public void setDummyDetails();

}
