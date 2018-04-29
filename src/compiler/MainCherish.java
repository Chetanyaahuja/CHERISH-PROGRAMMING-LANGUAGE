package src.compiler;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MainCherish {

        public static void main(String args[]){
            String filename = "grammar/Example.txt";
            if(args.length > 0) {
            	filename = args[0];	
            try {
                src.compiler.CherishLexer lexer = new CherishLexer(CharStreams.fromFileName(filename));

                CommonTokenStream tokens = new CommonTokenStream(lexer);

                CherishParser parser = new CherishParser(tokens);

                ParseTree parseTree = parser.progBlock();

                System.out.println(parseTree.toStringTree(parser));

                CherishIC ic = new CherishIC();
                ParseTreeWalker.DEFAULT.walk(ic, parseTree);
               /* CherishCompiler compiler = new CherishCompiler();
                compiler.visit(parseTree);*/
                
                StringBuilder icCode = ic.getICOutput();
                System.out.println(icCode);
                try {
        				PrintWriter writer = new PrintWriter(filename.substring(0, filename.length()-3)+"cherish", "UTF-8");
        				writer.println(icCode.toString());
        				writer.close();
	        		} catch (FileNotFoundException e) {
	        			// TODO Auto-generated catch block
	        			e.printStackTrace();
	        		} catch (UnsupportedEncodingException e) {
	        			// TODO Auto-generated catch block
	        			e.printStackTrace();
	        		}

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
