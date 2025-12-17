package org.example;


import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Server {
    public static void main(String[] args) {
        String url = "http://localhost:5566/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web service deployed :" + url);
    }
}
