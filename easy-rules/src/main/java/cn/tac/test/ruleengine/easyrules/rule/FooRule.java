package cn.tac.test.ruleengine.easyrules.rule;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Rule;

/**
 * @author tac
 * @since 06/12/2017
 */
@Rule(name = "foo rule", description = "hello world")
public class FooRule {
    @Condition
    public boolean when() {
        return true;
    }

    @Action
    public void then() throws Exception {
        System.out.println("hello world");
    }
}
