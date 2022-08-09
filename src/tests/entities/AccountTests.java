package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import tests.factory.AccountFactory;

public class AccountTests {
	
	/*
	  	Boas pr�ticas e padr�es
	 
		Nomenclatura de um teste
		<A��O> should <EFEITO> [when <CEN�RIO>]
		
		
		Padr�o AAA
		Arrange: instancie os objetos necess�rios
		Act: execute as a��es necess�rias
		Assert: declare o que deveria acontecer (resultado esperado)

	 */
	
	

	@Test
	public void depositShouldIncreaseBalanceAndDiscountFeeWhenPositiveAmount() {
		
		//Arrange
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = AccountFactory.createEmptyAccount();
		
		//Act
		acc.deposit(amount);
		
		//Assert
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	@Test
	public void depositShouldDoNothingWhenNegativeAmount() {
		
		double expectedValue = 100.0;
		Account acc = AccountFactory.createAccount(expectedValue);
		double amount = -200.0;
		
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	@Test
	public void fullWithdrawShouldClearBalanceAndReturnFullBalance() {
		
		double expectedValue = 0;
		double initialBalance = 800.0;
		Account acc = AccountFactory.createAccount(initialBalance);
		
		double result = acc.fullWithdraw();
		
		Assertions.assertTrue(expectedValue == acc.getBalance());
		Assertions.assertTrue(result == initialBalance);
		
	}
	
}
