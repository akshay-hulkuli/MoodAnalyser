package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad(){
		MoodAnalyser moodAnalyzer = new MoodAnalyser("Iam in sad mood");
		String mood = null ;
		try {
			mood = moodAnalyzer.analyseMood();
			Assert.assertEquals("SAD",mood);
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("Iam in Happy mood");
		String mood = null;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void givenMessage_WhenNull_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalysisException.class);
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void givenMessage_WhenEmpty_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalysisException.class);
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
}
