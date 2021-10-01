package dev.csv.buboyn.solidprinciples.interfacesegregation.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextProcessorTests {

	@Test
	public void simple_test() {
		
		TextProcessor textProcessor = new SimpleTextProcessorImpl();

		textProcessor.add("Spelynk");
		textProcessor.add("doesnt");
		textProcessor.add("matter");
		
		assertEquals("Spelynk doesnt matter", textProcessor.text());
		//should not have visibility to the 'correct' method
		//textProcessor.correct() <-- not found. This is a simple text processor, no spelling correction.
	}
	
	@Test
	public void test_using_language() {
		
		MultiLanguage textProcessor = new WithCorrectionTextProcessorImpl();

		textProcessor.add("I");
		textProcessor.add("am");
		textProcessor.add("hungry");
		
		assertEquals("I am hungry", textProcessor.text());
		
		assertTrue(textProcessor.correct(Language.EN));
	}
}
