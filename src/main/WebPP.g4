grammar WebPP;

//Definição de regras
webppFile : interfaceDeclaration;

interfaceDeclaration: 'interface' ID '{' doctypeAnnotation htmlElement '}';

doctypeAnnotation : '@Doctype' '('STRING')';

htmlElement : 'html' '{' langAttribute headElement bodyElement'}';

langAttribute : 'lang' '=' STRING;

headElement : 'head' '{' metaElement titleElement '}';

metaElement : 'meta' '{' (charsetAttribute | nameContentAttributes)* '}';

charsetAttribute : 'charset' '=' STRING;

nameContentAttributes : nameValuePair (',' nameValuePair)*;

nameValuePair : 'name' '=' STRING ',' 'content' '=' STRING;

titleElement : 'title' '=' STRING;

bodyElement : 'body' '{' (pElement
    | h1Element
    | h2Element
    | h3Element
    | h4Element
    | h5Element
    | h6Element
    | ulElement
    | aElement
    | abbrElement
    | audioElement
    | hrElement
    | dialogElement)*
    '}'
    ;

pElement : 'p' '=' STRING;

h1Element : 'h1' '=' STRING;

h2Element : 'h2' '=' STRING;

h3Element : 'h3' '=' STRING;

h4Element : 'h4' '=' STRING;

h5Element : 'h5' '=' STRING;

h6Element : 'h6' '=' STRING;

ulElement : 'ul' '{' liElement '}';

aElement : 'a' '(' STRING ')' '{' hrefAttribute '}';

hrefAttribute : 'href' '=' STRING;

abbrElement : 'abbr' '(' STRING ')' '{' titleAttribute '}';

titleAttribute : 'title' '=' STRING;

audioElement : 'audio' '(' ID ')' '{' (sourceElement)* '}';

sourceElement : srcValuePair (',' srcValuePair)*;

srcValuePair : 'src' '=' STRING ',' 'type' '=' STRING;

hrElement : '(' 'hr' ')';

dialogElement : 'dialog' '(' ID ')' '=' STRING;

liElement : 'li' '=' STRING (',' STRING)*;

comments : COMMENT+;

//Definição de tokens
STRING : '"' .*? '"'; //Captura strings entre aspas
ID : [a-z]+; //Identificadores
COMMENT : '/*' .*? '*/' -> skip; //Ignora comentários
WS : [ \t\r\n]+ -> skip; //Ignora espaços em branco