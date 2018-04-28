//Define a grammar called Cherish
grammar Cherish;

progBlock
    : 'start' progCode 'end'
    ;

progCode
    : statements+
    ;

statements
    :
    ( assignStatement
    | conditionalExp
    | iterationExp
    | displayStatement
    )
    ;

assignStatement
    : 'int' LOWERCASE ('=' arithExp)?                     #integerAssign
    | LOWERCASE '=' arithExp                              #integerAssign
    | 'boolean' LOWERCASE ('=' boolExp)?                  #booleanAssign
    | LOWERCASE '=' boolExp		                          #booleanAssign
    ;

boolExp
    : arithExp ('=='|'!=' | '>' | '<' | '<=' | '>=') arithExp	#booleanExpression
    | boolExp ('&&'| '||') boolExp								#booleanAndOr
    | (NOT)? LOWERCASE                                      	#checkLowercase
    | (NOT)? BOOLEAN                                        	#checkBoolean
    | comparator                                            	#comparison
    ;

arithExp
    : term '+' arithExp         #addExp
    | term '-' arithExp         #subExp
    | term                      #termF
    ;

term
    : factor '*' term           #mulExp
    | factor '/' term           #divExp
    | factor '%' term           #modExp
    | factor                    #factorT
    ;

factor
    : NUMERAL                   #numeralFactor
    | LOWERCASE                 #wordFactor
    ;

conditionalExp
    : 'if' '('boolExp')' '{' progCode '}' (elseCondition)?
    ;

elseCondition
    : 'else' '{' progCode '}'
    ;

iterationExp
    : 'while' '('boolExp')' '{' progCode '}'
    ;


displayStatement
    : 'Display' '(' (arithExp) ')'
    ;

comparator
    : arithExp GREATEREQUAL arithExp                #greaterThanEqual
    | arithExp GREATER arithExp                     #greater
    | arithExp LESSER arithExp                      #lessThan
    | arithExp LESSEREQUAL arithExp                 #lessThanEqual
    | arithExp EQUALS arithExp                      #equal
    | arithExp NOTEQUALS arithExp                   #notEqual
    ;

NOT : '!';

BOOLEAN
    : 'true'
    | 'false'
    ;

GREATEREQUAL : '>=';
GREATER      : '>' ;
LESSER       : '<' ;
LESSEREQUAL  : '<=';
EQUALS       : '==';
NOTEQUALS    : '!=';

NUMERAL
    : [1-9] [0-9]*
    | '0'
    ;

LOWERCASE
    : 'a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|'m'|'n'|'o'|'p'|'q'|'r'|'s'|'t'|'u'|'v'|'w'|'x'|'y'|'z'
    ;

WS
    : [ \t\n]+ -> skip
    ;
