package services.pricing;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ProductPriceService {
	public static void main(String[] args) {
		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		context.setContextPath("/");
		
		Server jettyServer = new Server(8081);
		jettyServer.setHandler(context);
		
		//It holds the name, params, and some state of the servlet.
		//Holder will organize the loading of the servlet when needed
		ServletHolder jerseyServlet = context.addServlet(org.glassfish.jersey.servlet.ServletContainer.class, "/*");
		jerseyServlet.setInitOrder(0);
		
		//Tells the servlet which REST class to load 
		jerseyServlet.setInitParameter("jersey.config.server.provider.classnames", ProductPriceAPI.class.getCanonicalName());
		
		try {
			jettyServer.start();
			jettyServer.join();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			jettyServer.destroy();
		}
	}
}
