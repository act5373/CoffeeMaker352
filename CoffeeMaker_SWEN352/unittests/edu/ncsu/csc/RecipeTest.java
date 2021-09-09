package edu.ncsu.csc;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coffeemaker.Recipe;
import coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;

class RecipeTest extends TestCase
{	
	Recipe rec;
	
	@BeforeEach
	public void setUp() throws Exception
	{
		super.setUp();
		
		rec = new Recipe();
	}

	@After
	public void tearDown() throws Exception 
	{
		super.tearDown();		
	}
	
	@Test
	public void setAmtChocolateTest()
	{
		assertThrows(RecipeException.class, () ->
		{
			rec.setAmtChocolate("-1");
		});
		
		assertThrows(RecipeException.class, () ->
		{
			rec.setAmtChocolate("a");
		});
		
		assertThrows(RecipeException.class, () ->
		{
			rec.setAmtChocolate("-1");
		});
		
		assertThrows(RecipeException.class, () ->
		{
			rec.setAmtChocolate("100000000000000000");
		});
		
		try
		{
			assertEquals(0, rec.getAmtChocolate());			
			rec.setAmtChocolate("0");
			assertEquals(0, rec.getAmtChocolate());
			
			rec.setAmtChocolate("1");
			assertEquals(1, rec.getAmtChocolate());
			
			rec.setAmtChocolate("10000000");
			assertEquals(10000000, rec.getAmtChocolate());
		}
		catch(RecipeException ex)
		{
			throw new RuntimeException(ex);
		}
	}
}
