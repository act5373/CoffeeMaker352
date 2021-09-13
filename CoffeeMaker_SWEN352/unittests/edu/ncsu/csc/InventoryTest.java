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
	
		//*****************************
		// Add Coffee Test cases
		//*****************************
	
	@Test
	public void addCoffeeString1() {
		
		try{
			inventory.addCoffee("1");
		}
		catch(InventoryException e) {
			assertEquals(e.getMessage(), "Units of coffee must be a positive integer");
		}
		
		assertEquals(16, inventory.getCoffee());
	}
	
	@Test
	public void addCoffeeStringOne() {
		
		try{
			inventory.addCoffee("one");
		}
		catch(InventoryException e) {
			assertEquals(e.getMessage(), "Units of coffee must be a positive integer");
		}
		
		assertEquals(15, inventory.getCoffee());
	}
	
	@Test
	public void addCoffeeNegative() {
		
		try{
			inventory.addCoffee("-1");
		}
		catch(InventoryException e) {
			assertEquals(e.getMessage(), "Units of coffee must be a positive integer");
		}
		
		assertEquals(15, inventory.getCoffee());
	}
	
	@Test
	public void addCoffeeDecimal() {
		
		try{
			inventory.addCoffee(".1");
		}
		catch(InventoryException e) {
			assertEquals(e.getMessage(), "Units of coffee must be a positive integer");
		}
		
		assertEquals(15, inventory.getCoffee());
	}

		//*****************************
		// Get Milk Test cases
		//*****************************
	
	@Test
	public void getMilk() {
		assertEquals(15, inventory.getMilk());
		
	}
	
		//*****************************
		// Set Chocolate Test cases
		//*****************************
	
	@Test
	public void setMilk1() {
		
		inventory.setMilk(15);
		
		assertEquals(15, inventory.getMilk());
	}
	
	@Test
	public void setMilk2() {
		
		inventory.setMilk(20);
		
		assertEquals(20, inventory.getMilk());
	}
	
	@Test
	public void setMilkinvaild() {
		
		inventory.setMilk(-1);
		
		assertEquals(15, inventory.getMilk());
	}
	
		//*****************************
		// Add Milk Test cases
		//*****************************
	
	@Test
	public void addMilkString1() {
		
		try{
			inventory.addMilk("1");
		}
		catch(InventoryException e) {
			assertEquals(e.getMessage(), "Units of milk must be a positive integer");
		}
		
		assertEquals(16, inventory.getMilk());
	}
	
	@Test
	public void addMilkStringOne() {
		
		try{
			inventory.addMilk("one");
		}
		catch(InventoryException e) {
			assertEquals(e.getMessage(), "Units of milk must be a positive integer");
		}
		
		assertEquals(15, inventory.getMilk());
	}
	
	@Test
	public void addMilkNegative() {
		
		try{
			inventory.addMilk("-1");
		}
		catch(InventoryException e) {
			assertEquals(e.getMessage(), "Units of milk must be a positive integer");
		}
		
		assertEquals(15, inventory.getMilk());
	}
	
	@Test
	public void addMilkDecimal() {
		
		try{
			inventory.addMilk(".1");
		}
		catch(InventoryException e) {
			assertEquals(e.getMessage(), "Units of milk must be a positive integer");
		}
		
		assertEquals(15, inventory.getMilk());
	}

		//*****************************
		// Get Sugar Test cases
		//*****************************
	
	@Test
	public void geSugar() {
		assertEquals(15, inventory.getSugar());
		
	}
	
		//*****************************
		// Set Chocolate Test cases
		//*****************************
	
	@Test
	public void setSugar1() {
		
		inventory.setSugar(15);
		
		assertEquals(15, inventory.getSugar());
	}
	
	@Test
	public void setSugar2() {
		
		inventory.setSugar(20);
		
		assertEquals(20, inventory.getSugar());
	}
	
	@Test
	public void setSugarinvaild() {
		
		inventory.setSugar(-1);
		
		assertEquals(15, inventory.getSugar());
	}
	
		//*****************************
		// Add Milk Test cases
		//*****************************
	
	@Test
	public void addSugarString1() {
		
		try{
			inventory.addSugar("1");
		}
		catch(InventoryException e) {
			fail("Units of sugar are a positive integer");
		}
		
		assertEquals(16, inventory.getSugar());
	}
	
	@Test
	public void addSugarStringOne() {
		
		try{
			inventory.addSugar("one");
		}
		catch(InventoryException e) {
			assertEquals(e.getMessage(), "Units of sugar must be a positive integer");
		}
		
		assertEquals(15, inventory.getSugar());
	}
	
	@Test
	public void addSugarNegative() {
		
		try{
			inventory.addSugar("-1");
		}
		catch(InventoryException e) {
			assertEquals(e.getMessage(), "Units of sugar must be a positive integer");
		}
		
		assertEquals(15, inventory.getSugar());
	}
	
	@Test
	public void addSugarDecimal() {
		
		try{
			inventory.addSugar(".1");
		}
		catch(InventoryException e) {
			assertEquals(e.getMessage(), "Units of sugar must be a positive integer");
		}
		
		assertEquals(15, inventory.getSugar());
	}
	
	@Test
	public void testEnoughIngredientsChoc1()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtChocolate("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setChocolate(0);
		assertFalse(inventory.enoughIngredients(r));
	}
	
	@Test
	public void testEnoughIngredientsChoc2()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtChocolate("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setChocolate(1);
		assertTrue(inventory.enoughIngredients(r));
	}
	
	@Test
	public void testEnoughIngredientsChoc3()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtChocolate("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setChocolate(2);
		assertTrue(inventory.enoughIngredients(r));
	}
	
	@Test
	public void testEnoughIngredientsSugar1()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtSugar("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setSugar(0);
		assertFalse(inventory.enoughIngredients(r));
	}
	
	@Test
	public void testEnoughIngredientsSugar2()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtSugar("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setSugar(1);
		assertTrue(inventory.enoughIngredients(r));
	}
	
	@Test
	public void testEnoughIngredientsSugar3()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtSugar("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setSugar(2);
		assertTrue(inventory.enoughIngredients(r));
	}
	
	@Test
	public void testEnoughIngredientsMilk1()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtMilk("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setMilk(0);
		assertFalse(inventory.enoughIngredients(r));
	}
	
	@Test
	public void testEnoughIngredientsMilk2()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtMilk("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setMilk(1);
		assertTrue(inventory.enoughIngredients(r));
	}
	
	@Test
	public void testEnoughIngredientsMilk3()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtMilk("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setMilk(2);
		assertTrue(inventory.enoughIngredients(r));
	}
	
	@Test
	public void testEnoughIngredientsCoffee1()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtCoffee("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setCoffee(0);
		assertFalse(inventory.enoughIngredients(r));
	}
	
	@Test
	public void testEnoughIngredientsCoffee2()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtChocolate("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setCoffee(1);
		assertTrue(inventory.enoughIngredients(r));
	}
	
	@Test
	public void testEnoughIngredientsCoffee3()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtCoffee("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setCoffee(2);
		assertTrue(inventory.enoughIngredients(r));
	}
	
	
	@Test
	public void testuseIngredientsChoc1()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtChocolate("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setChocolate(0);
		assertFalse(inventory.useIngredients(r));
	}
	
		//*****************************
		// To String Test case
		//*****************************
	
	@Test
	public void CheckToString() {
		
		int num = 15;
		StringBuffer buf = new StringBuffer();
    	buf.append("Coffee: ");
    	buf.append(num);
    	buf.append("\n");
    	buf.append("Milk: ");
    	buf.append(num);
    	buf.append("\n");
    	buf.append("Sugar: ");
    	buf.append(num);
    	buf.append("\n");
    	buf.append("Chocolate: ");
    	buf.append(num);
    	buf.append("\n");
		
		assertEquals(buf.toString(), inventory.toString());
	}
	
	@Test
	public void testuseIngredientsChoc2()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtChocolate("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setChocolate(1);
		assertTrue(inventory.useIngredients(r));
	}
	
	@Test
	public void testuseIngredientsChoc3()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtChocolate("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setChocolate(2);
		assertTrue(inventory.useIngredients(r));
	}
	
	@Test
	public void testuseIngredientsSugar1()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtSugar("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setSugar(0);
		assertFalse(inventory.useIngredients(r));
	}
	
	@Test
	public void testuseIngredientsSugar2()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtSugar("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setSugar(1);
		assertTrue(inventory.useIngredients(r));
	}
	
	@Test
	public void testuseIngredientsSugar3()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtSugar("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setSugar(2);
		assertTrue(inventory.useIngredients(r));
	}
	
	@Test
	public void testuseIngredientsMilk1()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtMilk("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setMilk(0);
		assertFalse(inventory.useIngredients(r));
	}
	
	@Test
	public void testuseIngredientsMilk2()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtMilk("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setMilk(1);
		assertTrue(inventory.useIngredients(r));
	}
	
	@Test
	public void testuseIngredientsMilk3()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtMilk("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setMilk(2);
		assertTrue(inventory.useIngredients(r));
	}
	
	@Test
	public void testuseIngredientsCoffee1()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtCoffee("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setCoffee(0);
		assertFalse(inventory.useIngredients(r));
	}
	
	@Test
	public void testuseIngredientsCoffee2()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtChocolate("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setCoffee(1);
		assertTrue(inventory.useIngredients(r));
	}
	
	@Test
	public void testuseIngredientsCoffee3()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtCoffee("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setCoffee(2);
		assertTrue(inventory.useIngredients(r));
	}
	
	@Test
	public void testIfCoffeeGoesDown()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtCoffee("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setCoffee(2);
		
		inventory.useIngredients(r);
	
		assertEquals(1, inventory.getCoffee());
	}
	
	@Test
	public void testIfSugarGoesDown()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtSugar("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setSugar(2);
		
		inventory.useIngredients(r);
		
		assertEquals(1, inventory.getSugar());
	}
	
	@Test
	public void testIfMilkGoesDown()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtMilk("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setMilk(2);
		
		inventory.useIngredients(r);
		
		assertEquals(1, inventory.getMilk());
	}
	
	@Test
	public void testIfChocGoesDown()
	{
		Recipe r = new Recipe();
		try {
			r.setAmtChocolate("1");
		} 
		catch (RecipeException e)
		{
			e.printStackTrace();
		}
		
		inventory.setChocolate(2);
		
		inventory.useIngredients(r);
		
		assertEquals(1, inventory.getChocolate());
	}
}
