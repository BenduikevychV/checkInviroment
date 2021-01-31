package practiceDefaultAcces.Practice;

import org.junit.Test;

public class Two {

    One one = new One();

    @Test
    public void setUp(){
        one.getName();
    }
}
