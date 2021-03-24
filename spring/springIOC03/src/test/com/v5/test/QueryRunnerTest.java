package com.v5.test;

import config.SpringConfiguration;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QueryRunnerTest {

    @Test
    public void test01() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        QueryRunner queryRunner1 = (QueryRunner) ac.getBean("queryRunner", QueryRunner.class);
        QueryRunner queryRunner2 = (QueryRunner) ac.getBean("queryRunner", QueryRunner.class);

        /**
         * 配置类上要加    @Scope("prototype")
         */
        System.out.println(queryRunner1);
        System.out.println(queryRunner2);

    }
}
