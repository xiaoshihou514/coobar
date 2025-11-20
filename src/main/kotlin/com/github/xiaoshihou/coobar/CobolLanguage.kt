package com.github.xiaoshihou.coobar

import com.intellij.lang.Language

class CobolLanguage private constructor(): Language("Cobol") {
    companion object {
        val INSTANCE: CobolLanguage = CobolLanguage()
    }
}