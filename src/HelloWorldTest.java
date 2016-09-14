
import junit.framework.*;

public class HelloWorldTest extends TestCase{

	public static void main(String[] args) {
  junit.textui.TestRunner.run(HelloWorldTest.class);
}

public void testHello() throws Exception {
	HelloWorld hw = new HelloWorld();

assertTrue("Hello World n'est pas écrit",hw.sayHello().equals("Hello World"));
}
}