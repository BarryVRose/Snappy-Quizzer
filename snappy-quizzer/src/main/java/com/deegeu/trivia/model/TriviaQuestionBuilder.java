package com.deegeu.trivia.model;

import java.util.Date;
// import java.util.HashSet;

public class TriviaQuestionBuilder {
	private long id;
	private String question;
	private String answerA;
	private String answerB;
	private String answerC;
	private String answerD;
	private Date   lastUpdated;
	
	public TriviaQuestionBuilder() {
	}
	
	public TriviaQuestion build() {
		if (id < 0) {
			throw new IllegalStateException("Question malformed!");
		}
		
		return new TriviaQuestion(
				this.id, 
				this.question, 
				this.answerA, 
				this.answerB,
				this.answerC, 
				this.answerD,
				this.lastUpdated);
	}

	/**
     * Setter for {@link TriviaQuestionBuilder#id} 
     * @param id the unique id for the {@link TriviaQuestion}
     * @return 
     */
    public TriviaQuestionBuilder id(long id) {
        if (id < 0) {
            throw new IllegalArgumentException("Id can't be less than 0");
        }
        this.id = id;
        return this;
    }
    
    /**
     * Setter for {@link TriviaQuestionBuilder#question} 
     * @param question the trivia question for the {@link TriviaQuestion}
     * @return a {@link TriviaQuestionBuilder} instance
     */
    public TriviaQuestionBuilder question(String question) {
        if (question == null || question.trim().isEmpty()) {
           throw new IllegalArgumentException("Question cannot be null or empty."); 
        }
        this.question = question;
        return this;
    }
     
    /**
     * Setter for {@link TriviaQuestionBuilder#answerA} 
     * @param answer the first possible answer for the {@link TriviaQuestion}
     * @return a {@link TriviaQuestionBuilder} instance
     */
    public TriviaQuestionBuilder answerA(String answerA) {
        if (answerA == null || answerA.trim().isEmpty()) {
           throw new IllegalArgumentException("AnswerA cannot be null or empty."); 
        }
        this.answerA = answerA;
        return this;
    }    
    /**
     * Setter for {@link TriviaQuestionBuilder#answerA} 
     * @param answer the second possible answer for the {@link TriviaQuestion}
     * @return a {@link TriviaQuestionBuilder} instance
     */
    public TriviaQuestionBuilder answerB(String answerB) {
        if (answerB == null || answerB.trim().isEmpty()) {
           throw new IllegalArgumentException("AnswerB cannot be null or empty."); 
        }
        this.answerB = answerB;
        return this;
    }    
    /**
     * Setter for {@link TriviaQuestionBuilder#answerA} 
     * @param answer the third possible answer for the {@link TriviaQuestion}
     * @return a {@link TriviaQuestionBuilder} instance
     */
    public TriviaQuestionBuilder answerC(String answerC) {
        if (answerC == null || answerC.trim().isEmpty()) {
           throw new IllegalArgumentException("AnswerC cannot be null or empty."); 
        }
        this.answerC = answerC;
        return this;
    }    
    /**
     * Setter for {@link TriviaQuestionBuilder#answerD} 
     * @param answer the fourth possible answer for the {@link TriviaQuestion}
     * @return a {@link TriviaQuestionBuilder} instance
     */
    public TriviaQuestionBuilder answerD(String answerD) {
        if (answerD == null || answerD.trim().isEmpty()) {
           throw new IllegalArgumentException("AnswerD cannot be null or empty."); 
        }
        this.answerD = answerD;
        return this;
    }    
}
