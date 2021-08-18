package com.PollSimulator.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.PollSimulator.model.Candidate;



public class CandidateService {
	static List<Candidate> candidate=new ArrayList<>();
	public static boolean register (Candidate c)
	{
		for (Candidate candidate : candidate) {
			if(candidate.getId() == c.getId()) {
				return false;
			}
		}
		candidate.add(c);
		return true;
	}
	public static List<Candidate> getAllCandidates ()
	{
		return candidate;
	}
	public static List<Candidate> showWinner()
	{
		List<Candidate> result = new ArrayList<Candidate>(2);
		Collections.sort(candidate);
		result.add(candidate.get(0));
		result.add(candidate.get(1));
		return result;
	}

}
