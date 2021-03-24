package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.v6.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * 该类是一个配置类，它的作用和bean.xml是一样的
 * spring种的新注解
 * Configuration作为AnnotationConfigApplicationContext对象创建的参数时，该注解可以不写
 * 作用: 指定当前类是一个配置类
 * 细节: 当配置类作为
 * ComponentScan
 * 作用: 通过注解指定spring在创建容器时要扫描的包
 * basePackages和 value的作用是一样的
 * 使用此注解相当于在xml里面配置了
 * <context:component-scan base-package="com.v6"></context:component-scan>
 * <p>
 * Bean
 * 作用: 用于把当前的方法的返回值存入到ioc容器中
 * 属性：用于指定bean的id 不写时 默认值是当前方法的名称
 * 细节：当我们能使用注解配置方法时，如果方法有参数，spring框架会去容器中查找有没有可用的bean对象
 * 查找的方式和Autowired注解的作用是一致的
 * <p>
 * Import
 * 作用：用于导入其他的配置类
 *
 * PropertySource
 * 作用：用于指定properties文件的位置
 * 属性：value:指定文件的名称和路径
 * 关键词：classpath，表示类路径下
 */
@Configuration
@Import({jdbcConfig.class})
//@ComponentScan(basePackages = "com.v6")
//@ComponentScan(basePackages = {"com.v6"})
//@ComponentScan("com.v6")
@ComponentScan({"com.v6", "config"})

@PropertySource("classpath:jdbcConfig.properties")
//@ComponentScan(value = "com.v6")
public class SpringConfiguration {


}
