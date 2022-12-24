package com.example.Fullstack.repository;

import com.example.Fullstack.blueprint.Bank;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankInterface extends JpaRepository<Bank,Integer>{

	}

