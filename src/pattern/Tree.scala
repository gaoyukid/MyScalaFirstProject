package pattern

abstract class Tree 
case class Sum(l: Tree, r: Tree) extends Tree {
  override def toString():String = {
    return "(" + l.toString() + " + " + r.toString() + ")";
  }
}
case class Var(n: String) extends Tree {
  override def toString():String = {
    return n;
  }
}
case class Const(v: Int) extends Tree {
  override def toString():String = {
    return v.toString();
  }
}

