package com.back.home.testeur.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Operateur {
	private static final Logger logger = (Logger) LogManager.getLogger(Operateur.class);

	public static String testCondition() {
		logger.info("Initializing ..");
		
		int inf =2;
		int sup = 10;
		
		String elavuation = (inf>sup)?"Vrai":"Faux";
		
		
		return elavuation;
		
	}

	public Operateur() {
		super();
		logger.info("Constructeur par default ..");	}
	
}
