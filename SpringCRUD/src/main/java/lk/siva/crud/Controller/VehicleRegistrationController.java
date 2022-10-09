package lk.siva.crud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.siva.crud.Entity.VehicleRegistration;
import lk.siva.crud.Service.VehicleRegistrationService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class VehicleRegistrationController {

	@Autowired
	private VehicleRegistrationService vrs;
	
	
	@GetMapping("/getAll")
	public Iterable<VehicleRegistration> getEmployee(){
		return vrs.listAll();
	}
	
	@PostMapping("/add")
	private long saveEmployee(@RequestBody VehicleRegistration vr) {
		vrs.saveOrUpdate(vr);
		return vr.getId();
	}
	
	@RequestMapping(value = "/update/{id}")
	private VehicleRegistration getRegister(@PathVariable(name="id") long id) {
		
		return vrs.getRegisterById(id);
	}
	
	@PutMapping(value = "/edit")
	private VehicleRegistration update(@RequestBody VehicleRegistration vr) {
		
		
		vrs.saveOrUpdate(vr);
		return vr;
	}
	
	@DeleteMapping("/delete/{id}")
	private void deleteEmployee(@PathVariable(name="id") long id) {
		
		vrs.delete(id);
		
	}
}
