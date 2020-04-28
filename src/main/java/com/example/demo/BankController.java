package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Address;
import com.example.model.Bank;

@RestController
public class BankController {

	
	@RequestMapping("/name")
	public String displayName() {
		Address addr = new Address("1500 ", "Wesk Creek ", " 23233 ", "Richmond ", "VA");
		Bank bank = new Bank("CapitalOne Bank", addr);
		return bank.getName();
	}

	@RequestMapping("/address")
	public Address displayAddress() {
		Address addr = new Address("1500 ", "Wesk Creek ", " 23233 ", "Richmond ", "VA");
		Bank bank = new Bank("CapitalOne Bank", addr);
		return bank.getAddr();
	}
}
