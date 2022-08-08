package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;

public class AccountTests {
	
	/*
	  	Boas práticas e padrões
	 
		Nomenclatura de um teste
		<AÇÃO> should <EFEITO> [when <CENÁRIO>]
		
		
		Padrão AAA
		Arrange: instancie os objetos necessários
		Act: execute as ações necessárias
		Assert: declare o que deveria acontecer (resultado esperado)

	 */
	
	

	@Test
	public void depositShouldIncreaseBalanceWhenPositiveAmount() {
		
		//Arrange
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = new Account(1L,0.0);
		
		//Act
		acc.deposit(amount);
		
		//Assert
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
}
