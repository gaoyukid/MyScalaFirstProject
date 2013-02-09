package Generics

class Reference[T] {
	private var content: T = _
	def set(value: T)  {content = value}
	def get:T = {return content}
}