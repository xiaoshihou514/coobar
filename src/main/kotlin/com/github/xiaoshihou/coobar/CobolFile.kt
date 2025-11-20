package com.github.xiaoshihou.coobar

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class CobolFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, CobolLanguage.INSTANCE) {
    override fun getFileType(): FileType = CobolFiletype.INSTANCE

    override fun toString(): String = "Cobol File"
}

