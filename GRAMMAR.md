expression ::==  &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ( var || num ) ( ' ' symbol ' ' ( var || num ) )*

symbol ::==  &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; '==' || '!=' || '&&' || '||' || '*' || '+' || '/' || '-' || '%' || '<' || '<=' || '>=' || '>'

var ::==              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; [a-z]+

ifstatement ::== &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 'if' ' ' var ' ' logic ' ' ( var || bool ) ' ' 'then'

logic ::== &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ( 'is' || 'is not' )

bool ::== &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ( 'true' || 'false' )

elifstatement ::== &nbsp; &nbsp; &nbsp;&nbsp;  'or' ' ' ifstatement

elsestatement ::== &nbsp; &nbsp; &nbsp;  'otherwise'

whilestatement ::==  &nbsp; &nbsp; 'while' ' ' var ' ' logic ' ' ( var || bool ) ' ' 'do'

printstatement ::==  &nbsp; &nbsp;&nbsp;  print ' ' ( var || num || string )

assignstatement ::== &nbsp;&nbsp; 'set' ' ' var ' ' 'to' ' ' ( expression || string )

forstatement ::==   &nbsp; &nbsp; &nbsp; &nbsp;  'for' ' ' var ' ' in ' ' ( 'range' ' ' int ':' int || var )

chunk ::== &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;   ifblock || whileblock || forblock || printstatement \n || assignstatement \n

ifblock ::==    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;     ifstatement \n ( \t chunk )* elifblock* elseblock? \n

elifblock ::==    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;    elifstatement \n ( \t chunk )*

elseblock ::==    &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;    elsestatement \n ( \t chunk )*

whileblock ::==    &nbsp; &nbsp; &nbsp; &nbsp;  whilestatement \n ( \t chunk )*

forblock ::==      &nbsp; &nbsp; &nbsp; &nbsp;   forstatement \n ( \t chunk )*

digit ::==    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;        [0-9]

int ::==      &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;         digit+

num :==         &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;      int ( '.' int )?

string ::==    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;       '"' .* '"'
