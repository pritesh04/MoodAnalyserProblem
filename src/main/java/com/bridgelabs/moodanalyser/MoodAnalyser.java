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

	public String analyseMood(String mood) throws MoodAnalyserException {
		try {

			if (mood.contains("Happy"))
				return "Happy";

			else if (mood.toLowerCase().contains("sad"))
				return "Sad";

			else
				return "Happy";
		} catch (NullPointerException e) {
			throw new MoodAnalyserException("Message cant be Null please enter Some mood");
			
		}

	}

}
