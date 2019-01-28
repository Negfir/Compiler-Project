/* A Bison parser, made by GNU Bison 2.5.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java
   
      Copyright (C) 2007-2011 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */

/* Line 32 of lalr1.java  */
/* Line 1 of "ph2.yacc"  */

import java.io.*;
import java.util.ArrayList;


/**
 * A Bison parser, automatically generated from <tt>ph2.yacc</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class YYParser
{
  /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "2.5";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";


  /** True if verbose error messages are enabled.  */
  public boolean errorVerbose = false;



  /** Token returned by the scanner to signal the end of its input.  */
  public static final int EOF = 0;

  /* Tokens.  */
  /** Token number, to be returned by the scanner.  */
  public static final int LETTER = 258;
  /** Token number, to be returned by the scanner.  */
  public static final int C_GIVEBACK_KW = 259;
  /** Token number, to be returned by the scanner.  */
  public static final int NUM = 260;
  /** Token number, to be returned by the scanner.  */
  public static final int SEMICOLON = 261;
  /** Token number, to be returned by the scanner.  */
  public static final int COLON = 262;
  /** Token number, to be returned by the scanner.  */
  public static final int COMMA = 263;
  /** Token number, to be returned by the scanner.  */
  public static final int LP = 264;
  /** Token number, to be returned by the scanner.  */
  public static final int RP = 265;
  /** Token number, to be returned by the scanner.  */
  public static final int LB = 266;
  /** Token number, to be returned by the scanner.  */
  public static final int RB = 267;
  /** Token number, to be returned by the scanner.  */
  public static final int LCB = 268;
  /** Token number, to be returned by the scanner.  */
  public static final int RCB = 269;
  /** Token number, to be returned by the scanner.  */
  public static final int DOT = 270;
  /** Token number, to be returned by the scanner.  */
  public static final int PLUSPLUS = 271;
  /** Token number, to be returned by the scanner.  */
  public static final int MINMIN = 272;
  /** Token number, to be returned by the scanner.  */
  public static final int ASSIGN = 273;
  /** Token number, to be returned by the scanner.  */
  public static final int LE = 274;
  /** Token number, to be returned by the scanner.  */
  public static final int LT = 275;
  /** Token number, to be returned by the scanner.  */
  public static final int GE = 276;
  /** Token number, to be returned by the scanner.  */
  public static final int GT = 277;
  /** Token number, to be returned by the scanner.  */
  public static final int EQUAL = 278;
  /** Token number, to be returned by the scanner.  */
  public static final int NOT_EQUAL = 279;
  /** Token number, to be returned by the scanner.  */
  public static final int ADD = 280;
  /** Token number, to be returned by the scanner.  */
  public static final int SUB = 281;
  /** Token number, to be returned by the scanner.  */
  public static final int MUL = 282;
  /** Token number, to be returned by the scanner.  */
  public static final int DIV = 283;
  /** Token number, to be returned by the scanner.  */
  public static final int MOD = 284;
  /** Token number, to be returned by the scanner.  */
  public static final int ADD_EQ = 285;
  /** Token number, to be returned by the scanner.  */
  public static final int SUB_EQ = 286;
  /** Token number, to be returned by the scanner.  */
  public static final int MUL_EQ = 287;
  /** Token number, to be returned by the scanner.  */
  public static final int DIV_EQ = 288;
  /** Token number, to be returned by the scanner.  */
  public static final int QUEST = 289;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_LOG = 290;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_LOG = 291;
  /** Token number, to be returned by the scanner.  */
  public static final int TILDA = 292;
  /** Token number, to be returned by the scanner.  */
  public static final int AND = 293;
  /** Token number, to be returned by the scanner.  */
  public static final int OR = 294;
  /** Token number, to be returned by the scanner.  */
  public static final int STATIC_KW = 295;
  /** Token number, to be returned by the scanner.  */
  public static final int INTEGER_KW = 296;
  /** Token number, to be returned by the scanner.  */
  public static final int BOOLEAN_KW = 297;
  /** Token number, to be returned by the scanner.  */
  public static final int INT_KW = 298;
  /** Token number, to be returned by the scanner.  */
  public static final int CHAR_KW = 299;
  /** Token number, to be returned by the scanner.  */
  public static final int CHARACTER_KW = 300;
  /** Token number, to be returned by the scanner.  */
  public static final int BOOL_KW = 301;
  /** Token number, to be returned by the scanner.  */
  public static final int VOID_KW = 302;
  /** Token number, to be returned by the scanner.  */
  public static final int IF_KW = 303;
  /** Token number, to be returned by the scanner.  */
  public static final int THEN_KW = 304;
  /** Token number, to be returned by the scanner.  */
  public static final int ELSE_KW = 305;
  /** Token number, to be returned by the scanner.  */
  public static final int OTHER_KW = 306;
  /** Token number, to be returned by the scanner.  */
  public static final int TILL_KW = 307;
  /** Token number, to be returned by the scanner.  */
  public static final int COMEBACK_KW = 308;
  /** Token number, to be returned by the scanner.  */
  public static final int GIVEBACK_KW = 309;
  /** Token number, to be returned by the scanner.  */
  public static final int CONTINUE_KW = 310;
  /** Token number, to be returned by the scanner.  */
  public static final int CONST_KW = 311;
  /** Token number, to be returned by the scanner.  */
  public static final int TRUE_KW = 312;
  /** Token number, to be returned by the scanner.  */
  public static final int FALSE_KW = 313;
  /** Token number, to be returned by the scanner.  */
  public static final int COMMENT = 314;





  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>YYParser</tt>.
   */
  public interface Lexer {


    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.  */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token. */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     *
     * @param s The string for the error message.  */
    void yyerror (String s);
  }

  /** The object doing lexical analysis for us.  */
  private Lexer yylexer;





  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public YYParser (Lexer yylexer) {
    this.yylexer = yylexer;

  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  private final int yylex () throws java.io.IOException {
    return yylexer.yylex ();
  }
  protected final void yyerror (String s) {
    yylexer.yyerror (s);
  }



  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];

    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value			    ) {
      height++;
      if (size == height)
      {
        int[] newStateStack = new int[size * 2];
        System.arraycopy (stateStack, 0, newStateStack, 0, height);
        stateStack = newStateStack;


        Object[] newValueStack = new Object[size * 2];
        System.arraycopy (valueStack, 0, newValueStack, 0, height);
        valueStack = newValueStack;

        size *= 2;
      }

      stateStack[height] = state;

      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
        java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);

      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
      {
        out.print (' ');
        out.print (stateStack[i]);
      }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).  */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).  */
  public static final int YYABORT = 1;

  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.  */
  public static final int YYERROR = 2;

  // Internal return codes that are not supported for user semantic
  // actions.
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;

  private int yyerrstatus_ = 0;

  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.  */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  private int yyaction (int yyn, YYStack yystack, int yylen)
  {
    Object yyval;


    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);

    yy_reduce_print (yyn, yystack);

    switch (yyn)
    {
      case 2:
        if (yyn == 2)

          /* Line 351 of lalr1.java  */
          /* Line 66 of "ph2.yacc"  */
        {
          System.out.println("Rule 4: " +
                  "program -> list");
          //exportIntermediateCode();
        };
        break;


      case 3:
        if (yyn == 3)

          /* Line 351 of lalr1.java  */
          /* Line 72 of "ph2.yacc"  */
        {
          System.out.println("Rule 5.1: " +
                  "list -> declaration listp");
          exportIntermediateCode();
        };
        break;


      case 4:
        if (yyn == 4)

          /* Line 351 of lalr1.java  */
          /* Line 78 of "ph2.yacc"  */
        {
          System.out.println("Rule 5.2: " +
                  "listP -> declaration listP");
          //exportIntermediateCode();
        };
        break;


      case 5:
        if (yyn == 5)

          /* Line 351 of lalr1.java  */
          /* Line 82 of "ph2.yacc"  */
        {
          System.out.println("Rule 5.3: " +
                  "listP -> /*NULL*/");
         // exportIntermediateCode();
        };
        break;


      case 6:
        if (yyn == 6)

          /* Line 351 of lalr1.java  */
          /* Line 88 of "ph2.yacc"  */
        {
          System.out.println("Rule 6.1: " +
                  "declaration -> function");
        };
        break;


      case 7:
        if (yyn == 7)

          /* Line 351 of lalr1.java  */
          /* Line 92 of "ph2.yacc"  */
        {
          System.out.println("Rule 6.2: " +
                  "declaration -> varDeclaration");
          //exportIntermediateCode();
          try{
            yyval = new EVal();
            ((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
            ((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
            ((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
            ((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
            ((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;}
          catch (NullPointerException e){

          }
        };
        break;


      case 8:
        if (yyn == 8)

          /* Line 351 of lalr1.java  */
          /* Line 97 of "ph2.yacc"  */
        {
          System.out.println("Rule 14.1: " +
                  "function -> VOID_KW numOrletter LP parameter RP LCB statement RCB");
         // exportIntermediateCode();
        };
        break;


      case 9:
        if (yyn == 9)

          /* Line 351 of lalr1.java  */
          /* Line 101 of "ph2.yacc"  */
        {
          System.out.println("Rule 14.2: " +
                  "function -> type letter numOrletter LP parameter RP statement");
          try{
            yyval = new EVal();
            ((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
            ((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
            ((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
            ((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
            ((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;}
          catch (NullPointerException e){

          }
        };
        break;


      case 10:
        if (yyn == 10)

          /* Line 351 of lalr1.java  */
          /* Line 107 of "ph2.yacc"  */
        {
          System.out.println("Rule 7: " +
                  "varDeclaration -> type variableList SEMICOLON");
          try{
          yyval = new EVal();
          ((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
          ((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
          ((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
          ((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
          ((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;}
          catch (NullPointerException e){

          }
        };
        break;


      case 11:
        if (yyn == 11)

          /* Line 351 of lalr1.java  */
          /* Line 113 of "ph2.yacc"  */
        {
          System.out.println("Rule 3.1: " +
                  "numOrletter -> num");
        };
        break;


      case 12:
        if (yyn == 12)

          /* Line 351 of lalr1.java  */
          /* Line 117 of "ph2.yacc"  */
        {
          System.out.println("Rule 3.2: " +
                  "numOrletter -> letter");
        };
        break;


      case 13:
        if (yyn == 13)

          /* Line 351 of lalr1.java  */
          /* Line 121 of "ph2.yacc"  */
        {
          System.out.println("Rule 3.3: " +
                  "numOrletter -> /*NULL*/");
        };
        break;


      case 14:
        if (yyn == 14)

          /* Line 351 of lalr1.java  */
          /* Line 128 of "ph2.yacc"  */
        {
          System.out.println("Rule 15.1: " +
                  "parameter -> listOfParameters");
         // exportIntermediateCode();
        };
        break;


      case 15:
        if (yyn == 15)

          /* Line 351 of lalr1.java  */
          /* Line 132 of "ph2.yacc"  */
        {
          System.out.println("Rule 15.2: " +
                  "parameter -> /*NULL*/");
         // exportIntermediateCode();
        };
        break;


      case 16:
        if (yyn == 16)

          /* Line 351 of lalr1.java  */
          /* Line 138 of "ph2.yacc"  */
        {
          System.out.println("Rule 21.1: " +
                  "statement -> phrase");
        };
        break;


      case 17:
        if (yyn == 17)

          /* Line 351 of lalr1.java  */
          /* Line 142 of "ph2.yacc"  */
        {
          System.out.println("Rule 21.2: " +
                  "statement -> compoundPhrase");
        };
        break;


      case 18:
        if (yyn == 18)

          /* Line 351 of lalr1.java  */
          /* Line 146 of "ph2.yacc"  */
        {
          System.out.println("Rule 21.3: " +
                  "statement -> selectPhrase");
        };
        break;


      case 19:
        if (yyn == 19)

          /* Line 351 of lalr1.java  */
          /* Line 150 of "ph2.yacc"  */
        {
          System.out.println("Rule 21.4: " +
                  "statement -> iterationPhrase");
        };
        break;


      case 20:
        if (yyn == 20)

          /* Line 351 of lalr1.java  */
          /* Line 154 of "ph2.yacc"  */
        {
          System.out.println("Rule 21.5: " +
                  "statement -> returnPhrase");
        };
        break;


      case 21:
        if (yyn == 21)

          /* Line 351 of lalr1.java  */
          /* Line 158 of "ph2.yacc"  */
        {
          System.out.println("Rule 21.6: " +
                  "statement -> continue");
        };
        break;


      case 22:
        if (yyn == 22)

          /* Line 351 of lalr1.java  */
          /* Line 164 of "ph2.yacc"  */
        {
          System.out.println("Rule 13.1: " +
                  "type -> BOOLEAN_KW");
          yyval = new EVal();
          ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
          ((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
          ((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
          ((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
          ((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

          emit(":=", "'" + String.valueOf(lexChar) + "'", null, ((EVal)yyval).place);
          emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
          emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
        };
        break;


      case 23:
        if (yyn == 23)

          /* Line 351 of lalr1.java  */
          /* Line 168 of "ph2.yacc"  */
        {
          System.out.println("Rule 13.2: " +
                  "type -> CHARACTER_KW");
          yyval = new EVal();
          ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_CHAR, false);
          ((EVal)yyval).type = EVal.TYPE_CODE_CHAR;
          ((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
          ((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
          ((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

          emit(":=", "'" + String.valueOf(lexChar) + "'", null, ((EVal)yyval).place);
          emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
          emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
        };
        break;


      case 24:
        if (yyn == 24)

          /* Line 351 of lalr1.java  */
          /* Line 172 of "ph2.yacc"  */
        {
          System.out.println("Rule 13.3: " +
                  "type -> INTEGER_KW");
          yyval = new EVal();
          ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
          ((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
          ((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
          ((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
          ((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

          emit(":=", String.valueOf(lexInt), null, ((EVal)yyval).place);
          emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
          emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
        };
        break;


      case 25:
        if (yyn == 25)

          /* Line 351 of lalr1.java  */
          /* Line 176 of "ph2.yacc"  */
        {
          System.out.println("Rule 13.4: " +
                  "type -> CHAR_KW");
          yyval = new EVal();
          ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_CHAR, false);
          ((EVal)yyval).type = EVal.TYPE_CODE_CHAR;
          ((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
          ((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
          ((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

          emit(":=", "'" + String.valueOf(lexChar) + "'", null, ((EVal)yyval).place);
          emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
          emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
        };
        break;


      case 26:
        if (yyn == 26)

          /* Line 351 of lalr1.java  */
          /* Line 180 of "ph2.yacc"  */
        {
          System.out.println("Rule 13.5: " +
                  "type -> BOOL_KW");
          yyval = new EVal();
          ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
          ((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
          ((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
          ((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
          ((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

          emit(":=", "'" + String.valueOf(lexChar) + "'", null, ((EVal)yyval).place);
          emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
          emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
        };
        break;


      case 27:
        if (yyn == 27)

          /* Line 351 of lalr1.java  */
          /* Line 184 of "ph2.yacc"  */
        {
          System.out.println("Rule 13.6: " +
                  "type -> INT_KW");
          yyval = new EVal();
          ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
          ((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
          ((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
          ((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
          ((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

          emit(":=", String.valueOf(lexInt), null, ((EVal)yyval).place);
          emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
          emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
        };
        break;


      case 28:
        if (yyn == 28)

          /* Line 351 of lalr1.java  */
          /* Line 190 of "ph2.yacc"  */
        {
          System.out.println("Rule 2.1: " +
                  "letter -> LETTER letterP");
        };
        break;


      case 29:
        if (yyn == 29)

          /* Line 351 of lalr1.java  */
          /* Line 195 of "ph2.yacc"  */
        {
          System.out.println("Rule 2.2: " +
                  "letterP -> letter letterP");
        };
        break;


      case 30:
        if (yyn == 30)

          /* Line 351 of lalr1.java  */
          /* Line 199 of "ph2.yacc"  */
        {
          System.out.println("Rule 2.3: " +
                  "letterP -> e");
        };
        break;


      case 31:
        if (yyn == 31)

          /* Line 351 of lalr1.java  */
          /* Line 205 of "ph2.yacc"  */
        {
          System.out.println("Rule 9.1: " +
                  "variableList -> varInitialization variableListP");
        };
        break;


      case 32:
        if (yyn == 32)

          /* Line 351 of lalr1.java  */
          /* Line 211 of "ph2.yacc"  */
        {
          System.out.println("Rule 9.2: " +
                  "variableListP -> COMMA varInitialization variableListP");
        };
        break;


      case 33:
        if (yyn == 33)

          /* Line 351 of lalr1.java  */
          /* Line 215 of "ph2.yacc"  */
        {
          System.out.println("Rule 9.3: " +
                  "variableListP -> /*NULL*/");
        };
        break;


      case 34:
        if (yyn == 34)

          /* Line 351 of lalr1.java  */
          /* Line 222 of "ph2.yacc"  */
        {
          System.out.println("Rule 1.1: " +
                  "num -> NUM numP");
        };
        break;


      case 35:
        if (yyn == 35)

          /* Line 351 of lalr1.java  */
          /* Line 227 of "ph2.yacc"  */
        {
          System.out.println("Rule 1.2: " +
                  "numP -> num numP");
        };
        break;


      case 36:
        if (yyn == 36)

          /* Line 351 of lalr1.java  */
          /* Line 231 of "ph2.yacc"  */
        {
          System.out.println("Rule 1.3: " +
                  "numP -> e");
        };
        break;


      case 37:
        if (yyn == 37)

          /* Line 351 of lalr1.java  */
          /* Line 237 of "ph2.yacc"  */
        {
          System.out.println("Rule 16.1: " +
                  "listOfParameters -> paramTypeList listOfParametersP");
          try{
            yyval = new EVal();
            ((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
            ((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
            ((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
            ((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
            ((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;}
          catch (NullPointerException e){

          }
        };
        break;


      case 38:
        if (yyn == 38)

          /* Line 351 of lalr1.java  */
          /* Line 243 of "ph2.yacc"  */
        {
          System.out.println("Rule 16.2: " +
                  "listOfParametersP -> SEMICOLON paramTypeList listOfParametersP");
        };
        break;


      case 39:
        if (yyn == 39)

          /* Line 351 of lalr1.java  */
          /* Line 247 of "ph2.yacc"  */
        {
          System.out.println("Rule 16.3: " +
                  "listOfParametersP -> /*NULL*/");
        };
        break;


      case 40:
        if (yyn == 40)

          /* Line 351 of lalr1.java  */
          /* Line 253 of "ph2.yacc"  */
        {
          System.out.println("Rule 24.1: " +
                  "phrase -> allExpression SEMICOLON");
        };
        break;


      case 41:
        if (yyn == 41)

          /* Line 351 of lalr1.java  */
          /* Line 257 of "ph2.yacc"  */
        {
          System.out.println("Rule 24.2: " +
                  "phrase -> SEMICOLON");
        };
        break;


      case 42:
        if (yyn == 42)

          /* Line 351 of lalr1.java  */
          /* Line 263 of "ph2.yacc"  */
        {
          System.out.println("Rule 22: " +
                  "compoundPhrase -> LCB localDeclarations statementList RCB");
          //exportIntermediateCode();
        };
        break;


      case 43:
        if (yyn == 43)

          /* Line 351 of lalr1.java  */
          /* Line 269 of "ph2.yacc"  */
        {
          System.out.println("Rule 25.1: " +
                  "selectPhrase -> IF_KW LP eachExpression RP selectPhraseP");
        };
        break;


      case 44:
        if (yyn == 44)

          /* Line 351 of lalr1.java  */
          /* Line 275 of "ph2.yacc"  */
        {
          System.out.println("Rule 25.2: " +
                  "selectPhraseP -> ifBody");
        };
        break;


      case 45:
        if (yyn == 45)

          /* Line 351 of lalr1.java  */
          /* Line 279 of "ph2.yacc"  */
        {
          System.out.println("Rule 25.3: " +
                  "selectPhraseP -> LCB ifBody ifBody RCB");
        };
        break;


      case 46:
        if (yyn == 46)

          /* Line 351 of lalr1.java  */
          /* Line 286 of "ph2.yacc"  */
        {
          System.out.println("Rule 27: " +
                  "iterationPhrase -> TILL_KW LP eachExpression RP statement");
        };
        break;


      case 47:
        if (yyn == 47)

          /* Line 351 of lalr1.java  */
          /* Line 293 of "ph2.yacc"  */
        {
          System.out.println("Rule 28.1: " +
                  "returnPhrase -> COMEBACK_KW SEMICOLON");
        };
        break;


      case 48:
        if (yyn == 48)

          /* Line 351 of lalr1.java  */
          /* Line 297 of "ph2.yacc"  */
        {
          System.out.println("Rule 28.2: " +
                  "returnPhrase -> GIVEBACK_KW allExpression SEMICOLON");
        };
        break;


      case 49:
        if (yyn == 49)

          /* Line 351 of lalr1.java  */
          /* Line 301 of "ph2.yacc"  */
        {
          System.out.println("Rule 28.3: " +
                  "returnPhrase -> C_GIVEBACK_KW numOrlette SEMICOLON");
        };
        break;


      case 50:
        if (yyn == 50)

          /* Line 351 of lalr1.java  */
          /* Line 308 of "ph2.yacc"  */
        {
          System.out.println("Rule 29: " +
                  "continue -> CONTINUE_KW ;");
        };
        break;


      case 51:
        if (yyn == 51)

          /* Line 351 of lalr1.java  */
          /* Line 315 of "ph2.yacc"  */
        {
          System.out.println("Rule 10.1: " +
                  "varInitialization -> varForm varInitializationP");
        };
        break;


      case 52:
        if (yyn == 52)

          /* Line 351 of lalr1.java  */
          /* Line 321 of "ph2.yacc"  */
        {
          System.out.println("Rule 10.2: " +
                  "varInitializationP -> COLON LP eachExpression RP");
        };
        break;


      case 53:
        if (yyn == 53)

          /* Line 351 of lalr1.java  */
          /* Line 325 of "ph2.yacc"  */
        {
          System.out.println("Rule 10.3: " +
                  "varInitializationP -> /*NULL*/");
        };
        break;


      case 54:
        if (yyn == 54)

          /* Line 351 of lalr1.java  */
          /* Line 331 of "ph2.yacc"  */
        {
          System.out.println("Rule 17: " +
                  "paramTypeList -> type paramList");
          try{
            yyval = new EVal();
            ((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
            ((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
            ((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
            ((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
            ((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;}
          catch (NullPointerException e){

          }

        };
        break;


      case 55:
        if (yyn == 55)

          /* Line 351 of lalr1.java  */
          /* Line 338 of "ph2.yacc"  */
        {
          System.out.println("Rule 30.1: " +
                  "allExpression -> alterable allExpressionZ");
        };
        break;


      case 56:
        if (yyn == 56)

          /* Line 351 of lalr1.java  */
          /* Line 342 of "ph2.yacc"  */
        {
          System.out.println("Rule 30.2: " +
                  "allExpression -> eachExpression");
          yyval = new EVal();
          ((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
          ((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
          ((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
          ((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
          ((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
        };
        break;


      case 57:
        if (yyn == 57)

          /* Line 351 of lalr1.java  */
          /* Line 348 of "ph2.yacc"  */
        {
          System.out.println("Rule 30.5: " +
                  "allExpressionZ -> mathOp allExpressionP");

        };
        break;


      case 58:
        if (yyn == 58)

          /* Line 351 of lalr1.java  */
          /* Line 352 of "ph2.yacc"  */
        {
          System.out.println("Rule 30.6: " +
                  "allExpressionZ -> PLUS_PLUS");
        };
        break;


      case 59:
        if (yyn == 59)

          /* Line 351 of lalr1.java  */
          /* Line 356 of "ph2.yacc"  */
        {
          System.out.println("Rule 30.7: " +
                  "allExpressionZ -> MINUS_MINUS");
        };
        break;


      case 60:
        if (yyn == 60)

          /* Line 351 of lalr1.java  */
          /* Line 362 of "ph2.yacc"  */
        {
          System.out.println("Rule 30.3: " +
                  "allExpressionP -> allExpression");
        };
        break;


      case 61:
        if (yyn == 61)

          /* Line 351 of lalr1.java  */
          /* Line 366 of "ph2.yacc"  */
        {
          System.out.println("Rule 30.4: " +
                  "allExpressionP -> alterable");
        };
        break;


      case 62:
        if (yyn == 62)

          /* Line 351 of lalr1.java  */
          /* Line 375 of "ph2.yacc"  */
        {
          System.out.println("Rule 19.1: " +
                  "localDeclarations -> localDeclarationsP");
          //exportIntermediateCode();
        };
        break;


      case 63:
        if (yyn == 63)

          /* Line 351 of lalr1.java  */
          /* Line 381 of "ph2.yacc"  */
        {
          System.out.println("Rule 19.2: " +
                  "localDeclarationsP -> ScopedVariableDec localDeclarationsP");
          //exportIntermediateCode();
        };
        break;


      case 64:
        if (yyn == 64)

          /* Line 351 of lalr1.java  */
          /* Line 385 of "ph2.yacc"  */
        {
          System.out.println("Rule 19.3: " +
                  "localDeclarationsP -> /*NULL*/");
          //exportIntermediateCode();
        };
        break;


      case 65:
        if (yyn == 65)

          /* Line 351 of lalr1.java  */
          /* Line 392 of "ph2.yacc"  */
        {
          System.out.println("Rule 23.1: " +
                  "statementList -> statementListP");
        };
        break;


      case 66:
        if (yyn == 66)

          /* Line 351 of lalr1.java  */
          /* Line 398 of "ph2.yacc"  */
        {
          System.out.println("Rule 23.2: " +
                  "statementListP -> statement statementListP");
        };
        break;


      case 67:
        if (yyn == 67)

          /* Line 351 of lalr1.java  */
          /* Line 402 of "ph2.yacc"  */
        {
          System.out.println("Rule 23.3: " +
                  "statementListP -> /*NULL*/");
        };
        break;


      case 68:
        if (yyn == 68)

          /* Line 351 of lalr1.java  */
          /* Line 409 of "ph2.yacc"  */
        {
          System.out.println("Rule 31.1: " +
                  "eachExpression -> logicOp eachExpression eachExpressionP");
        };
        break;


      case 69:
        if (yyn == 69)

          /* Line 351 of lalr1.java  */
          /* Line 413 of "ph2.yacc"  */
        {
          System.out.println("Rule 31.2: " +
                  "eachExpression -> relExpression eachExpressionP");
        };
        break;


      case 70:
        if (yyn == 70)

          /* Line 351 of lalr1.java  */
          /* Line 419 of "ph2.yacc"  */
        {
          System.out.println("Rule 31.3: " +
                  "eachExpressionP -> logicOp eachExpressionZ");
        };
        break;


      case 71:
        if (yyn == 71)

          /* Line 351 of lalr1.java  */
          /* Line 423 of "ph2.yacc"  */
        {
          System.out.println("Rule 31.4: " +
                  "eachExpressionP -> /*NULL*/");
        };
        break;


      case 72:
        if (yyn == 72)

          /* Line 351 of lalr1.java  */
          /* Line 429 of "ph2.yacc"  */
        {
          System.out.println("Rule 31.5: " +
                  "eachExpressionZ -> eachExpression eachExpressionP");
        };
        break;


      case 73:
        if (yyn == 73)

          /* Line 351 of lalr1.java  */
          /* Line 433 of "ph2.yacc"  */
        {
          System.out.println("Rule 31.6: " +
                  "eachExpressionZ -> THEN_KW eachExpression eachExpressionP");
        };
        break;


      case 74:
        if (yyn == 74)

          /* Line 351 of lalr1.java  */
          /* Line 437 of "ph2.yacc"  */
        {
          System.out.println("Rule 31.7: " +
                  "eachExpressionZ -> ELSE_KW eachExpression eachExpressionP");
        };
        break;


      case 75:
        if (yyn == 75)

          /* Line 351 of lalr1.java  */
          /* Line 443 of "ph2.yacc"  */
        {
          System.out.println("Rule 8: " +
                  "ScopedVariableDec -> scopedSpecifier  variableList SEMICOLON");
        };
        break;


      case 76:
        if (yyn == 76)

          /* Line 351 of lalr1.java  */
          /* Line 452 of "ph2.yacc"  */
        {
          System.out.println("Rule 11.1: " +
                  "varForm -> letter numOrletter varFormP");
        };
        break;


      case 77:
        if (yyn == 77)

          /* Line 351 of lalr1.java  */
          /* Line 458 of "ph2.yacc"  */
        {
          System.out.println("Rule 11.2: " +
                  "varFormP -> LB num RB");
        };
        break;


      case 78:
        if (yyn == 78)

          /* Line 351 of lalr1.java  */
          /* Line 462 of "ph2.yacc"  */
        {
          System.out.println("Rule 11.3: " +
                  "varFormP -> /*NULL*/");
        };
        break;


      case 79:
        if (yyn == 79)

          /* Line 351 of lalr1.java  */
          /* Line 469 of "ph2.yacc"  */
        {
          System.out.println("Rule 12.1: " +
                  "scopedSpecifier -> static type");
          try{
            yyval = new EVal();
            ((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
            ((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
            ((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
            ((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
            ((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;}
          catch (NullPointerException e){

          }
        };
        break;


      case 80:
        if (yyn == 80)

          /* Line 351 of lalr1.java  */
          /* Line 473 of "ph2.yacc"  */
        {
          System.out.println("Rule 12.2: " +
                  "scopedSpecifier -> type");
          try{
            yyval = new EVal();
            ((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
            ((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
            ((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
            ((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
            ((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;}
          catch (NullPointerException e){

          }
        };
        break;


      case 81:
        if (yyn == 81)

          /* Line 351 of lalr1.java  */
          /* Line 481 of "ph2.yacc"  */
        {
          System.out.println("Rule 18.1: " +
                  "paramList -> paramId paramListP");
        };
        break;


      case 82:
        if (yyn == 82)

          /* Line 351 of lalr1.java  */
          /* Line 487 of "ph2.yacc"  */
        {
          System.out.println("Rule 18.2: " +
                  "paramListP -> COMMA paramId paramListP");
        };
        break;


      case 83:
        if (yyn == 83)

          /* Line 351 of lalr1.java  */
          /* Line 491 of "ph2.yacc"  */
        {
          System.out.println("Rule 18.3: " +
                  "paramListP -> /*NULL*/");
        };
        break;


      case 84:
        if (yyn == 84)

          /* Line 351 of lalr1.java  */
          /* Line 499 of "ph2.yacc"  */
        {
          System.out.println("Rule 20.1: " +
                  "paramId -> letter numOrletter paramIdP");
        };
        break;


      case 85:
        if (yyn == 85)

          /* Line 351 of lalr1.java  */
          /* Line 505 of "ph2.yacc"  */
        {
          System.out.println("Rule 20.2: " +
                  "paramIdP -> LB RB");
        };
        break;


      case 86:
        if (yyn == 86)

          /* Line 351 of lalr1.java  */
          /* Line 509 of "ph2.yacc"  */
        {
          System.out.println("Rule 20.3: " +
                  "paramIdP -> /*NULL*/");
        };
        break;


      case 87:
        if (yyn == 87)

          /* Line 351 of lalr1.java  */
          /* Line 518 of "ph2.yacc"  */
        {
          System.out.println("Rule 26.1: " +
                  "ifBody -> statement ifBodyP");
        };
        break;


      case 88:
        if (yyn == 88)

          /* Line 351 of lalr1.java  */
          /* Line 522 of "ph2.yacc"  */
        {
          System.out.println("Rule 26.2: " +
                  "ifBody -> SEMICOLON");
        };
        break;


      case 89:
        if (yyn == 89)

          /* Line 351 of lalr1.java  */
          /* Line 528 of "ph2.yacc"  */
        {
          System.out.println("Rule 26.3: " +
                  "ifBodyP -> OTHER_KW statement");
        };
        break;


      case 90:
        if (yyn == 90)

          /* Line 351 of lalr1.java  */
          /* Line 532 of "ph2.yacc"  */
        {
          System.out.println("Rule 26.4: " +
                  "ifBodyP -> /*NULL*/");
        };
        break;


      case 91:
        if (yyn == 91)

          /* Line 351 of lalr1.java  */
          /* Line 541 of "ph2.yacc"  */
        {
          System.out.println("Rule 32.1: " +
                  "relExpression -> mathEXP relExpressionP");
        };
        break;


      case 92:
        if (yyn == 92)

          /* Line 351 of lalr1.java  */
          /* Line 548 of "ph2.yacc"  */
        {
          System.out.println("Rule 32.2: " +
                  "relExpressionP -> compareType mathEXP");
        };
        break;


      case 93:
        if (yyn == 93)

          /* Line 351 of lalr1.java  */
          /* Line 552 of "ph2.yacc"  */
        {
          System.out.println("Rule 32.3: " +
                  "relExpressionP -> /*NULL*/");
        };
        break;


      case 94:
        if (yyn == 94)

          /* Line 351 of lalr1.java  */
          /* Line 559 of "ph2.yacc"  */
        {
          System.out.println("Rule 33.1: " +
                  "compareType -> equal");
        };
        break;


      case 95:
        if (yyn == 95)

          /* Line 351 of lalr1.java  */
          /* Line 563 of "ph2.yacc"  */
        {
          System.out.println("Rule 33.2: " +
                  "compareType -> nonEqual");
        };
        break;


      case 96:
        if (yyn == 96)

          /* Line 351 of lalr1.java  */
          /* Line 570 of "ph2.yacc"  */
        {
          System.out.println("Rule 34.1: " +
                  "equal -> LE");
        };
        break;


      case 97:
        if (yyn == 97)

          /* Line 351 of lalr1.java  */
          /* Line 574 of "ph2.yacc"  */
        {
          System.out.println("Rule 34.2: " +
                  "equal -> GE");
        };
        break;


      case 98:
        if (yyn == 98)

          /* Line 351 of lalr1.java  */
          /* Line 578 of "ph2.yacc"  */
        {
          System.out.println("Rule 34.3: " +
                  "equal -> EQ");
        };
        break;


      case 99:
        if (yyn == 99)

          /* Line 351 of lalr1.java  */
          /* Line 585 of "ph2.yacc"  */
        {
          System.out.println("Rule 34.1: " +
                  "nonEqual -> LT");
        };
        break;


      case 100:
        if (yyn == 100)

          /* Line 351 of lalr1.java  */
          /* Line 589 of "ph2.yacc"  */
        {
          System.out.println("Rule 34.2: " +
                  "nonEqual -> GT");
        };
        break;


      case 101:
        if (yyn == 101)

          /* Line 351 of lalr1.java  */
          /* Line 593 of "ph2.yacc"  */
        {
          System.out.println("Rule 34.3: " +
                  "nonNOT_EQual -> NOT_EQ");
        };
        break;


      case 102:
        if (yyn == 102)

          /* Line 351 of lalr1.java  */
          /* Line 601 of "ph2.yacc"  */
        {
          System.out.println("Rule 35.1: " +
                  "mathEXP -> unaryExpression mathEXPp");
        };
        break;


      case 103:
        if (yyn == 103)

          /* Line 351 of lalr1.java  */
          /* Line 608 of "ph2.yacc"  */
        {
          System.out.println("Rule 35.2: " +
                  "mathEXPp -> ADD mathEXP mathEXPp");
          try {
            if (((((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_CHAR || ((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_BOOLEAN)
                    && (((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_BOOLEAN))
                    || (((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_REAL && ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_REAL)) {
              yyval = new EVal();
              ((EVal) yyval).place = newTemp(((EVal) (yystack.valueAt(2 - (2)))).type, false);
              ((EVal) yyval).type = ((EVal) (yystack.valueAt(2 - (2)))).type;
              emit("+", ((EVal) (yystack.valueAt(2 - (2)))).place, ((EVal) (yystack.valueAt(2 - (2)))).place1, ((EVal) yyval).place);
            } else if ((((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_CHAR || ((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_BOOLEAN)
                    && ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_REAL) {
              yyval = new EVal();
              ((EVal) yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
              ((EVal) yyval).type = EVal.TYPE_CODE_REAL;
              String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
              emit("cast", ((EVal) (yystack.valueAt(2 - (2)))).place, TYPE_STRING_REAL, tmp);
              emit("+", tmp, ((EVal) (yystack.valueAt(2 - (2)))).place1, ((EVal) yyval).place);
            } else if (((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_REAL
                    && (((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_BOOLEAN)) {
              yyval = new EVal();
              ((EVal) yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
              ((EVal) yyval).type = EVal.TYPE_CODE_REAL;
              String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
              emit("cast", ((EVal) (yystack.valueAt(2 - (2)))).place1, TYPE_STRING_REAL, tmp);
              emit("+", ((EVal) (yystack.valueAt(2 - (2)))).place, tmp, ((EVal) yyval).place);
            } else {
              System.err.println("Error! Invalid type for \"+\" operation.");
              return YYABORT;
            }
          }catch (NullPointerException e){

            }
        };
        break;


      case 104:
        if (yyn == 104)

          /* Line 351 of lalr1.java  */
          /* Line 612 of "ph2.yacc"  */
        {
          System.out.println("Rule 35.2: " +
                  "mathEXPp -> SUB mathEXP mathEXPp");
          try{
          if(((((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_BOOLEAN)
                  && (((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_BOOLEAN))
                  || (((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_REAL)) {
            yyval = new EVal();
            ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (2-(2)))).type, false);
            ((EVal)yyval).type = ((EVal)(yystack.valueAt (2-(2)))).type;
            emit("-", ((EVal)(yystack.valueAt (2-(2)))).place, ((EVal)(yystack.valueAt (2-(2)))).place1, ((EVal)yyval).place);
          } else if((((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_BOOLEAN)
                  && ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_REAL) {
            yyval = new EVal();
            ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
            ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
            String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
            emit("cast", ((EVal)(yystack.valueAt (2-(2)))).place, TYPE_STRING_REAL, tmp);
            emit("-", tmp, ((EVal)(yystack.valueAt (2-(2)))).place1, ((EVal)yyval).place);
          } else if(((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_REAL
                  && (((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_BOOLEAN)) {
            yyval = new EVal();
            ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
            ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
            String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
            emit("cast", ((EVal)(yystack.valueAt (2-(2)))).place1, TYPE_STRING_REAL, tmp);
            emit("-", ((EVal)(yystack.valueAt (2-(2)))).place, tmp, ((EVal)yyval).place);
          } else {
            System.err.println("Error! Invalid type for \"+\" operation.");
            return YYABORT;
          }
          }catch (NullPointerException e){

          }
        };
        break;


      case 105:
        if (yyn == 105)

          /* Line 351 of lalr1.java  */
          /* Line 616 of "ph2.yacc"  */
        {
          System.out.println("Rule 35.2: " +
                  "mathEXPp -> MUL mathEXP mathEXPp");
          try {

            if (((((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_CHAR || ((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_BOOLEAN)
                    && (((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_BOOLEAN))
                    || (((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_REAL && ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_REAL)) {
              yyval = new EVal();
              ((EVal) yyval).place = newTemp(((EVal) (yystack.valueAt(2 - (2)))).type, false);
              ((EVal) yyval).type = ((EVal) (yystack.valueAt(2 - (2)))).type;
              emit("*", ((EVal) (yystack.valueAt(2 - (2)))).place, ((EVal) (yystack.valueAt(2 - (2)))).place1, ((EVal) yyval).place);
            } else if ((((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_CHAR || ((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_BOOLEAN)
                    && ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_REAL) {
              yyval = new EVal();
              ((EVal) yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
              ((EVal) yyval).type = EVal.TYPE_CODE_REAL;
              String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
              emit("cast", ((EVal) (yystack.valueAt(2 - (2)))).place, TYPE_STRING_REAL, tmp);
              emit("*", tmp, ((EVal) (yystack.valueAt(2 - (2)))).place1, ((EVal) yyval).place);
            } else if (((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_REAL
                    && (((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_BOOLEAN)) {
              yyval = new EVal();
              ((EVal) yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
              ((EVal) yyval).type = EVal.TYPE_CODE_REAL;
              String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
              emit("cast", ((EVal) (yystack.valueAt(2 - (2)))).place1, TYPE_STRING_REAL, tmp);
              emit("*", ((EVal) (yystack.valueAt(2 - (2)))).place, tmp, ((EVal) yyval).place);
            } else {
              System.err.println("Error! Invalid type for \"+\" operation.");
              return YYABORT;
            }
          }
          catch (NullPointerException e){

          }
        };
        break;


      case 106:
        if (yyn == 106)

          /* Line 351 of lalr1.java  */
          /* Line 620 of "ph2.yacc"  */
        {
          System.out.println("Rule 35.2: " +
                  "mathEXPp -> DIV mathEXP mathEXPp");
          try{
          if(((((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_BOOLEAN)
                  && (((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_BOOLEAN))
                  || (((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_REAL)) {
            yyval = new EVal();
            ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (2-(2)))).type, false);
            ((EVal)yyval).type = ((EVal)(yystack.valueAt (2-(2)))).type;
            emit("/", ((EVal)(yystack.valueAt (2-(2)))).place, ((EVal)(yystack.valueAt (2-(2)))).place1, ((EVal)yyval).place);
          } else if((((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_BOOLEAN)
                  && ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_REAL) {
            yyval = new EVal();
            ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
            ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
            String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
            emit("cast", ((EVal)(yystack.valueAt (2-(2)))).place, TYPE_STRING_REAL, tmp);
            emit("/", tmp, ((EVal)(yystack.valueAt (2-(2)))).place1, ((EVal)yyval).place);
          } else if(((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_REAL
                  && (((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_BOOLEAN)) {
            yyval = new EVal();
            ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
            ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
            String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
            emit("cast", ((EVal)(yystack.valueAt (2-(2)))).place1, TYPE_STRING_REAL, tmp);
            emit("/", ((EVal)(yystack.valueAt (2-(2)))).place, tmp, ((EVal)yyval).place);
          } else {
            System.err.println("Error! Invalid type for \"+\" operation.");
            return YYABORT;
          }
          }catch (NullPointerException e){

          }
        };
        break;


      case 107:
        if (yyn == 107)

          /* Line 351 of lalr1.java  */
          /* Line 624 of "ph2.yacc"  */
        {
          System.out.println("Rule 35.2: " +
                  "mathEXPp -> MOD mathEXP mathEXPp");
          if(((((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_BOOLEAN)
                  && (((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_BOOLEAN))
                  || (((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_REAL)) {
            yyval = new EVal();
            ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (2-(2)))).type, false);
            ((EVal)yyval).type = ((EVal)(yystack.valueAt (2-(2)))).type;
            emit("%", ((EVal)(yystack.valueAt (2-(2)))).place, ((EVal)(yystack.valueAt (2-(2)))).place1, ((EVal)yyval).place);
          } else if((((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_BOOLEAN)
                  && ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_REAL) {
            yyval = new EVal();
            ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
            ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
            String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
            emit("cast", ((EVal)(yystack.valueAt (2-(2)))).place, TYPE_STRING_REAL, tmp);
            emit("%", tmp, ((EVal)(yystack.valueAt (2-(2)))).place1, ((EVal)yyval).place);
          } else if(((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_REAL
                  && (((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_BOOLEAN)) {
            yyval = new EVal();
            ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
            ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
            String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
            emit("cast", ((EVal)(yystack.valueAt (2-(2)))).place1, TYPE_STRING_REAL, tmp);
            emit("%", ((EVal)(yystack.valueAt (2-(2)))).place, tmp, ((EVal)yyval).place);
          } else {
            System.err.println("Error! Invalid type for \"+\" operation.");
            return YYABORT;
          }
        };
        break;


      case 108:
        if (yyn == 108)

          /* Line 351 of lalr1.java  */
          /* Line 628 of "ph2.yacc"  */
        {
          System.out.println("Rule 35.3: " +
                  "mathEXPp -> /*NULL*/");
        };
        break;


      case 109:
        if (yyn == 109)

          /* Line 351 of lalr1.java  */
          /* Line 660 of "ph2.yacc"  */
        {
          System.out.println("Rule 37.1: " +
                  "unaryExpression -> SUB unaryExpression");
          yyval = new EVal();
          ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (2-(2)))).type, false);
          ((EVal)yyval).type = ((EVal)(yystack.valueAt (2-(2)))).type;
          emit("SUB", ((EVal)(yystack.valueAt (2-(2)))).place, null, ((EVal)yyval).place);
        };
        break;


      case 110:
        if (yyn == 110)

          /* Line 351 of lalr1.java  */
          /* Line 664 of "ph2.yacc"  */
        {
          System.out.println("Rule 37.1: " +
                  "unaryExpression -> MUL unaryExpression");
          try {
            yyval = new EVal();
            ((EVal) yyval).place = newTemp(((EVal) (yystack.valueAt(2 - (2)))).type, false);
            ((EVal) yyval).type = ((EVal) (yystack.valueAt(2 - (2)))).type;
            emit("MUL", ((EVal) (yystack.valueAt(2 - (2)))).place, null, ((EVal) yyval).place);
          }
          catch (NullPointerException e){}
          };
        break;


      case 111:
        if (yyn == 111)

          /* Line 351 of lalr1.java  */
          /* Line 668 of "ph2.yacc"  */ {
          System.out.println("Rule 37.1: " +
                  "unaryExpression -> Q_MARK unaryExpression");
          try {
            yyval = new EVal();
            ((EVal) yyval).place = newTemp(((EVal) (yystack.valueAt(2 - (2)))).type, false);
            ((EVal) yyval).type = ((EVal) (yystack.valueAt(2 - (2)))).type;
            emit("QUEST", ((EVal) (yystack.valueAt(2 - (2)))).place, null, ((EVal) yyval).place);
          }
          catch(NullPointerException e){}
          } ;
          break;


      case 112:
        if (yyn == 112)

          /* Line 351 of lalr1.java  */
          /* Line 672 of "ph2.yacc"  */
        {
          System.out.println("Rule 37.2: " +
                  "unaryExpression -> factor");
        };
        break;


      case 113:
        if (yyn == 113)

          /* Line 351 of lalr1.java  */
          /* Line 695 of "ph2.yacc"  */
        {
          System.out.println("Rule 38.1: " +
                  "factor -> inalterable");
        };
        break;


      case 114:
        if (yyn == 114)

          /* Line 351 of lalr1.java  */
          /* Line 699 of "ph2.yacc"  */
        {
          System.out.println("Rule 38.2: " +
                  "factor -> alterable");
        };
        break;


      case 115:
        if (yyn == 115)

          /* Line 351 of lalr1.java  */
          /* Line 707 of "ph2.yacc"  */
        {
          System.out.println("Rule 39.1: " +
                  "alterable -> letter numOrletter alterableP");
        };
        break;


      case 116:
        if (yyn == 116)

          /* Line 351 of lalr1.java  */
          /* Line 713 of "ph2.yacc"  */
        {
          System.out.println("Rule 39.2: " +
                  "alterableP -> alterableZ alterableP");
        };
        break;


      case 117:
        if (yyn == 117)

          /* Line 351 of lalr1.java  */
          /* Line 717 of "ph2.yacc"  */
        {
          System.out.println("Rule 39.3: " +
                  "alterableP -> e");
        };
        break;


      case 118:
        if (yyn == 118)

          /* Line 351 of lalr1.java  */
          /* Line 722 of "ph2.yacc"  */
        {
          System.out.println("Rule 39.4: " +
                  "alterableZ -> LB allExpression RB");
        };
        break;


      case 119:
        if (yyn == 119)

          /* Line 351 of lalr1.java  */
          /* Line 726 of "ph2.yacc"  */
        {
          System.out.println("Rule 39.5: " +
                  "alterableZ -> DOT letter numOrletter");
        };
        break;


      case 120:
        if (yyn == 120)

          /* Line 351 of lalr1.java  */
          /* Line 733 of "ph2.yacc"  */
        {
          System.out.println("Rule 40.1: " +
                  "inalterable -> LP allExpression RP");
        };
        break;


      case 121:
        if (yyn == 121)

          /* Line 351 of lalr1.java  */
          /* Line 737 of "ph2.yacc"  */
        {
          System.out.println("Rule 40.2: " +
                  "inalterable -> constant");
        };
        break;


      case 122:
        if (yyn == 122)

          /* Line 351 of lalr1.java  */
          /* Line 741 of "ph2.yacc"  */
        {
          System.out.println("Rule 40.3: " +
                  "inalterable -> letter numOrletter LP args RP");
        };
        break;


      case 123:
        if (yyn == 123)

          /* Line 351 of lalr1.java  */
          /* Line 748 of "ph2.yacc"  */
        {
          System.out.println("Rule 41.1: " +
                  "args -> arguments");
        };
        break;


      case 124:
        if (yyn == 124)

          /* Line 351 of lalr1.java  */
          /* Line 752 of "ph2.yacc"  */
        {
          System.out.println("Rule 41.2: " +
                  "args -> /*NULL*/");
        };
        break;


      case 125:
        if (yyn == 125)

          /* Line 351 of lalr1.java  */
          /* Line 759 of "ph2.yacc"  */
        {
          System.out.println("Rule 42.1: " +
                  "arguments -> allExpression argumentsP");
        };
        break;


      case 126:
        if (yyn == 126)

          /* Line 351 of lalr1.java  */
          /* Line 765 of "ph2.yacc"  */
        {
          System.out.println("Rule 42.2: " +
                  "arguments -> COMMA allExpression argumentsP");
        };
        break;


      case 127:
        if (yyn == 127)

          /* Line 351 of lalr1.java  */
          /* Line 769 of "ph2.yacc"  */
        {
          System.out.println("Rule 42.3: " +
                  "arguments -> /*NULL*/");
        };
        break;


      case 128:
        if (yyn == 128)

          /* Line 351 of lalr1.java  */
          /* Line 776 of "ph2.yacc"  */
        {
          System.out.println("Rule 43.1: " +
                  "constant -> CONST_KW");
        };
        break;


      case 129:
        if (yyn == 129)

          /* Line 351 of lalr1.java  */
          /* Line 780 of "ph2.yacc"  */
        {
          System.out.println("Rule 43.2: " +
                  "constant -> TRUE_KW");
        };
        break;


      case 130:
        if (yyn == 130)

          /* Line 351 of lalr1.java  */
          /* Line 784 of "ph2.yacc"  */
        {
          System.out.println("Rule 43.3: " +
                  "constant -> FALSE_KW");
        };
        break;


      case 131:
        if (yyn == 131)

          /* Line 351 of lalr1.java  */
          /* Line 790 of "ph2.yacc"  */
        {
          System.out.println("Rule 44.1: " +
                  "logicOp -> ANDAND");
        };
        break;


      case 132:
        if (yyn == 132)

          /* Line 351 of lalr1.java  */
          /* Line 794 of "ph2.yacc"  */
        {
          System.out.println("Rule 44.2: " +
                  "logicOp -> OROR");
        };
        break;


      case 133:
        if (yyn == 133)

          /* Line 351 of lalr1.java  */
          /* Line 798 of "ph2.yacc"  */
        {
          System.out.println("Rule 44.3: " +
                  "logicOp -> TILDA");
        };
        break;


      case 134:
        if (yyn == 134)

          /* Line 351 of lalr1.java  */
          /* Line 802 of "ph2.yacc"  */
        {
          System.out.println("Rule 44.4: " +
                  "logicOp -> AND");
        };
        break;


      case 135:
        if (yyn == 135)

          /* Line 351 of lalr1.java  */
          /* Line 806 of "ph2.yacc"  */
        {
          System.out.println("Rule 44.5: " +
                  "logicOp -> OR");
        };
        break;


      case 136:
        if (yyn == 136)

          /* Line 351 of lalr1.java  */
          /* Line 813 of "ph2.yacc"  */
        {
          System.out.println("Rule 44.1: " +
                  "mathOp -> ASSIGN");
        };
        break;


      case 137:
        if (yyn == 137)

          /* Line 351 of lalr1.java  */
          /* Line 817 of "ph2.yacc"  */ {
          System.out.println("Rule 44.2: " +
                  "mathOp -> SUBE");
          try {
          if (((((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_CHAR || ((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_BOOLEAN)
                  && (((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_BOOLEAN))
                  || (((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_REAL && ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_REAL)) {
            yyval = new EVal();
            ((EVal) yyval).place = newTemp(((EVal) (yystack.valueAt(2 - (2)))).type, false);
            ((EVal) yyval).type = ((EVal) (yystack.valueAt(2 - (2)))).type;
            emit("-", ((EVal) (yystack.valueAt(2 - (2)))).place, ((EVal) (yystack.valueAt(2 - (2)))).place1, ((EVal) yyval).place);
          } else if ((((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_CHAR || ((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_BOOLEAN)
                  && ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_REAL) {
            yyval = new EVal();
            ((EVal) yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
            ((EVal) yyval).type = EVal.TYPE_CODE_REAL;
            String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
            emit("cast", ((EVal) (yystack.valueAt(2 - (2)))).place, TYPE_STRING_REAL, tmp);
            emit("-", tmp, ((EVal) (yystack.valueAt(2 - (2)))).place1, ((EVal) yyval).place);
          } else if (((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_REAL
                  && (((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_BOOLEAN)) {
            yyval = new EVal();
            ((EVal) yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
            ((EVal) yyval).type = EVal.TYPE_CODE_REAL;
            String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
            emit("cast", ((EVal) (yystack.valueAt(2 - (2)))).place1, TYPE_STRING_REAL, tmp);
            emit("-", ((EVal) (yystack.valueAt(2 - (2)))).place, tmp, ((EVal) yyval).place);
          } else {
            System.err.println("Error! Invalid type for \"+\" operation.");
            return YYABORT;
          }
        }catch (NullPointerException e){}

        };
        break;


      case 138:
        if (yyn == 138)

          /* Line 351 of lalr1.java  */
          /* Line 821 of "ph2.yacc"  */
        {
          System.out.println("Rule 44.3: " +
                  "mathOp -> ADDE");
          try {

          if(((((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_BOOLEAN)
                  && (((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_BOOLEAN))
                  || (((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_REAL)) {
            yyval = new EVal();
            ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (2-(2)))).type, false);
            ((EVal)yyval).type = ((EVal)(yystack.valueAt (2-(2)))).type;
            emit("+", ((EVal)(yystack.valueAt (2-(2)))).place, ((EVal)(yystack.valueAt (2-(2)))).place1, ((EVal)yyval).place);
          } else if((((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_BOOLEAN)
                  && ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_REAL) {
            yyval = new EVal();
            ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
            ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
            String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
            emit("cast", ((EVal)(yystack.valueAt (2-(2)))).place, TYPE_STRING_REAL, tmp);
            emit("+", tmp, ((EVal)(yystack.valueAt (2-(2)))).place1, ((EVal)yyval).place);
          } else if(((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_REAL
                  && (((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_BOOLEAN)) {
            yyval = new EVal();
            ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
            ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
            String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
            emit("cast", ((EVal)(yystack.valueAt (2-(2)))).place1, TYPE_STRING_REAL, tmp);
            emit("+", ((EVal)(yystack.valueAt (2-(2)))).place, tmp, ((EVal)yyval).place);
          } else {
            System.err.println("Error! Invalid type for \"+\" operation.");
            return YYABORT;
          }
          }
          catch (NullPointerException e){}
        };
        break;


      case 139:
        if (yyn == 139)

          /* Line 351 of lalr1.java  */
          /* Line 825 of "ph2.yacc"  */
        {
          System.out.println("Rule 44.4: " +
                  "mathOp -> MULE");
          try{
          if(((((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_BOOLEAN)
                  && (((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_BOOLEAN))
                  || (((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_REAL)) {
            yyval = new EVal();
            ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (2-(2)))).type, false);
            ((EVal)yyval).type = ((EVal)(yystack.valueAt (2-(2)))).type;
            emit("*", ((EVal)(yystack.valueAt (2-(2)))).place, ((EVal)(yystack.valueAt (2-(2)))).place1, ((EVal)yyval).place);
          } else if((((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_BOOLEAN)
                  && ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_REAL) {
            yyval = new EVal();
            ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
            ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
            String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
            emit("cast", ((EVal)(yystack.valueAt (2-(2)))).place, TYPE_STRING_REAL, tmp);
            emit("*", tmp, ((EVal)(yystack.valueAt (2-(2)))).place1, ((EVal)yyval).place);
          } else if(((EVal)(yystack.valueAt (2-(2)))).type == EVal.TYPE_CODE_REAL
                  && (((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(2)))).type1 == EVal.TYPE_CODE_BOOLEAN)) {
            yyval = new EVal();
            ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
            ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
            String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
            emit("cast", ((EVal)(yystack.valueAt (2-(2)))).place1, TYPE_STRING_REAL, tmp);
            emit("*", ((EVal)(yystack.valueAt (2-(2)))).place, tmp, ((EVal)yyval).place);
          } else {
            System.err.println("Error! Invalid type for \"+\" operation.");
            return YYABORT;
          }
        }
        catch(NullPointerException e){}
        };
        break;


      case 140:
        if (yyn == 140)

          /* Line 351 of lalr1.java  */
          /* Line 829 of "ph2.yacc"  */ {
          System.out.println("Rule 44.5: " +
                  "mathOp -> DIVE");
          try{
          if (((((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_CHAR || ((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_BOOLEAN)
                  && (((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_BOOLEAN))
                  || (((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_REAL && ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_REAL)) {
            yyval = new EVal();
            ((EVal) yyval).place = newTemp(((EVal) (yystack.valueAt(2 - (2)))).type, false);
            ((EVal) yyval).type = ((EVal) (yystack.valueAt(2 - (2)))).type;
            emit("/", ((EVal) (yystack.valueAt(2 - (2)))).place, ((EVal) (yystack.valueAt(2 - (2)))).place1, ((EVal) yyval).place);
          } else if ((((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_INTEGER || ((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_CHAR || ((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_BOOLEAN)
                  && ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_REAL) {
            yyval = new EVal();
            ((EVal) yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
            ((EVal) yyval).type = EVal.TYPE_CODE_REAL;
            String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
            emit("cast", ((EVal) (yystack.valueAt(2 - (2)))).place, TYPE_STRING_REAL, tmp);
            emit("/", tmp, ((EVal) (yystack.valueAt(2 - (2)))).place1, ((EVal) yyval).place);
          } else if (((EVal) (yystack.valueAt(2 - (2)))).type == EVal.TYPE_CODE_REAL
                  && (((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_INTEGER || ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_CHAR || ((EVal) (yystack.valueAt(2 - (2)))).type1 == EVal.TYPE_CODE_BOOLEAN)) {
            yyval = new EVal();
            ((EVal) yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
            ((EVal) yyval).type = EVal.TYPE_CODE_REAL;
            String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
            emit("cast", ((EVal) (yystack.valueAt(2 - (2)))).place1, TYPE_STRING_REAL, tmp);
            emit("/", ((EVal) (yystack.valueAt(2 - (2)))).place, tmp, ((EVal) yyval).place);
          } else {
            System.err.println("Error! Invalid type for \"+\" operation.");
            return YYABORT;
          }
        }
        catch(NullPointerException e){}
        };
        break;




      /* Line 351 of lalr1.java  */
      /* Line 2061 of "ph2.cacc"  */
      default: break;
    }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    yyn = yyr1_[yyn];
    int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
    if (0 <= yystate && yystate <= yylast_
            && yycheck_[yystate] == yystack.stateAt (0))
      yystate = yytable_[yystate];
    else
      yystate = yydefgoto_[yyn - yyntokens_];

    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }

  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  private final String yytnamerr_ (String yystr)
  {
    if (yystr.charAt (0) == '"')
    {
      StringBuffer yyr = new StringBuffer ();
      strip_quotes: for (int i = 1; i < yystr.length (); i++)
        switch (yystr.charAt (i))
        {
          case '\'':
          case ',':
            break strip_quotes;

          case '\\':
            if (yystr.charAt(++i) != '\\')
              break strip_quotes;
            /* Fall through.  */
          default:
            yyr.append (yystr.charAt (i));
            break;

          case '"':
            return yyr.toString ();
        }
    }
    else if (yystr.equals ("$end"))
      return "end of input";

    return yystr;
  }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
                                Object yyvaluep				 )
  {
    if (yydebug > 0)
      yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
              + yytname_[yytype] + " ("
              + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }

  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException
  {
    /// Lookahead and lookahead in internal form.
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;

    YYStack yystack = new YYStack ();

    /* Error handling.  */
    int yynerrs_ = 0;


    /// Semantic value of the lookahead.
    Object yylval = null;

    int yyresult;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;


    /* Initialize the stack.  */
    yystack.push (yystate, yylval);

    int label = YYNEWSTATE;
    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
	   pushed when we come here.  */
        case YYNEWSTATE:
          yycdebug ("Entering state " + yystate + "\n");
          if (yydebug > 0)
            yystack.print (yyDebugStream);

          /* Accept?  */
          if (yystate == yyfinal_)
            return true;

          /* Take a decision.  First try without lookahead.  */
          yyn = yypact_[yystate];
          if (yy_pact_value_is_default_ (yyn))
          {
            label = YYDEFAULT;
            break;
          }

          /* Read a lookahead token.  */
          if (yychar == yyempty_)
          {
            yycdebug ("Reading a token: ");
            yychar = yylex ();

            yylval = yylexer.getLVal ();
          }

          /* Convert token to internal form.  */
          if (yychar <= EOF)
          {
            yychar = yytoken = EOF;
            yycdebug ("Now at end of input.\n");
          }
          else
          {
            yytoken = yytranslate_ (yychar);
            yy_symbol_print ("Next token is", yytoken,
                    yylval);
          }

        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
          yyn += yytoken;
          if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
            label = YYDEFAULT;

            /* <= 0 means reduce or error.  */
          else if ((yyn = yytable_[yyn]) <= 0)
          {
            if (yy_table_value_is_error_ (yyn))
              label = YYERRLAB;
            else
            {
              yyn = -yyn;
              label = YYREDUCE;
            }
          }

          else
          {
            /* Shift the lookahead token.  */
            yy_symbol_print ("Shifting", yytoken,
                    yylval);

            /* Discard the token being shifted.  */
            yychar = yyempty_;

            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;

            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
          break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
        case YYDEFAULT:
          yyn = yydefact_[yystate];
          if (yyn == 0)
            label = YYERRLAB;
          else
            label = YYREDUCE;
          break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
        case YYREDUCE:
          yylen = yyr2_[yyn];
          label = yyaction (yyn, yystack, yylen);
          yystate = yystack.stateAt (0);
          break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
        case YYERRLAB:
          /* If not already recovering from an error, report this error.  */
          if (yyerrstatus_ == 0)
          {
            ++yynerrs_;
            if (yychar == yyempty_)
              yytoken = yyempty_;
            yyerror (yysyntax_error (yystate, yytoken));
          }


          if (yyerrstatus_ == 3)
          {
	    /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */

            if (yychar <= EOF)
            {
              /* Return failure if at end of input.  */
              if (yychar == EOF)
                return false;
            }
            else
              yychar = yyempty_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
          label = YYERRLAB1;
          break;

      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
        case YYERROR:


        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
          yystack.pop (yylen);
          yylen = 0;
          yystate = yystack.stateAt (0);
          label = YYERRLAB1;
          break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
        case YYERRLAB1:
          yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */

          for (;;)
          {
            yyn = yypact_[yystate];
            if (!yy_pact_value_is_default_ (yyn))
            {
              yyn += yyterror_;
              if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
              {
                yyn = yytable_[yyn];
                if (0 < yyn)
                  break;
              }
            }

            /* Pop the current state because it cannot handle the error token.  */
            if (yystack.height == 1)
              return false;


            yystack.pop ();
            yystate = yystack.stateAt (0);
            if (yydebug > 0)
              yystack.print (yyDebugStream);
          }



          /* Shift the error token.  */
          yy_symbol_print ("Shifting", yystos_[yyn],
                  yylval);

          yystate = yyn;
          yystack.push (yyn, yylval);
          label = YYNEWSTATE;
          break;

        /* Accept.  */
        case YYACCEPT:
          return true;

        /* Abort.  */
        case YYABORT:
          return false;
      }
  }

  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    if (errorVerbose)
    {
        /* There are many possibilities here to consider:
           - Assume YYFAIL is not used.  It's too flawed to consider.
             See
             <http://lists.gnu.org/archive/html/bison-patches/2009-12/msg00024.html>
             for details.  YYERROR is fine as it does not invoke this
             function.
           - If this state is a consistent state with a default action,
             then the only way this function was invoked is if the
             default action is an error action.  In that case, don't
             check for expected tokens because there are none.
           - The only way there can be no lookahead present (in tok) is
             if this state is a consistent state with a default action.
             Thus, detecting the absence of a lookahead is sufficient to
             determine that there is no unexpected or expected token to
             report.  In that case, just report a simple "syntax error".
           - Don't assume there isn't a lookahead just because this
             state is a consistent state with a default action.  There
             might have been a previous inconsistent state, consistent
             state with a non-default action, or user semantic action
             that manipulated yychar.  (However, yychar is currently out
             of scope during semantic actions.)
           - Of course, the expected token list depends on states to
             have correct lookahead information, and it depends on the
             parser not to perform extra reductions after fetching a
             lookahead from the scanner and before detecting a syntax
             error.  Thus, state merging (from LALR or IELR) and default
             reductions corrupt the expected token list.  However, the
             list is correct for canonical LR with one exception: it
             will still contain any token that will not be accepted due
             to an error action in a later state.
        */
      if (tok != yyempty_)
      {
        // FIXME: This method of building the message is not compatible
        // with internationalization.
        StringBuffer res =
                new StringBuffer ("syntax error, unexpected ");
        res.append (yytnamerr_ (yytname_[tok]));
        int yyn = yypact_[yystate];
        if (!yy_pact_value_is_default_ (yyn))
        {
                /* Start YYX at -YYN if negative to avoid negative
                   indexes in YYCHECK.  In other words, skip the first
                   -YYN actions for this state because they are default
                   actions.  */
          int yyxbegin = yyn < 0 ? -yyn : 0;
          /* Stay within bounds of both yycheck and yytname.  */
          int yychecklim = yylast_ - yyn + 1;
          int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
          int count = 0;
          for (int x = yyxbegin; x < yyxend; ++x)
            if (yycheck_[x + yyn] == x && x != yyterror_
                    && !yy_table_value_is_error_ (yytable_[x + yyn]))
              ++count;
          if (count < 5)
          {
            count = 0;
            for (int x = yyxbegin; x < yyxend; ++x)
              if (yycheck_[x + yyn] == x && x != yyterror_
                      && !yy_table_value_is_error_ (yytable_[x + yyn]))
              {
                res.append (count++ == 0 ? ", expecting " : " or ");
                res.append (yytnamerr_ (yytname_[x]));
              }
          }
        }
        return res.toString ();
      }
    }

    return "syntax error";
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yy_pact_value_is_default_ (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code> value indicates a syntax error.
   * @param yyvalue   the value to check
   */
  private static boolean yy_table_value_is_error_ (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
  private static final short yypact_ninf_ = -215;
  private static final short yypact_[] =
          {
                  141,  -215,  -215,  -215,  -215,  -215,  -215,    27,    13,  -215,
                  141,  -215,  -215,    15,    15,    32,    35,  -215,  -215,  -215,
                  -215,   141,    27,    41,    40,    45,    15,  -215,    32,  -215,
                  115,  -215,    29,  -215,    15,  -215,    44,  -215,  -215,  -215,
                  48,    15,  -215,    49,   115,    32,  -215,    27,    40,   372,
                  46,    27,  -215,    62,   115,  -215,    65,    64,    66,  -215,
                  372,    16,    16,    16,  -215,  -215,  -215,  -215,  -215,  -215,
                  -215,  -215,    27,    69,   210,   177,   227,  -215,  -215,  -215,
                  -215,   372,   224,    70,    15,  -215,    49,   224,  -215,    72,
                  -215,    95,  -215,  -215,  -215,    12,  -215,  -215,   335,  -215,
                  -215,  -215,  -215,  -215,  -215,  -215,    16,  -215,  -215,    16,
                  16,    16,    16,    16,  -215,   210,    27,  -215,   198,    71,
                  77,    81,   372,    86,    79,  -215,  -215,  -215,  -215,  -215,
                  -215,    88,    87,  -215,    62,  -215,  -215,  -215,  -215,  -215,
                  -215,  -215,  -215,  -215,  -215,  -215,   372,   372,   372,    15,
                  -215,     0,   372,   372,   210,  -215,  -215,   227,   227,   227,
                  227,   227,  -215,    94,   115,  -215,   224,  -215,   198,    15,
                  372,   372,  -215,    96,  -215,  -215,  -215,  -215,  -215,  -215,
                  -215,   370,    99,    93,  -215,    92,    27,  -215,   210,   210,
                  -215,  -215,  -215,  -215,  -215,  -215,  -215,  -215,   224,   100,
                  -215,  -215,   102,   106,   107,  -215,   372,  -215,  -215,  -215,
                  -215,  -215,  -215,  -215,  -215,  -215,   261,   224,    99,  -215,
                  168,    58,  -215,  -215,  -215,  -215,   298,   224,  -215,   104,
                  -215,  -215
          };

  /* YYDEFACT[S] -- default reduction number in state S.  Performed when
     YYTABLE doesn't specify something else to do.  Zero means the
     default is an error.  */
  private static final short yydefact_[] =
          {
                  0,    24,    22,    27,    25,    23,    26,    13,     0,     2,
                  5,     6,     7,     0,    30,    36,     0,    12,    11,     1,
                  3,     5,    13,     0,    33,    53,    30,    28,    36,    34,
                  15,     4,    78,    10,     0,    31,     0,    51,    29,    35,
                  0,     0,    14,    39,    15,     0,    76,    13,    33,     0,
                  0,    13,    54,    83,     0,    37,     0,     0,    78,    32,
                  0,     0,     0,     0,   131,   132,   133,   134,   135,   128,
                  129,   130,    13,     0,    71,    93,   108,   112,   114,   113,
                  121,     0,     0,    86,     0,    81,    39,     0,    77,     0,
                  56,   114,   109,   110,   111,   117,    52,    69,     0,    96,
                  99,    97,   100,    98,   101,    91,     0,    94,    95,     0,
                  0,     0,     0,     0,   102,    71,    13,    41,    64,     0,
                  0,     0,     0,     0,     0,    16,    17,    18,    19,    20,
                  21,     0,     0,    84,    83,    38,     9,   120,    58,    59,
                  136,   138,   137,   139,   140,    55,     0,   124,     0,     0,
                  115,   117,     0,     0,    71,    70,    92,   108,   108,   108,
                  108,   108,    68,     0,     0,    80,    67,    62,    64,     0,
                  0,     0,    47,     0,    50,     8,    40,    85,    82,    60,
                  57,   114,   127,     0,   123,     0,    13,   116,    71,    71,
                  72,   103,   104,   105,   106,   107,    49,    79,    67,     0,
                  65,    63,     0,     0,     0,    48,     0,   125,   122,   118,
                  119,    73,    74,    66,    42,    75,     0,     0,   127,    41,
                  64,    90,    43,    44,    46,   126,     0,     0,    87,     0,
                  89,    45
          };

  /* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] =
          {
                  -215,  -215,  -215,   101,   121,  -215,  -215,   -18,    85,   -65,
                  -30,    -6,   105,   -39,    84,    11,   108,  -215,    51,  -215,
                  -215,  -215,  -215,  -215,  -215,  -215,   110,  -215,    91,   -57,
                  -215,  -215,  -215,   -33,  -215,   -59,   -47,  -105,  -215,  -215,
                  -215,  -215,  -215,  -215,     7,    56,  -215,  -214,  -215,  -215,
                  -215,  -215,  -215,  -215,   -49,   132,     6,  -215,   -51,    -9,
                  -215,  -215,  -215,  -215,   -72,  -215,   -69,  -215
          };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final short
          yydefgoto_[] =
          {
                  -1,     8,     9,    20,    21,    11,    12,    16,    40,   221,
                  13,    72,    27,    23,    35,    18,    29,    42,    55,   125,
                  126,   127,   222,   128,   129,   130,    24,    37,    43,   131,
                  145,   180,   166,   167,   199,   200,    90,    97,   155,   168,
                  25,    46,   169,    52,    85,    53,   133,   223,   228,    74,
                  105,   106,   107,   108,    75,   114,    76,    77,    78,   150,
                  151,    79,   183,   184,   207,    80,    81,   146
          };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If YYTABLE_NINF_, syntax error.  */
  private static final short yytable_ninf_ = -62;
  private static final short
          yytable_[] =
          {
                  41,    17,    73,    89,    32,    98,   226,    22,    26,    91,
                  162,   148,   229,    19,    41,   149,    17,   124,    14,    14,
                  26,   147,   136,   148,    41,    60,    28,   149,    47,    58,
                  14,    91,    15,    83,   115,    51,    91,    15,    44,    28,
                  45,    17,    61,    62,    30,    17,    98,    33,    34,   190,
                  63,   154,    36,    49,    95,    54,    57,   156,    50,    82,
                  157,   158,   159,   160,   161,   173,    17,    92,    93,    94,
                  84,    91,    69,    70,    71,    87,    88,    45,    51,    96,
                  170,   132,   137,   211,   212,    98,   171,   172,   165,   179,
                  182,   185,   174,   175,   176,   181,    91,    91,   163,   177,
                  196,   198,   205,   208,   209,   188,   189,   206,   215,   227,
                  17,   138,   139,   140,   214,    91,   216,   217,   231,    98,
                  98,    10,    31,   203,   204,   141,   142,   143,   144,    56,
                  202,    38,    59,   198,   197,   201,    39,   135,   165,   213,
                  134,   178,   187,   186,    48,    86,   225,    91,     0,   218,
                  0,     0,   224,     0,     0,    91,     1,     2,     3,     4,
                  5,     6,   230,    47,     0,    91,    91,     0,   210,    91,
                  0,    14,   116,     0,   219,    91,    91,    60,     0,     0,
                  17,   118,     1,     2,     3,     4,     5,     6,     7,     0,
                  165,     0,     0,     0,    61,    62,    99,   100,   101,   102,
                  103,   104,    63,    64,    65,    66,    67,    68,   164,     1,
                  2,     3,     4,     5,     6,     0,   119,     0,     0,     0,
                  120,   121,   122,   123,    69,    70,    71,    14,   116,     0,
                  117,     0,     0,    60,     0,     0,     0,   118,   164,     1,
                  2,     3,     4,     5,     6,    64,    65,    66,    67,    68,
                  61,    62,   109,   110,   111,   112,   113,     0,    63,    64,
                  65,    66,    67,    68,    14,   116,     0,   219,     0,     0,
                  60,     0,   119,     0,   220,     0,   120,   121,   122,   123,
                  69,    70,    71,     0,     0,     0,     0,    61,    62,   191,
                  192,   193,   194,   195,     0,    63,    64,    65,    66,    67,
                  68,    14,   116,     0,   219,     0,     0,    60,     0,   119,
                  0,   118,     0,   120,   121,   122,   123,    69,    70,    71,
                  0,     0,     0,     0,    61,    62,     0,     0,     0,     0,
                  0,     0,    63,    64,    65,    66,    67,    68,    14,     0,
                  0,     0,     0,     0,    60,     0,   119,     0,     0,     0,
                  120,   121,   122,   123,    69,    70,    71,     0,     0,     0,
                  0,    61,    62,     0,     0,     0,     0,     0,     0,    63,
                  64,    65,    66,    67,    68,    14,   -61,     0,   -61,     0,
                  -61,    60,   -61,     0,   152,   153,   138,   139,   140,     0,
                  0,    69,    70,    71,     0,     0,     0,     0,    61,    62,
                  141,   142,   143,   144,     0,     0,    63,    64,    65,    66,
                  67,    68,     0,     0,     0,     0,     0,     0,     0,     0,
                  0,     0,     0,     0,     0,     0,     0,     0,    69,    70,
                  71
          };

  /* YYCHECK.  */
  private static final short
          yycheck_[] =
          {
                  30,     7,    49,    60,    22,    74,   220,    13,    14,    60,
                  115,    11,   226,     0,    44,    15,    22,    82,     3,     3,
                  26,     9,    87,    11,    54,     9,    15,    15,    34,    47,
                  3,    82,     5,    51,    81,    41,    87,     5,     9,    28,
                  11,    47,    26,    27,     9,    51,   115,     6,     8,   154,
                  34,    98,     7,     9,    72,     6,    45,   106,    10,    13,
                  109,   110,   111,   112,   113,   122,    72,    61,    62,    63,
                  8,   122,    56,    57,    58,    10,    12,    11,    84,    10,
                  9,    11,    10,   188,   189,   154,     9,     6,   118,   146,
                  147,   148,     6,    14,     6,   146,   147,   148,   116,    12,
                  6,   166,     6,    10,    12,   152,   153,     8,     6,    51,
                  116,    16,    17,    18,    14,   166,    10,    10,    14,   188,
                  189,     0,    21,   170,   171,    30,    31,    32,    33,    44,
                  169,    26,    48,   198,   164,   168,    28,    86,   168,   198,
                  84,   134,   151,   149,    34,    54,   218,   198,    -1,   206,
                  -1,    -1,   217,    -1,    -1,   206,    41,    42,    43,    44,
                  45,    46,   227,   169,    -1,   216,   217,    -1,   186,   220,
                  -1,     3,     4,    -1,     6,   226,   227,     9,    -1,    -1,
                  186,    13,    41,    42,    43,    44,    45,    46,    47,    -1,
                  220,    -1,    -1,    -1,    26,    27,    19,    20,    21,    22,
                  23,    24,    34,    35,    36,    37,    38,    39,    40,    41,
                  42,    43,    44,    45,    46,    -1,    48,    -1,    -1,    -1,
                  52,    53,    54,    55,    56,    57,    58,     3,     4,    -1,
                  6,    -1,    -1,     9,    -1,    -1,    -1,    13,    40,    41,
                  42,    43,    44,    45,    46,    35,    36,    37,    38,    39,
                  26,    27,    25,    26,    27,    28,    29,    -1,    34,    35,
                  36,    37,    38,    39,     3,     4,    -1,     6,    -1,    -1,
                  9,    -1,    48,    -1,    13,    -1,    52,    53,    54,    55,
                  56,    57,    58,    -1,    -1,    -1,    -1,    26,    27,   157,
                  158,   159,   160,   161,    -1,    34,    35,    36,    37,    38,
                  39,     3,     4,    -1,     6,    -1,    -1,     9,    -1,    48,
                  -1,    13,    -1,    52,    53,    54,    55,    56,    57,    58,
                  -1,    -1,    -1,    -1,    26,    27,    -1,    -1,    -1,    -1,
                  -1,    -1,    34,    35,    36,    37,    38,    39,     3,    -1,
                  -1,    -1,    -1,    -1,     9,    -1,    48,    -1,    -1,    -1,
                  52,    53,    54,    55,    56,    57,    58,    -1,    -1,    -1,
                  -1,    26,    27,    -1,    -1,    -1,    -1,    -1,    -1,    34,
                  35,    36,    37,    38,    39,     3,     6,    -1,     8,    -1,
                  10,     9,    12,    -1,    49,    50,    16,    17,    18,    -1,
                  -1,    56,    57,    58,    -1,    -1,    -1,    -1,    26,    27,
                  30,    31,    32,    33,    -1,    -1,    34,    35,    36,    37,
                  38,    39,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
                  -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    56,    57,
                  58
          };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
          yystos_[] =
          {
                  0,    41,    42,    43,    44,    45,    46,    47,    61,    62,
                  64,    65,    66,    70,     3,     5,    67,    71,    75,     0,
                  63,    64,    71,    73,    86,   100,    71,    72,    75,    76,
                  9,    63,    67,     6,     8,    74,     7,    87,    72,    76,
                  68,    70,    77,    88,     9,    11,   101,    71,    86,     9,
                  10,    71,   103,   105,     6,    78,    68,    75,    67,    74,
                  9,    26,    27,    34,    35,    36,    37,    38,    39,    56,
                  57,    58,    71,    96,   109,   114,   116,   117,   118,   121,
                  125,   126,    13,    67,     8,   104,    88,    10,    12,    89,
                  96,   118,   116,   116,   116,    67,    10,    97,   126,    19,
                  20,    21,    22,    23,    24,   110,   111,   112,   113,    25,
                  26,    27,    28,    29,   115,    96,     4,     6,    13,    48,
                  52,    53,    54,    55,    69,    79,    80,    81,    83,    84,
                  85,    89,    11,   106,   105,    78,    69,    10,    16,    17,
                  18,    30,    31,    32,    33,    90,   127,     9,    11,    15,
                  119,   120,    49,    50,    96,    98,   114,   114,   114,   114,
                  114,   114,    97,    67,    40,    70,    92,    93,    99,   102,
                  9,     9,     6,    89,     6,    14,     6,    12,   104,    89,
                  91,   118,    89,   122,   123,    89,    71,   119,    96,    96,
                  97,   115,   115,   115,   115,   115,     6,    70,    69,    94,
                  95,    93,    73,    96,    96,     6,     8,   124,    10,    12,
                  67,    97,    97,    95,    14,     6,    10,    10,    89,     6,
                  13,    69,    82,   107,    69,   124,   107,    51,   108,   107,
                  69,    14
          };

  /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
     to YYLEX-NUM.  */
  private static final short
          yytoken_number_[] =
          {
                  0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
                  265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
                  275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
                  285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
                  295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
                  305,   306,   307,   308,   309,   310,   311,   312,   313,   314
          };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte
          yyr1_[] =
          {
                  0,    60,    61,    62,    63,    63,    64,    64,    65,    65,
                  66,    67,    67,    67,    68,    68,    69,    69,    69,    69,
                  69,    69,    70,    70,    70,    70,    70,    70,    71,    72,
                  72,    73,    74,    74,    75,    76,    76,    77,    78,    78,
                  79,    79,    80,    81,    82,    82,    83,    84,    84,    84,
                  85,    86,    87,    87,    88,    89,    89,    90,    90,    90,
                  91,    91,    92,    93,    93,    94,    95,    95,    96,    96,
                  97,    97,    98,    98,    98,    99,   100,   101,   101,   102,
                  102,   103,   104,   104,   105,   106,   106,   107,   107,   108,
                  108,   109,   110,   110,   111,   111,   112,   112,   112,   113,
                  113,   113,   114,   115,   115,   115,   115,   115,   115,   116,
                  116,   116,   116,   117,   117,   118,   119,   119,   120,   120,
                  121,   121,   121,   122,   122,   123,   124,   124,   125,   125,
                  125,   126,   126,   126,   126,   126,   127,   127,   127,   127,
                  127
          };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
          yyr2_[] =
          {
                  0,     2,     1,     2,     2,     0,     1,     1,     8,     7,
                  3,     1,     1,     0,     1,     0,     1,     1,     1,     1,
                  1,     1,     1,     1,     1,     1,     1,     1,     2,     2,
                  0,     2,     3,     0,     2,     2,     0,     2,     3,     0,
                  2,     1,     4,     5,     1,     4,     5,     2,     3,     3,
                  2,     2,     4,     0,     2,     2,     1,     2,     1,     1,
                  1,     1,     1,     2,     0,     1,     2,     0,     3,     2,
                  2,     0,     2,     3,     3,     3,     3,     3,     0,     2,
                  1,     2,     3,     0,     3,     2,     0,     2,     1,     2,
                  0,     2,     2,     0,     1,     1,     1,     1,     1,     1,
                  1,     1,     2,     3,     3,     3,     3,     3,     0,     2,
                  2,     2,     1,     1,     1,     3,     2,     0,     3,     3,
                  3,     1,     5,     1,     0,     2,     3,     0,     1,     1,
                  1,     1,     1,     1,     1,     1,     1,     1,     1,     1,
                  1
          };

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] =
          {
                  "$end", "error", "$undefined", "LETTER", "C_GIVEBACK_KW", "NUM",
                  "SEMICOLON", "COLON", "COMMA", "LP", "RP", "LB", "RB", "LCB", "RCB",
                  "DOT", "PLUSPLUS", "MINUSMINUS", "ASSIGN", "LE", "LT", "GE", "GT",
                  "EQUAL", "NOT_EQUAL", "ADD", "SUB", "MUL", "DIV", "MOD", "ADDE", "SUBE",
                  "MULE", "DIVE", "QUEST", "ANDAND", "OROR", "TILDA", "AND", "OR",
                  "STATIC_KW", "INTEGER_KW", "BOOLEAN_KW", "INT_KW", "CHAR_KW",
                  "CHARACTER_KW", "BOOL_KW", "VOID_KW", "IF_KW", "THEN_KW", "ELSE_KW",
                  "OTHER_KW", "TILL_KW", "COMEBACK_KW", "GIVEBACK_KW", "CONTINUE_KW",
                  "CONST_KW", "TRUE_KW", "FALSE_KW", "COMMENT", "$accept", "program",
                  "list", "listP", "declaration", "function", "varDeclaration",
                  "numOrletter", "parameter", "statement", "type", "letter", "letterP",
                  "variableList", "variableListP", "num", "numP", "listOfParameters",
                  "listOfParametersP", "phrase", "compoundPhrase", "selectPhrase",
                  "selectPhraseP", "iterationPhrase", "returnPhrase", "continue",
                  "varInitialization", "varInitializationP", "paramTypeList",
                  "allExpression", "allExpressionZ", "allExpressionP", "localDeclarations",
                  "localDeclarationsP", "statementList", "statementListP",
                  "eachExpression", "eachExpressionP", "eachExpressionZ",
                  "ScopedVariableDec", "varForm", "varFormP", "scopedSpecifier",
                  "paramList", "paramListP", "paramId", "paramIdP", "ifBody", "ifBodyP",
                  "relExpression", "relExpressionP", "compareType", "equal", "nonEqual",
                  "mathEXP", "mathEXPp", "unaryExpression", "factor", "alterable",
                  "alterableP", "alterableZ", "inalterable", "args", "arguments",
                  "argumentsP", "constant", "logicOp", "mathOp", null
          };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
          {
                  61,     0,    -1,    62,    -1,    64,    63,    -1,    64,    63,
                  -1,    -1,    65,    -1,    66,    -1,    47,    67,     9,    68,
                  10,    13,    69,    14,    -1,    70,    71,    67,     9,    68,
                  10,    69,    -1,    70,    73,     6,    -1,    75,    -1,    71,
                  -1,    -1,    77,    -1,    -1,    79,    -1,    80,    -1,    81,
                  -1,    83,    -1,    84,    -1,    85,    -1,    42,    -1,    45,
                  -1,    41,    -1,    44,    -1,    46,    -1,    43,    -1,     3,
                  72,    -1,    71,    72,    -1,    -1,    86,    74,    -1,     8,
                  86,    74,    -1,    -1,     5,    76,    -1,    75,    76,    -1,
                  -1,    88,    78,    -1,     6,    88,    78,    -1,    -1,    89,
                  6,    -1,     6,    -1,    13,    92,    94,    14,    -1,    48,
                  9,    96,    10,    82,    -1,   107,    -1,    13,   107,   107,
                  14,    -1,    52,     9,    96,    10,    69,    -1,    53,     6,
                  -1,    54,    89,     6,    -1,     4,    67,     6,    -1,    55,
                  6,    -1,   100,    87,    -1,     7,     9,    96,    10,    -1,
                  -1,    70,   103,    -1,   118,    90,    -1,    96,    -1,   127,
                  91,    -1,    16,    -1,    17,    -1,    89,    -1,   118,    -1,
                  93,    -1,    99,    93,    -1,    -1,    95,    -1,    69,    95,
                  -1,    -1,   126,    96,    97,    -1,   109,    97,    -1,   126,
                  98,    -1,    -1,    96,    97,    -1,    49,    96,    97,    -1,
                  50,    96,    97,    -1,   102,    73,     6,    -1,    71,    67,
                  101,    -1,    11,    75,    12,    -1,    -1,    40,    70,    -1,
                  70,    -1,   105,   104,    -1,     8,   105,   104,    -1,    -1,
                  71,    67,   106,    -1,    11,    12,    -1,    -1,    69,   108,
                  -1,     6,    -1,    51,    69,    -1,    -1,   114,   110,    -1,
                  111,   114,    -1,    -1,   112,    -1,   113,    -1,    19,    -1,
                  21,    -1,    23,    -1,    20,    -1,    22,    -1,    24,    -1,
                  116,   115,    -1,    25,   114,   115,    -1,    26,   114,   115,
                  -1,    27,   114,   115,    -1,    28,   114,   115,    -1,    29,
                  114,   115,    -1,    -1,    26,   116,    -1,    27,   116,    -1,
                  34,   116,    -1,   117,    -1,   121,    -1,   118,    -1,    71,
                  67,   119,    -1,   120,   119,    -1,    -1,    11,    89,    12,
                  -1,    15,    71,    67,    -1,     9,    89,    10,    -1,   125,
                  -1,    71,    67,     9,   122,    10,    -1,   123,    -1,    -1,
                  89,   124,    -1,     8,    89,   124,    -1,    -1,    56,    -1,
                  57,    -1,    58,    -1,    35,    -1,    36,    -1,    37,    -1,
                  38,    -1,    39,    -1,    18,    -1,    31,    -1,    30,    -1,
                  32,    -1,    33,    -1
          };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
          {
                  0,     0,     3,     5,     8,    11,    12,    14,    16,    25,
                  33,    37,    39,    41,    42,    44,    45,    47,    49,    51,
                  53,    55,    57,    59,    61,    63,    65,    67,    69,    72,
                  75,    76,    79,    83,    84,    87,    90,    91,    94,    98,
                  99,   102,   104,   109,   115,   117,   122,   128,   131,   135,
                  139,   142,   145,   150,   151,   154,   157,   159,   162,   164,
                  166,   168,   170,   172,   175,   176,   178,   181,   182,   186,
                  189,   192,   193,   196,   200,   204,   208,   212,   216,   217,
                  220,   222,   225,   229,   230,   234,   237,   238,   241,   243,
                  246,   247,   250,   253,   254,   256,   258,   260,   262,   264,
                  266,   268,   270,   273,   277,   281,   285,   289,   293,   294,
                  297,   300,   303,   305,   307,   309,   313,   316,   317,   321,
                  325,   329,   331,   337,   339,   340,   343,   347,   348,   350,
                  352,   354,   356,   358,   360,   362,   364,   366,   368,   370,
                  372
          };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
          {
                  0,    66,    66,    72,    78,    82,    88,    92,    97,   101,
                  107,   113,   117,   121,   128,   132,   138,   142,   146,   150,
                  154,   158,   164,   168,   172,   176,   180,   184,   190,   195,
                  199,   205,   211,   215,   222,   227,   231,   237,   243,   247,
                  253,   257,   263,   269,   275,   279,   286,   293,   297,   301,
                  308,   315,   321,   325,   331,   338,   342,   348,   352,   356,
                  362,   366,   375,   381,   385,   392,   398,   402,   409,   413,
                  419,   423,   429,   433,   437,   443,   452,   458,   462,   469,
                  473,   481,   487,   491,   499,   505,   509,   518,   522,   528,
                  532,   541,   548,   552,   559,   563,   570,   574,   578,   585,
                  589,   593,   601,   608,   612,   616,   620,   624,   628,   660,
                  664,   668,   672,   695,   699,   707,   713,   717,   722,   726,
                  733,   737,   741,   748,   752,   759,   765,   769,   776,   780,
                  784,   790,   794,   798,   802,   806,   813,   817,   821,   825,
                  829
          };

  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
            + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
              yyrhs_[yyprhs_[yyrule] + yyi],
              ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] =
          {
                  0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                  2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
                  5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
                  15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
                  25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
                  35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
                  45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
                  55,    56,    57,    58,    59
          };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 430;
  private static final int yynnts_ = 68;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 19;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 60;

  private static final int yyuser_token_number_max_ = 314;
  private static final int yyundef_token_ = 2;

  /* User implementation code.  */
  /* Unqualified %code blocks.  */

  /* Line 927 of lalr1.java  */
  /* Line 8 of "ph2.yacc"  */


  public static final String TYPE_STRING_INTEGER = "int";
  public static final String TYPE_STRING_REAL = "double";
  public static final String TYPE_STRING_CHAR = "char";
  public static final String TYPE_STRING_BOOLEAN = "int";

  private static final String tempStr = "TempVar";
  public static final String startStr = "StartVar";
  public static final String sizeStr = "SizeVar";
  public static final String indexStr = "IndexVar";
  public static final String condStr = "ConditionVar";

  public static String lexIdentifier;
  public static int lexInt;
  public static double lexReal;
  public static boolean lexBoolean;
  public static char lexChar;

  private ArrayList<Quadruple> quadruples = new ArrayList<>();
  private SymbolTable symbolTable = new SymbolTable();
  //public static PrintStream writer;

  private int tempCounter = 0;
  public String fileAddress="output.txt";

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

  private void emit(String operation, String arg0, String arg1, String result) {
    quadruples.add(new Quadruple(operation, arg0, arg1, result));
  }


  private void backpatch(ArrayList<Integer> list, int quadNumber) {
    for (int i = 0; i < list.size(); i++)
      quadruples.get(list.get(i)).result = String.valueOf(quadNumber);
  }

  private void backpatch(int quadNumber, int destination) {
    quadruples.get(quadNumber).result = String.valueOf(destination);
  }

  private String newTemp(int type, boolean array) {
    String name = tempStr + tempCounter++;
    symbolTable.addToSymbolTable(name, type, array);
    return name;
  }


  private int nextQuad() {
    return quadruples.size();
  }


  private String getTypeString(int typeCode){
    switch(typeCode){
      case EVal.TYPE_CODE_INTEGER:
        return TYPE_STRING_INTEGER;
      case EVal.TYPE_CODE_REAL:
        return TYPE_STRING_REAL;
      case EVal.TYPE_CODE_CHAR:
        return TYPE_STRING_CHAR;
      case EVal.TYPE_CODE_BOOLEAN:
        return TYPE_STRING_BOOLEAN;
      case EVal.TYPE_CODE_UNKNOWN:
      case EVal.TYPE_CODE_RANGE:
      default:
        return null;
    }
  }



  private void exportIntermediateCode() {
    DataOutputStream dos = null;
    try {
      dos = new DataOutputStream(new FileOutputStream(fileAddress));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    try {
      dos.writeBytes("#include <stdio.h>\n\nint main() {\n\t// ////////////////// Symbol Table \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \\\\\n\n");
      dos.writeBytes(symbolTable.toString());
      dos.writeBytes("\n\t// ////////////////// Three Address Code \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \\\\\n\n");
      // Backpatch of error controllers.
      backpatch(EVal.arrayIndexOutOfBoundList, (quadruples.size() + 1)); // Array index out of bound error.
      backpatch(EVal.invalidArraySizeList, (quadruples.size() + 2)); // Invalid array size error.
      for (int i = 0; i < quadruples.size() && i < 100; i++) {
        dos.writeBytes(Quadruple.LINE_STR + i + ":" + "\t\t" + quadruples.get(i) + "\n");
      }
      for (int i = 100; i < quadruples.size(); i++) {
        dos.writeBytes(Quadruple.LINE_STR + i + ":" + "\t\t" + quadruples.get(i) + "\n");
      }
      // Normal Finish
      if(quadruples.size() < 100)
        dos.writeBytes(Quadruple.LINE_STR + quadruples.size() + ":" + "\t\tprintf(\"Process is terminated with no error.\\n\");\n" +
                "\t\t\t\tgetchar();\n\t\t\t\treturn 0;\n");
      else
        dos.writeBytes(Quadruple.LINE_STR + quadruples.size() + ":" + "\t\tprintf(\"Process is terminated with no error.\\n\");\n" +
                "\t\t\t\tgetchar();\n\t\t\t\treturn 0;\n");

      // Array index out of bound error.
      if(quadruples.size() < 100)
        dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 1) + ":" + "\t\tprintf(\"Array Error: Index out of bound!\\n\");\n" +
                "\t\t\t\tgetchar();\n\t\t\treturn -1;\n");
      else
        dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 1) + ":" + "\t\tprintf(\"Array Error: Index out of bound!\\n\");\n" +
                "\t\t\t\tgetchar();\n\t\t\treturn -1;\n");

      // Invalid array size error.
      if(quadruples.size() < 100)
        dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 2) + ":" + "\t\tprintf(\"Array Error: Invalid array size!\\n\");\n" +
                "\t\t\t\tgetchar();\n\t\t\treturn -2;\n");
      else
        dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 2) + ":" + "\t\tprintf(\"Array Error: Invalid array size!\\n\");\n" +
                "\t\t\t\tgetchar();\n\t\t\treturn -2;\n");

      dos.writeBytes("}\n");
    } catch (IOException  | NullPointerException e) {
      System.out.println("err");
    }

  }

  /* Line 927 of lalr1.java  */
  /* Line 2978 of "ph2.cacc"  */

}


class Quadruple {

  public static final String LINE_STR = "Line";

  public String operation;
  public String arg0;
  public String arg1;
  public String result;

  public Quadruple(String operation, String arg0, String arg1, String result) {
    this.operation = operation;
    this.arg0 = arg0;
    this.arg1 = arg1;
    this.result = result;
  }

  @Override
  public String toString() {
    switch(operation.toLowerCase()){
      case "goto":
        return operation + " " + LINE_STR + result + ";";
      case "check":
        return "if (" + arg0 + ") goto " + LINE_STR + result + ";";
      case "<":
      case "<=":
      case ">":
      case ">=":
      case "+":
      case "-":
      case "*":
      case "/":
      case "%":
        return result + " = " + arg0 + " " + operation + " " + arg1 + ";";
      case "=":
        return result + " = " + arg0 + " " + "==" + " " + arg1 + ";";
      case "<>":
        return result + " != " + arg0 + " " + "==" + " " + arg1 + ";";
      case "usub":
        return result + " = -" + arg0 + ";";
      case ":=":
        return result + " = " + arg0 + ";";
      case "cast":
        return result + " = (" + arg1 + ") " + arg0 + ";";
      case "init":
        return arg1 + " " + result + ";";
      case "iprint":
        return "printf(\"%s = %d\\n\", \"" + result + "\", " + result + ");";
      case "rprint":
        return "printf(\"%s = %f\\n\", \"" + result + "\", " + result + ");";
      case "cprint":
        return "printf(\"%s = '%c'\\n\", \"" + result + "\", " + result + ");";
      case "bprint":
        return "printf(\"%s = %s\\n\", \"" + result + "\", " + result + " ? \"true\" : \"false\");";
      case "aiprint":
        return "printf(\"%s[%d] = %d\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "]);";
      case "arprint":
        return "printf(\"%s[%d] = %f\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "]);";
      case "acprint":
        return "printf(\"%s[%d] = '%c'\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "]);";
      case "abprint":
        return "printf(\"%s[%d] = %s\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "] ? \"true\" : \"false\");";
      case "[]=":
        return "*(" + result + " + " + arg1 + ") = " + arg0 + ";";
      case "=[]":
        return result + " = *(" + arg0 + " + " + arg1 + ");";
      case "malloc":
        return result + " = " + "malloc(sizeof(" + arg0 + ") * " + arg1+ ");";
      default:
        return null;
    }
  }
}


class EVal {

  public static final int TYPE_CODE_UNKNOWN = -1;
  public static final int TYPE_CODE_INTEGER = 0;
  public static final int TYPE_CODE_REAL = 1;
  public static final int TYPE_CODE_CHAR = 2;
  public static final int TYPE_CODE_BOOLEAN = 3;
  public static final int TYPE_CODE_RANGE = 4;


  public String place;

  public String place1;



  public int type;

  public int type1;



  public boolean array;

  public boolean array1;



  public int quad;

  public int quad1;





  public static ArrayList<Integer> arrayIndexOutOfBoundList = new ArrayList<>();
  public static ArrayList<Integer> invalidArraySizeList = new ArrayList<>();
  public ArrayList<Integer> initList;
  public ArrayList<Integer> nextList;
  public ArrayList<Integer> trueList;
  public ArrayList<Integer> falseList;

  public ArrayList<ArrayList<EVal>> initializersList;
  public ArrayList<EVal> declareds;

  public ArrayList<EVal> initializers;

  public EVal() {
  }

  public static ArrayList<Integer> makeList(int number) {
    ArrayList<Integer> result = new ArrayList<>();
    result.add(number);
    return result;
  }

  public static ArrayList<Integer> merge(ArrayList<Integer> al1, ArrayList<Integer> al2) {
    ArrayList<Integer> result = new ArrayList<>();
    result.addAll(al1);
    result.addAll(al2);
    return result;
  }

  public static ArrayList<ArrayList<EVal>> makeInitializersList(ArrayList<EVal> initializers) {
    ArrayList<ArrayList<EVal>> result = new ArrayList<>();
    result.add(initializers);
    return result;
  }

  public static ArrayList<EVal> makeInitializersOrDeclareds(EVal initializerOrdDeclared) {
    ArrayList<EVal> result = new ArrayList<>();
    result.add(initializerOrdDeclared);
    return result;
  }
}


//SymbolTable
class SymbolTable {

  public static final int NOT_IN_SYMBOL_TABLE = -1;

  public ArrayList<String> names;
  public ArrayList<Integer> types;
  public ArrayList<Boolean> arrays;

  public SymbolTable() {
    names = new ArrayList<>();
    types = new ArrayList<>();
    arrays = new ArrayList<>();
  }

  public int lookUp(String name) {
    return names.indexOf(name);
  }

  public boolean addToSymbolTable(String name, int type, boolean array) {
    if (lookUp(name) == -1) {
      names.add(name);
      types.add(type);
      arrays.add(array);
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    if(names.size() == 0)
      return null;
    String res = "";
    for(int i = 0; i < names.size(); i++) {
      switch (types.get(i)) {
        case EVal.TYPE_CODE_INTEGER:
          res += "\t" + YYParser.TYPE_STRING_INTEGER;
          break;
        case EVal.TYPE_CODE_REAL:
          res += "\t" + YYParser.TYPE_STRING_REAL;
          break;
        case EVal.TYPE_CODE_CHAR:
          res += "\t" + YYParser.TYPE_STRING_CHAR;
          break;
        case EVal.TYPE_CODE_BOOLEAN:
          res += "\t" + YYParser.TYPE_STRING_BOOLEAN;
          break;
        case EVal.TYPE_CODE_RANGE:
          continue;
      }
      res += (arrays.get(i) ? " *" : " ") + names.get(i) + ";\n";
    }
    return res;
  }

}