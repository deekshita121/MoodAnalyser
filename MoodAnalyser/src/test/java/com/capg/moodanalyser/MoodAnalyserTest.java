package com.capg.moodanalyser;

import org.junit.Assert;

import org.junit.Test;


public class MoodAnalyserTest
{
    
	
	@Test
    public void givenMessage_WhenSad_ShouldReturnSad() 
	{
    	MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
    	String mood = moodAnalyser.analyseMood();
    	Assert.assertEquals("SAD", mood);
    }
    
    @Test
    public void givenMessage_WhenOtherThanSad_ShouldReturnHappy()
    {
    	MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
    	String mood = moodAnalyser.analyseMood();
    	Assert.assertEquals("HAPPY", mood); 
    }
    
    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy()
    {
    	MoodAnalyser moodAnalyser = new MoodAnalyser(null);
    	String mood = moodAnalyser.analyseMood();
    	Assert.assertEquals("HAPPY", mood);
    }
}


