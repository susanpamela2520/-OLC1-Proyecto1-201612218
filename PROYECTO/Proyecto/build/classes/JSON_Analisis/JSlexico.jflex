// ------------  Paquetes e importaciones ------------
package JSON_Analisis; 


import java_cup.runtime.*;

%%	

%eof{
    System.out.println("se termino el analisis de tokens");
    //System.out.println(TablaEL.toString());
%eof}



//-------> Directivas (igual al del Navarro xD)

%public 
%class Lexer
%cup
%char
%column
%line
%unicode
%ignorecase
//%debug

// ------> Expresiones Regulares 

DECIMAL = [0-9]+"."[0-9]+
STRING = \" ([^\"] | "\\\"")+ \"
//----> COMENTARIOS
COMENTARIO_S = "//" .*
COMENTARIO_M = "/*"([^*]|("*"+[^*/]))*"*/"


%%


<YYINITIAL> ":"       {funcionesJava.JSTK.TokensJSon.add(new funcionesJava.JSTK(yytext(),"DOS_P",yyline,yycolumn));return new Symbol(sym.DOS_P, yycolumn, yyline, yytext());}

<YYINITIAL> ","       {funcionesJava.JSTK.TokensJSon.add(new funcionesJava.JSTK(yytext(),"COMA",yyline,yycolumn));return new Symbol(sym.COMA, yycolumn, yyline, yytext());}

<YYINITIAL> "{"       {funcionesJava.JSTK.TokensJSon.add(new funcionesJava.JSTK(yytext(),"CORCHETE_A",yyline,yycolumn));return new Symbol(sym.CORCHETE_A, yycolumn, yyline, yytext());}

<YYINITIAL> "}"       {funcionesJava.JSTK.TokensJSon.add(new funcionesJava.JSTK(yytext(),"CORCHETE_C",yyline,yycolumn));return new Symbol(sym.CORCHETE_C, yycolumn, yyline, yytext());}

<YYINITIAL> ";"       {funcionesJava.JSTK.TokensJSon.add(new funcionesJava.JSTK(yytext(),"PUNTOYCOMA",yyline,yycolumn));return new Symbol(sym.PUNTOYCOMA, yycolumn, yyline, yytext());}




<YYINITIAL> {DECIMAL}  { funcionesJava.JSTK.TokensJSon.add(new funcionesJava.JSTK(yytext(),"DECIMAL",yyline,yycolumn));return new Symbol(sym.DECIMAL, yycolumn, yyline, yytext());}

<YYINITIAL> {STRING}  {funcionesJava.JSTK.TokensJSon.add(new funcionesJava.JSTK(yytext(),"STRING",yyline,yycolumn)); return new Symbol(sym.STRING, yycolumn, yyline, yytext());}



//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}
{COMENTARIO_S}    {}
{COMENTARIO_M}    {}


//------> Errores Léxicos 
.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn);funcionesJava.erroresJS.erroresJSon.add(new funcionesJava.erroresJS(yytext(),"error lexico",yyline,yycolumn));}