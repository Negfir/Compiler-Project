/*package jSHLang;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;

class MainClass {
    public static void main(String[] args) {
        FileReader fr = null;
        String input = "Code.txt";
        try {
            fr = new FileReader(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Lexeme\tToken\tAttribute");
        Yylex yylex = new Yylex(fr);
        try {
            yylex.yylex();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
  
%%

%byaccj

LETTER = [a-zA-Z]
NUM = [0-9]
SEMICOLON = [;]
COLON = [:]
COMMA = [,]
LP = [(]
RP = [)]
LB = "["
RB = "]"
LCB = "{"
RCB = "}"
DOT = "\."
PLUSPLUS = "++"
MINMIN = (--)

ASSIGN = [=]
LE = (<=)
LT = [<]
GE = (>=)
GT = [>]
EQUAL = (==)
NOT_EQUAL = "!="



ADD = [+]
SUB = [-]
MUL = [*]
DIV = [/]
MOD = [%]


ADD_EQ = "+="
SUB_EQ = (-=)
MUL_EQ = "*="
DIV_EQ = "/="

AND_LOG = (&&)
OR_LOG = "||"
TILDA = [~]
AND = (and)
OR = (or)

// UMUL = [*]
// UMINUS = [-]
QUEST = [?] 




STATIC_KW = (static)
INTEGER_KW = (integer)
BOOLEAN_KW = (boolean)
INT_KW = (int)
CHAR_KW = (char)
CHARACTER_KW = (character)
BOOL_KW = (bool)

VOID_KW = (void)

IF_KW = (if)
THEN_KW = (then)
ELSE_KW = (else)

OTHER_KW = (other)
TILL_KW = (till)

COMEBACK_KW = (comeback) 
GIVEBACK_KW = (giveback)
C_GIVEBACK_KW = (GiveBack)
CONTINUE_KW = (continue)



CONST_KW = (const)
TRUE_KW = (true)
FALSE_KW = (false)


//WHITESPACE = [\ \n\t\r\b]+ 
COMMENT = "//" ({LETTER} | {NUM})*



%%

{NUM} {
	//System.out.println(yytext() + "\t" + "NUM\t" + '-');
	return YYParser.Lexer.NUM;
}
{LETTER} {
	//System.out.println(yytext() + "\t" + "LETTER\t" + '-');
	return YYParser.Lexer.LETTER;
}
{STATIC_KW} {
	//System.out.println(yytext() + "\t" + "STATIC_KW\t" + '-');
	return YYParser.Lexer.STATIC_KW;
}
{INTEGER_KW} {
	//System.out.println(yytext() + "\t" + "INTEGER_KW\t" + '-');
	return YYParser.Lexer.INTEGER_KW;
}
{BOOLEAN_KW} {
	//System.out.println(yytext() + "\t" + "BOOLEAN_KW\t" + '-');
	return YYParser.Lexer.BOOLEAN_KW;
}
{INT_KW} {
	//System.out.println(yytext() + "\t" + "INT_KW\t" + '-');
	return YYParser.Lexer.INT_KW;
}
{CHAR_KW} {
	//System.out.println(yytext() + "\t" + "CHAR_KW\t" + '-');
	return YYParser.Lexer.CHAR_KW;
}
{CHARACTER_KW} {
	//System.out.println(yytext() + "\t" + "CHARACTER_KW\t" + '-');
	return YYParser.Lexer.CHARACTER_KW;
}
{BOOL_KW} {
	//System.out.println(yytext() + "\t" + "BOOL_KW\t" + '-');
	return YYParser.Lexer.BOOL_KW;
}
{VOID_KW} {
	//System.out.println(yytext() + "\t" + "VOID_KW\t" + '-');
	return YYParser.Lexer.VOID_KW;
}
{IF_KW} {
	//System.out.println(yytext() + "\t" + "IF_KW\t" + '-');
	return YYParser.Lexer.IF_KW;
}
{THEN_KW} {
	//System.out.println(yytext() + "\t" + "THEN_KW\t" + '-');
	return YYParser.Lexer.THEN_KW;
}
{ELSE_KW} {
	//System.out.println(yytext() + "\t" + "ELSE_KW\t" + '-');
	return YYParser.Lexer.ELSE_KW;
}

{OTHER_KW} {
	//System.out.println(yytext() + "\t" + "OTHER_KW\t" + '-');
	return YYParser.Lexer.OTHER_KW;
}
{TILL_KW} {
	//System.out.println(yytext() + "\t" + "TILL_KW\t" + '-');
	return YYParser.Lexer.TILL_KW;
}
{COMEBACK_KW} {
	//System.out.println(yytext() + "\t" + "COMEBACK_KW\t" + '-');
	return YYParser.Lexer.COMEBACK_KW;
}
{GIVEBACK_KW} {
	//System.out.println(yytext() + "\t" + "GIVEBACK_KW\t" + '-');
	return YYParser.Lexer.GIVEBACK_KW;
}
{C_GIVEBACK_KW} {
	//System.out.println(yytext() + "\t" + "C_GIVEBACK_KW\t" + '-');
	return YYParser.Lexer.C_GIVEBACK_KW;
}
{CONTINUE_KW} {
	//System.out.println(yytext() + "\t" + "CONTINUE_KW\t" + '-');
	return YYParser.Lexer.CONTINUE_KW;
}
{TRUE_KW} {
	//System.out.println(yytext() + "\t" + "TRUE_KW\t" + '-');
	return YYParser.Lexer.TRUE_KW;
}
{FALSE_KW} {
	//System.out.println(yytext() + "\t" + "FALSE_KW\t" + '-');
	return YYParser.Lexer.FALSE_KW;
}
{CONST_KW} {
	//System.out.println(yytext() + "\t" + "CONST_KW\t" + "-");
	return YYParser.Lexer.CONST_KW;
}

{AND} {
	//System.out.println(yytext() + "\t" + "AND\t" + '-');
	return YYParser.Lexer.AND;
}
{OR} {
	//System.out.println(yytext() + "\t" + "OR\t" + '-');
	return YYParser.Lexer.OR;
}
{QUEST} {
	//System.out.println(yytext() + "\t" + "َٔQUEST\t" + '-');
	return YYParser.Lexer.QUEST;
}


/*{WHITESPACE} {
	//System.out.println(yytext() + "\t" + "WHITESPACE\t" + '-');
	return YYParser.Lexer.WHITESPACE;
}*/
{COMMENT} {
	//System.out.println(yytext() + "\t" + "COMMENT\t" + '-');
	return YYParser.Lexer.COMMENT;
}

{SEMICOLON} {
	//System.out.println(yytext() + "\t" + "SEMICOLON\t" + '-');
	return YYParser.Lexer.SEMICOLON;
}
{COLON} {
	//System.out.println(yytext() + "\t" + "COLON\t" + '-');
	return YYParser.Lexer.COLON;
}
{COMMA} {
	//System.out.println(yytext() + "\t" + "COMMA\t" + '-');
	return YYParser.Lexer.COMMA;
}

{LP} {
	//System.out.println(yytext() + "\t" + "LP\t" + '-');
	return YYParser.Lexer.LP;
}
{RP} {
	//System.out.println(yytext() + "\t" + "RP\t" + '-');
	return YYParser.Lexer.RP;
}
{LB} {
	//System.out.println(yytext() + "\t" + "LB\t" + '-');
	return YYParser.Lexer.LB;
}
{RB} {
	//System.out.println(yytext() + "\t" + "RB\t" + '-');
	return YYParser.Lexer.RB;
}
{LCB} {
	//System.out.println(yytext() + "\t" + "LCB\t" + '-');
	return YYParser.Lexer.LCB;
}
{RCB} {
	//System.out.println(yytext() + "\t" + "RCB\t" + '-');
	return YYParser.Lexer.RCB;
}
{DOT} {
	//System.out.println(yytext() + "\t" + "DOT\t" + '-');
	return YYParser.Lexer.DOT;
}
{PLUSPLUS} {
	//System.out.println(yytext() + "\t" + "PLUSPLUS\t" + '-');
	return YYParser.Lexer.PLUSPLUS;
}
{MINMIN} {
	//System.out.println(yytext() + "\t" + "MINMIN\t" + '-');
	return YYParser.Lexer.MINMIN;
}
{ASSIGN} {
	//System.out.println(yytext() + "\t" + "ASSIGN\t" + '-');
	return YYParser.Lexer.ASSIGN;
}
{NOT_EQUAL} {
	//System.out.println(yytext() + "\t" + "NOT_EQUAL\t" + '-');
	return YYParser.Lexer.NOT_EQUAL;
}
{LE} {
	//System.out.println(yytext() + "\t" + "LE\t" + '-');
	return YYParser.Lexer.LE;
}
{LT} {
	//System.out.println(yytext() + "\t" + "LT\t" + '-');
	return YYParser.Lexer.LT;
}
{GE} {
	//System.out.println(yytext() + "\t" + "GE\t" + '-');
	return YYParser.Lexer.GE;
}
{GT} {
	//System.out.println(yytext() + "\t" + "GT\t" + '-');
	return YYParser.Lexer.GT;
}
{EQUAL} {
	//System.out.println(yytext() + "\t" + "EQUAL\t" + '-');
	return YYParser.Lexer.EQUAL;
}
{NOT_EQUAL} {
	//System.out.println(yytext() + "\t" + "NOT_EQUAL\t" + '-');
	return YYParser.Lexer.NOT_EQUAL;
}
{ADD} {
	//System.out.println(yytext() + "\t" + "ADD\t" + '-');
	return YYParser.Lexer.ADD;
}
{SUB} {
	//System.out.println(yytext() + "\t" + "SUB\t" + '-');
	return YYParser.Lexer.SUB;
}
{MUL} {
	//System.out.println(yytext() + "\t" + "MUL\t" + '-');
	return YYParser.Lexer.MUL;
}
{DIV} {
	//System.out.println(yytext() + "\t" + "DIV\t" + '-');
	return YYParser.Lexer.DIV;
}
{MOD} {
	//System.out.println(yytext() + "\t" + "MOD\t" + '-');
	return YYParser.Lexer.MOD;
}
{ADD_EQ} {
	//System.out.println(yytext() + "\t" + "ADD_EQ\t" + '-');
	return YYParser.Lexer.ADD_EQ;
}
{SUB_EQ} {
	//System.out.println(yytext() + "\t" + "SUB_EQ\t" + '-');
	return YYParser.Lexer.SUB_EQ;
}
{MUL_EQ} {
	//System.out.println(yytext() + "\t" + "MUL_EQ\t" + '-');
	return YYParser.Lexer.MUL_EQ;
}
{DIV_EQ} {
	//System.out.println(yytext() + "\t" + "DIV_EQ\t" + '-');
	return YYParser.Lexer.DIV_EQ;
}
{AND_LOG} {
	//System.out.println(yytext() + "\t" + "AND_LOG\t" + '-');
	return YYParser.Lexer.AND_LOG;
}
{OR_LOG} {
	//System.out.println(yytext() + "\t" + "OR_LOG\t" + '-');
	return YYParser.Lexer.OR_LOG;
}
{TILDA} {
	//System.out.println(yytext() + "\t" + "TILDA\t" + '-');
	return YYParser.Lexer.TILDA;
}




"\s"|"\n"|"\r"|"\t" {
}

. {
}