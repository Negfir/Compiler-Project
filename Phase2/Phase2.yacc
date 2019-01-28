%{
  import java.io.*;
%}

%token LETTER  C_GIVEBACK_KW NUM SEMICOLON COLON COMMA LP RP LB RB LCB RCB DOT PLUSPLUS MINUSMINUS ASSIGN LE LT GE GT EQUAL NOT_EQUAL ADD SUB MUL DIV MOD ADDE SUBE MULE DIVE /* UPLUS UMUL */ QUEST ANDAND OROR TILDA AND OR STATIC_KW INTEGER_KW BOOLEAN_KW INT_KW CHAR_KW CHARACTER_KW BOOL_KW VOID_KW IF_KW THEN_KW ELSE_KW OTHER_KW TILL_KW COMEBACK_KW GIVEBACK_KW CONTINUE_KW CONST_KW TRUE_KW FALSE_KW COMMENT 


%code {
    static PrintStream writer;

    public static void main(String args[]) throws IOException, FileNotFoundException {
        YYParser yyparser;
        final Yylex lexer;

        writer = new PrintStream(new File("output.txt"));
        lexer = new Yylex(new InputStreamReader(new FileInputStream("Code.txt")));

        yyparser = new YYParser(new Lexer() {

            @Override
            public int yylex() {
                int yyl_return = -1;
                try {

                    yyl_return = lexer.yylex();
                } catch (IOException e) {
                    System.err.println("IO error :" + e);
                }
                return yyl_return;
            }

            @Override
            public void yyerror(String error) {
                System.err.println("Error : " + error);
            }

            @Override
            public Object getLVal() {
                return null;
            }
        });
        yyparser.parse();

        return;
    }
}

%start program

%left EQUAL NOT_EQUAL LE LT GE GT LP RP LB RB DOT
%left ADD SUB
%left MUL DIV MOD
%left AND OR ANDAND OROR
%right TILDA
%right ASSIGN //UPLUS UMUL
%right ADDE SUBE
%right MULE DIVE
%left COMMA 


%%



program: 
    list {
        System.out.println("Rule 4: " +
            "program -> list");
    }

list: 
    declaration listP {
        System.out.println("Rule 5.1: " +
            "list -> declaration listp");
    }

listP: 
    declaration listP {
        System.out.println("Rule 5.2: " +
            "listP -> declaration listP");
    }
    | /*NULL*/ {
        System.out.println("Rule 5.3: " +
            "listP -> /*NULL*/");
    }

declaration: 
    function {
        System.out.println("Rule 6.1: " +
            "declaration -> function");
    }
    | varDeclaration {
        System.out.println("Rule 6.2: " +
            "declaration -> varDeclaration");
    }
function: 
    VOID_KW numOrletter LP parameter RP LCB statement RCB {
        System.out.println("Rule 14.1: " +
            "function -> VOID_KW numOrletter LP parameter RP LCB statement RCB");
    }
    | type letter numOrletter LP parameter RP statement {
        System.out.println("Rule 14.2: " +
            "function -> type letter numOrletter LP parameter RP statement");
    }

varDeclaration: 
    type variableList SEMICOLON{
        System.out.println("Rule 7: " +
            "varDeclaration -> type variableList SEMICOLON");
    }

numOrletter: 
    num {
        System.out.println("Rule 3.1: " +
            "numOrletter -> num");
    }
    | letter {
        System.out.println("Rule 3.2: " +
            "numOrletter -> letter");
    }
    | /*NULL*/ {
        System.out.println("Rule 3.3: " +
            "numOrletter -> /*NULL*/");
    }


parameter: 
    listOfParameters {
        System.out.println("Rule 15.1: " +
            "parameter -> listOfParameters");
    }
    | /*NULL*/ {
        System.out.println("Rule 15.2: " +
            "parameter -> /*NULL*/");
    }
    
statement: 
    phrase {
        System.out.println("Rule 21.1: " +
            "statement -> phrase");
    }
    | compoundPhrase {
        System.out.println("Rule 21.2: " +
            "statement -> compoundPhrase");
    }
    | selectPhrase {
        System.out.println("Rule 21.3: " +
            "statement -> selectPhrase");
    }
    | iterationPhrase {
        System.out.println("Rule 21.4: " +
            "statement -> iterationPhrase");
    }
    | returnPhrase {
        System.out.println("Rule 21.5: " +
            "statement -> returnPhrase");
    }
    | continue {
        System.out.println("Rule 21.6: " +
            "statement -> continue");
    }

type: 
    BOOLEAN_KW {
        System.out.println("Rule 13.1: " +
            "type -> BOOLEAN_KW");
    }
    | CHARACTER_KW {
        System.out.println("Rule 13.2: " +
            "type -> CHARACTER_KW");
    }
    | INTEGER_KW {
        System.out.println("Rule 13.3: " +
            "type -> INTEGER_KW");
    }
    | CHAR_KW {
        System.out.println("Rule 13.4: " +
            "type -> CHAR_KW");
    }
    | BOOL_KW {
        System.out.println("Rule 13.5: " +
            "type -> BOOL_KW");
    }
    | INT_KW {
        System.out.println("Rule 13.6: " +
            "type -> INT_KW");
    }

letter:
    LETTER letterP {
        System.out.println("Rule 2.1: " +
            "letter -> LETTER letterP");
    }
letterP:
    letter letterP {
        System.out.println("Rule 2.2: " +
            "letterP -> letter letterP");
    }
    | /*NULL*/ {
        System.out.println("Rule 2.3: " +
            "letterP -> e");
    }

variableList: 
    varInitialization variableListP{
        System.out.println("Rule 9.1: " +
            "variableList -> varInitialization variableListP");
    }

variableListP: 
    COMMA varInitialization variableListP {
        System.out.println("Rule 9.2: " +
            "variableListP -> COMMA varInitialization variableListP");
    }
    | /*NULL*/ {
        System.out.println("Rule 9.3: " +
            "variableListP -> /*NULL*/");
    }


num:
    NUM numP {
        System.out.println("Rule 1.1: " +
            "num -> NUM numP");
    }
numP:
    num numP {
        System.out.println("Rule 1.2: " +
            "numP -> num numP");
    }
    | /*NULL*/ {
        System.out.println("Rule 1.3: " +
            "numP -> e");
    }

listOfParameters: 
    paramTypeList listOfParametersP {
        System.out.println("Rule 16.1: " +
            "listOfParameters -> paramTypeList listOfParametersP");
    }

listOfParametersP: 
    SEMICOLON paramTypeList listOfParametersP {
        System.out.println("Rule 16.2: " +
            "listOfParametersP -> SEMICOLON paramTypeList listOfParametersP");
    }
    | /*NULL*/ {
        System.out.println("Rule 16.3: " +
            "listOfParametersP -> /*NULL*/");
    }

phrase: 
    allExpression SEMICOLON {
        System.out.println("Rule 24.1: " +
            "phrase -> allExpression SEMICOLON");
    }
    | SEMICOLON {
        System.out.println("Rule 24.2: " +
            "phrase -> SEMICOLON");
    }

compoundPhrase: 
    LCB localDeclarations statementList RCB {
        System.out.println("Rule 22: " +
            "compoundPhrase -> LCB localDeclarations statementList RCB");
    }

selectPhrase: 
    IF_KW LP eachExpression RP selectPhraseP {
        System.out.println("Rule 25.1: " +
            "selectPhrase -> IF_KW LP eachExpression RP selectPhraseP");
    }

selectPhraseP: 
    ifBody {
        System.out.println("Rule 25.2: " +
            "selectPhraseP -> ifBody");
    }
    | LCB ifBody ifBody RCB {
        System.out.println("Rule 25.3: " +
            "selectPhraseP -> LCB ifBody ifBody RCB");
    } 

    
iterationPhrase: 
    TILL_KW LP eachExpression RP statement {
        System.out.println("Rule 27: " +
            "iterationPhrase -> TILL_KW LP eachExpression RP statement");
    }


returnPhrase: 
    COMEBACK_KW SEMICOLON {
        System.out.println("Rule 28.1: " +
            "returnPhrase -> COMEBACK_KW SEMICOLON");
    }
    | GIVEBACK_KW allExpression SEMICOLON {
        System.out.println("Rule 28.2: " +
            "returnPhrase -> GIVEBACK_KW allExpression SEMICOLON");
    } 
    | C_GIVEBACK_KW numOrletter SEMICOLON {
        System.out.println("Rule 28.3: " +
            "returnPhrase -> C_GIVEBACK_KW numOrlette SEMICOLON");
    }


continue: 
    CONTINUE_KW SEMICOLON {
        System.out.println("Rule 29: " +
            "continue -> CONTINUE_KW ;");
    }


varInitialization: 
    varForm varInitializationP {
        System.out.println("Rule 10.1: " +
            "varInitialization -> varForm varInitializationP");
    }

varInitializationP: 
    COLON LP eachExpression RP {
        System.out.println("Rule 10.2: " +
            "varInitializationP -> COLON LP eachExpression RP");
    }
    | /*NULL*/ {
        System.out.println("Rule 10.3: " +
            "varInitializationP -> /*NULL*/");
    }

paramTypeList: 
    type paramList {
        System.out.println("Rule 17: " +
            "paramTypeList -> type paramList");
    }


allExpression: 
    alterable allExpressionZ {
        System.out.println("Rule 30.1: " +
            "allExpression -> alterable allExpressionZ");
    }
    | eachExpression {
        System.out.println("Rule 30.2: " +
            "allExpression -> eachExpression");
    } 

allExpressionZ: 
    mathOp allExpressionP {
        System.out.println("Rule 30.5: " +
            "allExpressionZ -> mathOp allExpressionP");
    }
    | PLUSPLUS {
        System.out.println("Rule 30.6: " +
            "allExpressionZ -> PLUS_PLUS");
    } 
    | MINUSMINUS {
        System.out.println("Rule 30.7: " +
            "allExpressionZ -> MINUS_MINUS");
    }

allExpressionP: 
    allExpression {
        System.out.println("Rule 30.3: " +
            "allExpressionP -> allExpression");
    }
    | alterable {
        System.out.println("Rule 30.4: " +
            "allExpressionP -> alterable");
    } 




localDeclarations: 
    localDeclarationsP {
        System.out.println("Rule 19.1: " +
            "localDeclarations -> localDeclarationsP");
    }

localDeclarationsP: 
    ScopedVariableDec localDeclarationsP {
        System.out.println("Rule 19.2: " +
            "localDeclarationsP -> ScopedVariableDec localDeclarationsP");
    }
    | /*NULL*/ {
        System.out.println("Rule 19.3: " +
            "localDeclarationsP -> /*NULL*/");
    }  


statementList: 
    statementListP {
        System.out.println("Rule 23.1: " +
            "statementList -> statementListP");
    }

statementListP: 
    statement statementListP {
        System.out.println("Rule 23.2: " +
            "statementListP -> statement statementListP");
    }
    | /*NULL*/ {
        System.out.println("Rule 23.3: " +
            "statementListP -> /*NULL*/");
    }     


eachExpression: 
    logicOp eachExpression eachExpressionP {
        System.out.println("Rule 31.1: " +
            "eachExpression -> logicOp eachExpression eachExpressionP");
    }
    | relExpression eachExpressionP {
        System.out.println("Rule 31.2: " +
            "eachExpression -> relExpression eachExpressionP");
    } 

eachExpressionP: 
    logicOp eachExpressionZ {
        System.out.println("Rule 31.3: " +
            "eachExpressionP -> logicOp eachExpressionZ");
    }
    | /*NULL*/ {
        System.out.println("Rule 31.4: " +
            "eachExpressionP -> /*NULL*/");
    } 

eachExpressionZ: 
    eachExpression eachExpressionP {
        System.out.println("Rule 31.5: " +
            "eachExpressionZ -> eachExpression eachExpressionP");
    }
    | THEN_KW eachExpression eachExpressionP {
        System.out.println("Rule 31.6: " +
            "eachExpressionZ -> THEN_KW eachExpression eachExpressionP");
    } 
    | ELSE_KW eachExpression eachExpressionP {
        System.out.println("Rule 31.7: " +
            "eachExpressionZ -> ELSE_KW eachExpression eachExpressionP");
    }               

ScopedVariableDec: 
    scopedSpecifier  variableList SEMICOLON{
        System.out.println("Rule 8: " +
            "ScopedVariableDec -> scopedSpecifier  variableList SEMICOLON");
    }




varForm: 
    letter numOrletter varFormP {
        System.out.println("Rule 11.1: " +
            "varForm -> letter numOrletter varFormP");
    }

varFormP: 
    LB num RB {
        System.out.println("Rule 11.2: " +
            "varFormP -> LB num RB");
    }
    | /*NULL*/ {
        System.out.println("Rule 11.3: " +
            "varFormP -> /*NULL*/");
    }


scopedSpecifier: 
    STATIC_KW type {
        System.out.println("Rule 12.1: " +
            "scopedSpecifier -> static type");
    }
    | type {
        System.out.println("Rule 12.2: " +
            "scopedSpecifier -> type");
    }



paramList: 
    paramId paramListP {
        System.out.println("Rule 18.1: " +
            "paramList -> paramId paramListP");
    }

paramListP: 
    COMMA paramId paramListP {
        System.out.println("Rule 18.2: " +
            "paramListP -> COMMA paramId paramListP");
    }
    | /*NULL*/ {
        System.out.println("Rule 18.3: " +
            "paramListP -> /*NULL*/");
    }



paramId: 
    letter numOrletter paramIdP {
        System.out.println("Rule 20.1: " +
            "paramId -> letter numOrletter paramIdP");
    }

paramIdP: 
    LB RB {
        System.out.println("Rule 20.2: " +
            "paramIdP -> LB RB");
    }
    | /*NULL*/ {
        System.out.println("Rule 20.3: " +
            "paramIdP -> /*NULL*/");
    }    




ifBody: 
    statement ifBodyP {
        System.out.println("Rule 26.1: " +
            "ifBody -> statement ifBodyP");
    }
    | SEMICOLON {
        System.out.println("Rule 26.2: " +
            "ifBody -> SEMICOLON");
    }

ifBodyP: 
    OTHER_KW statement {
        System.out.println("Rule 26.3: " +
            "ifBodyP -> OTHER_KW statement");
    }
    | /*NULL*/ {
        System.out.println("Rule 26.4: " +
            "ifBodyP -> /*NULL*/");
    } 




relExpression: 
    mathEXP relExpressionP {
        System.out.println("Rule 32.1: " +
            "relExpression -> mathEXP relExpressionP");
    }
    

relExpressionP: 
    compareType mathEXP {
        System.out.println("Rule 32.2: " +
            "relExpressionP -> compareType mathEXP");
    }
    | /*NULL*/ {
        System.out.println("Rule 32.3: " +
            "relExpressionP -> /*NULL*/");
    } 


compareType: 
    equal {
        System.out.println("Rule 33.1: " +
            "compareType -> equal");
    }
    | nonEqual {
        System.out.println("Rule 33.2: " +
            "compareType -> nonEqual");
    }   


equal: 
    LE {
        System.out.println("Rule 34.1: " +
            "equal -> LE");
    }
    | GE {
        System.out.println("Rule 34.2: " +
            "equal -> GE");
    }   
    | EQUAL {
        System.out.println("Rule 34.3: " +
            "equal -> EQ");
    } 


nonEqual: 
    LT {
        System.out.println("Rule 34.1: " +
            "nonEqual -> LT");
    }
    | GT {
        System.out.println("Rule 34.2: " +
            "nonEqual -> GT");
    }   
    | NOT_EQUAL {
        System.out.println("Rule 34.3: " +
            "nonNOT_EQual -> NOT_EQ");
    }   


    
mathEXP: 
    unaryExpression mathEXPp {
        System.out.println("Rule 35.1: " +
            "mathEXP -> unaryExpression mathEXPp");
    }
    

mathEXPp: 
    ADD mathEXP mathEXPp {
        System.out.println("Rule 35.2: " +
            "mathEXPp -> ADD mathEXP mathEXPp");
    }
    | SUB mathEXP mathEXPp {
        System.out.println("Rule 35.2: " +
            "mathEXPp -> SUB mathEXP mathEXPp");
    }
    | MUL mathEXP mathEXPp {
        System.out.println("Rule 35.2: " +
            "mathEXPp -> MUL mathEXP mathEXPp");
    }
    | DIV mathEXP mathEXPp {
        System.out.println("Rule 35.2: " +
            "mathEXPp -> DIV mathEXP mathEXPp");
    }
    | MOD mathEXP mathEXPp {
        System.out.println("Rule 35.2: " +
            "mathEXPp -> MOD mathEXP mathEXPp");
    }
    | /*NULL*/ {
        System.out.println("Rule 35.3: " +
            "mathEXPp -> /*NULL*/");
    } 



// op: 
//  ADD {
//      System.out.println("Rule 36.1: " +
//          "op -> ADD");
//  }
//  | SUB {
//      System.out.println("Rule 36.2: " +
//          "op -> SUB");
//  }   
//  | MUL {
//      System.out.println("Rule 36.3: " +
//          "op -> MUL");
//  }
//  | DIV {
//      System.out.println("Rule 36.4: " +
//          "op -> DIV");
//  }   
//  | MOD {
//      System.out.println("Rule 36.5: " +
//          "op -> MOD");
//  }



unaryExpression: 
    SUB unaryExpression {
        System.out.println("Rule 37.1: " +
            "unaryExpression -> SUB unaryExpression");
    }
    | MUL unaryExpression {
        System.out.println("Rule 37.1: " +
            "unaryExpression -> MUL unaryExpression");
    }
    | QUEST unaryExpression {
        System.out.println("Rule 37.1: " +
            "unaryExpression -> Q_MARK unaryExpression");
    }
    | factor {
        System.out.println("Rule 37.2: " +
            "unaryExpression -> factor");
    }



// unaryop: 
//  UNARY_MINUS {
//      System.out.println("Rule 38.1: " +
//          "unaryop -> UNARY_MINUS");
//  }
//  | UNARY_MUL {
//      System.out.println("Rule 38.2: " +
//          "unaryop -> UNARY_MUL");
//  }   
//  | Q_MARK {
//      System.out.println("Rule 38.3: " +
//          "unaryop -> Q_MARK");
//  }


factor: 
    inalterable {
        System.out.println("Rule 38.1: " +
            "factor -> inalterable");
    }
    | alterable {
        System.out.println("Rule 38.2: " +
            "factor -> alterable");
    } 



alterable: 
    letter numOrletter alterableP {
        System.out.println("Rule 39.1: " +
            "alterable -> letter numOrletter alterableP");
    } 

alterableP: 
    alterableZ alterableP {
        System.out.println("Rule 39.2: " +
            "alterableP -> alterableZ alterableP");
    }
    | /*NULL*/ {
        System.out.println("Rule 39.3: " +
            "alterableP -> e");
    }
alterableZ: 
    LB allExpression RB {
        System.out.println("Rule 39.4: " +
            "alterableZ -> LB allExpression RB");
    }
    | DOT letter numOrletter {
        System.out.println("Rule 39.5: " +
            "alterableZ -> DOT letter numOrletter");
    } 

    
inalterable: 
    LP allExpression RP {
        System.out.println("Rule 40.1: " +
            "inalterable -> LP allExpression RP");
    }
    | constant {
        System.out.println("Rule 40.2: " +
            "inalterable -> constant");
    }   
    | letter numOrletter LP args RP {
        System.out.println("Rule 40.3: " +
            "inalterable -> letter numOrletter LP args RP");
    }


args: 
    arguments {
        System.out.println("Rule 41.1: " +
            "args -> arguments");
    }
    | /*NULL*/ {
        System.out.println("Rule 41.2: " +
            "args -> /*NULL*/");
    }


arguments: 
    allExpression argumentsP {
        System.out.println("Rule 42.1: " +
            "arguments -> allExpression argumentsP");
    }

argumentsP:
    COMMA allExpression argumentsP {
        System.out.println("Rule 42.2: " +
            "arguments -> COMMA allExpression argumentsP");
    }
    | /*NULL*/ {
        System.out.println("Rule 42.3: " +
            "arguments -> /*NULL*/");
    }


constant: 
    CONST_KW {
        System.out.println("Rule 43.1: " +
            "constant -> CONST_KW");
    }
    | TRUE_KW {
        System.out.println("Rule 43.2: " +
            "constant -> TRUE_KW");
    }   
    | FALSE_KW {
        System.out.println("Rule 43.3: " +
            "constant -> FALSE_KW");
    }

logicOp: 
    ANDAND {
        System.out.println("Rule 44.1: " +
            "logicOp -> ANDAND");
    }
    | OROR {
        System.out.println("Rule 44.2: " +
            "logicOp -> OROR");
    }   
    | TILDA {
        System.out.println("Rule 44.3: " +
            "logicOp -> TILDA");
    }
    | AND {
        System.out.println("Rule 44.4: " +
            "logicOp -> AND");
    }   
    | OR {
        System.out.println("Rule 44.5: " +
            "logicOp -> OR");
    }


mathOp: 
    ASSIGN {
        System.out.println("Rule 44.1: " +
            "mathOp -> ASSIGN");
    }
    | SUBE {
        System.out.println("Rule 44.2: " +
            "mathOp -> SUBE");
    }   
    | ADDE {
        System.out.println("Rule 44.3: " +
            "mathOp -> ADDE");
    }
    | MULE {
        System.out.println("Rule 44.4: " +
            "mathOp -> MULE");
    }   
    | DIVE {
        System.out.println("Rule 44.5: " +
            "mathOp -> DIVE");
    }