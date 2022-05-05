package kiszel.daniel.demo_temalabor;

import java.util.List;

import netscape.javascript.JSObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ApartmentController {
    private Logger logger = LoggerFactory.getLogger(ApartmentController.class);
    @Autowired
    private ApartmentService service;

    @GetMapping("/api/apartments")
    public List<Apartment> getApartments(){
        return service.getApartments();
    }
    @PostMapping("/api/apartments/new")
    public void addApartment(@RequestBody Apartment apartment){
        service.addApartment(apartment);
    }
    @PutMapping("/api/apartments/{id}/edit")
    public void updateApartment(@PathVariable("id") Integer id, @RequestBody Apartment apartment){
        service.updateApartment(apartment);
    }
    @DeleteMapping("/api/apartments/{id}/delete")
    public void deleteApartment(@PathVariable("id") Integer id){
        service.deleteApartment(id);
    }

    @PostMapping("/send_todo")
    public void addApartment(@RequestBody JSObject param){
        logger.info((String) param.getMember("title"));
    }
}
