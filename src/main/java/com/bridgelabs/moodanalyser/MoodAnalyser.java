package com.bridgelabs.moodanalyser;

public class MoodAnalyser {
	String message;

	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (message.contains("Happy"))
			return "Happy";
		if (message.toLowerCase().contains("sad"))
			return "Sad";
		else
			return "Happy";

	}

	public String analyseMood(String mood) {
		if (mood.contains("Happy"))
			return "Happy";
		if (mood.toLowerCase().contains("sad"))
			return "Sad";
		else
			return "Happy";

	}
}
