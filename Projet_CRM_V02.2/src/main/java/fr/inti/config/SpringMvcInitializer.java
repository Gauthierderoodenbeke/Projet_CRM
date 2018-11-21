package fr.inti.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Classe de configuration qui remplace le web.xml
 */
public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { BeansConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return  null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
