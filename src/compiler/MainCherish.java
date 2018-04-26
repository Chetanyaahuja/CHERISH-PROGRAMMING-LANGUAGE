package src.compiler;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class MainCherish {

        public static void main(String args[]){
            String filename = "/Users/natalyakumar/Documents/Workspace/ser516/SER502-Spring2018-Team31/grammar/Example.txt";
            try {
                CherishLexer lexer = new CherishLexer(CharStreams.fromFileName(filename));

                CommonTokenStream tokens = new CommonTokenStream(lexer);

                CherishParser parser = new CherishParser(tokens);

                ParseTree parseTree = parser.progBlock();

                System.out.println(parseTree.toStringTree(parser));

                CherishCompiler compiler = new CherishCompiler();
                compiler.visit(parseTree);

                System.out.println(compiler.getICOutput());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
