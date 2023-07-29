package local.tilde.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletConfig;



public class HelloWorld implements Servlet {
    
    public void init(ServletConfig config){

        System.out.println("Servlet initialised");
    }
    public String getServletInfo(){
        return "Hello";
    }

    public ServletConfig getServletConfig(){

    }

    public void service(ServletRequest request, ServletResponse response){

    }

    public void destroy(){
        System.out.println("Servlet destroyed");
    }
    
}
