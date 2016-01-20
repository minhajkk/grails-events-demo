package grails.events.demo

class DemoController {

    def index() {
    	IClass clazz = new IClass(a:'a', b:'b')

    	notify 'my.event',clazz

    	render text:"All Good"
    }
}
