package com.testlab;

import org.apache.catalina.startup.Tomcat;

public class Main {
    public static void main(String[] args) throws Exception {
        // Configurando o Tomcat
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        // Configurando o diretório base
        tomcat.getHost().setAppBase(".");

        // Adicionando o contexto
        tomcat.addWebapp("/", System.getProperty("java.io.tmpdir"));

        // Inicializando e aguardando o Tomcat
        tomcat.start();
        tomcat.getServer().await();
    }
}
