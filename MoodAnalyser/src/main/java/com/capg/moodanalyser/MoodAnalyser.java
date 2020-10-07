package com.capg.moodanalyser;

/**
 * Hello world!
 *
 */
public class MoodAnalyser 
{
      private String message;
	
	  public MoodAnalyser()
	  {
		
	  }
	  
	  public MoodAnalyser(String message)
	  {
		    this.message = message;
	  }
	
	  public String analyseMood()
	  {
		  try
		  {
		     if(message.contains("I am in Sad Mood"))
			    return  "SAD";
		     else
			    return "HAPPY";
		  }
		  catch(NullPointerException e)
		  {
			  return "HAPPY";
		  }
		  
   	  }
	
      public static void main( String[] args )
      {
        
      }
}
