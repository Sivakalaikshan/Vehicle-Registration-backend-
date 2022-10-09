package lk.siva.crud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.siva.crud.Entity.VehicleRegistration;
import lk.siva.crud.Repository.VehicleRegistrationRepository;

@Service
public class VehicleRegistrationService {
	
	@Autowired
	private VehicleRegistrationRepository rep;

	public Iterable<VehicleRegistration> listAll(){
		return this.rep.findAll();
	}
	
	public void saveOrUpdate(VehicleRegistration vr) {
		rep.save(vr);
	}
	
	public VehicleRegistration getRegisterById(long id) {
		return rep.findById(id).get();
	}
	
	
	public void update(VehicleRegistration vr, long id) {
		rep.save(vr);
	}
	
	public void delete(long id) {
		rep.deleteById(id);
	}
}
