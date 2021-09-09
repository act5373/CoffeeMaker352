package edu.ncsu.csc;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coffeemaker.Recipe;
import coffeemaker.RecipeBook;
import junit.framework.TestCase;

/**
 * Tests for the recipe book test.  Found 1 bug in {@link RecipeBook#editRecipe(int, Recipe)}.  More details commented in the function
 * @author Anthony Tornetta
 */
class RecipeBookTest extends TestCase
{	
	private RecipeBook bk;
	
	private Recipe[] recipes;
	
	@BeforeEach
	public void setUp() throws Exception
	{
		super.setUp();
		
		bk = new RecipeBook();
		
		recipes = new Recipe[5];
		
		for(int i = 0; i < recipes.length; i++)
		{
			recipes[i] = new Recipe();
			recipes[i].setName("r" + i);
		}
	}

	@AfterEach
	public void tearDown() throws Exception 
	{
		super.tearDown();
		
		bk = null;
		recipes = null;
	}
	
	@Test
	public void testRecipesSize()
	{
		assertEquals(4, bk.getRecipes().length);
	}
	
	@Test
	public void testAddingRecipe()
	{
		assertTrue(bk.addRecipe(recipes[0]));
	}
	
	@Test
	public void testAddingRecipeTwice()
	{
		assertTrue(bk.addRecipe(recipes[0]));
		assertFalse(bk.addRecipe(recipes[0]));
	}
	
	@Test
	public void testRecipeInRecipes()
	{
		bk.addRecipe(recipes[0]);
		assertEquals(recipes[0], bk.getRecipes()[0]);
	}
	
	@Test
	public void testAddingTwoRecipes()
	{
		bk.addRecipe(recipes[0]);
		assertTrue(bk.addRecipe(recipes[1]));
	}
	
	@Test
	public void testAddingTwoThenDeletingLast()
	{
		bk.addRecipe(recipes[0]);
		bk.addRecipe(recipes[1]);
		
		assertEquals(recipes[1].getName(), bk.deleteRecipe(1));
	}
	
	@Test
	public void testAddingNull()
	{
		assertThrows(NullPointerException.class, () ->
		{
			bk.addRecipe(null);
		});
	}
	
	@Test
	public void testDeleteingBelowBounds()
	{
		assertThrows(ArrayIndexOutOfBoundsException.class, () ->
		{
			bk.deleteRecipe(-1);
		});
	}
	
	@Test
	public void testDeletingAboveBounds()
	{
		assertThrows(ArrayIndexOutOfBoundsException.class, () ->
		{
			bk.deleteRecipe(4);
		});
	}
	
	@Test
	public void testDeletingNullLower()
	{
		assertEquals(null, bk.deleteRecipe(0));
	}
	
	@Test
	public void testDeletingNullUpper()
	{
		assertEquals(null, bk.deleteRecipe(3));
	}
	
	@Test
	public void testAddingFour()
	{
		bk.addRecipe(recipes[0]);
		bk.addRecipe(recipes[1]);
		bk.addRecipe(recipes[2]);
		assertTrue(bk.addRecipe(recipes[3]));
	}
	
	
	@Test
	public void testAddingFive()
	{
		bk.addRecipe(recipes[0]);
		bk.addRecipe(recipes[1]);
		bk.addRecipe(recipes[2]);
		bk.addRecipe(recipes[3]);
		
		assertFalse(bk.addRecipe(recipes[4]));
	}
	
	@Test
	public void testDelete()
	{
		bk.addRecipe(recipes[0]);
		assertEquals(recipes[0].getName(), bk.deleteRecipe(0));		
	}
	
	@Test
	public void testDeleteNonexisting()
	{
		assertEquals(null, bk.deleteRecipe(0));
	}
	
	@Test
	public void testEditRecipeAtNull()
	{
		assertEquals(null, bk.editRecipe(0, new Recipe()));
	}
	
	@Test
	public void testEditRecipeWithNull()
	{		
		bk.addRecipe(recipes[0]);
		
		assertEquals(recipes[0].getName(), bk.editRecipe(0, null));
	}
	
	@Test
	public void testEditRecipeBelow()
	{
		assertThrows(ArrayIndexOutOfBoundsException.class, () ->
		{
			bk.editRecipe(-1, null);
		});
	}
	
	@Test
	public void testEditRecipeAbove()
	{
		assertThrows(ArrayIndexOutOfBoundsException.class, () ->
		{
			bk.editRecipe(4, null);
		});
	}
}
