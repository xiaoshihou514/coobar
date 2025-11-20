package com.github.xiaoshihou.coobar

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet


class CobolParserDefinition : ParserDefinition {
    override fun createLexer(project: Project?): Lexer = CobolLexerAdapter()

    override fun getCommentTokens(): TokenSet = CobolTokenSets.COMMENTS

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun createParser(project: Project?): PsiParser = CobolParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun createFile(viewProvider: FileViewProvider): PsiFile =
        CobolFile(viewProvider)

    override fun createElement(node: ASTNode?): PsiElement =
        CobolTypes.Factory.createElement(node)

    companion object {
        val FILE: IFileElementType = IFileElementType(CobolLanguage.INSTANCE)
    }
}