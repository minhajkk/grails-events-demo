package grails.events.demo

import reactor.bus.Event
import reactor.spring.context.annotation.*


@Consumer
class DemoService {

    @Selector('my.event')
	void myEventListener(Event<IClass> event) {
		println "GOT EVENT $event"
	}
}
