/**
 * 
 */
package com.example.demo.services;

import java.time.Instant;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.example.demo.data.PersonalInfo;
import com.example.demo.data.Resume;

/**
 * @author Chiraj
 *
 */
@Service
public class ResumeService implements IResumeService {
	
	Resume resume = new Resume() ;
	PersonalInfo personalInfo = new PersonalInfo() ;

	@Override
	public Resume getDetails() {
		return resume;
	}


	@Override
	public void setDummyDetails() {
		personalInfo.setFirstName("Alex");
		personalInfo.setLastName("Alan");
		personalInfo.setMiddleName("Middleton");
		personalInfo.setFullName("Alex Middleton Alan");
		personalInfo.setDOB(Date.from(Instant.now()));
		resume.setPersonalInfo(personalInfo);
	}

}
