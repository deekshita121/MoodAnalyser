package com.capg.moodanalyser;
enum ExceptionTest
{
	EMPTY, NULL;
}

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
	
	  public String analyseMood() throws MoodAnalyserException
	  {
		  try 
		  {
             if(message.contains("I am in Sad Mood"))
		     {
			    return  "SAD";
		     }
		     else if(message.isBlank())
		     {
		    	 ExceptionTest one = ExceptionTest.EMPTY;
		    	 throw new MoodAnalyserException("You cant have the message "+ one);
		     }
		     else
		     {
			    return "HAPPY";
		     }
		  }
		  catch(NullPointerException e)
		  {
			  ExceptionTest two = ExceptionTest.NULL;
			  throw new MoodAnalyserException("You cant have the message "+ two);
		  }
		  
   	  }
	
      public static void main( String[] args )
      {
        
      }

}
