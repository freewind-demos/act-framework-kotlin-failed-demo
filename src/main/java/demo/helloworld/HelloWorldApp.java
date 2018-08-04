package demo.helloworld;

import act.Act;
import act.inject.DefaultValue;
import act.util.Output;
import org.osgl.mvc.annotation.GetAction;

import static act.controller.Controller.Util.render;

public class HelloWorldApp {

    @GetAction
    public void home(@DefaultValue("World") @Output String who) {
        render(who);
    }

    public static void main(String[] args) throws Exception {
        Act.start();
    }

}
