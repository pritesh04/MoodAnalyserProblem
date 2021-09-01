package com.bridgelabs.registrationtest;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabs.moodanalyser.MoodAnalyser;
import com.bridgelabs.moodanalyser.MoodAnalyserException;

public class MoodAnalyserRunner {
	@Test
	public void whenHappy_ShouldReturnHappy() throws MoodAnalyserException {
		MoodAnalyser analyser = new MoodAnalyser();
		String result = analyser.analyseMood("Happy");
		Assert.assertEquals("Happy", result);
	}
	@Test
	public void whenSad_ShouldReturnSad() throws MoodAnalyserException {
		MoodAnalyser analyser = new MoodAnalyser();
		String result = analyser.analyseMood("Sad");
		Assert.assertEquals("Sad", result);
	}

}
