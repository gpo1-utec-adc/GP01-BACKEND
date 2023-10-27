package utec.arquitectura.conciliacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ConciliacionApplication extends SpringBootServletInitializer {

	public static void main( String[] args ){
		SpringApplication.run(ConciliacionApplication.class);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ConciliacionApplication.class);
	}

}
