package kiszel.daniel.demo_temalabor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ApartmentService {

    @Autowired
    private ApartmentRepository repository;

    public List<Apartment> getApartments(){
        return repository.findAllByOrderByIdAsc();
    }
    public void addApartment(Apartment apartment){
        repository.save(apartment);
    }
    public void updateApartment(Apartment apartment){
        repository.save(apartment);
    }
    public void deleteApartment(Integer id){
        repository.deleteById(id);
    }
}
