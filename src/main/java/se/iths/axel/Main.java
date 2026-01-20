package se.iths.axel;

public class Main {
    public static void main(String[] args) throws Exception {

        var server = new org.eclipse.jetty.server.Server(8080);
        var context = new org.eclipse.jetty.servlet.ServletContextHandler();
        server.setHandler(context);
        context.addServlet(RootServlet.class, ("/"));
        context.addServlet(HelloServlet.class, ("/hello/*"));

        server.start();
        server.join();
    }
}
