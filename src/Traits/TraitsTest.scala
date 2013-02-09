package Traits

object TraitsTest {
	def main(args:Array[String]) = 
	{
	  var date1 = new Date(1996, 1, 23);
	  var date2 = new Date(2005, 1, 23);
	  
	  println(date1);
	  println(date2);
	  
	  if(date1 < date2)
	  {
	    println("date1 < date2")
	  } else if(date1 > date2)
	  {
	    println("date1 > date2")
	  } else
	  {
	    println("date1 = date2")
	  }
	  
	  
	}
}