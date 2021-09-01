package com.bridgelabs.moodanalyser;

public class MoodAnalyser {

	public String analyseMood(String mood) {
		if (mood.contains("Happy"))
			return "Happy";

		else
			return "Sad";

	}
}
