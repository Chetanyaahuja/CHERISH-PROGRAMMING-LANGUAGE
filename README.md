# SER502-Spring2018-Team31
1. Chetanya Ahuja (cahuja3@asu.edu | 1213247254) 
2. Drishty Kapoor (dkapoor3@asu.edu | 1213247241)
3. Himanshu Dua (hdua1@asu.edu | 1213100991)
4. Natalya Kumar (nkumar50@asu.edu | 1213103292)

                                                      NAME OF THE LANGUAGE

CHERISH – “A Happy Language”

                                                      BONUS POINTS
                                                      
We implemented print statment named as "Display ()" in our language to display the variable or value on console:

start
int a = 5
int b = a + 9
Display (b)
Display (a);
end

The output will be:

14
5

Added if statements and While loop

                                                  STEPS TO RUN THE PROJECT

1) Change diresctory to the folder where the project is stored by command "cd".

2) To compile and run the MainCherish.java in order to create intermediate code run the following commands:
  a) javac -d . -cp .:src/:lib/antlr-4.7.1-complete.jar src/compiler/MainCherish.java
  b) java -cp .:src/:lib/antlr-4.7.1-complete.jar src/compiler/MainCherish
  
3) To compile and run the Cherish.java in order to handle the runtime, run the following commands:
  a) javac -d . -cp .:src/:lib/antlr-4.7.1-complete.jar src/runtime/Cherish.java
  b) java -cp .:src/:lib/antlr-4.7.1-complete.jar Cherish
  
  OR
  
  1) Open the project on Eclipse.
  
  
  2) Now run MainCherish.java present in the src/compiler. It will give you the IC for the example.txt present in the folder         Grammar and a new file named example.cherish will be created in the Grammar folder.
  
  
  3) Now run Cherish.java present in src/runtime. It will give you output of the example.txt on console after handling the IC     instructions.
  
  
  4) There are 5 sample programs in the grammar folder, whichever you wants to run just rename that one as "example.txt" and       follow the above written steps. 
  


                                                     DESIGN CHARACTERISTICS
                                                     
➢ Our team is constructing an Imperative Structured Language.
➢ Language is defined with an easy structure, starting with 'start' and ending with 'end'.
➢ It resembles 'C language' in its features and implementation. 
➢ Strongly typed language. 
➢ Use of assignment operator '=' is supported. 
➢ Two Variable types: 'int' as integer, 'char' as character. 
➢ Decision constructs: Syntax: if (condition) else statements 
➢ Iterative constructs: Syntax: while (condition) statements 
➢ Operators used in the language: 
    Arithmetic Operators '+', '-', '*', '/', '%' 
    Relational Operators '<', '<=', '>', '>=', '!=', '==' 
    Assignment Operator '=' 
    Unary Operator '++', '--' 
➢ Each word of the program is separated by a space.

                                                       LANGUAGE DESIGN FLOW
                                                       
  SOURCE CODE --> ANTLR --> INTERMEDIATE CODE --> RUNTIME --> OUTPUT
  
  Explanation:
1. We get input from the source code in the form of Context Free Grammar which passes on to the ANTLRv4(Another Tool for Language Recognition) which uses the LL(*) parsing technique.
2. ANTLR acts as Lexer as well as Parser thereby automatically handling the ambiguity and creating a Parse Tree, and generating the Intermediate Code by overriding BaseListener.
3. Line by line interpretation of the intermediate code.
4. Interpreter lastly gives the final output. 

                                                            TOOLS USED
                                                            
➢ ANTLR 4: To create Parse Tree and override BaseListener to generate Intermediate Code

➢ JAVA

➢ ECLIPSE

➢ GIT

➢ INTELIJ

                                                       INTERMEDIATE CODE 


1. Using customized notation for Decision and Iterative Constructs. 


For instance: notation used for while() is ITERATOR, 

>= is GEQL, 

!= is NEQL.

2. Adding if as IF in IC.


3. We are using top down parsing technique. This technique parses the input and constructs a parse tree from the root node and then gradually moves down towards the leaf nodes. We are using Recursive descent parsing technique. In this, the parse tree is constructed from the top and the input is read from left to right. Procedure is used for every terminal and non-terminal entity. The tokens generated from the Lexer go as input to the Parser. 



4. Data Structures: Here, we are using Stack, StringBuilder and HashMap as data structures. 

