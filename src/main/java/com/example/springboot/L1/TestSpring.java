package com.example.springboot.L1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );

        TestBean testBean1 = context.getBean("L1", TestBean.class);
        TestBean testBean2 = context.getBean("L1a", TestBean.class);
        System.out.println(testBean1.getName());
        System.out.println(testBean1.getAge());
        System.out.println(testBean1.getCountry());
        System.out.println(testBean2.getName());
        System.out.println(testBean2.getAge());
        System.out.println(testBean2.getCountry());

        context.close();
    }
}
