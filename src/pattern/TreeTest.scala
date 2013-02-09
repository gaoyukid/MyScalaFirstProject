package pattern


object TreeTest {

	type Environment = String => Int
	def eval(t:Tree, env: Environment): Int = t match {
	  case Sum(l, r) => eval(l, env) + eval(r, env)
	  case Var(n) => env(n)
	  case Const(v) => v
	}
	
	def main(args: Array[String]) {
	  val exp:Tree = Sum(Sum(Var("x"), Var("x")), Sum(Var("y"), Const(7)));
	  val env:Environment = {
	    case "x" => 5 
	    case "y" => 7
	  }
	  println("expression: " + exp )
	  println("evluate x = 5, y = 7: " + eval(exp, env) ) 
	}
}