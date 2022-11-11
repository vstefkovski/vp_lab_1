package mk.finki.ukim.mk.lab.web;

import mk.finki.ukim.mk.lab.service.BalloonService;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "confirmation_info_servlet", urlPatterns = "/ConfirmationInfo")
public class ConfirmationInfoServlet extends HttpServlet {
    private final BalloonService balloonService;
    private final SpringTemplateEngine springTemplateEngine;
    public ConfirmationInfoServlet(BalloonService balloonService, SpringTemplateEngine springTemplateEngine) {
        this.balloonService = balloonService;
        this.springTemplateEngine = springTemplateEngine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Attribute NullPointer Check
        if(req.getSession().getAttribute("color")==null){
            resp.sendRedirect("");
            return;
        }
        WebContext context = new WebContext(req, resp, req.getServletContext());
        context.setVariable( "clientName", req.getSession().getAttribute("name") );
        context.setVariable( "clientAddress", req.getSession().getAttribute("address") );
        context.setVariable( "clientIP", req.getRemoteAddr() );
        context.setVariable( "clientAgent", req.getHeader("User-Agent") );
        context.setVariable( "balloonColor", req.getSession().getAttribute("color") );
        context.setVariable( "balloonSize", req.getSession().getAttribute("size") );
        this.springTemplateEngine.process("confirmationInfo.html", context, resp.getWriter() );
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}