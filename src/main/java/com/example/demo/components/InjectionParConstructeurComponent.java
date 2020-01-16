package com.example.demo.components;

import com.example.demo.services.ServiceBonjour;

public class InjectionParConstructeurComponent {

    private ServiceBonjour serviceBonjour;

    public InjectionParConstructeurComponent(ServiceBonjour service){
        serviceBonjour = service;
    }

    public String direBonjour() {
        return serviceBonjour.bonjour();
    }
}