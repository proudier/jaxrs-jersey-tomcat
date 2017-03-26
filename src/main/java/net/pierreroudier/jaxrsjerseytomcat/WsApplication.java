package net.pierreroudier.jaxrsjerseytomcat;

import org.glassfish.jersey.server.ResourceConfig;

public class WsApplication extends ResourceConfig {

	public WsApplication() {
		setApplicationName("jaxrs-jersey-tomcat");
		// separate packages with ';'
		packages(true, "net.pierreroudier.jaxrsjerseytomcat");

	}
}
