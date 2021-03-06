package com.deegeu.trivia.model;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//import java.util.Date;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class TriviaQuestionArrayAccess implements TriviaQuestionAccessible{
	private ArrayList<TriviaQuestion> questionList;
	static private final int MAX_QUESTIONS_PER_PAGE = 1000;
	
	public TriviaQuestionArrayAccess() {
		this.loadQuestionArray();
	}
	
	@Override
    public TriviaQuestion getRandomQuestion() {
        int index = (new Random()).nextInt(questionList.size());
        return questionList.get(index);
    }
    
	
public List<TriviaQuestion> getQuestionList(long offset) {
    long start = offset; 
    if (start < 0) {
        start = 0;
    }
    if (start >= questionList.size()) {
        start = questionList.size();
    }
    long end = start + MAX_QUESTIONS_PER_PAGE;
    if (end >= questionList.size()) {
        end = questionList.size();
    }
    
    return questionList.subList((int) start, (int) end);
}

public List<TriviaQuestion> getSpecifiedQuestionList(long... id) {

    // Convert the var args into a List
    List<Object> ids = Arrays.stream(id)
                                 .boxed()
                                 .collect(Collectors.toList());

	Predicate<TriviaQuestion> byId = question -> ids.contains(question.getId());
    
	// Filter the question list to only have question with the given ids
    return this.questionList.stream()
                            .filter(byId)
                            .collect(Collectors.toList());

}

/*
    Creates trivia questions and adds them to an array.
*/
private void loadQuestionArray() {
    questionList = new ArrayList<TriviaQuestion>();
    questionList.add((new TriviaQuestionBuilder()
            .id(0)
            .question("How many feet are in a mile?")
            .answerA("5260")
            .answerB("5270")
            .answerC("5280")
            .answerD("5290"))
    /*        .correctAnswer("C")
            .hint("The altitude of Denver, Colorado")
            .lastUpdated(new Date()) */
            .build()
        );
    questionList.add((new TriviaQuestionBuilder()
            .id(0)
            .question("How many feet are in a week?")
            .answerA("5260")
            .answerB("5270")
            .answerC("5280")
            .answerD("5290"))
    /*        .correctAnswer("C")
            .hint("The altitude of Denver, Colorado")
            .lastUpdated(new Date()) */
            .build()
        );
	}
	
	public long getQuestionListSize() {
		return questionList.size();
	}
	
	public TriviaQuestion getQuestionByIndex(long index) {
		return ((int) index < questionList.size()) ? questionList.get((int) index) : null;
		
	}

	public TriviaQuestion getQuestionById(long id) {
		return ((int) id < questionList.size()) ? questionList.get((int) id) : null;
		
	}
}