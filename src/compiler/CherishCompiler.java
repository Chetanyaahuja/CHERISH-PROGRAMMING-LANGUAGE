import
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class CherishCompiler {

        public static void main(String args[]){
            String filename = args[0];
            try {
                CherishLexer lexer = new CherishLexer(CharStreams.fromFileName(args[0]));
                CherishParser parser = new CherishParser(new CommonTokenStream(lexer));
                ParseTree tree = parser.block();
                ParseTreeWalker walker = new ParseTreeWalker();
                filename = filename.substring(0,filename.length()-4);
                CherishWalker epsilonWalk = new CherishWalker(filename);
                walker.walk( epsilonWalk, tree );


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
