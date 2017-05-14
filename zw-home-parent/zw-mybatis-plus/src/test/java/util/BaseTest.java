package util;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zha on 2017/5/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= { "classpath*:/application-context*.xml"})
public class BaseTest {
}
