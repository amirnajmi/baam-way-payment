package ir.co.sadad.eb.resource;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Arquillian.class)
public class InvoiceResourceTest {

    @Drone
    private WebDriver webDriver;

    @Deployment
    public static JavaArchive createTestArchive() {
//        return ShrinkWrap.create(JavaArchive.class)
                return null;
    }

}
