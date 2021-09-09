package edu.ncsu.csc;

import coffeemaker.Recipe;
import coffeemaker.exceptions.*;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;


//Written by Joseph Saltalmacchia
//Test class for Recipe class in coffeemaker
//note: we use "BerforeEach" and "AfterEach" instead of "Before" and "After" for the setup and teardown functions because we are using Junit 5
class RecipeTest extends TestCase
{	
	private Recipe recipe;
	
	@BeforeEach
	public void setUp() throws Exception
	{
		this.recipe = new Recipe();
		super.setUp();
	}

	@AfterEach
	public void tearDown() throws Exception 
	{
		recipe = null;
		super.tearDown();
	}
	
	@Test
	public void testGetName() {
		assertEquals("", recipe.getName()); // arguments: error message, arg1, arg2
	}
	
	@Test
	public void testGetPrice() {
		assertEquals(0, recipe.getPrice());
	}
	
	//**************************
	// Amount Coffee test cases
	//**************************
	
	@Test
	public void testGetAmntCoffee() {
		assertEquals(0, recipe.getAmtCoffee());
	}
	
	@Test
	public void testSetAmntCoffeeValid1(){
		try{
			recipe.setAmtCoffee("1");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(1, recipe.getAmtCoffee());
	}
	
	@Test
	public void testSetAmntCoffeeValid0(){
		try{
			recipe.setAmtCoffee("0");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(0, recipe.getAmtCoffee());
	}
	
	@Test
	public void testSetAmntCoffeeValidNominal(){
		try{
			recipe.setAmtCoffee("15");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(15, recipe.getAmtCoffee());
	}
	
	@Test
	public void testSetAmntCoffeeInvalidABC(){
		try{
			recipe.setAmtCoffee("ABC");
		} catch(RecipeException e) {
			assertEquals(e.getMessage(), "Units of coffee must be a positive integer");
		}
	}
	
	@Test
	public void testSetAmntCoffeeInvalidNeg1(){
		try{
			recipe.setAmtCoffee("-1");
		} catch(RecipeException e) {
			assertEquals(e.getMessage(), "Units of coffee must be a positive integer");
		}
	}
	
	@Test
	public void testGetAmntMilk() {
		assertEquals(0, recipe.getAmtMilk());
	}
	
	//*************************
	//Amount sugar Test cases
	//*************************
	
	@Test
	public void testGetAmntSugar() {
		assertEquals(0, recipe.getAmtSugar());
	}
	
	@Test
	public void testSetAmntSugarValid1(){
		try{
			recipe.setAmtSugar("1");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(1, recipe.getAmtSugar());
	}
	
	@Test
	public void testSetAmntSugarValid0(){
		try{
			recipe.setAmtSugar("0");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(0, recipe.getAmtSugar());
	}
	
	@Test
	public void testSetAmntSugarValidNominal(){
		try{
			recipe.setAmtSugar("15");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(15, recipe.getAmtSugar());
	}
	
	@Test
	public void testSetAmntSugarInvalidABC(){
		try{
			recipe.setAmtSugar("ABC");
		} catch(RecipeException e) {
			assertEquals(e.getMessage(), "Units of sugar must be a positive integer");
		}
	}
	
	@Test
	public void testSetAmntSugarInvalidNeg1(){
		try{
			recipe.setAmtSugar("-1");
		} catch(RecipeException e) {
			assertEquals(e.getMessage(), "Units of sugar must be a positive integer");
		}
	}
	
	
	//*****************************
	// Amount Chocolate Test cases
	//*****************************
	
	@Test
	public void testGetAmntChocolate() {
		assertEquals( 0, recipe.getAmtChocolate());
	}
	
	@Test
	public void testSetAmntChocolateValid1(){
		try{
			recipe.setAmtChocolate("1");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(1, recipe.getAmtChocolate());
	}
	
	@Test
	public void testSetAmntChocolateValid0(){
		try{
			recipe.setAmtChocolate("0");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(0, recipe.getAmtChocolate());
	}
	
	@Test
	public void testSetAmntChocolateValidNominal(){
		try{
			recipe.setAmtChocolate("15");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(15, recipe.getAmtChocolate());
	}
	
	@Test
	public void testSetAmntChocolateInvalidABC(){
		try{
			recipe.setAmtChocolate("ABC");
		} catch(RecipeException e) {
			assertEquals(e.getMessage(), "Units of chocolate must be a positive integer");
		}
	}
	
	@Test
	public void testSetAmntChocolateInvalidNeg1(){
		try{
			recipe.setAmtChocolate("-1");
		} catch(RecipeException e) {
			assertEquals(e.getMessage(), "Units of chocolate must be a positive integer");
		}
	}
}
