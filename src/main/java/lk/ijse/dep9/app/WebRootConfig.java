package lk.ijse.dep9.app;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.context.annotation.RequestScope;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
@EnableTransactionManagement
public class WebRootConfig {

    @Bean
    public JndiObjectFactoryBean dataSource(){
        JndiObjectFactoryBean jndi = new JndiObjectFactoryBean();
        jndi.setJndiName("java:comp/env/jdbc/task-app");
        jndi.setExpectedType(DataSource.class);
        return jndi;
    }
    @RequestScope
    @Bean
    public Connection connection(DataSource ds) throws SQLException {
        return DataSourceUtils.getConnection(ds);
    }
    @Bean
    public DataSourceTransactionManager transactionManager(DataSource ds){
        return new DataSourceTransactionManager(ds);
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
