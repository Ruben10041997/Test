package Sem1.Controllers;

import Sem1.Models.ConfigSingleton;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by rubenahmadiev on 28.11.15.
 */
public class ServletFuturePlans extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        if (session.getAttribute("current_user") != null) {
            response.sendRedirect("/main");
        } else {
            try {
                Configuration cfg = ConfigSingleton.getConfig(getServletContext());
                Template tmpl = cfg.getTemplate("futurePlans.ftl");
                HashMap<String, Object> root = new HashMap<>();
                tmpl.process(root, response.getWriter());

            } catch (TemplateException e) {
                e.printStackTrace();
            }


        }
    }
}