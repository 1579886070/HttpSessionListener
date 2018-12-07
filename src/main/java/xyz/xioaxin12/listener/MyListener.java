package xyz.xioaxin12.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext context = se.getSession().getServletContext();
        Integer num = (Integer) context.getAttribute("num");
        if(num == null){
            context.setAttribute("num",1);
        }else {
            context.setAttribute("num",++num);
        }
        System.out.println(num);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext context = se.getSession().getServletContext();
        Integer num = (Integer) context.getAttribute("num");
        if(num == null){
            context.setAttribute("num",1);
        }else {
            context.setAttribute("num",--num);
        }
        System.out.println(num);
    }
}
