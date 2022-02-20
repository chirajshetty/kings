/**
 * 
 */
package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.data.Address;
import com.example.demo.data.BasicInfo;
import com.example.demo.data.Education;
import com.example.demo.data.Resume;
import com.example.demo.data.Work;

/**
 * @author Chiraj
 *
 */
@Service
public class ResumeService implements IResumeService {
	
	Resume resume = new Resume() ;
	
	@Override
	public Resume getDetails() {
		setResumeData();
		return resume;
	}


	@Override
	public void setDummyDetails() {
	}

	private void setResumeData() {
		resume.setBasicInfo(getBasicInfo());
		resume.setAddress(getAddress());
		resume.setEducation(getEducation());
		resume.setTopics(getTopics());
		resume.setId(getId());
		resume.setWork(getWork());
	}


	private List<Work> getWork() {
		List<Work> result = new ArrayList<>();
		result.add(new Work("Amazon","Software Engineer","Aug-2000","Sep-2000"));
		result.add(new Work("Amazon","Senior Software Engineer","Aug-2000","Present"));
		return result;
	}


	private Integer getId() {
		return 001;
	}


	private List<String> getTopics() {
		List<String> result = new ArrayList<>();
		result.add("Java");
		result.add("SQL");
		result.add("Angular");
		result.add("Spring");
		return result;
	}


	private List<Education> getEducation() {
		List<Education> result = new ArrayList<>();
		result.add(new Education("St Andrew","HighSchool","Aug-2000","Sep-2000"));
		result.add(new Education("MIT","Graduation","Aug-2000","Present"));
		return result;
	}


	private Address getAddress() {
		return new Address("Delhi", "India");
	}


	private BasicInfo getBasicInfo() {
		return new BasicInfo("Alan", "Baker", "Roger", "Alan Roger", "10-Jan-90");
	}


}
