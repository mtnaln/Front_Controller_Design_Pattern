package com.metin.design.pattern.front.controller.example;

public class CommandHelper {

    public Command getCommand(String requestURI) {

        if (requestURI.contains("personDetails.do")){
            return new PersonCommand();
        }else if (requestURI.contains("taskDetails.do")){
            return new TaskCommand();
        }

        return null;
    }
}
