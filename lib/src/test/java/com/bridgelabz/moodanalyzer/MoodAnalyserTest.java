package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad(){
		MoodAnalyser moodAnalyzer = new MoodAnalyser("Iam in sad mood");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("SAD",mood);
	}
	
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("Iam in Happy mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	
	@Test
	public void givenMessage_WhenNull_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
}
