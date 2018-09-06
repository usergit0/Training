package com.back.home.testeur.interfac;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Chat extends Animal{
	private static final Logger logger = (Logger) LogManager.getLogger(Chat.class);
 
 public static void afficherNbPattesDeAnimal() {
	 System.out.println("chat");
	 logger.info("Initializing ..{}", nbPattes);
 }
}
