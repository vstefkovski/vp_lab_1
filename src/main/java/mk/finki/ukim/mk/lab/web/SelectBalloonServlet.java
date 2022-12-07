package mk.finki.ukim.mk.lab.web;

import mk.finki.ukim.mk.lab.service.BalloonService;
import mk.finki.ukim.mk.lab.service.OrderService;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SelectBalloonServlet", urlPatterns = "/selectBalloon")
public class SelectBalloonServlet extends HttpServlet {
    private final SpringTemplateEngine springTemplateEngine;
    private final BalloonService balloonService;

    public SelectBalloonServlet(SpringTemplateEngine springTemplateEngine, BalloonService balloonService) {
        this.springTemplateEngine = springTemplateEngine;
        this.balloonService = balloonService;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Attribute NullPointer Check
        if (req.getSession().getAttribute("color") == null) {
            resp.sendRedirect("");
            return;
        }
        WebContext context = new WebContext(req, resp, req.getServletContext());
        context.setVariable("balloonColor", req.getSession().getAttribute("color").toString());
        this.springTemplateEngine.process("selectBalloonSize.html", context, resp.getWriter());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String selectedSize = req.getParameter("size");
        req.getSession().setAttribute("size", selectedSize);
        resp.sendRedirect("/BalloonOrder.do");
    }
}