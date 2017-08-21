import static org.junit.Assert.*;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestCase;
import java.util.*;

public class AddressCheckTest extends TestCase{

	public AddressChecker adcheck;
	
	@Test
	public void setUp() {
		adcheck = new AddressChecker();
	}
	
	@Test
	public void testDomainD1True() {
		assertTrue(adcheck.isDomainD1Valiable("example.com"));
	}
	
	@Test
	public void testDomainD1False() {
		assertFalse(adcheck.isDomainD1Valiable("exam¥ple.com"));
	}
	
	@Test
	public void testDomainD2True() {
		assertTrue(adcheck.isDomainD2Valiable("example.com"));
	}
	
	@Test
	public void testDomainD2False() {
		assertFalse(adcheck.isDomainD2Valiable(".example.com"));
	}
	
	@Test
	public void testDomainD3True() {
		assertTrue(adcheck.isDomainD3Valiable("example.com"));
	}
	
	@Test
	public void testDomainD3False() {
		assertFalse(adcheck.isDomainD3Valiable("example.com."));
	}
	
	@Test
	public void testDomainD4True() {
		assertTrue(adcheck.isDomainD4Valiable("example.com"));
	}
	
	@Test
	public void testDomainD4False() {
		assertFalse(adcheck.isDomainD4Valiable("example..com"));
	}
	
	@Test
	public void testDomainD5True() {
		assertTrue(adcheck.isDomainD5Valiable("hh"));
	}
	
	@Test
	public void testDomainD5False() {
		boolean out = adcheck.isDomainD5Valiable("");
		assertFalse(out);
	}
	
	@Test
	public void testDomainA1True() {
		assertTrue(adcheck.isDomainA1Valiable("hogehoge@email.com"));
		assertTrue(adcheck.isDomainA1Valiable("hoge\"@\"hoge@email.com"));
	}

	@Test
	public void testDomainA1False() {
		assertFalse(adcheck.isDomainA1Valiable("hogehoge@fooo@email.com"));
		assertFalse(adcheck.isDomainA1Valiable("hoge\"@\"hoge@fooooo@email.com"));
	}
	
	
	@Test
	public void testGetLocal(){
		String testcase1 = "aaaa@bbb.com";
		String soteiLocal1 = "aaaa";
		assertEquals(soteiLocal1, adcheck.getLocal(testcase1));
	}
	
	@Test
	public void testGetDomain(){
		String testcase1 = "aaaa@bbb.com";
		String soteiLocal1 = "bbb.com";
		assertEquals(soteiLocal1, adcheck.getDomain(testcase1));
	}
	
	@Test
	public void testDotatomLD1True(){
		assertTrue(adcheck.isDotatomLD1Valiable("example"));
	}
	@Test
	public void testDotatomLD1False(){
		assertFalse(adcheck.isDotatomLD1Valiable("exam¥ple"));
	}
	
	@Test
	public void testDotatomLD2True(){
		assertTrue(adcheck.isDotatomLD2Valiable("example"));
	}
	
	@Test
	public void testDotatomLD2False(){
		assertFalse(adcheck.isDotatomLD2Valiable(".example"));
	}
	
	@Test
	public void testDotatomLD3True(){
		assertTrue(adcheck.isDotatomLD3Valiable("example"));
	}
	
	@Test
	public void testDotatomLD3False(){
		assertFalse(adcheck.isDotatomLD3Valiable("example."));
	}
	
	@Test
	public void testDotatomLD4True(){
		assertTrue(adcheck.isDotatomLD4Valiable("example"));
	}
	
	@Test
	public void testDotatomLD4False(){
		assertFalse(adcheck.isDotatomLD4Valiable("exam..ple"));
	}
	
	@Test
	public void testDotatomLD5True(){
		assertTrue(adcheck.isDotatomLD5Valiable("example"));
	}
	
	@Test
	public void testDotatomLD5False(){
		assertFalse(adcheck.isDotatomLD5Valiable(""));
	}
	
	@Test
	public void testQuotedStrLQ1True(){
		assertTrue(adcheck.isQuotedStrLQ1Valiable("\"example"));
	}
	
	@Test
	public void testQuotedStrLQ1False(){
		assertFalse(adcheck.isQuotedStrLQ1Valiable("example"));
	}
	
	@Test
	public void testQuotedStrLQ2True(){
		assertTrue(adcheck.isQuotedStrLQ2Valiable("example\""));
	}
	
	@Test
	public void testQuotedStrLQ2False(){
		assertFalse(adcheck.isQuotedStrLQ2Valiable("example"));
	}

//	@Test
//	public void testQuotedStrLQ3True(){
//		assertTrue(adcheck.isQuotedStrLQ3Valiable("\"exa\""));
//	}
//	
//	@Test
//	public void testQuotedStrLQ3False(){
//		assertFalse(adcheck.isQuotedStrLQ3Valiable("\"ex@a\""));
//	}
}
