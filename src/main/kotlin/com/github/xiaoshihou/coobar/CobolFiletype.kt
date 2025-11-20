package com.github.xiaoshihou.coobar

import com.intellij.openapi.fileTypes.LanguageFileType;

class CobolFiletype private constructor() : LanguageFileType(CobolLanguage.INSTANCE) {
    override fun getName() = "Cobol File"

    override fun getDescription() = "Cobol language file"

    override fun getDefaultExtension() = "cbl"

    override fun getIcon() = CobolIcon.FILE

    companion object {
        @JvmField
        val INSTANCE: CobolFiletype = CobolFiletype()
    }
}