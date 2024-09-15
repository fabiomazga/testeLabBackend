package com.testlab;

import org.apache.catalina.startup.Tomcat;

public class Main {
    public static void main(String[] args) throws Exception {
        // Cria uma instância do Tomcat
        Tomcat tomcat = new Tomcat();

        // Configura a porta que o Heroku fornece via variável de ambiente "PORT"
        String port = System.getenv("PORT");
        if (port == null || port.isEmpty()) {
            port = "8080"; // Porta padrão local se "PORT" não estiver definida
        }
        tomcat.setPort(Integer.parseInt(port));

        // Adiciona o contexto da aplicação
        tomcat.addWebapp("/", System.getProperty("user.dir") + "/src/main/webapp");

        // Inicializa e inicia o servidor Tomcat
        tomcat.start();

        // Mantém o servidor Tomcat em execução
        tomcat.getServer().await();
    }
}
