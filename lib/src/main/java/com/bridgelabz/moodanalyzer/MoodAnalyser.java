package com.bridgelabz.moodanalyzer;

public class MoodAnalyser {
	
	private String message;
	
	public MoodAnalyser(String message){
		this.message = message;
	}
	
	public MoodAnalyser() {
		this.message = "";
	}
	public String analyseMood() {
		if(message.contains("sad")) {
			return "SAD";
		}
		else {
			return "HAPPY";
		}
	}
}
