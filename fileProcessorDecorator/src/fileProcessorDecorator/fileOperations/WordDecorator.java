package fileProcessorDecorator.fileOperations;

public class WordDecorator extends FileProcessorAbstractBase {
	InputDetails inp;
	String[] words = new String[200];
    String input;
    FileProcessorAbstractBase deco;
    
	public WordDecorator(FileProcessorAbstractBase decoIn) {
		// TODO Auto-generated constructor stub
		deco = decoIn;
		System.out.println("Word Decorator");
	}
	public void processFileData(InputDetails inp1) {
		// TODO Auto-generated method stub
		if(deco!=null)	deco.processFileData(inp1);
		input = inp1.orignalFileContent;
		
		words = input.split(" ");
		
		for(int i=0; i<words.length;i++)
		{
			if(words[i] != null){
			inp1.words.add(words[i]);
			//System.out.println("Words :"+i);
			//System.out.println(words[i]);
			}
		}
		inp1.setWord();		
	}

}
