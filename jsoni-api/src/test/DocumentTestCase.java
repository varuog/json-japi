/**
 * 
 */
package test;

import static org.junit.Assert.*;
import jsonapi.Document;

import org.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author gourav sarkar
 *
 */
public class DocumentTestCase {

	public DocumentTestCase() {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link jsonapi.Document#toObject(org.json.JSONObject)}.
	 */
	@Test
	public void testToObject() {
		JSONObject jsonobj= new JSONObject();
		
		Document doc=new Document();
		doc.toObject(jsonobj);
	}

	/**
	 * Test method for {@link jsonapi.Document#toJson()}.
	 */
	@Test
	public void testToJson() {
		fail("Not yet implemented"); // TODO
	}

}
