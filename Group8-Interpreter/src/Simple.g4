grammar Simple;

// Lexer rules
INT     : [0-9]+ ;
FLOAT   : [0-9]+ '.' [0-9]* | '.' [0-9]+ ;
CHAR    : '\'' . '\'' ;
STRING  : '"' .*? '"' ;
BOOL    : '"TRUE"' | '"FALSE"';
BEGIN   : 'BEGIN CODE';
END     : 'END CODE';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
NEWLINE : '\r'? '\n' ; 


// Parser rules
start   : BEGIN line* END EOF ;
line    : NEWLINE | statement ;

statement : assignment;

assignment : datatype variable NEWLINE
            | variable '=' expression NEWLINE
            | datatype variable '=' expression NEWLINE
            | datatype variable;

variable   : IDENTIFIER (',' expression)*;

datatype: 'INT' | 'FLOAT' | 'CHAR' | 'STRING' | 'BOOL';
data: INT | FLOAT | CHAR | STRING | BOOL;

expression: IDENTIFIER ('=')* (expression)* (',')* 
            | IDENTIFIER '=' expression
            | data (',' expression)*
            | variable
            | data;


// Whitespace and comment rules
WS      : [ \t]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip ;