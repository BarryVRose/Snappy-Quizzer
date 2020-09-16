package com.deegeu.trivia.model;

import java.util.Date;
import java.util.Objects;

public final class TriviaQuestion {
	final private long id;
	final private String question;
	final private String answerA;
	final private String answerB;
	final private String answerC;
	final private String answerD;
	final private Date   lastUpdated;
	
	// constructor
	TriviaQuestion(long id, String question, 
			String answerA,String answerB, String answerC, String answerD,
			Date lastUpdated) {
		this.id = id;
		this.question = question;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.lastUpdated = lastUpdated;
	}
	
	public long getId() { return this.id; }
	public String getQuestion() { return this.question; }
	public String getAnswerA() { return this.answerA; }
	public String getAnswerB() { return this.answerB; }
	public String getAnswerC() { return this.answerC; }
	public String getAnswerD() { return this.answerD; }
	public Date getLastUpdated() { return this.lastUpdated; }

	 @Override
	    public boolean equals(Object obj) {
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final TriviaQuestion other = (TriviaQuestion) obj;
	        if (this.id != other.id) {
	            return false;
	        }
	        if (!Objects.equals(this.question, other.question)) {
	            return false;
	        }
	        if (!Objects.equals(this.answerA, other.answerA)) { // was answer A
	            return false;
	        }
	        if (!Objects.equals(this.answerB, other.answerB)) {
	            return false;
	        }
	        if (!Objects.equals(this.answerC, other.answerC)) {
	            return false;
	        }
	        if (!Objects.equals(this.answerD, other.answerD)) {
	            return false;
	        }
	        if (!Objects.equals(this.lastUpdated, other.lastUpdated)) {
	            return false;
	        }
	        /*
	        if (!Objects.equals(this.correctAnswer, other.correctAnswer)) {
	            return false;
	        }
	        if (!Objects.equals(this.hint, other.hint)) {
	            return false;
	        } */
	        if (!Objects.equals(this.lastUpdated, other.lastUpdated)) {
	            return false;
	        }
	        return true;
	    }}
