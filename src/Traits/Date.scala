package Traits

class Date(y: Int, m: Int, d: Int) extends Ord{
	def year = y;
	def month = m;
	def day = d;
	
	override def toString():String = {
	  return year + "-" + month + "-" + day;
	}
	
	override def equals (that: Any): Boolean = {
	  if(!that.isInstanceOf[Date])
	    error("cannot compare " + that + " and a Date");
	  var o = that.asInstanceOf[Date];
	  return (this.year == o.year) && (this.month == o.month) && (this.day == o.day);
	}
	def < (that: Any): Boolean = {
      if (!that.isInstanceOf[Date])
              error("cannot compare " + that + " and a Date")
      val o = that.asInstanceOf[Date] 
      return (year < o.year) ||
              (year == o.year && (month < o.month ||
              (month == o.month && day < o.day)))
	}
	
}