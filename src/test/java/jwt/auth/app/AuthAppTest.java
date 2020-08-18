package jwt.auth.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class AuthAppTest {
    @Test
    public void contexLoads() {
        AuthApp.main(new String[]{});
    }
}
