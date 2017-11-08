package fileProcessorDecorator.fileOperations;

public class ParagraphDecorator extends FileProcessorAbstractBase{
	InputDetails inp;
	FileProcessorAbstractBase deco;
    String input;
	public ParagraphDecorator(FileProcessorAbstractBase decoIn) {
		// TODO Auto-generated constructor stub
		deco=decoIn;
		System.out.println("Paragraph Decorator");
	}
	@Override
	public void processFileData(InputDetails inp1) {
		// TODO Auto-generated method stub
		if(deco!=null)	deco.processFileData(inp1);
		input = inp1.orignalFileContent;
		
		String [] para = input.split("( +) |(.\n)");
		
		for(int i=0; i<para.length;i++)
		{
			inp1.paragraph.add(para[i]);
		}
		inp1.setParagraph();	
	}

}
