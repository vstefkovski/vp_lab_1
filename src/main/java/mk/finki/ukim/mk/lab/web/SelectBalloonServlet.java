package mk.finki.ukim.mk.lab.web;

import mk.finki.ukim.mk.lab.service.OrderService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "select_balloon",urlPatterns = "/selectBalloon")
public class SelectBalloonServlet extends HttpServlet {
    private final OrderService orderService;

    public SelectBalloonServlet(OrderService orderService) {
        this.orderService = orderService;
    }
}
