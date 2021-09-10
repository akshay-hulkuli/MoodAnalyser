package com.bridgelabz.moodanalyzer;

public class MoodAnalyser {
	
	private String message;
	
	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public String analyseMood(String message) throws MoodAnalysisException {
		this.message = message;
		try {
			return analyseMood();
		} catch (MoodAnalysisException e) {
			throw e;
		}
	}
	
	public String analyseMood() throws MoodAnalysisException {
		try {
			if(message.length() == 0) throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Please don't send empty string");
			if(message.contains("sad")) {
				return "SAD";
			}
			else {
				return "HAPPY";
			}
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Please don't send null values");
		}
	}
}
