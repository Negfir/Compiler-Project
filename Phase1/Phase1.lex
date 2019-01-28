

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
DIVE_EQ = "/="

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
	System.out.println(yytext() + "\t" + "NUM\t" + '-');
	
}
{LETTER} {
	System.out.println(yytext() + "\t" + "LETTER\t" + '-');

}
{STATIC_KW} {
	System.out.println(yytext() + "\t" + "STATIC_KW\t" + '-');
	
}
{INTEGER_KW} {
	System.out.println(yytext() + "\t" + "INTEGER_KW\t" + '-');
	
}
{BOOLEAN_KW} {
	System.out.println(yytext() + "\t" + "BOOLEAN_KW\t" + '-');

}
{INT_KW} {
	System.out.println(yytext() + "\t" + "INT_KW\t" + '-');
	
}
{CHAR_KW} {
	System.out.println(yytext() + "\t" + "CHAR_KW\t" + '-');

}
{CHARACTER_KW} {
	System.out.println(yytext() + "\t" + "CHARACTER_KW\t" + '-');
	
}
{BOOL_KW} {
	System.out.println(yytext() + "\t" + "BOOL_KW\t" + '-');
	
}
{VOID_KW} {
	System.out.println(yytext() + "\t" + "VOID_KW\t" + '-');
	
}
{IF_KW} {
	System.out.println(yytext() + "\t" + "IF_KW\t" + '-');
	
}
{THEN_KW} {
	System.out.println(yytext() + "\t" + "THEN_KW\t" + '-');
	
}
{ELSE_KW} {
	System.out.println(yytext() + "\t" + "ELSE_KW\t" + '-');
	
}

{OTHER_KW} {
	System.out.println(yytext() + "\t" + "OTHER_KW\t" + '-');
	
}
{TILL_KW} {
	System.out.println(yytext() + "\t" + "TILL_KW\t" + '-');
	
}
{COMEBACK_KW} {
	System.out.println(yytext() + "\t" + "COMEBACK_KW\t" + '-');
	
}
{GIVEBACK_KW} {
	System.out.println(yytext() + "\t" + "GIVEBACK_KW\t" + '-');
	
}
{C_GIVEBACK_KW} {
	System.out.println(yytext() + "\t" + "C_GIVEBACK_KW\t" + '-');

}
{CONTINUE_KW} {
	System.out.println(yytext() + "\t" + "CONTINUE_KW\t" + '-');
	
}
{TRUE_KW} {
	System.out.println(yytext() + "\t" + "TRUE_KW\t" + '-');
	
}
{FALSE_KW} {
	System.out.println(yytext() + "\t" + "FALSE_KW\t" + '-');
	
}
{CONST_KW} {
	System.out.println(yytext() + "\t" + "CONST_KW\t" + "-");
	
}

{AND} {
	System.out.println(yytext() + "\t" + "AND\t" + '-');

}
{OR} {
	System.out.println(yytext() + "\t" + "OR\t" + '-');
	
}
{QUEST} {
	System.out.println(yytext() + "\t" + "َٔQUEST\t" + '-');
	
}


/*{WHITESPACE} {
	//System.out.println(yytext() + "\t" + "WHITESPACE\t" + '-');
	return YYParser.Lexer.WHITESPACE;
}*/
{COMMENT} {
	System.out.println(yytext() + "\t" + "COMMENT\t" + '-');

}

{SEMICOLON} {
	System.out.println(yytext() + "\t" + "SEMICOLON\t" + '-');
	
}
{COLON} {
	System.out.println(yytext() + "\t" + "COLON\t" + '-');
	
}
{COMMA} {
	System.out.println(yytext() + "\t" + "COMMA\t" + '-');
	
}

{LP} {
	System.out.println(yytext() + "\t" + "LP\t" + '-');
	
}
{RP} {
	System.out.println(yytext() + "\t" + "RP\t" + '-');

}
{LB} {
	System.out.println(yytext() + "\t" + "LB\t" + '-');
	
}
{RB} {
	System.out.println(yytext() + "\t" + "RB\t" + '-');

}
{LCB} {
	System.out.println(yytext() + "\t" + "LCB\t" + '-');

}
{RCB} {
	System.out.println(yytext() + "\t" + "RCB\t" + '-');
	
}
{DOT} {
	System.out.println(yytext() + "\t" + "DOT\t" + '-');

}
{PLUSPLUS} {
	System.out.println(yytext() + "\t" + "PLUSPLUS\t" + '-');
	
}
{MINMIN} {
	System.out.println(yytext() + "\t" + "MINMIN\t" + '-');
	
}
{ASSIGN} {
	System.out.println(yytext() + "\t" + "ASSIGN\t" + '-');
	
}
{NOT_EQUAL} {
	System.out.println(yytext() + "\t" + "NOT_EQUAL\t" + '-');

}
{LE} {
	System.out.println(yytext() + "\t" + "LE\t" + '-');
	
}
{LT} {
	System.out.println(yytext() + "\t" + "LT\t" + '-');
	
}
{GE} {
	System.out.println(yytext() + "\t" + "GE\t" + '-');
	
}
{GT} {
	System.out.println(yytext() + "\t" + "GT\t" + '-');
	
}
{EQUAL} {
	System.out.println(yytext() + "\t" + "EQUAL\t" + '-');
	
}
{NOT_EQUAL} {
	System.out.println(yytext() + "\t" + "NOT_EQUAL\t" + '-');
	
}
{ADD} {
	System.out.println(yytext() + "\t" + "ADD\t" + '-');
	
}
{SUB} {
	System.out.println(yytext() + "\t" + "SUB\t" + '-');
	
}
{MUL} {
	System.out.println(yytext() + "\t" + "MUL\t" + '-');
	
}
{DIV} {
	System.out.println(yytext() + "\t" + "DIV\t" + '-');
	
}
{MOD} {
	System.out.println(yytext() + "\t" + "MOD\t" + '-');
	
}
{ADD_EQ} {
	System.out.println(yytext() + "\t" + "ADD_EQ\t" + '-');
	
}
{SUB_EQ} {
	System.out.println(yytext() + "\t" + "SUB_EQ\t" + '-');
	
}
{MUL_EQ} {
	System.out.println(yytext() + "\t" + "MUL_EQ\t" + '-');
	
}
{DIVE_EQ} {
	System.out.println(yytext() + "\t" + "DIVE_EQ\t" + '-');
	
}
{AND_LOG} {
	System.out.println(yytext() + "\t" + "AND_LOG\t" + '-');
	
}
{OR_LOG} {
	System.out.println(yytext() + "\t" + "OR_LOG\t" + '-');

}
{TILDA} {
	System.out.println(yytext() + "\t" + "TILDA\t" + '-');
	
}




"\s"|"\n"|"\r"|"\t" {
}

. {
}