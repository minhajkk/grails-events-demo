package grails.events.demo

class IClass {
	String a
	String b

	String toString(){
		return ['a':a, 'b':b].toString()
	}
}