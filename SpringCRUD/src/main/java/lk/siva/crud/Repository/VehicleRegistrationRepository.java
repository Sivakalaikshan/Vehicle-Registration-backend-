package lk.siva.crud.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lk.siva.crud.Entity.VehicleRegistration;

@Repository
public interface VehicleRegistrationRepository extends CrudRepository<VehicleRegistration, Long>{

}
