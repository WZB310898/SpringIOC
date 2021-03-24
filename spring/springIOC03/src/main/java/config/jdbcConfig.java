package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;


//@Configuration
public class jdbcConfig {


    @Value("${jdbc.driver}")
    private String driver;


    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;


    /**
     * 创建一个QueryRunner对象
     *
     * @param dataSource
     * @return
     */
    @Bean(name = "queryRunner")
    @Scope("prototype")
    public QueryRunner getQueryRunner(@Qualifier("ds2") DataSource dataSource) {
        return new QueryRunner(dataSource);
    }

    /**
     * 创建数据源对象
     *
     * @return
     */
    @Bean(name = "ds1")
    public DataSource createDataSource1() {
        ComboPooledDataSource cpde = new ComboPooledDataSource();
        try {
            cpde.setDriverClass(driver);
            cpde.setJdbcUrl(url);
            cpde.setUser(username);
            cpde.setPassword(password);
            return cpde;
        } catch (PropertyVetoException e) {
            throw new RuntimeException(e);
        }

    }



    @Bean(name = "ds2")
    public DataSource createDataSource2() {
        ComboPooledDataSource cpde = new ComboPooledDataSource();
        try {
            cpde.setDriverClass("com.mysql.jdbc.Driver");
            cpde.setJdbcUrl("jdbc:mysql://localhost:3306/mysql-u");
            cpde.setUser("root");
            cpde.setPassword("*panzer310898");
            return cpde;
        } catch (PropertyVetoException e) {
            throw new RuntimeException(e);
        }

    }
}
