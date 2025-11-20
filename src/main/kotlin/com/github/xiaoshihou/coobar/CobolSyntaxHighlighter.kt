package com.github.xiaoshihou.coobar

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.intellij.psi.TokenType
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey

class CobolSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return CobolLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey?> {
        if (tokenType.equals(CobolTypes.SEPARATOR)) {
            return SEPARATOR_KEYS
        }
        if (tokenType.equals(CobolTypes.KEY)) {
            return KEY_KEYS
        }
        if (tokenType.equals(CobolTypes.VALUE)) {
            return VALUE_KEYS
        }
        if (tokenType.equals(CobolTypes.COMMENT)) {
            return COMMENT_KEYS
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS
        }
        return EMPTY_KEYS
    }

    companion object {
        val SEPARATOR: TextAttributesKey =
            createTextAttributesKey("SIMPLE_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        val KEY: TextAttributesKey = createTextAttributesKey("SIMPLE_KEY", DefaultLanguageHighlighterColors.KEYWORD)
        val VALUE: TextAttributesKey = createTextAttributesKey("SIMPLE_VALUE", DefaultLanguageHighlighterColors.STRING)
        val COMMENT: TextAttributesKey =
            createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val BAD_CHARACTER: TextAttributesKey =
            createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)


        private val BAD_CHAR_KEYS = arrayOf<TextAttributesKey?>(BAD_CHARACTER)
        private val SEPARATOR_KEYS = arrayOf<TextAttributesKey?>(SEPARATOR)
        private val KEY_KEYS = arrayOf<TextAttributesKey?>(KEY)
        private val VALUE_KEYS = arrayOf<TextAttributesKey?>(VALUE)
        private val COMMENT_KEYS = arrayOf<TextAttributesKey?>(COMMENT)
        private val EMPTY_KEYS = arrayOfNulls<TextAttributesKey>(0)
    }
}
