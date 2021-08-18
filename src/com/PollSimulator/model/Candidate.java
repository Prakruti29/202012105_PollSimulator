package com.PollSimulator.model;

import com.PollSimulator.model.Candidate;

public class Candidate implements Comparable<Candidate> {
	private long id;
	private String name;
	int votes;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	@Override
	public int compareTo(Candidate c) {
		return c.getVotes() - this.getVotes();
	}
	

}
