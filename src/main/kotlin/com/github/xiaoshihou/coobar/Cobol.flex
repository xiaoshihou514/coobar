package com.github.xiaoshihou.coobar;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.lexer.FlexLexer;
%%

%class CobolLexer
%implements FlexLexer
%unicode
%ignorecase
%function advance
%type IElementType
%eof{  return;
%eof}

WHITE_SPACE=[\ \t\f\r\n]+
NUMBER=[0-9]+
IDENTIFIER=[A-Za-z][A-Za-z0-9\-]*
STRING='[^'\r\n]*'

%%

{WHITE_SPACE}                   { return TokenType.WHITE_SPACE; }

"IDENTIFICATION"                { return CobolTypes.IDENTIFICATION; }
"DIVISION"                      { return CobolTypes.DIVISION; }
"PROGRAM-ID"                    { return CobolTypes.PROGRAM_ID; }
"DATA"                          { return CobolTypes.DATA; }
"WORKING-STORAGE"               { return CobolTypes.WORKING_STORAGE; }
"SECTION"                       { return CobolTypes.SECTION; }
"PROCEDURE"                     { return CobolTypes.PROCEDURE; }

"PIC"                           { return CobolTypes.PIC; }
"VALUE"                         { return CobolTypes.VALUE; }

"PERFORM"                       { return CobolTypes.PERFORM; }
"VARYING"                       { return CobolTypes.VARYING; }
"FROM"                          { return CobolTypes.FROM; }
"BY"                            { return CobolTypes.BY; }
"UNTIL"                         { return CobolTypes.UNTIL; }
"STOP"                          { return CobolTypes.STOP; }
"RUN"                           { return CobolTypes.RUN; }
"DISPLAY"                       { return CobolTypes.DISPLAY; }

"("                             { return CobolTypes.LPAREN; }
")"                             { return CobolTypes.RPAREN; }
"="                             { return CobolTypes.EQUALS; }
"."                             { return CobolTypes.DOT; }

{NUMBER}                        { return CobolTypes.NUMBER; }
{IDENTIFIER}                    { return CobolTypes.IDENTIFIER; }
{STRING}                        { return CobolTypes.STRING; }

.                               { return TokenType.BAD_CHARACTER; }
