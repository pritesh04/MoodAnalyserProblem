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

	@Test
	public void given_IaminSadMood_ShouldReturnSAD() throws MoodAnalyserException {
		MoodAnalyser analyser = new MoodAnalyser();
		String result = analyser.analyseMood("I am in Sad Mood");
		Assert.assertEquals("Sad", result);
	}

	@Test
	public void given_IaminAnyMood_ShouldReturnHappy() throws MoodAnalyserException {
		MoodAnalyser analyser = new MoodAnalyser();
		String result = analyser.analyseMood("I am in Any Mood");
		Assert.assertEquals("Happy", result);
	}

	@Test
	public void given_IaminSadMood_ShouldReturnSAD_ByCallingConstructor() {
		MoodAnalyser analyser = new MoodAnalyser("I am in Sad Mood");
		String result = analyser.analyseMood();
		Assert.assertEquals("Sad", result);
	}

	@Test
	public void given_IaminAnyMood_ShouldReturnHappy_ByCallingConstructor() {
		MoodAnalyser analyser = new MoodAnalyser("I am in Any Mood");
		String result = analyser.analyseMood();
		Assert.assertEquals("Happy", result);
	}

	@Test
	public void givenNull_ShouldHandleException() throws MoodAnalyserException {
		try {
			MoodAnalyser analyser = new MoodAnalyser();
			String result = analyser.analyseMood(null);
			Assert.assertEquals("Exception Handled", result);
		} catch (Exception e) {
			e.getMessage();
		}
	}

//	@Test
//	public void givenNullMood_ShouldReturnHappy() throws MoodAnalyserException {
//		
//			MoodAnalyser analyser = new MoodAnalyser();
//			String result = analyser.analyseMood(null);
//			Assert.assertEquals("Happy", result);
//		
//	}
	@Test
	public void givenNull_ShouldGive_NoEmptyMood() throws MoodAnalyserException {
		try {
			MoodAnalyser analyser = new MoodAnalyser();
			String result = analyser.analyseMood(null);
			Assert.assertEquals("Exception Handled", result);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	@Test
	public void givenBlank_ShouldGive_NoBlankMood() throws MoodAnalyserException {
		try {
			MoodAnalyser analyser = new MoodAnalyser();
			String result = analyser.analyseMood("");
			Assert.assertEquals("Exception Handled", result);
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
