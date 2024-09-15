package com.testlab;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/anamneses")
public class AnamnesesServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Exemplo de dados JSON, que pode ser carregado de uma fonte de dados real
        // posteriormente.
        String jsonResponse = "[{"
                + "\"nome\":\"ANONIMO 1\","
                + "\"numAcesso\":\"780153-158\","
                + "\"data\":\"2020-06-09\","
                + "\"modalidade\":\"MR\","
                + "\"tipoExame\":\"SHOULDER\","
                + "\"estado\":\"4\""
                + "}]";

        PrintWriter out = response.getWriter();
        out.print(jsonResponse);
        out.flush();
    }
}
