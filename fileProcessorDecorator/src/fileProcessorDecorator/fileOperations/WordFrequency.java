package fileProcessorDecorator.fileOperations;

import java.util.HashMap;

public class WordFrequency extends FileProcessorAbstractBase{
	FileProcessorAbstractBase deco;
	InputDetails inp;
	String input;
	String[] list;
	HashMap<String,Integer> word = new HashMap<String,Integer>();
	public WordFrequency(FileProcessorAbstractBase decoIn) {
		// TODO Auto-generated constructor stub
		deco = decoIn;
		System.out.println("Word Frequency Decorator");
	}

	@Override
	public void processFileData(InputDetails inp1) {
		// TODO Auto-generated method stub
		int i;
		 if(deco!=null)	deco.processFileData(inp1);
		input = inp1.orignalFileContent;
		list = input.split(" ");
		for(i=0; i<list.length; i++)
		{
			word.put(list[i], word.getOrDefault(list[i], 0)+1);
			inp1.frequency.put(list[i], word.getOrDefault(list[i], 0)+1);
		}
		
	      System.out.println();
	      inp1.setFrequency();
	}
}
