grammar Prolingua;

/* Parser Rules */

program : ( chunk '\n'+ )+;

expression : ( VAR | NUM ) ( ' ' SYMBOL ' ' ( VAR | NUM ) )*;

ifstatement : 'if ' VAR ' ' LOGIC ' ' ( VAR | TRUE | FALSE | NUM ) ' then';
elifstatement : 'or' ifstatement;
elsestatement : 'otherwise';

whilestatement : 'while' ' ' VAR ' ' LOGIC ' ' ( VAR | TRUE | FALSE | NUM ) ' do';
printstatement : 'print ' ( VAR || NUM || STRING );
assignstatement : 'set ' VAR ' to ' expression;
forstatement : 'for ' VAR ' in ' ( 'range ' RANGE || VAR );

chunk : ifblock || whileblock || forblock || printstatement || assignstatement;

ifblock : ifstatement '\n' ( '\t' chunk )* elifblock* elseblock?;
elifblock : elifstatement '\n '( '\t' chunk )*;
elseblock : elsestatement '\n' ( '\t' chunk )*;
whileblock : whilestatement '\n' ( '\t' chunk )*;
forblock : forstatement '\n' ( '\t' chunk )*;


/* Lexer Rules */

TAB : '\t';
SYMBOL : '==' | '!=' | '&&' | '||' | '+' | '-' | '*' | '/' | '%' | '<=' | '<' | '>' | '>=';

RANGE : INT ':' INT;
fragment DIGIT : [0-9];
NUM : INT ( '.' INT )?;
INT : DIGIT+;

STRING : '"' ~'"'* '"';

LOGIC : 'is' | 'is not';

TRUE : 'true';
FALSE : 'false';


VAR : [a-z]+;