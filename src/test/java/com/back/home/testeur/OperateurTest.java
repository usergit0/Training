package com.back.home.testeur;

import org.junit.Test;

import com.back.home.testeur.base.Operateur;

import junit.framework.TestCase;

public class OperateurTest extends TestCase {

	@Test
	public void testEtape1() {
	System.out.println(Operateur.testCondition());
	assertEquals(Operateur.testCondition(), "Faux");
	}}
