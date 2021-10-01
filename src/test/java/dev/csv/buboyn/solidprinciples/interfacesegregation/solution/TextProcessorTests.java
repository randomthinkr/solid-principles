package dev.csv.buboyn.solidprinciples.interfacesegregation.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextProcessorTests {

	@Test
	public void simple_test() {
		
		TextProcessor textProcessor = new TextProcessorImpl();

		textProcessor.add("Spelynk");
		textProcessor.add("doesnt");
		textProcessor.add("matter");
		
		assertEquals("Spelynk doesnt matter", textProcessor.text());
	}
	
	@Test
	public void test_using_language() {
		
		MultiLanguage textProcessor = new TextProcessorImpl();

		textProcessor.add("I");
		textProcessor.add("am");
		textProcessor.add("hungry");
		
		assertEquals("I am hungry", textProcessor.text());
		
		assertTrue(textProcessor.correct(Language.EN));
	}
}
