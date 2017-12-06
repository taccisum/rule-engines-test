package cn.tac.test.ruleengine.drools.guide;

import cn.tac.test.ruleengine.drools.guide.pojo.Applicant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author tac
 * @since 06/12/2017
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GuideTest.class)
@SpringBootApplication
public class GuideTest {
    @Test
    public void testSimply() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kContainer = kieServices.getKieClasspathContainer();

        StatelessKieSession ksession = kContainer.newStatelessKieSession();
        Applicant applicant = new Applicant("Mr John Smith", 17);
        assertTrue(applicant.getValid());
        ksession.execute(applicant);
        assertFalse(applicant.getValid());

        Applicant applicant1 = new Applicant("Mr Tac", 18);
        ksession.execute(applicant1);
        assertTrue(applicant1.getValid());
    }
}
