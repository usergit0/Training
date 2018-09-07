package com.back.home.testeur.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.back.home.testeur.base.Operateur;
import com.back.home.testeur.interfac.Chat;

public class App {

	private static final Logger logger = (Logger) LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		logger.info("Initializing ..");
		//Operateur.testCondition();
		logger.info(Operateur.testCondition());
		
		//Operateur operateur = new Operateur();
		//operateur.testCondition();
		
		Chat.afficherNbPattesDeAnimal();
		
		//todo verif git
	}

}
