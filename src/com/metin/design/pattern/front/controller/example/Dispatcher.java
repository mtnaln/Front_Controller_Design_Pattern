package com.metin.design.pattern.front.controller.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Dispatcher {

    public void dispatch(HttpServletRequest request, HttpServletResponse response, String view) {

        if (view != null){
            RequestDispatcher dispatcher = request.getRequestDispatcher(mapViewToJspPage(view));
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String mapViewToJspPage(String view) {

        if (view.equalsIgnoreCase("displayPersonDetail")){
            return "person.jsp";
        } else if (view.equalsIgnoreCase("displayTaskDetail")){
            return "task.jsp";
        }

        return null;
    }
}
