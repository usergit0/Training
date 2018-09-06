package com.back.home.testeur.interfac;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.back.home.testeur.base.Operateur;

public class Animal {
	private static final Logger logger = (Logger) LogManager.getLogger(Animal.class);

	
	protected static int nbPattes;
	
	
	public String Animal(){
		return "nbPattes";
	}

	public int getNbPattes() {
		return nbPattes;
	}

	public void setNbPattes(int nbPattes) {
		this.nbPattes = nbPattes;
	}
}


