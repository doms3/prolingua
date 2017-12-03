grammar Prolingua;

@header {package generatedcode;}

/* Parser Rules */

program : ( ( line )* NEWLINE+ )+;

line : TAB* ( elifstatement | ifstatement | elsestatement | whilestatement | printstatement | assignstatement | forstatement | expression ) NEWLINE;

expression : ( VAR | NUM ) ( ' ' SYMBOL ' ' ( VAR | NUM ) )*;

ifstatement : 'if ' VAR ' ' ( TRUE | FALSE | ( LOGIC ' ' ( VAR | NUM ) ) ) ' then';
elifstatement : 'or' ifstatement;
elsestatement : 'otherwise';

whilestatement : 'while' ' ' VAR ' ' LOGIC ' ' ( VAR | TRUE | FALSE | NUM ) ' do';
printstatement : 'print ' ( VAR || NUM || STRING );
assignstatement : 'set ' VAR ' to ' expression;
forstatement : 'for ' VAR ' in ' ( 'range ' RANGE | VAR );

/* Lexer Rules */
TAB : '\t';
SYMBOL : '==' | '!=' | '&&' | '||' | '+' | '-' | '*' | '/' | '%' | '<=' | '<' | '>' | '>=';

NEWLINE : '\n' | '\n\r';

RANGE : INT ':' INT;
fragment DIGIT : [0-9];
NUM : INT ( '.' INT )?;
INT : DIGIT+;

STRING : '"' ~'"'* '"';

LOGIC : 'is' | 'is not';

TRUE : 'is ' TRUEPRIME;
fragment TRUEPRIME : 'true' | 'not false';
FALSE : 'is ' FALSEPRIME;
fragment FALSEPRIME : 'false' | 'not true';


VAR : [a-z]+;