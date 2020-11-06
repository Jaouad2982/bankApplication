package com.bank.app;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double>transactions;
	
	public Customer(String name, ArrayList<Double> transactions) {
		this.name = name;
		this.transactions = new ArrayList<Double>();
	}
	
	public String getName() {
		return name;
	}


	public ArrayList<Double> getTransactions() {
		return transactions;
	}


	public void add(double amount) {
	this.transactions.add(amount);
	}
	
}
