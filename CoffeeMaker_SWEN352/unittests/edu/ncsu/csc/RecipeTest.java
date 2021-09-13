package edu.ncsu.csc;

import coffeemaker.Recipe;
import coffeemaker.exceptions.*;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;


//Written by: Joseph Saltalmacchia
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
	
	//*************************
	// Name Test cases
	//*************************
	@Test
	public void testGetName() {
		assertEquals(recipe.getName(), "");
	}
	
	@Test
	public void testSetnameValid() {
		recipe.setName("AppleSauce");
		
		assertEquals(recipe.getName(), "AppleSauce");
	}
	
	@Test
	public void testSetnameValidBlank() {
		recipe.setName("");
		
		assertEquals(recipe.getName(), "");
	}
	
	@Test
	public void testSetnameValidNull() {
		recipe.setName(null);
		
		assertEquals(recipe.getName(), "");
	}
	
	//*************************
	// toString Test cases
	//*************************
	@Test
	public void testToString() {
		assertEquals(recipe.toString(), "");
	}
	
	@Test
	public void testToStringNotEmpty() {
		recipe.setName("AppleSauce");
		
		assertEquals(recipe.toString(), "AppleSauce");
	}
	
	//*************************
	// Price Test cases
	//*************************
	
	@Test
	public void testGetPrice() {
		assertEquals(recipe.getPrice(), 0);
	}
	
	@Test
	public void testSetPriceValid1(){
		try{
			recipe.setPrice("1");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(recipe.getPrice(), 1);
	}
	
	@Test
	public void testSetPriceValid0(){
		try{
			recipe.setPrice("0");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(recipe.getPrice(), 0);
	}
	
	@Test
	public void testSetPriceValidNominal(){
		try{
			recipe.setPrice("15");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(recipe.getPrice(), 15);
	}
	
	@Test
	public void testSetPriceInvalidABC(){
		try{
			recipe.setPrice("ABC");
		} catch(RecipeException e) {
			assertEquals(e.getMessage(), "Price must be a positive integer");
		}
	}
	
	@Test
	public void testSetPriceInvalidDecimal(){
		try{
			recipe.setPrice("1.1");
		} catch(RecipeException e) {
			assertEquals(e.getMessage(), "Price must be a positive integer");
		}
	}
	
	@Test
	public void testSetPriceInvalidNeg1(){
		try{
			recipe.setPrice("-1");
		} catch(RecipeException e) {
			assertEquals(e.getMessage(), "Price must be a positive integer");
		}
	}
	
	@Test
	public void testSetPriceInvalidNull(){
		try{
			recipe.setPrice(null);
		} catch(Exception e) {
			assertEquals(recipe.getPrice(), 0);
		}
	}
	
	//**************************
	// Amount Coffee test cases
	//**************************
	
	@Test
	public void testGetAmntCoffee() {
		assertEquals(recipe.getAmtCoffee(), 0);
	}
	
	@Test
	public void testSetAmntCoffeeValid1(){
		try{
			recipe.setAmtCoffee("1");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(recipe.getAmtCoffee(), 1);
	}
	
	@Test
	public void testSetAmntCoffeeValid0(){
		try{
			recipe.setAmtCoffee("0");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(recipe.getAmtCoffee(), 0);
	}
	
	@Test
	public void testSetAmntCoffeeValidNominal(){
		try{
			recipe.setAmtCoffee("15");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(recipe.getAmtCoffee(), 15);
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
	public void testSetAmntCoffeeInvalidDecimal(){
		try{
			recipe.setAmtCoffee("1.1");
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
	public void testSetAmntCoffeeInvalidNull(){
		try{
			recipe.setAmtCoffee(null);
		} catch(Exception e) {
			assertEquals(recipe.getAmtCoffee(), 0);
		}
	}
	
	//*************************
	//Amount Milk Test cases
	//*************************
	
	@Test
	public void testGetAmntMilk() {
		assertEquals(recipe.getAmtMilk(), 0);
	}
	
	@Test
	public void testSetAmntMilkValid1(){
		try{
			recipe.setAmtMilk("1");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(recipe.getAmtMilk(),1);
	}
	
	@Test
	public void testSetAmntMilkValid0(){
		try{
			recipe.setAmtMilk("0");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(recipe.getAmtMilk(), 0);
	}
	
	@Test
	public void testSetAmntMilkValidNominal(){
		try{
			recipe.setAmtMilk("15");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(recipe.getAmtMilk(), 15);
	}
	
	@Test
	public void testSetAmntMilkInvalidABC(){
		try{
			recipe.setAmtMilk("ABC");
		} catch(RecipeException e) {
			assertEquals(e.getMessage(), "Units of milk must be a positive integer");
		}
	}
	
	@Test
	public void testSetAmntMilkInvalidDecimal(){
		try{
			recipe.setAmtMilk("1.1");
		} catch(RecipeException e) {
			assertEquals(e.getMessage(), "Units of milk must be a positive integer");
		}
	}
	
	@Test
	public void testSetAmntMilkInvalidNeg1(){
		try{
			recipe.setAmtMilk("-1");
		} catch(RecipeException e) {
			assertEquals(e.getMessage(), "Units of milk must be a positive integer");
		}
	}
	
	@Test
	public void testSetAmntMilkInvalidNull(){
		try{
			recipe.setAmtMilk(null);
		} catch(Exception e) {
			assertEquals(recipe.getAmtMilk(), 0);
		}
	}
	
	//*************************
	//Amount Sugar Test cases
	//*************************
	
	@Test
	public void testGetAmntSugar() {
		assertEquals(recipe.getAmtSugar(), 0);
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
		
		assertEquals(recipe.getAmtSugar(), 0);
	}
	
	@Test
	public void testSetAmntSugarValidNominal(){
		try{
			recipe.setAmtSugar("15");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(recipe.getAmtSugar(), 15);
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
	public void testSetAmntSugarInvalidDecimal(){
		try{
			recipe.setAmtSugar("1.1");
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
	
	@Test
	public void testSetAmntSugarInvalidNull(){
		try{
			recipe.setAmtSugar(null);
		} catch(Exception e) {
			assertEquals(recipe.getAmtSugar(), 0);
		}
	}
	
	//*****************************
	// Amount Chocolate Test cases
	//*****************************
	
	@Test
	public void testGetAmntChocolate() {
		assertEquals(recipe.getAmtChocolate(), 0);
	}
	
	@Test
	public void testSetAmntChocolateValid1(){
		try{
			recipe.setAmtChocolate("1");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(recipe.getAmtChocolate(), 1);
	}
	
	@Test
	public void testSetAmntChocolateValid0(){
		try{
			recipe.setAmtChocolate("0");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(recipe.getAmtChocolate(), 0);
	}
	
	@Test
	public void testSetAmntChocolateValidNominal(){
		try{
			recipe.setAmtChocolate("15");
		} catch(RecipeException e) {
			fail("Should parse Int");
		}
		
		assertEquals(recipe.getAmtChocolate(), 15);
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
	public void testSetAmntChocolateInvalidDecimal(){
		try{
			recipe.setAmtChocolate("1.1");
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
	
	@Test
	public void testSetAmntChocolateInvalidNull(){
		try{
			recipe.setAmtChocolate(null);
		} catch(Exception e) {
			assertEquals(recipe.getAmtChocolate(), 0);
		}
	}
	
	//*****************************
	// equals Test cases
	//*****************************
	
	//note: this cannot get 100% coverage because the if on line 178 of the recipe class can never be true
	
	@Test
	public void testEqualsValidSelfCompare() {
		assertTrue(recipe.equals(recipe));		
	}
	
	@Test
	public void testEqualsValidNewRecipe() {
		Recipe recipeTwo = new Recipe();
		assertTrue(recipe.equals(recipeTwo));
	}
	
	@Test
	public void testEqualsValid() {
		Recipe recipeTwo = new Recipe();
		recipeTwo.setName("PB&J");
		recipe.setName("PB&J");
		assertTrue(recipe.equals(recipeTwo));
	}
	
	@Test
	public void testEqualsInvalidNull() {
		assertFalse(recipe.equals(null));
	}
	
	@Test
	public void testequalsInvalidWrongClass() {
		String word = "word";
		
		assertFalse(recipe.getName().equals(word));
	}
	
	@Test
	public void testEqualsInvalidName() {
		Recipe recipeTwo = new Recipe();
		recipeTwo.setName("PB&J");
		recipe.setName("Gumbo");
		assertFalse(recipe.equals(recipeTwo));
	}
	
	//*****************************
	// hashCode Test cases
	//*****************************
	
	@Test
	public void testHashCode() {
		assertEquals(recipe.hashCode(), 31);  //this is valid because the hashcode of an empty string is zero, and the result should be (31 * 1 + 0)
	}
	
	@Test
	public void testHashCodeSameName() {
		Recipe recipeTwo = new Recipe();
		recipeTwo.setName("PB&J");
		recipe.setName("PB&J");
		assertEquals(recipe.hashCode(), recipeTwo.hashCode()); //hashcode is determined by name
	}
	
	@Test
	public void testHashCodeDifferentName() {
		Recipe recipeTwo = new Recipe();
		recipeTwo.setName("PB&J");
		recipe.setName("Gumbo");
		assertTrue(recipe.hashCode() != recipeTwo.hashCode()); //hashcode is determined by name
	}
}
