package edu.ncsu.csc;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import coffeemaker.CoffeeMaker;
import coffeemaker.exceptions.InventoryException;
import junit.framework.TestCase;
//Hi mom
public class CoffeeMakerTest extends TestCase
{	
	@Before
	public void setUp() throws Exception
	{
		super.setUp();
	}

	@After
	public void tearDown() throws Exception 
	{
		super.tearDown();
	}

	@Test
	public void test()
	{
		CoffeeMaker cm = new CoffeeMaker();
		
		assertThrows(InventoryException.class, () ->
		{
			cm.addInventory("one", "0", "0", "0");
		});
		
		assertThrows(InventoryException.class, () ->
		{
			cm.addInventory("-10", "0", "0", "0");
		});
		
		assertThrows(InventoryException.class, () ->
		{
			cm.addInventory("10000000000000000", "0", "0", "0");
		});
		
		
	}
}
