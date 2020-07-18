package com.freshvoters.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity

public class Vote {
	
	private VoteId id;
	private Boolean upvote;

	public Boolean getUpvote() {
		return upvote;
	}

	public void setUpvote(Boolean upvote) {
		this.upvote = upvote;
	}
	@EmbeddedId
	public VoteId getId() {
		return id;
	}

	public void setId(VoteId id) {
		this.id = id;
	}
	
	
}
