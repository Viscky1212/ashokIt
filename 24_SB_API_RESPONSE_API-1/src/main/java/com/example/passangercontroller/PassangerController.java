package com.example.passangercontroller;
import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Address;
import com.example.pojo.Passanger;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/user")
public class PassangerController {
	
	@PostMapping("v1")
	public Passanger createData(@RequestBody Passanger passanger){
		Address addr = new Address();
		addr.setCity("Bengalur");
		addr.setState("Karnataka");
		addr.setCountry("India");

		Passanger p = new Passanger();
		p.setName("Raju");
		p.setFrom("ABY");
		p.setTo("xyz");
		p.setGender("M");
		p.setAddr(addr);

		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("passanger.json"), p);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // ✅ Serializes to JSON file
		System.out.println("Done...............");
		return p;
		
	}

}
