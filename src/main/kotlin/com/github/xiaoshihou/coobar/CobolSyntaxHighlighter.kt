package com.github.xiaoshihou.coobar

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class CobolSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = CobolLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey?> = when (tokenType) {
        in KEYWORD_TOKENS -> KEY_KEYS
        CobolTypes.NUMBER -> NUMBER_KEYS
        CobolTypes.STRING -> STRING_KEYS
        CobolTypes.IDENTIFIER -> IDENTIFIER_KEYS
        CobolTypes.DOT, CobolTypes.LPAREN, CobolTypes.RPAREN, CobolTypes.EQUALS -> OPERATOR_KEYS
        TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
        else -> EMPTY_KEYS
    }

    companion object {
        private val KEYWORD_TOKENS = setOf<IElementType>(
            CobolTypes.IDENTIFICATION,
            CobolTypes.DIVISION,
            CobolTypes.PROGRAM_ID,
            CobolTypes.DATA,
            CobolTypes.WORKING_STORAGE,
            CobolTypes.SECTION,
            CobolTypes.PROCEDURE,
            CobolTypes.PIC,
            CobolTypes.VALUE,
            CobolTypes.PERFORM,
            CobolTypes.VARYING,
            CobolTypes.FROM,
            CobolTypes.BY,
            CobolTypes.UNTIL,
            CobolTypes.STOP,
            CobolTypes.RUN,
            CobolTypes.DISPLAY,
        )

        private val KEYWORD: TextAttributesKey =
            createTextAttributesKey("COBOL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        private val NUMBER: TextAttributesKey = createTextAttributesKey("COBOL_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        private val STRING: TextAttributesKey = createTextAttributesKey("COBOL_STRING", DefaultLanguageHighlighterColors.STRING)
        private val IDENTIFIER: TextAttributesKey =
            createTextAttributesKey("COBOL_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)
        private val OPERATOR: TextAttributesKey =
            createTextAttributesKey("COBOL_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        private val BAD_CHARACTER: TextAttributesKey =
            createTextAttributesKey("COBOL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)

        private val KEY_KEYS = arrayOf<TextAttributesKey?>(KEYWORD)
        private val NUMBER_KEYS = arrayOf<TextAttributesKey?>(NUMBER)
        private val STRING_KEYS = arrayOf<TextAttributesKey?>(STRING)
        private val IDENTIFIER_KEYS = arrayOf<TextAttributesKey?>(IDENTIFIER)
        private val OPERATOR_KEYS = arrayOf<TextAttributesKey?>(OPERATOR)
        private val BAD_CHAR_KEYS = arrayOf<TextAttributesKey?>(BAD_CHARACTER)
        private val EMPTY_KEYS = arrayOfNulls<TextAttributesKey>(0)
    }
}
