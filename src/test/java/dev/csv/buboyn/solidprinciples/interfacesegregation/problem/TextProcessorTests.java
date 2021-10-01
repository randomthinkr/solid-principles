package dev.csv.buboyn.solidprinciples.interfacesegregation.problem;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextProcessorTests {

	@Test
	public void simple_test() {
		
		TextProcessor textProcessor = new TextProcessor();

		textProcessor.add("Spelynk");
		textProcessor.add("doesnt");
		textProcessor.add("matter");
		
		assertEquals("Spelynk doesnt matter", textProcessor.text());
	}
	
	@Test
	public void test_using_language() {
		
		TextProcessor textProcessor = new TextProcessor();

		textProcessor.add("I");
		textProcessor.add("am");
		textProcessor.add("hungry");
		
		assertEquals("I am ungry", textProcessor.text());
		
		assertTrue(textProcessor.correct(Language.EN));
	}
}
