package fileProcessorDecorator.driver;

import java.io.FileNotFoundException;

import fileProcessorDecorator.fileOperations.FileProcessorAbstractBase;
import fileProcessorDecorator.fileOperations.InputDetails;
import fileProcessorDecorator.fileOperations.ParagraphDecorator;
import fileProcessorDecorator.fileOperations.SentenceDecorator;
import fileProcessorDecorator.fileOperations.WordDecorator;
import fileProcessorDecorator.fileOperations.WordFrequency;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//if (4!=args.length  || args[0].equals("${arg0)") || args[1].equals("${arg1)") || !args[2].equals("${arg2}") || !args[3].equals("${arg3}") ){ 
			//System.out.println("Invalid Arguments!");
			//System.exit(1);
	      //}
       try{
		InputDetails inp1 = new InputDetails(args[0],args[1]);
	    FileProcessorAbstractBase fileProcessor = new ParagraphDecorator(null);
		fileProcessor = new SentenceDecorator(fileProcessor);
		fileProcessor = new WordDecorator(fileProcessor);
		fileProcessor = new WordFrequency(fileProcessor);
		System.out.println("Original file content: "+ inp1.orignalFileContent);
		
		fileProcessor.processFileData(inp1);	
		}catch (IllegalArgumentException ex) {
			System.err.println("Invalid number of arguments.");
			ex.printStackTrace();
			System.exit(1);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println("Invalid debug value");
			ex.printStackTrace();
			System.exit(1);
		} catch (Exception e) {
			System.err.println("Invalid input");
			e.printStackTrace();
		}
		finally {

		}
       
		}
	}

