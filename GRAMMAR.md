expression ::== ( var || num ) ( ' ' symbol ' ' ( var || num ) )*

symbol ::== '==' || '!=' || '&&' || '||'

var ::== [a-z]+

ifstatement ::== 'if' ' ' var ' ' logic ' ' ( var || bool ) ' ' 'then'

logic ::== ( 'is' || 'is not' )

bool ::== ( 'true' || 'false' )

elifstatement ::== 'or' ' ' ifstatement

elsestatement ::== 'otherwise'

whilestatement ::== 'while' ' ' var ' ' logic ' ' ( var || bool ) ' ' 'do'

printstatement ::== print ' ' ( var || num )

assignstatement ::== 'set' ' ' var ' ' 'to' ' ' expression

forstatement ::== 'for' ' ' var ' ' in ' ' ( 'range' ' ' int ':' int || var )

chunk ::== ifblock || whileblock || forblock || printstatement \n || assignstatement \n

ifblock ::== ifstatement \n ( \t chunk )* elifblock* elseblock? \n

elifblock ::== elifstatement \n ( \t chunk )*

elseblock ::== elsestatement \n ( \t chunk )*

whileblock ::== whilestatement \n ( \t chunk )*

forblock ::== forstatement \n ( \t chunk )*

digit ::== [0-9]

int ::== digit+

num :== int ( '.' int )?