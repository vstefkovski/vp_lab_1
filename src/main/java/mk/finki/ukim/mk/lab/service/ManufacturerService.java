package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.model.Manufacturer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ManufacturerService {
    List<Manufacturer> findAll();

}