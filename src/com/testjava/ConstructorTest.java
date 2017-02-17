import java.io.IOException;

public class ConstructorTest {
	
	private ConstructorTest() throws IOException {
		
	}

}

class SubConstructorTest extends ConstructorTest {
	SubConstructorTest() throws Throwable {
	}
}