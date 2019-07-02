package nh.bays.repository;

import nh.bays.model.Charger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChargeRepository extends JpaRepository<Charger, Long>{
}
