package mk.finki.ukim.mk.lab.model;

import lombok.Data;

@Data
public class Order {
    String balloonColor;
    String balloonSize;
    String clientName;
    String clientAddress;
    Long orderId;

    public Order(String balloonColor, String balloonSize, String clientName, String clientAddress) {
        this.balloonColor = balloonColor;
        this.balloonSize = balloonSize;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
    }
}
