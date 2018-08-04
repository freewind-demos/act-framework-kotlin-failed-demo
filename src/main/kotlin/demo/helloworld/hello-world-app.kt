package demo.helloworld

import act.Act
import act.inject.DefaultValue
import act.util.Output
import org.osgl.mvc.annotation.GetAction

import act.controller.Controller.Util.render

class HelloWorldApp {

    @GetAction
    fun home(@DefaultValue("World") @Output who: String) {
        render(who)
    }

    companion object {

        @Throws(Exception::class)
        @JvmStatic
        fun main(args: Array<String>) {
            Act.start()
        }
    }

}
