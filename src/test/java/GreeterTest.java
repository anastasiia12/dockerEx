import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class GreeterTest {

    private Greeter greeter = new Greeter();
    private GettingCurrentTime gettingCurrentTime = new GettingCurrentTime();


    @Test
    public void greeterSaysHello() {
        assertThat("is not equals", greeter.sayHello(), containsString("hghgh"));
    }


    @Test
    public void gettingCurrentTime() {
        gettingCurrentTime.getcurrentTime();
        gettingCurrentTime.getcurrentTimeString();
    }

    @Test
    public void gettingCurrentTime_1() {
        gettingCurrentTime.getcurrentTime();
        gettingCurrentTime.getcurrentTimeString();
    }

    @Test
    public void gettingCurrentTime_2() {
        gettingCurrentTime.getcurrentTime();
        gettingCurrentTime.getcurrentTimeString();
    }

    @Test
    public void gettingCurrentTime_3() {
        gettingCurrentTime.getcurrentTime();
    }

}
