package nh.bays.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Charger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String Unit;
    String description;
    String name;


    public void setUnit(String Unit){
        this.Unit=Unit;
    }
    public String getUnit(String Unit){
        return this.Unit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
