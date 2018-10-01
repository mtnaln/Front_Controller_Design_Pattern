package com.metin.design.pattern.front.controller.example;

import javax.servlet.http.*;

public interface Command {

    String execute(HttpServletRequest request, HttpServletResponse response);
}
