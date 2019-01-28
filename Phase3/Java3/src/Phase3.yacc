%{
  import java.io.*;
%}

%token LETTER WHITESPACE NUM SEMICOLON COLON COMMA LP RP LB RB LCB RCB DOT PLUSPLUS MINUSMINUS ASSIGN LE LT GE GT EQUAL NOT_EQUAL ADD SUB MUL DIV MOD ADDE SUBE MULE DIVE /* UPLUS UMUL */ QUEST ANDAND OROR TILDA AND OR STATIC_KW INTEGER_KW BOOLEAN_KW INT_KW CHAR_KW CHARACTER_KW BOOL_KW VOID_KW IF_KW THEN_KW ELSE_KW OTHER_KW TILL_KW COMEBACK_KW GIVEBACK_KW CONTINUE_KW CONST_KW TRUE_KW FALSE_KW COMMENT 


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

%%



num:
    NUM num2 {
        System.out.println("Rule 1.1: " +
            "num → NUM num2");
    }

num2:
    num num2 {
        System.out.println("Rule 12.1: " +
            "num2 → num num2");
    }
    |{
        System.out.println("Rule 12.2: " +
            "num2 → ϵ");
    }


letter:
    LETTER letter2 {
        System.out.println("Rule 2.1: " +
            "letter → LETTER letter2");
    }

letter2:
    letter letter2 {
        System.out.println("Rule 13.1: " +
            "letter2 → letter letter2");
    }
    |  {
        System.out.println("Rule 13.2: " +
            "letter2 → ϵ");
    }


numOrletter:
    num {
        System.out.println("Rule 3.1: " +
            "numOrletter → num");
    }
    | letter {
        System.out.println("Rule 3.2: " +
            "numOrletter → letter");
    } |
    {
        System.out.println("Rule 15.2: " +
            "numOrletter → ϵ");
    }


program:
    list {
        System.out.println("Rule 29.1: " +
            "program → list");
    }

list:
    declaration list2 {
        System.out.println("Rule 4.1: " +
            "list → declaration list2");
    }


listOfParameters:
    paramTypeList listOfParameters2 {
        System.out.println("Rule 5.1: " +
            "listOfParameters → paramTypeList listOfParameters2");
    }

paramList:
    paramId paramList2 {
        System.out.println("Rule 6.1: " +
            "paramList → paramId paramList2");
    }

localDeclarations:
     localDeclarations2 {
        System.out.println("Rule 7.1: " +
            "localDeclarations → ε localDeclarations2");
    }

statementList:
     statementList2 {
        System.out.println("Rule 8.1: " +
            "statementList → ε statementList2");
    }

mathEXP:
    unaryExpression mathEXP2 {
        System.out.println("Rule 10.1: " +
            "mathEXP → unaryExpression mathEXP2");
    }

arguments:
    allExpression arguments2 {
        System.out.println("Rule 11.1: " +
            "arguments → allExpression arguments2");
    }



list2:
    declaration list2 {
        System.out.println("Rule 15.1: " +
            "list2 → declaration list2");
    }
    | {
        System.out.println("Rule 15.2: " +
            "list2 → ϵ");
    }

listOfParameters2:
    SEMICOLON paramTypeList listOfParameters2 {
        System.out.println("Rule 16.1: " +
            "listOfParameters2 → ; paramTypeList listOfParameters2");
    }
    |  {
        System.out.println("Rule 16.2: " +
            "listOfParameters2 → ϵ");
    }

paramList2:
    COMMA paramId paramList2 {
        System.out.println("Rule 17.1: " +
            "paramList2 → , paramId paramList2");
    }
    |  {
        System.out.println("Rule 17.2: " +
            "paramList2 → ϵ");
    }

localDeclarations2:
    ScopedVariableDec localDeclarations2 {
        System.out.println("Rule 18.1: " +
            "localDeclarations2 → ScopedVariableDec localDeclarations2");
    }
    |  {
        System.out.println("Rule 18.2: " +
            "localDeclarations2 → ϵ");
    }

statementList2:
    statement statementList2 {
        System.out.println("Rule 19.1: " +
            "statementList2 → statement statementList2");
    }
    |  {
        System.out.println("Rule 19.2: " +
            "statementList2 → ϵ");
    }

mathEXP2:
    op mathEXP mathEXP2 {
        System.out.println("Rule 20.1: " +
            "mathEXP2 → op mathEXP mathEXP2");
    }
    |  {
        System.out.println("Rule 20.2: " +
            "mathEXP2 → ϵ");
    }

arguments2:
    COMMA allExpression arguments2 {
        System.out.println("Rule 21.1: " +
            "arguments2 → , allExpression arguments2");
    }
    |  {
        System.out.println("Rule 21.2: " +
            "arguments2 → ϵ");
    }


alterable:
    letter numOrletter alterable3 {
        System.out.println("Rule 25.1: " +
            "alterable → letter numOrletter alterable3");
    }

alterable2:
    LB allExpression RB {
        System.out.println("Rule 26.1: " +
            "alterable2 → [ allExpression ]");
    }
    | DOT letter numOrletter {
        System.out.println("Rule 26.2: " +
            "alterable2 → . letter numOrletter");
    }

alterable3:
    alterable2 alterable3 {
        System.out.println("Rule 28.1: " +
            "alterable3 → alterable2 alterable3");
    }
    |  {
        System.out.println("Rule 28.2: " +
            "alterable3 → ϵ");
    }


declaration:
    function  {
        System.out.println("Rule 30.1: " +
            "declaration → function ");
    }
    | varDeclaration {
        System.out.println("Rule 30.2: " +
            "declaration → varDeclaration");
    }

varDeclaration:
    type variableList SEMICOLON {
        System.out.println("Rule 31.1: " +
            "varDeclaration → type variableList;");
    }

ScopedVariableDec:
    scopedSpecifier  variableList SEMICOLON {
        System.out.println("Rule 32.1: " +
            "ScopedVariableDec → scopedSpecifier  variableList;");
    }

scopedSpecifier:
    STATIC_KW type  {
        System.out.println("Rule 33.1: " +
            "scopedSpecifier → static type ");
    }
    | type {
        System.out.println("Rule 33.2: " +
            "scopedSpecifier → type");
    }

type:
    BOOLEAN_KW  {
        System.out.println("Rule 34.1: " +
            "type → Boolean ");
    }
    | CHARACTER_KW  {
        System.out.println("Rule 34.2: " +
            "type → character ");
    }
    | INTEGER_KW  {
        System.out.println("Rule 34.3: " +
            "type → integer ");
    }
    | CHAR_KW  {
        System.out.println("Rule 34.4: " +
            "type → char ");
    }
    | BOOL_KW  {
        System.out.println("Rule 34.5: " +
            "type → bool ");
    }
    | INT_KW {
        System.out.println("Rule 34.6: " +
            "type → int");
    }

continue:
    CONTINUE_KW SEMICOLON {
        System.out.println("Rule 29: " +
            "continue → continue ;");
    }        

parameter:
    listOfParameters  {
        System.out.println("Rule 35.1: " +
            "parameter → listOfParameters ");
    }
    |  {
        System.out.println("Rule 35.2: " +
            "parameter → ε");
    }

paramTypeList:
    type paramList {
        System.out.println("Rule 36.1: " +
            "paramTypeList → type paramList");
    }

statement:
    phrase  {
        System.out.println("Rule 37.1: " +
            "statement → phrase ");
    }
    | compoundPhrase  {
        System.out.println("Rule 37.2: " +
            "statement → compoundPhrase ");
    }
    | selectPhrase  {
        System.out.println("Rule 37.3: " +
            "statement → selectPhrase ");
    }
    | iterationPhrase  {
        System.out.println("Rule 37.4: " +
            "statement → iterationPhrase ");
    }
    | returnPhrase  {
        System.out.println("Rule 37.5: " +
            "statement → returnPhrase ");
    }
    | continue {
        System.out.println("Rule 37.6: " +
            "statement → continue");
    }

compoundPhrase:
    LCB localDeclarations statementList RCB {
        System.out.println("Rule 38.1: " +
            "compoundPhrase → { localDeclarations statementList }");
    }

phrase:
    allExpression SEMICOLON  {
        System.out.println("Rule 39.1: " +
            "phrase → allExpression ; ");
    }
    | SEMICOLON {
        System.out.println("Rule 39.2: " +
            "phrase → ;");
    }

iterationPhrase:
    TILL_KW LP eachExpression RP statement {
        System.out.println("Rule 40.1: " +
            "iterationPhrase → till ( eachExpression ) statement");
    }

compareType:
    equal  {
        System.out.println("Rule 41.1: " +
            "compareType → equal ");
    }
    | nonEqual {
        System.out.println("Rule 41.2: " +
            "compareType → nonEqual");
    }

equal:
    LE {
        System.out.println("Rule 42.1: " +
            "equal → <=");
    }
    | GE {
        System.out.println("Rule 42.2: " +
            "equal → >=");
    }
    | EQUAL {
        System.out.println("Rule 42.3: " +
            "equal → ==");
    }

nonEqual:
    LT {
        System.out.println("Rule 43.1: " +
            "nonEqual → <");
    }
    | GT {
        System.out.println("Rule 43.2: " +
            "nonEqual → >");
    }
    | NOT_EQUAL {
        System.out.println("Rule 43.3: " +
            "nonEqual → !=");
    }

op:
    ADD {
        System.out.println("Rule 44.1: " +
            "op → +");
    }
    | SUB {
        System.out.println("Rule 44.2: " +
            "op → -");
    }
    | MUL {
        System.out.println("Rule 44.3: " +
            "op → *");
    }
    | DIV {
        System.out.println("Rule 44.4: " +
            "op → /");
    }
    | MOD {
        System.out.println("Rule 44.5: " +
            "op → %");
    }

unaryExpression:
    unaryop unaryExpression  {
        System.out.println("Rule 45.1: " +
            "unaryExpression → unaryop unaryExpression ");
    }
    | factor {
        System.out.println("Rule 45.2: " +
            "unaryExpression → factor");
    }

unaryop:
    SUB  {
        System.out.println("Rule 46.1: " +
            "unaryop → - ");
    }
    | MUL  {
        System.out.println("Rule 46.2: " +
            "unaryop → * ");
    }
    | QUEST {
        System.out.println("Rule 46.3: " +
            "unaryop → ?");
    }

factor:
    inalterable  {
        System.out.println("Rule 47.1: " +
            "factor → inalterable ");
    }
    | alterable {
        System.out.println("Rule 47.2: " +
            "factor → alterable");
    }

inalterable:
    LP allExpression RP  {
        System.out.println("Rule 48.1: " +
            "inalterable → ( allExpression ) ");
    }
    | constant  {
        System.out.println("Rule 48.2: " +
            "inalterable → constant ");
    }
    | letter numOrletter LP args RP {
        System.out.println("Rule 48.3: " +
            "inalterable → letter numOrletter ( args )");
    }

args:
    arguments  {
        System.out.println("Rule 49.1: " +
            "args → arguments ");
    }
    |  {
        System.out.println("Rule 49.2: " +
            "args → ε");
    }

constant:
    CONST_KW {
        System.out.println("Rule 50.1: " +
            "constant → CONST");
    }
    | TRUE_KW {
        System.out.println("Rule 50.2: " +
            "constant → true");
    }
    | FALSE_KW {
        System.out.println("Rule 50.3: " +
            "constant → false");
    }

logicOp:
    ANDAND {
        System.out.println("Rule 51.1: " +
            "logicOp → &&");
    }|
    AND {
        System.out.println("Rule 51.1: " +
            "logicOp → and");
    }|
    OR {
        System.out.println("Rule 51.1: " +
            "logicOp → or");
    }|
    TILDA {
        System.out.println("Rule 51.1: " +
            "logicOp → ~");
    }|
    OROR {
        System.out.println("Rule 51.1: " +
            "logicOp → ||");
    }



varInitialization:
    varForm varInitialization2 {
        System.out.println("Rule 52.1: " +
            "varInitialization → varForm varInitialization2");
    }

varInitialization2:
    COLON LP eachExpression RP {
        System.out.println("Rule 53.2: " +
            "varInitialization2 → : ( eachExpression )");
    } |
     {
        System.out.println("Rule 53.1: " +
            "varInitialization2 → ϵ");
    }

varForm:
    letter numOrletter varForm2 {
        System.out.println("Rule 56.1: " +
            "varForm → letter numOrletter varForm2");
    }

varForm2:
    LB num RB {
        System.out.println("Rule 57.1: " +
            "varForm2 → [ num ]");
    }
    |  {
        System.out.println("Rule 57.2: " +
            "varForm2 → ϵ");
    }

paramId:
    letter numOrletter paramId2 {
        System.out.println("Rule 58.1: " +
            "paramId → letter numOrletter paramId2");
    }

paramId2:
     {
        System.out.println("Rule 59.1: " +
            "paramId2 → ϵ");
    }
    | LB RB {
        System.out.println("Rule 59.2: " +
            "paramId2 → [ ]");
    }

selectPhrase:
    IF_KW LP eachExpression RP selectPhrase2 {
        System.out.println("Rule 60.1: " +
            "selectPhrase → if ( eachExpression ) selectPhrase2");
    }

selectPhrase2:
    ifBody {
        System.out.println("Rule 61.1: " +
            "selectPhrase2 → ifBody");
    }
    | LCB ifBody ifBody RCB {
        System.out.println("Rule 61.2: " +
            "selectPhrase2 → { ifBody ifBody }");
    }

ifBody:
    statement ifBody2 {
        System.out.println("Rule 62.1: " +
            "ifBody → statement ifBody2");
    }
    | SEMICOLON {
        System.out.println("Rule 62.2: " +
            "ifBody → ;");
    }

ifBody2:
    OTHER_KW statement {
        System.out.println("Rule 63.2: " +
            "ifBody2 → other statement");
    } |
     {
        System.out.println("Rule 63.1: " +
            "ifBody2 → ϵ");
    }

allExpression:
    alterable allExpression3 {
        System.out.println("Rule 64.1: " +
            "allExpression → alterable allExpression3");
    }
    | eachExpression {
        System.out.println("Rule 64.2: " +
            "allExpression → eachExpression");
    }

allExpression2:
    alterable allExpression4 {
        System.out.println("Rule 65.1: " +
            "allExpression2 → alterable allExpression");
    }
    | eachExpression {
        System.out.println("Rule 64.2: " +
            "allExpression2 → eachExpression");
    }

allExpression3:
    mathOp allExpression2 {
        System.out.println("Rule 66.1: " +
            "allExpression3 → mathOp allExpression2");
    }
    | PLUSPLUS {
        System.out.println("Rule 66.2: " +
            "allExpression3 → ++");
    }
    | MINUSMINUS {
        System.out.println("Rule 66.3: " +
            "allExpression3 → --");
    }

 allExpression4:
    allExpression3 {
        System.out.println("Rule 66.1: " +
            "allExpression4 → mathOp allExpression3");
    }

    
eachExpression:
    logicOp eachExpression eachExpression3 {
        System.out.println("Rule 67.1: " +
            "eachExpression -> logicOp eachExpression eachExpression3");
    }
    | relExpression eachExpression3{
        System.out.println("Rule 67.2: " +
            "eachExpression → relExpression eachExpression3");
    }

eachExpression2:
    logicOp eachExpression eachExpression3 {
        System.out.println("Rule 68.1: " +
            "eachExpression2 → logicOp eachExpression eachExpression3");
    }
    | relExpression eachExpression3 {
        System.out.println("Rule 68.2: " +
            "eachExpression2 → relExpression eachExpression3");
    }
    | THEN_KW eachExpression {
        System.out.println("Rule 68.2: " +
            "eachExpression2 → THEN_KW eachExpression");
    } |
    ELSE_KW eachExpression {
        System.out.println("Rule 68.2: " +
            "eachExpression2 → ELSE_KW eachExpression");
    }

eachExpression3:
    logicOp eachExpression2 eachExpression3 {
        System.out.println("Rule 69.1: " +
            "eachExpression3 → logicOp eachExpression2 eachExpression3");
    }
    |  {
        System.out.println("Rule 71.2: " +
            "relExpression2 → ϵ");
    }

relExpression:
    mathEXP relExpression2 {
        System.out.println("Rule 70.1: " +
            "relExpression → mathEXP relExpression2");
    }

relExpression2:
    compareType mathEXP {
        System.out.println("Rule 71.1: " +
            "relExpression2 → compareType mathEXP");
    }
    |  {
        System.out.println("Rule 71.2: " +
            "relExpression2 → ϵ");
    }

function:
    VOID_KW numOrletter LP parameter RP LCB statement RCB {
        System.out.println("Rule 14.1: " +
            "function → void numOrletter ( parameter ) {statement}");
    } |
    type letter numOrletter LP parameter RP statement{
        System.out.println("Rule 14.2: " +
            "function → type letter numOrletter ( parameter ) statement");
    }  
mathOp:
    ASSIGN {
        System.out.println("Rule 31.1: " +
            "mathOp → =");
    } |
    ADDE {
        System.out.println("Rule 31.2: " +
            "allExpression → ADDE");
    } |
    SUBE{
        System.out.println("Rule 31.3: " +
            "allExpression → SUBE");
    } |
    MULE {
        System.out.println("Rule 31.4: " +
            "allExpression → MULE");
    } |
    DIVE {
        System.out.println("Rule 31.5: " +
            "allExpression → DIVE");
    } 

returnPhrase:
    COMEBACK_KW SEMICOLON {
        System.out.println("Rule 28.1: " +
            "returnPhrase → comeback; ");
    } |
    GIVEBACK_KW allExpression SEMICOLON {
        System.out.println("Rule 28.2: " +
            "returnPhrase → giveback allExpression ;");
    } |
    GIVEBACK_KW numOrletter SEMICOLON {  //lette????
        System.out.println("Rule 28.2: " +
            "returnPhrase → giveback numOrletter ;");
    }

variableList:
    varInitialization variableList2  {
        System.out.println("Rule 9.1: " +
            "variableList -> varInitialization variableList2");
    }
    
variableList2:
    COMMA varInitialization variableList2 {
        System.out.println("Rule 9.1: " +
            "variableList2 → , varInitialization variableList2");
    } |
     {
        System.out.println("Rule 9.2: " +
            "variableList2 → ϵ ");
    }        
