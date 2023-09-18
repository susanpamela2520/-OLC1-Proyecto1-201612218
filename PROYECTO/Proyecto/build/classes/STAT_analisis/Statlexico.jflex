
//------------  Paquete e importaciones ------------
package STAT_analisis; 

import java_cup.runtime.*;
import java.util.LinkedList;
 

/*------------------ 2da Area: Opciiones y Declaraciones ------------------*/
%%
%{
    //---> Codigo de usuario en sintaxis java
   // public static LinkedList<TError> TablaEL = new LinkedList<TError>();
   // public static LinkedList<Tokens> tabla_tokens = new LinkedList<Tokens>();
    
%}

%eof{
    System.out.println("se completo el analisis");
    //System.out.println(TablaEL.toString());
%eof}
	
//-------> Directivas (No tocar)

%public 
%class Lexer
%cup
%char
%column
%line
%unicode
%ignorecase
//%standalone

// ------> Expresiones Regulares 

multi_comentario  = "/*"([^*]|("*"+[^*/]))*"*/"
CARACTER=\' ([^\'] | '\\\'')+ \'
STRCADENA = \" ([^\"] | "\\\"")+ \"

COMENT_S = "//"[^\n]*\n 
NUMERO = [0-9]+
DIGITO = [0-9]+("."[  |0-9]+)?
ID = [a-zA-Z_][a-zA-Z0-9_]*




//---> Estados
%%

/*------------------ 3ra Area: Reglas Lexicas            ------------------*/
//---> Simbolos
<YYINITIAL> ";"       { funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"PUNTO_COMA",yyline,yycolumn));return new Symbol(sym.PUNTO_COMA, yycolumn, yyline, yytext());}

<YYINITIAL> ":"       { funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"DOSPUNTOS",yyline,yycolumn));return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext());}

<YYINITIAL> ","       { funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"COMA",yyline,yycolumn));return new Symbol(sym.COMA, yycolumn, yyline, yytext());}

<YYINITIAL> "{"        {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"COMA",yyline,yycolumn));return new Symbol(sym.LLAVE_ABRE, yycolumn, yyline, yytext());}

<YYINITIAL> "}"       {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"COMA",yyline,yycolumn));return new Symbol(sym.LLAVE_CIERRA, yycolumn, yyline, yytext());}



<YYINITIAL> "("       { funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"OPEN_PAR",yyline,yycolumn)); return new Symbol(sym.OPEN_PAR, yycolumn, yyline, yytext());}

<YYINITIAL> ")"       {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"CLOSE_PAR",yyline,yycolumn));  return new Symbol(sym.CLOSE_PAR, yycolumn, yyline, yytext());}



<YYINITIAL> "$"       {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"SIMBOLO_DOLAR",yyline,yycolumn));return new Symbol(sym.SIMBOLO_DOLAR, yycolumn, yyline, yytext());}

<YYINITIAL> "=="      {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RELACIONAL_IGUAL",yyline,yycolumn));return new Symbol(sym.RELACIONAL_IGUAL, yycolumn, yyline, yytext());}

<YYINITIAL> "++"      {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RELACIONAL_MAS",yyline,yycolumn));return new Symbol(sym.RELACIONAL_MAS, yycolumn, yyline, yytext());}


<YYINITIAL> "="       {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"IGUAL",yyline,yycolumn));return new Symbol(sym.IGUAL, yycolumn, yyline, yytext());}

<YYINITIAL> "["       {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"CORCHETE_ABRE",yyline,yycolumn));return new Symbol(sym.CORCHETE_ABRE, yycolumn, yyline, yytext());}

<YYINITIAL> "]"       {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"CORCHETE_CIERRA",yyline,yycolumn));return new Symbol(sym.CORCHETE_CIERRA, yycolumn, yyline, yytext());}



<YYINITIAL> "*"       {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"MULTIPLICACION",yyline,yycolumn));return new Symbol(sym.MULTIPLICACION, yycolumn, yyline, yytext());}

<YYINITIAL> "/"       {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"DIVICION",yyline,yycolumn));return new Symbol(sym.DIVICION, yycolumn, yyline, yytext());}

<YYINITIAL> "+"       {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"MAS",yyline,yycolumn));return new Symbol(sym.MAS, yycolumn, yyline, yytext());}

<YYINITIAL> "-"       {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"MENOS",yyline,yycolumn));return new Symbol(sym.MENOS, yycolumn, yyline, yytext());}


<YYINITIAL> ">"       {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"MAYOR",yyline,yycolumn));return new Symbol(sym.MAYOR, yycolumn, yyline, yytext());}
<YYINITIAL> ">="      {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"MAYOR_IGUAL",yyline,yycolumn));return new Symbol(sym.MAYOR_IGUAL, yycolumn, yyline, yytext());}


<YYINITIAL> "<"       {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"MENOR",yyline,yycolumn));return new Symbol(sym.MENOR, yycolumn, yyline, yytext());}
<YYINITIAL> "<="      {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"MENOR_IGUAL",yyline,yycolumn)); new Symbol(sym.MENOR_IGUAL, yycolumn, yyline, yytext());}



<YYINITIAL> "!="      {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"DIFERENTE",yyline,yycolumn));return new Symbol(sym.DIFERENTE, yycolumn, yyline, yytext());}


<YYINITIAL> "&&"      {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"AND",yyline,yycolumn));return new Symbol(sym.AND, yycolumn, yyline, yytext());}

<YYINITIAL> "!"       {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"NOT",yyline,yycolumn));return new Symbol(sym.NOT, yycolumn, yyline, yytext());}

<YYINITIAL> "||"      {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"OR",yyline,yycolumn));return new Symbol(sym.OR, yycolumn, yyline, yytext());}


<YYINITIAL> "var"       {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_VAR",yyline,yycolumn));return new Symbol(sym.RECERVADA_VAR, yycolumn, yyline, yytext());}

<YYINITIAL> "main"      {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_MAIN",yyline,yycolumn));return new Symbol(sym.RECERVADA_MAIN, yycolumn, yyline, yytext());}

<YYINITIAL> "if"        {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_IF",yyline,yycolumn));return new Symbol(sym.RECERVADA_IF, yycolumn, yyline, yytext());}

<YYINITIAL> "else"     {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_ELSE",yyline,yycolumn));return new Symbol(sym.RECERVADA_ELSE, yycolumn, yyline, yytext());}

<YYINITIAL> "switch"    {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_SWITCH",yyline,yycolumn));return new Symbol(sym.RECERVADA_SWITCH, yycolumn, yyline, yytext());}

<YYINITIAL> "void"      {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_VOID",yyline,yycolumn));return new Symbol(sym.RECERVADA_VOID, yycolumn, yyline, yytext());}

<YYINITIAL> "int"       {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_INT",yyline,yycolumn));return new Symbol(sym.RECERVADA_INT, yycolumn, yyline, yytext());}

<YYINITIAL> "double"    {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_DOUBLE",yyline,yycolumn));return new Symbol(sym.RECERVADA_DOUBLE, yycolumn, yyline, yytext());}

<YYINITIAL> "char"      {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_CHAR",yyline,yycolumn));return new Symbol(sym.RECERVADA_CHAR, yycolumn, yyline, yytext());}

<YYINITIAL> "bool"      {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_BOOL",yyline,yycolumn));return new Symbol(sym.RECERVADA_BOOL, yycolumn, yyline, yytext());}

<YYINITIAL> "string"    {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_STRING",yyline,yycolumn));return new Symbol(sym.RECERVADA_STRING, yycolumn, yyline, yytext());}

<YYINITIAL> "break"     {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_BREAK",yyline,yycolumn));return new Symbol(sym.RECERVADA_BREAK, yycolumn, yyline, yytext());}

<YYINITIAL> "for"       {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_FOR",yyline,yycolumn));return new Symbol(sym.RECERVADA_FOR, yycolumn, yyline, yytext());}

<YYINITIAL> "while"     {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_WHILE",yyline,yycolumn));return new Symbol(sym.RECERVADA_WHILE, yycolumn, yyline, yytext());}


<YYINITIAL> "do"        { funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_DO",yyline,yycolumn));return new Symbol(sym.RECERVADA_DO, yycolumn, yyline, yytext());}

<YYINITIAL> "true"      {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_TRUE",yyline,yycolumn));return new Symbol(sym.RECERVADA_TRUE, yycolumn, yyline, yytext());}

<YYINITIAL> "false"     {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_FALSE",yyline,yycolumn));return new Symbol(sym.RECERVADA_FALSE, yycolumn, yyline, yytext());}


<YYINITIAL> "Console.Write"     {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_CONSOL",yyline,yycolumn));return new Symbol(sym.RECERVADA_CONSOL, yycolumn, yyline, yytext());}

<YYINITIAL> "default"   {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_DEFAULT",yyline,yycolumn));return new Symbol(sym.RECERVADA_DEFAULT, yycolumn, yyline, yytext());}  
  
<YYINITIAL> "case"      {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_CASE",yyline,yycolumn));return new Symbol(sym.RECERVADA_CASE, yycolumn, yyline, yytext());}

<YYINITIAL> "definirglobales"     {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_GLOBAL",yyline,yycolumn));return new Symbol(sym.RECERVADA_GLOBAL, yycolumn, yyline, yytext()); }


<YYINITIAL> "Titulo"         {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_TITULO",yyline,yycolumn));return new Symbol(sym.RECERVADA_TITULO, yycolumn, yyline, yytext()); }

<YYINITIAL> "NewValor"         { funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_NEWVALOR",yyline,yycolumn));return new Symbol(sym.RECERVADA_NEWVALOR, yycolumn, yyline, yytext()); }


<YYINITIAL> "GraficaBarras"  {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_BAR",yyline,yycolumn)); return new Symbol(sym.RECERVADA_BAR, yycolumn, yyline, yytext()); }


<YYINITIAL> "GraficaPie"    {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_PIES",yyline,yycolumn)); return new Symbol(sym.RECERVADA_PIES, yycolumn, yyline, yytext()); }


<YYINITIAL> "EjeX"             {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_EJEX",yyline,yycolumn));return new Symbol(sym.RECERVADA_EJEX, yycolumn, yyline, yytext()); }

<YYINITIAL> "TituloX"   {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_TITULOX",yyline,yycolumn)); return new Symbol(sym.RECERVADA_TITULOX, yycolumn, yyline, yytext()); }

<YYINITIAL> "TituloY"   {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_TITULOY",yyline,yycolumn)); return new Symbol(sym.RECERVADA_TITULOY, yycolumn, yyline, yytext()); }


<YYINITIAL> "Valores"   {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"RECERVADA_VAL",yyline,yycolumn));return new Symbol(sym.RECERVADA_VAL, yycolumn, yyline, yytext()); }




<YYINITIAL> {NUMERO}     {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"NUMERO",yyline,yycolumn));return new Symbol(sym.NUMERO, yycolumn, yyline, yytext()); }

<YYINITIAL> {DIGITO}    {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"DIGITO",yyline,yycolumn));return new Symbol(sym.DIGITO, yycolumn, yyline, yytext());}

<YYINITIAL> {ID}         {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"ID",yyline,yycolumn));return new Symbol(sym.ID, yycolumn, yyline, yytext()); }

<YYINITIAL> {STRCADENA}     {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"STRCADENA",yyline,yycolumn));return new Symbol(sym.STRCADENA, yycolumn, yyline, yytext()); }

<YYINITIAL> {CARACTER}      {funcionesJava.SPTK.TokensSP.add(new funcionesJava.SPTK(yytext(),"CARACTER",yyline,yycolumn));return new Symbol(sym.CARACTER, yycolumn, yyline, yytext()); }




//------> Ingorados 
<YYINITIAL> [ \t\r\n\f]     {/* Espacios en blanco se ignoran */}


<YYINITIAL> {COMENT_S}    {}
<YYINITIAL> {multi_comentario }    {}

//------> Errores Léxicos 
.           	{ funcionesJava.SPERR.ERRSPtokens.add(new funcionesJava.SPERR(yytext(),"Error Lexico",yyline,yycolumn));   System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn);}