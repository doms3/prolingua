grammar Prolingua;

/* Parser Rules */

program : ( chunk '\n'* )+;

expression : ( VAR | NUM ) ( ' ' SYMBOL ' ' ( VAR | NUM ) )*;

ifstatement : 'if ' VAR ' ' LOGIC ' ' ( VAR | TRUE | FALSE ) ' then';
elifstatement : 'or' ifstatement;
elsestatement : 'otherwise';

whilestatement : 'while' ' ' VAR ' ' LOGIC ' ' ( VAR | TRUE | FALSE ) ' do';
printstatement : 'print ' ( VAR || NUM || STRING );
assignstatement : 'set ' VAR ' to ' expression;
forstatement : 'for ' VAR ' in ' ( 'range ' RANGE || VAR );

chunk : ifblock || whileblock || forblock || printstatement '\n' || assignstatement '\n';

ifblock : ifstatement '\n' ( '\t' chunk )* elifblock* elseblock? '\n';
elifblock : elifstatement '\n '( '\t' chunk )*;
elseblock : elsestatement '\n' ( '\t' chunk )*;
whileblock : whilestatement '\n' ( '\t' chunk )*;
forblock : forstatement '\n' ( '\t' chunk )*;


/* Lexer Rules */

TAB : '\t';
SYMBOL : '==' | '!=' | '&&' | '||' | '+' | '-' | '*' | '/' | '%' | '<=' | '<' | '>' | '>=';

fragment DIGIT : [0-9];
INT : DIGIT+;
NUM : INT ( '.' INT )?;

VAR : [a-z]+;
STRING : '"' ~'"'* '"';

LOGIC : 'is' | 'is not';

TRUE : 'true';
FALSE : 'false';

RANGE : INT ':' INT;

