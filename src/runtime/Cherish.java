import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author Drishty Kapoor
 * @author Chetanya Ahuja
 */

public class Cherish
{
    public static HashMap<String, Integer> symbolTable = new HashMap<String, Integer>();
    public static Stack<Integer> intStack = new Stack<Integer>();
    public static Stack<Boolean> booleanStack = new Stack<Boolean>();
    public static Stack<Boolean> isIterate = new Stack<Boolean>(); 
    public static int position = 0;
    public static String[] ic;

    public void moveToBegin(String s) {
    		int i = position;
    		while (i >= 0) {
    			if (s.equals(ic[i])) {
    				position = i;
    				break;
    			}
    			i--;
    		}
    }
    
    public void moveToEnd(String s) {
		int i = position;
		while (i < ic.length) {
			if (s.equals(ic[i]) || (s.equals("ELSE") && "END_IF".equals(ic[i]))) {
				position = i;
				break;
			}
			i++;
		}
}
    
    public void execute(String line) {
            String[] command = line.split(" ");
            int temp = 0;
            switch(command[0]) {
                case "DEC" :
                    symbolTable.put(command[1], 0);
                    break;
                case "MOV" :
                    symbolTable.put(command[1], intStack.pop());
                    break;
                case "DISPLAY":
                    System.out.println(intStack.pop());
                    break;
                case "IF" :
                		isIterate.push(false);
                    break;
                case "GET" :
                		intStack.push(symbolTable.get(command[1]));
                		break;
                case "PUSH" :
                		intStack.push(Integer.parseInt(command[1]));
                		break;
                case "ADD" :
                		intStack.push(intStack.pop() + intStack.pop());
                		break;
                case "SUB" :
                	temp = intStack.pop();
            		intStack.push(intStack.pop() - temp);
            		break;
                case "MUL" :
                	intStack.push(intStack.pop() * intStack.pop());
                		break;
                case "DIV" :
                		temp =intStack.pop();
                		intStack.push(intStack.pop()/temp);
                	 	break;
                case "MOD" :
            		temp =intStack.pop();
            		intStack.push(intStack.pop()%temp);
            	 	break;
                case "EQL" :
                		if (intStack.pop() == intStack.pop()) {
                			booleanStack.push(true);
                		} else {
                			booleanStack.push(false);
                		}
                		break;
                case "LT" :
                		temp  = intStack.pop();
	                	if (intStack.pop() < temp) {
	            			booleanStack.push(true);
	            		} else {
	            			booleanStack.push(false);
	            		}
                		break;
                case "GT" :
            		temp  = intStack.pop();
                	if (intStack.pop() > temp) {
            			booleanStack.push(true);
            		} else {
            			booleanStack.push(false);
            		}
            		break;
            		
                case "LEQL" :
            		temp  = intStack.pop();
                	if (intStack.pop() <= temp) {
            			booleanStack.push(true);
            		} else {
            			booleanStack.push(false);
            		}
            		break;
                case "NEQL" :
            		temp  = intStack.pop();
                	if (intStack.pop() != temp) {
            			booleanStack.push(true);
            		} else {
            			booleanStack.push(false);
            		}
            		break;
                case "GEQL" :
            		temp  = intStack.pop();
                	if (intStack.pop() >= temp) {
            			booleanStack.push(true);
            		} else {
            			booleanStack.push(false);
            		}
            		break;
                case "EXIT_BOOL" :
                		if (!isIterate.pop()) {
	                		if (!booleanStack.pop()) {
	                			this.moveToEnd("ELSE");
	                		} 
                		} else {
                			if (!booleanStack.pop()) {
                				this.moveToEnd("ITERATE_END");
                			} else {
                				isIterate.push(true);
                			}
                		}
                		break;
                case "ELSE" :
                		this.moveToEnd("END_IF");
                		break;
                case "ITERATE" :
                		isIterate.push(true);
                		break;
                case "ITERATE_END" :
                		this.moveToBegin("ITERATE");
                		break;
                default :
                		break;
        }

    }

   
    public static void main(String args[])
    {
        Cherish c = new Cherish();
    		String filename = "grammar/Example.cherish";
        	if (args.length > 0){
        		filename = args[0];
        	}
        	ArrayList<String> list = new ArrayList<String>();
        	try {
	    	    	for (String line : Files.readAllLines(Paths.get(filename))) {
	    	    	    list.add(line);
	    	    	}
        	}
    		catch (IOException e){
    			System.out.println("Exception caught while reading fiel");
    		}
        	
        ic = new String[list.size()];
        	for (int i=0; i<ic.length; i++){
            	ic[i] = list.get(i);
         }
        	
        	 while (position < ic.length) {
        		 c.execute(ic[position]);
        		 position++;
        	 }
        	
    }
}
