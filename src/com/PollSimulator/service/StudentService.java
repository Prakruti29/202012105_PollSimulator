package com.PollSimulator.service;

import java.util.HashSet;
import java.util.List;

import com.PollSimulator.model.Candidate;
import com.PollSimulator.model.Student;


public class StudentService {
	static HashSet<Long> studentMap=new HashSet<>();
	public static boolean register(Student u) {
		if(studentMap.contains(u.getStudentId())) 
			return true;
		else
			studentMap.add(u.getStudentId());
		return false;
	}
	public static boolean castVote(String name) {
		List<Candidate> al=CandidateService.getAllCandidates();
		for(Candidate can:al) {
			if(can.getName().equals(name)) {
				int count=can.getVotes();
				count++;
				can.setVotes(count);
			}
		}
		return true;
	}
}
