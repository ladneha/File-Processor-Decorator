package fileProcessorDecorator.fileOperations;


public class SentenceDecorator extends FileProcessorAbstractBase {
	InputDetails inp;
	FileProcessorAbstractBase deco;
	String[] sent = new String[200];
    String input;
        
	public SentenceDecorator(FileProcessorAbstractBase deco1) {
		// TODO Auto-generated constructor stub
		//inp = inp1;
		deco = deco1;
		System.out.println("Sentence Decorator");
	}

	@Override
	public void processFileData(InputDetails inp1) {
	// TODO Auto-generated method stub
		if(deco!=null)	deco.processFileData(inp1);
		//for(int i=0; i<inp.paragraph.size();i++){
        //input = inp.paragraph.get(i);
		sent =  inp1.orignalFileContent.split("\\.");
		
		for(int j=0; j<sent.length;j++)
		{
			if(sent[j] != null && sent[j] != ""){
				inp1.sentences.add(sent[j]);
				//System.out.println("Sentence :"+j);
				//System.out.println(sent[j]);
			}
		}
		
		//end for
		//return sent;
		inp1.setSentence();
	}

}
