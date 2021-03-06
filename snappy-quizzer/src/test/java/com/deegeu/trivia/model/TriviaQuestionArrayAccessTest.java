package com.deegeu.trivia.model;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

public class TriviaQuestionArrayAccessTest {

	@Test
	public void testGetQuestionList() {
		long offset = 0L;
		TriviaQuestionArrayAccess acc = new TriviaQuestionArrayAccess();
		List<TriviaQuestion> quList =  acc.getQuestionList(offset);
		assertNotNull("Whatever was tested", quList);
		System.out.printf("Worked with %d questions!\n", quList.size());
		assert(quList.size() > 0);
	}
}
