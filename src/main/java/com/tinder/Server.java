package com.tinder;

import com.tinder.controller.TemplateEngine;
import org.eclipse.jetty.server.session.SessionHandler;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.DispatcherType;
import java.util.EnumSet;

public class Server  {
  public static void main(String[] args) throws Exception {
    String portStr = System.getenv("PORT");
    String dbUrl = System.getenv("JDBC_DATABASE_URL");
    String username = System.getenv("JDBC_DATABASE_USERNAME");
    String password = System.getenv("JDBC_DATABASE_PASSWORD");
    portStr = portStr == null ? "8088" : portStr;
    int port = Integer.parseInt(portStr);
    System.out.println("PORT: " + port);

    org.eclipse.jetty.server.Server server = new org.eclipse.jetty.server.Server(port);
    ServletContextHandler handler = new ServletContextHandler();
    TemplateEngine templateEngine = new TemplateEngine();
    SessionHandler sessionHandler = new SessionHandler();
    handler.setSessionHandler(sessionHandler);

//    handler.addFilter(new FilterHolder(new LoginFilter(templateEngine, userService)), "/*", EnumSet.of(DispatcherType.REQUEST));
//    handler.addServlet(new ServletHolder(new LoginServlet(userService, templateEngine)), "/");
//    handler.addServlet(new ServletHolder(new HelloServlet(templateEngine)), "/hello");
//    handler.addServlet(new ServletHolder(new FileServlet()), "/assets/*");
//    handler.addServlet(new ServletHolder(new RegistrationServlet(userService, templateEngine)), "/registration");

//        handler.addServlet(new ServletHolder(new UserServlet(userDao)), "/users");

//        handler.addServlet(new ServletHolder(new LikeServlet(userDao)), "/liked");

//        handler.addServlet(new ServletHolder(new MessageServlet(messageDao, userDao)), "/messages/*");
//        handler.addFilter(MessageFilter.class, "/messages/*", EnumSet.of(DispatcherType.REQUEST));

//        handler.addServlet(RedirectServlet.class, "/*");
//postgres://zqbqkvlznupzbl:a77883d190f0791d4dc914192c85c7d7c092747ddd5a5c9541bcb3c85789ceed@ec2-34-239-241-121.compute-1.amazonaws.com:5432/dbntfgp8kbdpt
    server.setHandler(handler);
    server.start();
    server.join();
  }
}
