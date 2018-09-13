package com.example.springdemo;

import com.example.springdemo.util.NumberUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDemoApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println(NumberUtil.formatStr("0112"));
    }
}
