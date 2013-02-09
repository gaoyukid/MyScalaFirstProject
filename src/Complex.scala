class Complex (real: Float, imaginary: Float) {
	def re:Float = real;
	def im:Float = imaginary;
	
	def abs:Float = {
	  val result = Math.sqrt(re * re + im * im).toFloat;
	  return result;
	}
	
	override def toString() = {
	  "" + re + (if(im > 0) "+" else "") + im + "i";
	}
}