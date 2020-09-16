package com.deegeu.trivia.model;

import java.util.List;

public interface TriviaQuestionAccessible {
	TriviaQuestion	getQuestionById(long index);
	TriviaQuestion	getQuestionByIndex(long index);
	TriviaQuestion	getRandomQuestion();
	long getQuestionListSize();
	List<TriviaQuestion> getQuestionList(long offset);
}
