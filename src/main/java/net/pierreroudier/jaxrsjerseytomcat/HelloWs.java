package net.pierreroudier.jaxrsjerseytomcat;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.slf4j.Logger;

@Path("hello")
public class HelloWs {

	@Inject
	private Logger logger;

	@GET
	@Path("world")
	public String HelloWorld() {
		logger.trace("Hello World invoked");
		return "Hello, World";
	}
	
	@GET
	@Path("name/{who}")
	public String HelloName(@PathParam("who") String who) {
		logger.trace("Hello name invoked, with who={}, who");
		return "Hello " + who;
	}		
}
