//Defined a grammar called Cherish
progBlock -> start, progCode, end
progCode -> varDecl, progCode | statements
varDecl -> varType, varAssign
varType -> 'int' | 'char'
statements -> assignStatement | conditionalExp | iterationExp
varAssign -> word ‘=’ numeral
assignStatement -> word '=' arithExp | arithExp
word -> alphabet, alphanumeral | '_', alphanumeral
alphanumeral -> alphabet, alphanumeral | numeral, alphanumeral | symbol
symbol-> alphabet | numeral | ϵ
alphabet-> lowercase | uppercase
arithExp -> term '+' arithExp | term '-' arithExp | term
term -> factor '*' term | factor '/' term | factor '%' term | factor
factor -> unary | '(' unary ')' | '(rightArithExp)' | numeral | word | arithExp
unary -> numeral '++' | numeral '--' | word '++' | word '--'
conditionalExp -> 'if' '('cond')' statements | 'if' '('cond')' statements else statements
iterationExp -> 'while' '('cond')' statements
cond -> cond '&&' andExpr | andExp
andExp -> andExp '||' singleExp | singleExp
singleExp -> 'not' singleExpr | relativeExp
relativeExp -> terminal operator terminal | boolVal
operator -> '<=' | '<' | '>' | '>=' |'==' | '!='
terminal -> word | numeral
boolVal -> 'true' | 'false'
numeral -> digit, numeral | digit
digit -> '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
lowercase -> 'a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|'m'|'n'|'o'|'p'|'q'|'r'|'s'|'t'|'u'|'v'|'w'|'x'|'y'|'z'
uppercase -> 'A'|'B'|'C'|'D'|'E'|'F'|'G'|'H'|'I'|'J'|'K'|'L'|'M'|'N'|'O'|'P'|'Q'|'R'|'S'|'T'|'U'|'V'|'W'|'X'|'Y'|'Z'
