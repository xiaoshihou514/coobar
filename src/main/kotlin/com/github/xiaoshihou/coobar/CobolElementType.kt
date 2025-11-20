package com.github.xiaoshihou.coobar

import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls

class CobolElementType(@NonNls debugName: String) : IElementType(debugName, CobolLanguage.INSTANCE) {
    override fun toString(): String = "CobolElementType.${super.toString()}"
}

