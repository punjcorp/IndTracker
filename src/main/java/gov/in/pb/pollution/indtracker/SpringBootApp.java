/**
 * 
 */
package gov.in.pb.pollution.indtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Punj Corp
 *
 */
@SpringBootApplication
public class SpringBootApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//SpringApplication app=new SpringApplication(SpringBootApp.class);
		SpringApplication.run(SpringBootApp.class, args);
		//app.setWebEnvironment(false);
		//app.run(args);
	}

}

