package kr.hs.study.beans;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //설정파일 (config.xml)을 로딩하고 실행하는 것
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        TestBean obj1 = ctx.getBean("t1", TestBean.class); //t1의 주소값이 들어감
        System.out.println("obj1: "+obj1);

        TestBean2 obj2 = ctx.getBean("t2", TestBean2.class); //t2의 주소값이 들어감
        System.out.println("obj2: "+obj2);
        ctx.close();


    }
}