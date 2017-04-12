package com.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/12
 * \* Time: 14:07
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= { "classpath*:/application-context*.xml"})
public class BaseTestCase {
}