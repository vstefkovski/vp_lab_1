package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.model.Manufacturer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ManufacturerRepository {
    List<Manufacturer> manufacturers = new ArrayList<>(5);

    public ManufacturerRepository() {
        Manufacturer manufacturer1 = new Manufacturer("Balloneria", "Makedonija", "Vodnjanska");
        Manufacturer manufacturer2 = new Manufacturer("Cameron Balloons", "United Kingdom", "Bristol");
        Manufacturer manufacturer3 = new Manufacturer("RubAir Balloons", "India", "Mumbai");
        Manufacturer manufacturer4 = new Manufacturer("Kubicek Balloons", "United Kingdom", "Southempton");
        Manufacturer manufacturer5 = new Manufacturer("One Sky Balloons", "India", "New Delhi");

        manufacturers.add(manufacturer1);
        manufacturers.add(manufacturer2);
        manufacturers.add(manufacturer3);
        manufacturers.add(manufacturer4);
        manufacturers.add(manufacturer5);
    }

    public List<Manufacturer> findAll() {
        return this.manufacturers;
    }

    public Optional<Manufacturer> findById(Long id) {
        return manufacturers.stream().filter(r -> r.getId().equals(id)).findFirst();
    }
}
