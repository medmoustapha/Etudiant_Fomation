package gestion.formation;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class GlobalRepositoryRestConfigurer extends RepositoryRestConfigurerAdapter{
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.setReturnBodyOnCreate(true);
		config.setReturnBodyOnUpdate(true);
		config.getCorsRegistry()
			.addMapping("/**")
			.allowedOrigins("http://localhost:4200")
			.allowedMethods("OPTIONS","HEAD","GET","POST","PUT","DELETE","PATCH")
			.allowedHeaders("*");
	}

}
