package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.model.Ballon;

import java.util.List;

public interface BalloonService {
    List<Ballon> listAll();

    List<Ballon> searchByNameOrDescription(String text);
}
