package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Address;
import com.example.model.Bank;

@RestController
public class BankController {

	/**
	 * First end point to display name
	 * @return
	 */
	@RequestMapping("/name")
	public String displayName() {
		Address addr = new Address("1500 ", "Wesk Creek ", " 23233 ", "Richmond ", "VA");
		Bank bank = new Bank("CapitalOne Bank", addr);
		return bank.getName();
	}

	/**
	 * End point to display Address
	 * @return
	 */
	@RequestMapping("/address")
	public Address displayAddress() {
		Address addr = new Address("1500 ", "Wesk Creek ", " 23233 ", "Richmond ", "VA");
		Bank bank = new Bank("CapitalOne Bank", addr);
		return bank.getAddr();
	}
	
	/**
	 * Retrive a parameter in Request path
	 * @param bankName
	 * @return
	 */
	@RequestMapping("bank/{bankName}")
	public String welcomeMessage(@PathVariable("bankName") String bankName) {
		return  "Welcome "+ bankName;
	}
	
	/**
	 * Retrieve a parameter as request param
	 * @param bank
	 * @return
	 */
	@RequestMapping("/bank")
	public String addBank(@RequestParam("name") String bank) {
		return "Welcome bank " + bank;
	}
	
	@RequestMapping("/addBankName")
	public String addBankName(@RequestBody Bank bank) {
		return "Bank name "+bank.getName() +" added.";
	}
}
