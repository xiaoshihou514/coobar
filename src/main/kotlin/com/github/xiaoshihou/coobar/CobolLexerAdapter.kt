package com.github.xiaoshihou.coobar

import com.intellij.lexer.FlexAdapter

class CobolLexerAdapter : FlexAdapter(CobolLexer(null))

