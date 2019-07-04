package nh.bays.Controller;

import nh.bays.model.Charger;
import nh.bays.repository.ChargeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChargeController {

    @Autowired
    private ChargeRepository chargeRepository;

    @CrossOrigin("http://localhost:8080")
    @RequestMapping(value = "/allchargers", method = RequestMethod.GET)
    public List<Charger> list(){

        return chargeRepository.findAll();
    }

    @RequestMapping(value = "/chargerEntry", method = RequestMethod.POST)
    public Charger create( Charger charger){

        return chargeRepository.saveAndFlush(charger);
    }

    @RequestMapping(value = "notes/{id}", method = RequestMethod.GET)
    public Charger getCharger(@PathVariable long id){
        return chargeRepository.findOne(id);

    }

    @RequestMapping(value = "notes/{id}", method = RequestMethod.DELETE)
    public Charger delete(@PathVariable Long id){
        Charger existingCharger = chargeRepository.findOne(id);
        chargeRepository.delete(existingCharger);
        return existingCharger;
    }
}
