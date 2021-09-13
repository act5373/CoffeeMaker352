package edu.ncsu.csc;

import coffeemaker.Inventory;
import coffeemaker.Recipe;
import coffeemaker.exceptions.*;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;


class InventoryTest extends TestCase{	
	
	private Inventory inventory;
	
	@BeforeEach
	public void setUp() throws Exception
	{
		inventory = new Inventory();
		super.setUp();
	}

	@After
	public void tearDown() throws Exception 
	{
		inventory = null;
		super.tearDown();
	}
	
		//*****************************
		// Get Chocolate Test cases
		//*****************************

	@Test
	public void getChocolate() {
		assertEquals(15, inventory.getChocolate());
		
	}
	
		//*****************************
		// Set Chocolate Test cases
		//*****************************
	
	@Test
	public void setChocolate1() {
		
		inventory.setChocolate(15);
		
		assertEquals(15, inventory.getChocolate());
	}
	
	@Test
	public void setChocolate2() {
		
		inventory.setChocolate(20);
		
		assertEquals(20, inventory.getChocolate());
	}
	
	@Test
	public void setChocolateinvaild() {
		
		inventory.setChocolate(-1);
		
		assertEquals(15, inventory.getChocolate());
	}
	
		//*****************************
		// Add Chocolate Test cases
		//*****************************

	@Test
	public void addChocolateString1() {
		
		try{
			inventory.addChocolate("1");
		}
		catch(InventoryException e) {
			assertEquals(e.getMessage(), "Units of chocolate must be a positive integer");
		}
		
		assertEquals(16, inventory.getChocolate());
	}
	
	@Test
	public void testIsEnoughAtZero()
	{
		inventory.enoughIngredients(null);
	}

	@Test
	public void addChocolateStringOne() {
		
		try{
			inventory.addChocolate("one");
		}
		catch(InventoryException e) {
			assertEquals(e.getMessage(), "Units of chocolate must be a positive integer");
		}
		
		assertEquals(15, inventory.getChocolate());
	}
	
	@Test
	public void addChocolateNegative() {
		
		try{
			inventory.addChocolate("-1");
		}
		catch(InventoryException e) {
			assertEquals(e.getMessage(), "Units of chocolate must be a positive integer");
		}
		
		assertEquals(15, inventory.getChocolate());
	}
	
	@Test
	public void addChocolateDecimal() {
		
		try{
			inventory.addChocolate(".1");
		}
		catch(InventoryException e) {
			assertEquals(e.getMessage(), "Units of chocolate must be a positive integer");
		}
		
		assertEquals(15, inventory.getChocolate());
	}

		//*****************************
		// Get Coffee Test cases
		//*****************************
		
	@Test
	public void getCoffee() {
		assertEquals(15, inventory.getCoffee());
		
	}
	
		//*****************************
		// Set Coffee Test cases
		//*****************************
	
	@Test
	public void setCoffee1() {
		
		inventory.setCoffee(15);
		
		assertEquals(15, inventory.getCoffee());
	}
	
	@Test
	public void setCoffee2() {
		
		inventory.setCoffee(20);
		
		assertEquals(20, inventory.getCoffee());
	}
	
	@Test
	public void setCoffeeinvaild() {
		
		inventory.setCoffee(-1);
		
		assertEquals(15, inventory.getCoffee());
	}
	
}
