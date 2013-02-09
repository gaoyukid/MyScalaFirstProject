package Generics
import pattern.Tree
import Traits.Date

object GenericTest {
	def main(argss: Array[String]){
	  var ref:Reference[Date] = new Reference[Date];
	  ref.set(new Date(12,2,3));
	  println(ref.get);
	}
}