package com.bridgelabs.moodanalyser;

public class MoodAnalyser {

	public String analyseMood(String mood) {
		if (mood.contains("Happy"))
			return "Happy";
		if (mood.toLowerCase().contains("sad"))
			return "Sad";
		else 
			return "Happy";
		

	}
}
