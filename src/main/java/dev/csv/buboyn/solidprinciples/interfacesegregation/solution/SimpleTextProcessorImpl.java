package dev.csv.buboyn.solidprinciples.interfacesegregation.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleTextProcessorImpl implements TextProcessor{


	private List<String> text = new ArrayList<>();

	@Override
	public void add (String word) {
		text.add(word);
	}

	@Override
	public String text () {
		return text.stream().collect(Collectors.joining(" "));
	}
}
