/**
 * 
 */
package gov.in.pb.pollution.indtracker.conf;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * @author admin
 *
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"gov.in.pb.pollution.indtracker.domain"})
@EnableJpaRepositories(basePackages = {"gov.in.pb.pollution.indtracker.repository"})
@EnableTransactionManagement
public class RepositoryConfiguration {

}
