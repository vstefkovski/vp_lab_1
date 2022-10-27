package mk.finki.ukim.mk.lab.web;

import mk.finki.ukim.mk.lab.model.Ballon;
import mk.finki.ukim.mk.lab.service.BalloonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "balloon_servlet", urlPatterns = "")
public class BalloonListSevlet extends HttpServlet {
    private final BalloonService balloonService;

    public BalloonListSevlet(BalloonService balloonService) {
        this.balloonService = balloonService;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Ballon> ballons = balloonService.listAll();
        resp.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
