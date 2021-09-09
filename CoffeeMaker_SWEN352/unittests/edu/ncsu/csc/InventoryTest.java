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

	@Test
	public void testChocolate() {
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
		// Set Chocolate Test cases
		//*****************************

	@Test
	public void addChocolate1() {
		
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
}
