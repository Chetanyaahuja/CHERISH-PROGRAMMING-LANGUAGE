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
    : boolExp operation=('=='|'!=') boolExp			     	#booleanExpression
    | boolExp operation=('&&'| '||') boolExp				#booleanAndOr
    | ('!')? LOWERCASE                                      #checkInteger
    | ('!')? BOOLEAN                                        #checkBoolean
    | comparator                                            #comparison
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
    : 'Display' '(' (NUMERAL|LOWERCASE|BOOLEAN| arithExp) ')'
    ;

comparator
    : arithExp operation=
    ( '<='
    | '<'
    | '>'
    | '>='
    | '=='
    | '!='
    ) arithExp
    ;



BOOLEAN
    : 'true'
    | 'false'
    ;

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
