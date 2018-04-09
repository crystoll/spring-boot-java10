package fi.solita.java10demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Java10demoApplication.class) // This is required currently for test to be able to find the annotations in JDK 10
public class Java10demoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
