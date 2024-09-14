package com.testlab;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AnamnesesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.getWriter().write(
                "[{\"nome\":\"ANONIMO 1\", \"modalidade\":\"MR\", \"laudo\":\"F\", \"patientID\":\"ANONIMO\", \"data\":\"2020-06-09\", \"tipoExame\":\"SHOULDER\", \"numero\":\"780153-158\", \"estado\":\"4\"}]");
    }
}
