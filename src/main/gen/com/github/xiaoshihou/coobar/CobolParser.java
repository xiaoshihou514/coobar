// This is a generated file. Not intended for manual editing.
package com.github.xiaoshihou.coobar;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.xiaoshihou.coobar.CobolTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CobolParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // EQUALS
  public static boolean comparison_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_operator")) return false;
    if (!nextTokenIs(b, EQUALS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    exit_section_(b, m, COMPARISON_OPERATOR, r);
    return r;
  }

  /* ********************************************************** */
  // identifier_ref comparison_operator literal
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier_ref(b, l + 1);
    r = r && comparison_operator(b, l + 1);
    r = r && literal(b, l + 1);
    exit_section_(b, m, CONDITION, r);
    return r;
  }

  /* ********************************************************** */
  // line_prefix level_number data_name picture_clause value_clause? DOT
  public static boolean data_description_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_description_entry")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_prefix(b, l + 1);
    r = r && level_number(b, l + 1);
    r = r && data_name(b, l + 1);
    r = r && picture_clause(b, l + 1);
    r = r && data_description_entry_4(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, DATA_DESCRIPTION_ENTRY, r);
    return r;
  }

  // value_clause?
  private static boolean data_description_entry_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_description_entry_4")) return false;
    value_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // line_prefix DATA DIVISION DOT working_storage_section?
  public static boolean data_division(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_division")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_prefix(b, l + 1);
    r = r && consumeTokens(b, 0, DATA, DIVISION, DOT);
    r = r && data_division_4(b, l + 1);
    exit_section_(b, m, DATA_DIVISION, r);
    return r;
  }

  // working_storage_section?
  private static boolean data_division_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_division_4")) return false;
    working_storage_section(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean data_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, DATA_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // literal | identifier_ref
  public static boolean display_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISPLAY_ITEM, "<display item>");
    r = literal(b, l + 1);
    if (!r) r = identifier_ref(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DISPLAY display_item+
  public static boolean display_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_statement")) return false;
    if (!nextTokenIs(b, DISPLAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DISPLAY);
    r = r && display_statement_1(b, l + 1);
    exit_section_(b, m, DISPLAY_STATEMENT, r);
    return r;
  }

  // display_item+
  private static boolean display_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = display_item(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!display_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "display_statement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // line_prefix IDENTIFICATION DIVISION DOT program_id_paragraph
  public static boolean identification_division(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identification_division")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_prefix(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFICATION, DIVISION, DOT);
    r = r && program_id_paragraph(b, l + 1);
    exit_section_(b, m, IDENTIFICATION_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean identifier_ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_ref")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, IDENTIFIER_REF, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER
  public static boolean level_number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "level_number")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    exit_section_(b, m, LEVEL_NUMBER, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER
  public static boolean line_prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "line_prefix")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    exit_section_(b, m, LINE_PREFIX, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER | STRING | IDENTIFIER
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // line_prefix paragraph_name DOT paragraph_body?
  public static boolean paragraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_prefix(b, l + 1);
    r = r && paragraph_name(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && paragraph_3(b, l + 1);
    exit_section_(b, m, PARAGRAPH, r);
    return r;
  }

  // paragraph_body?
  private static boolean paragraph_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph_3")) return false;
    paragraph_body(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // sentence+
  public static boolean paragraph_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph_body")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sentence(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!sentence(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "paragraph_body", c)) break;
    }
    exit_section_(b, m, PARAGRAPH_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean paragraph_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PARAGRAPH_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // PERFORM perform_target perform_varying_phrase? perform_until_phrase?
  public static boolean perform_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perform_statement")) return false;
    if (!nextTokenIs(b, PERFORM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERFORM);
    r = r && perform_target(b, l + 1);
    r = r && perform_statement_2(b, l + 1);
    r = r && perform_statement_3(b, l + 1);
    exit_section_(b, m, PERFORM_STATEMENT, r);
    return r;
  }

  // perform_varying_phrase?
  private static boolean perform_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perform_statement_2")) return false;
    perform_varying_phrase(b, l + 1);
    return true;
  }

  // perform_until_phrase?
  private static boolean perform_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perform_statement_3")) return false;
    perform_until_phrase(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean perform_target(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perform_target")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PERFORM_TARGET, r);
    return r;
  }

  /* ********************************************************** */
  // UNTIL condition
  public static boolean perform_until_phrase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perform_until_phrase")) return false;
    if (!nextTokenIs(b, UNTIL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNTIL);
    r = r && condition(b, l + 1);
    exit_section_(b, m, PERFORM_UNTIL_PHRASE, r);
    return r;
  }

  /* ********************************************************** */
  // VARYING IDENTIFIER FROM literal BY literal
  public static boolean perform_varying_phrase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perform_varying_phrase")) return false;
    if (!nextTokenIs(b, VARYING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VARYING, IDENTIFIER, FROM);
    r = r && literal(b, l + 1);
    r = r && consumeToken(b, BY);
    r = r && literal(b, l + 1);
    exit_section_(b, m, PERFORM_VARYING_PHRASE, r);
    return r;
  }

  /* ********************************************************** */
  // PIC picture_string
  public static boolean picture_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "picture_clause")) return false;
    if (!nextTokenIs(b, PIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PIC);
    r = r && picture_string(b, l + 1);
    exit_section_(b, m, PICTURE_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER | IDENTIFIER | LPAREN | RPAREN
  public static boolean picture_fragment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "picture_fragment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PICTURE_FRAGMENT, "<picture fragment>");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, LPAREN);
    if (!r) r = consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // picture_fragment+
  public static boolean picture_string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "picture_string")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PICTURE_STRING, "<picture string>");
    r = picture_fragment(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!picture_fragment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "picture_string", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // line_prefix PROCEDURE DIVISION DOT paragraph*
  public static boolean procedure_division(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_division")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_prefix(b, l + 1);
    r = r && consumeTokens(b, 0, PROCEDURE, DIVISION, DOT);
    r = r && procedure_division_4(b, l + 1);
    exit_section_(b, m, PROCEDURE_DIVISION, r);
    return r;
  }

  // paragraph*
  private static boolean procedure_division_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_division_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!paragraph(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "procedure_division_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // identification_division data_division? procedure_division
  public static boolean program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identification_division(b, l + 1);
    r = r && program_1(b, l + 1);
    r = r && procedure_division(b, l + 1);
    exit_section_(b, m, PROGRAM, r);
    return r;
  }

  // data_division?
  private static boolean program_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_1")) return false;
    data_division(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // line_prefix PROGRAM_ID DOT program_name DOT
  public static boolean program_id_paragraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_id_paragraph")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_prefix(b, l + 1);
    r = r && consumeTokens(b, 0, PROGRAM_ID, DOT);
    r = r && program_name(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, PROGRAM_ID_PARAGRAPH, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean program_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PROGRAM_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // program
  static boolean root(PsiBuilder b, int l) {
    return program(b, l + 1);
  }

  /* ********************************************************** */
  // line_prefix statement DOT?
  public static boolean sentence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sentence")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_prefix(b, l + 1);
    r = r && statement(b, l + 1);
    r = r && sentence_2(b, l + 1);
    exit_section_(b, m, SENTENCE, r);
    return r;
  }

  // DOT?
  private static boolean sentence_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sentence_2")) return false;
    consumeToken(b, DOT);
    return true;
  }

  /* ********************************************************** */
  // perform_statement
  //            | stop_run_statement
  //            | display_statement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = perform_statement(b, l + 1);
    if (!r) r = stop_run_statement(b, l + 1);
    if (!r) r = display_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STOP RUN
  public static boolean stop_run_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stop_run_statement")) return false;
    if (!nextTokenIs(b, STOP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STOP, RUN);
    exit_section_(b, m, STOP_RUN_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // VALUE literal
  public static boolean value_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_clause")) return false;
    if (!nextTokenIs(b, VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALUE);
    r = r && literal(b, l + 1);
    exit_section_(b, m, VALUE_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // line_prefix WORKING_STORAGE SECTION DOT data_description_entry*
  public static boolean working_storage_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "working_storage_section")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_prefix(b, l + 1);
    r = r && consumeTokens(b, 0, WORKING_STORAGE, SECTION, DOT);
    r = r && working_storage_section_4(b, l + 1);
    exit_section_(b, m, WORKING_STORAGE_SECTION, r);
    return r;
  }

  // data_description_entry*
  private static boolean working_storage_section_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "working_storage_section_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!data_description_entry(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "working_storage_section_4", c)) break;
    }
    return true;
  }

}
