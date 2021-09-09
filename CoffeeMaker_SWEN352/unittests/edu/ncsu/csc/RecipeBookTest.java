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
	
	private Recipe[] r;
	
	@BeforeEach
	public void setUp() throws Exception
	{
		super.setUp();
		
		bk = new RecipeBook();
		
		r = new Recipe[5];
		
		for(int i = 0; i < r.length; i++)
		{
			r[i] = new Recipe();
			r[i].setName("r" + i);
		}
	}

	@AfterEach
	public void tearDown() throws Exception 
	{
		super.tearDown();
		
		bk = null;
		r = null;
	}
	
	private void assertNoChanges()
	{
		for(int i = 0; i < r.length; i++)
		{
			assertEquals("r" + i, r[i].getName());
		}
	}
	
	@Test
	public void testRecipesSize()
	{
		assertEquals(4, bk.getRecipes().length);
	}
	
	@Test
	public void testAddingRecipe()
	{
		assertTrue(bk.addRecipe(r[0]));
		
		assertNoChanges();
	}
	
	@Test
	public void testAddingRecipeTwice()
	{
		assertTrue(bk.addRecipe(r[0]));
		assertFalse(bk.addRecipe(r[0]));
		
		assertNoChanges();
	}
	
	@Test
	public void testRecipeInRecipes()
	{
		bk.addRecipe(r[0]);
		assertEquals(r[0], bk.getRecipes()[0]);
		
		assertNoChanges();
	}
	
	@Test
	public void testAddingTwoRecipes()
	{
		bk.addRecipe(r[0]);
		assertTrue(bk.addRecipe(r[1]));
		
		assertNoChanges();
	}
	
	@Test
	public void testAddingTwoThenDeletingLast()
	{
		bk.addRecipe(r[0]);
		bk.addRecipe(r[1]);
		
		assertEquals(r[1].getName(), bk.deleteRecipe(1));
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
		bk.addRecipe(r[0]);
		bk.addRecipe(r[1]);
		bk.addRecipe(r[2]);
		assertTrue(bk.addRecipe(r[3]));
	}
	
	
	@Test
	public void testAddingFive()
	{
		bk.addRecipe(r[0]);
		bk.addRecipe(r[1]);
		bk.addRecipe(r[2]);
		bk.addRecipe(r[3]);
		
		assertFalse(bk.addRecipe(r[4]));
	}
	
	@Test
	public void testDelete()
	{
		bk.addRecipe(r[0]);
		assertEquals(r[0].getName(), bk.deleteRecipe(0));		
		
		assertNoChanges();
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
		bk.addRecipe(r[0]);
		
		assertEquals(r[0].getName(), bk.editRecipe(0, null));
		
		assertNoChanges();
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
