/**
 * 
 */
package com.example.demo.services;

import java.time.Instant;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.data.PersonalInfo;

/**
 * @author Chiraj
 *
 */
public class ResumeService implements IResumeService {
	
	@Autowired
	private PersonalInfo personalInfo;

	public String getName() {
		return personalInfo.getFullName();
	}

	public Integer getAge() {
		Date dob = personalInfo.getDOB();
		return Date.from(Instant.now()).compareTo(dob);
	}

	public PersonalInfo getDetails() {
		return personalInfo;
	}

	@Override
	public void setDetails(PersonalInfo personalInfo) {
		
	}

	@Override
	public void setDummyDetails() {
		personalInfo.setFirstName("Alex");
		personalInfo.setLastName("Alan");
		personalInfo.setMiddleName("Middleton");
		personalInfo.setFullName("Alex Middleton Alan");
		personalInfo.setDOB(Date.from(Instant.now()));
	}

}
