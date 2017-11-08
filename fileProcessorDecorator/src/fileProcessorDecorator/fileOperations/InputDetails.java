package fileProcessorDecorator.fileOperations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import fileProcessorDecorator.util.Results;

public class InputDetails {

	ArrayList<String> paragraph = new ArrayList<String>();
	ArrayList<String> sentences = new ArrayList<String>();
	ArrayList<String> words = new ArrayList<String>();
	// ArrayList<Integer> frequency = new ArrayList<Integer>();
	HashMap<String, Integer> frequency = new HashMap<String, Integer>();
	public String orignalFileContent;
	String inputFileName, outputFileName;
	Results res;

	public InputDetails(String fileName1In, String fileName2In) {
		inputFileName = fileName1In;
		outputFileName = fileName2In;
		FileProcessor fp = new FileProcessor(inputFileName);
		FileProcessor fpOut = new FileProcessor(outputFileName);
		res = new Results(fpOut);
		orignalFileContent = fp.readLine();
	}

	// public String[] getParagraph()
	// {

	// }

	// public String[] getSentences()
	// {

	// }

	public void setParagraph() {
		// write to file
		res.writeToFile("---PARAGRAPH DECORATOR START---");
		for (int i = 0; i < paragraph.size(); i++) {
			res.writeToFile(paragraph.get(i));
		}
		res.writeToFile("---PARAGRAPH DECORATOR END---");
	}

	public void setSentence() {
		// write to file
		res.writeToFile("---SENTENCE DECORATOR START---");
		for (int i = 0; i < sentences.size(); i++) {
			res.writeToFile(sentences.get(i));
		}
		res.writeToFile("---SENTENCE DECORATOR END---");
	}

	public void setWord() {
		// write to file
		res.writeToFile("---WORD DECORATOR START---");
		for (int i = 0; i < words.size(); i++) {
			res.writeToFile(words.get(i));
		}
		res.writeToFile("---WORD DECORATOR END---");
	}

	public void setFrequency() {
		// write to file
		res.writeToFile("---WORD FREQUENCY DECORATOR START---");
		Set<Entry<String, Integer>> set = frequency.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		// Display elements
		while (it.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry me = (Map.Entry) it.next();
			res.writeToFile(me.getKey() + ":" + me.getValue());
					}
		res.writeToFile("---WORD FREQUENCY DECORATOR END---");
	}

	String getWords(int i) {
		return words.get(i);
	}

}
