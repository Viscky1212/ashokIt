  package com.example.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Passanger;
import com.example.pojo.Ticket;


@RestController
@RequestMapping
public class ErailController {
	
	private Map<Integer,Ticket> tickets = new HashMap<>();
	
	@PostMapping(
			value ="/ticket",
			consumes =  {"application/xml","application/json"},
			produces = {"application/xml","application/json"}
			
			)
	private Ticket bookTicket(@RequestBody Passanger passanger) {
		
		//logic to book ticket
		
		Ticket t = new Ticket();
		
		Random r = new Random();
		int ticketId = r.nextInt();
		
		t.setTicketId(ticketId);
		t.setFrom(passanger.getFrom());
		t.setTo(passanger.getTo());
		t.setTicketStatus("CONFIRMED");
		t.setTrainNum(passanger.getTrainNum());
		t.setTktCost("1500.00  INR");
		
		tickets.put(ticketId, t);
		return t;
		
	}
	
	@GetMapping(value = "/ticket/{ticketId}",
			produces = {"application/xml","application/json"}
			)
	public Ticket getTicket(@PathVariable Integer ticketId) {
		System.out.println(tickets);
		if(tickets.containsKey(ticketId)) {
			return tickets.get(ticketId);
		}
		return null;
	}
	
	
	
	
	
	
	

}
