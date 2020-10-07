package com.capg.moodanalyser;

import org.junit.Assert;

import org.junit.Test;


public class MoodAnalyserTest
{
    
	
	@Test
    public void givenMessage_WhenSad_ShouldReturnSad() 
	{
    	MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
    	String mood = null;
    	try 
    	{
    	    mood = moodAnalyser.analyseMood();
    	}
    	catch (MoodAnalyserException e)
    	{
			e.printStackTrace();
        }
    	Assert.assertEquals("SAD", mood);
	}
    
    @Test
    public void givenMessage_WhenOtherThanSad_ShouldReturnHappy()
    {
    	MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
    	String mood = null;
    	try
    	{
    	    mood = moodAnalyser.analyseMood();
    	}
    	catch (MoodAnalyserException e)
    	{
    	    e.printStackTrace();
    	}
    	Assert.assertEquals("HAPPY", mood); 
    }
    
    @Test
    public void givenMessage_WhenNull_ShouldThrowMoodAnalyserException()
    {
    	try
    	{
    		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
    		moodAnalyser.analyseMood();
    	}
    	catch(MoodAnalyserException e)
    	{
    		System.out.println(e.getMessage());
    		Assert.assertNotEquals("You can't have the message as NULL", e.getMessage());
    	}
    }
    
    @Test
    public void givenMessage_WhenEmpty_ShouldThrowMoodAnalyserException() 
    {
       try
       {
           MoodAnalyser moodAnalyser = new MoodAnalyser("");
           moodAnalyser.analyseMood();
       }
       catch(MoodAnalyserException e)
       {
           System.out.println(e.getMessage());
           Assert.assertNotEquals("You can't have the message as EMPTY",e.getMessage());
       }
    }
}


