// This is a generated file. Not intended for manual editing.
package com.github.xiaoshihou.coobar;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.xiaoshihou.coobar.impl.*;

public interface CobolTypes {

  IElementType COMPARISON_OPERATOR = new CobolElementType("COMPARISON_OPERATOR");
  IElementType CONDITION = new CobolElementType("CONDITION");
  IElementType DATA_DESCRIPTION_ENTRY = new CobolElementType("DATA_DESCRIPTION_ENTRY");
  IElementType DATA_DIVISION = new CobolElementType("DATA_DIVISION");
  IElementType DATA_NAME = new CobolElementType("DATA_NAME");
  IElementType DISPLAY_ITEM = new CobolElementType("DISPLAY_ITEM");
  IElementType DISPLAY_STATEMENT = new CobolElementType("DISPLAY_STATEMENT");
  IElementType IDENTIFICATION_DIVISION = new CobolElementType("IDENTIFICATION_DIVISION");
  IElementType IDENTIFIER_REF = new CobolElementType("IDENTIFIER_REF");
  IElementType LEVEL_NUMBER = new CobolElementType("LEVEL_NUMBER");
  IElementType LINE_PREFIX = new CobolElementType("LINE_PREFIX");
  IElementType LITERAL = new CobolElementType("LITERAL");
  IElementType PARAGRAPH = new CobolElementType("PARAGRAPH");
  IElementType PARAGRAPH_BODY = new CobolElementType("PARAGRAPH_BODY");
  IElementType PARAGRAPH_NAME = new CobolElementType("PARAGRAPH_NAME");
  IElementType PERFORM_STATEMENT = new CobolElementType("PERFORM_STATEMENT");
  IElementType PERFORM_TARGET = new CobolElementType("PERFORM_TARGET");
  IElementType PERFORM_UNTIL_PHRASE = new CobolElementType("PERFORM_UNTIL_PHRASE");
  IElementType PERFORM_VARYING_PHRASE = new CobolElementType("PERFORM_VARYING_PHRASE");
  IElementType PICTURE_CLAUSE = new CobolElementType("PICTURE_CLAUSE");
  IElementType PICTURE_FRAGMENT = new CobolElementType("PICTURE_FRAGMENT");
  IElementType PICTURE_STRING = new CobolElementType("PICTURE_STRING");
  IElementType PROCEDURE_DIVISION = new CobolElementType("PROCEDURE_DIVISION");
  IElementType PROGRAM = new CobolElementType("PROGRAM");
  IElementType PROGRAM_ID_PARAGRAPH = new CobolElementType("PROGRAM_ID_PARAGRAPH");
  IElementType PROGRAM_NAME = new CobolElementType("PROGRAM_NAME");
  IElementType SENTENCE = new CobolElementType("SENTENCE");
  IElementType STATEMENT = new CobolElementType("STATEMENT");
  IElementType STOP_RUN_STATEMENT = new CobolElementType("STOP_RUN_STATEMENT");
  IElementType VALUE_CLAUSE = new CobolElementType("VALUE_CLAUSE");
  IElementType WORKING_STORAGE_SECTION = new CobolElementType("WORKING_STORAGE_SECTION");

  IElementType BY = new CobolTokenType("BY");
  IElementType DATA = new CobolTokenType("DATA");
  IElementType DISPLAY = new CobolTokenType("DISPLAY");
  IElementType DIVISION = new CobolTokenType("DIVISION");
  IElementType DOT = new CobolTokenType(".");
  IElementType EQUALS = new CobolTokenType("=");
  IElementType FROM = new CobolTokenType("FROM");
  IElementType IDENTIFICATION = new CobolTokenType("IDENTIFICATION");
  IElementType IDENTIFIER = new CobolTokenType("IDENTIFIER");
  IElementType LPAREN = new CobolTokenType("(");
  IElementType NUMBER = new CobolTokenType("NUMBER");
  IElementType PERFORM = new CobolTokenType("PERFORM");
  IElementType PIC = new CobolTokenType("PIC");
  IElementType PROCEDURE = new CobolTokenType("PROCEDURE");
  IElementType PROGRAM_ID = new CobolTokenType("PROGRAM-ID");
  IElementType RPAREN = new CobolTokenType(")");
  IElementType RUN = new CobolTokenType("RUN");
  IElementType SECTION = new CobolTokenType("SECTION");
  IElementType STOP = new CobolTokenType("STOP");
  IElementType STRING = new CobolTokenType("STRING");
  IElementType UNTIL = new CobolTokenType("UNTIL");
  IElementType VALUE = new CobolTokenType("VALUE");
  IElementType VARYING = new CobolTokenType("VARYING");
  IElementType WORKING_STORAGE = new CobolTokenType("WORKING-STORAGE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == COMPARISON_OPERATOR) {
        return new CobolComparisonOperatorImpl(node);
      }
      else if (type == CONDITION) {
        return new CobolConditionImpl(node);
      }
      else if (type == DATA_DESCRIPTION_ENTRY) {
        return new CobolDataDescriptionEntryImpl(node);
      }
      else if (type == DATA_DIVISION) {
        return new CobolDataDivisionImpl(node);
      }
      else if (type == DATA_NAME) {
        return new CobolDataNameImpl(node);
      }
      else if (type == DISPLAY_ITEM) {
        return new CobolDisplayItemImpl(node);
      }
      else if (type == DISPLAY_STATEMENT) {
        return new CobolDisplayStatementImpl(node);
      }
      else if (type == IDENTIFICATION_DIVISION) {
        return new CobolIdentificationDivisionImpl(node);
      }
      else if (type == IDENTIFIER_REF) {
        return new CobolIdentifierRefImpl(node);
      }
      else if (type == LEVEL_NUMBER) {
        return new CobolLevelNumberImpl(node);
      }
      else if (type == LINE_PREFIX) {
        return new CobolLinePrefixImpl(node);
      }
      else if (type == LITERAL) {
        return new CobolLiteralImpl(node);
      }
      else if (type == PARAGRAPH) {
        return new CobolParagraphImpl(node);
      }
      else if (type == PARAGRAPH_BODY) {
        return new CobolParagraphBodyImpl(node);
      }
      else if (type == PARAGRAPH_NAME) {
        return new CobolParagraphNameImpl(node);
      }
      else if (type == PERFORM_STATEMENT) {
        return new CobolPerformStatementImpl(node);
      }
      else if (type == PERFORM_TARGET) {
        return new CobolPerformTargetImpl(node);
      }
      else if (type == PERFORM_UNTIL_PHRASE) {
        return new CobolPerformUntilPhraseImpl(node);
      }
      else if (type == PERFORM_VARYING_PHRASE) {
        return new CobolPerformVaryingPhraseImpl(node);
      }
      else if (type == PICTURE_CLAUSE) {
        return new CobolPictureClauseImpl(node);
      }
      else if (type == PICTURE_FRAGMENT) {
        return new CobolPictureFragmentImpl(node);
      }
      else if (type == PICTURE_STRING) {
        return new CobolPictureStringImpl(node);
      }
      else if (type == PROCEDURE_DIVISION) {
        return new CobolProcedureDivisionImpl(node);
      }
      else if (type == PROGRAM) {
        return new CobolProgramImpl(node);
      }
      else if (type == PROGRAM_ID_PARAGRAPH) {
        return new CobolProgramIdParagraphImpl(node);
      }
      else if (type == PROGRAM_NAME) {
        return new CobolProgramNameImpl(node);
      }
      else if (type == SENTENCE) {
        return new CobolSentenceImpl(node);
      }
      else if (type == STATEMENT) {
        return new CobolStatementImpl(node);
      }
      else if (type == STOP_RUN_STATEMENT) {
        return new CobolStopRunStatementImpl(node);
      }
      else if (type == VALUE_CLAUSE) {
        return new CobolValueClauseImpl(node);
      }
      else if (type == WORKING_STORAGE_SECTION) {
        return new CobolWorkingStorageSectionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
