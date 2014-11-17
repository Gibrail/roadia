/**
 * 
 */
package projet.tests;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import projet.sources.Carte;

/**
 * @author giberdou
 *
 */
public class CarteTest
{
	private Carte carte1;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		this.carte1 = new Carte();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
		this.carte1 = null;
	}

	@Test
	public void test()
	{
		fail("Not yet implemented");
	}

}
