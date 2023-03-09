package kr.hs.study.beans;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //설정파일 (config.xml)을 로딩하고 실행하는 것
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        ctx.getBean("t1");
        ctx.close();


    }
}