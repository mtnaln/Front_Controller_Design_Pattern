package com.metin.design.pattern.front.controller.example;

import javax.servlet.http.*;

public class PersonCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        Person person = new Person(1, "Yusuf", "Alnıaçık");
        request.setAttribute("personDetail", person);

        return "displayPersonDetail";
    }
}
