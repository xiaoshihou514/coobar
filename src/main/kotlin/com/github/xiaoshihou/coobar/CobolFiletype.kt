package com.github.xiaoshihou.coobar

import com.intellij.openapi.fileTypes.LanguageFileType

object CobolFiletype: LanguageFileType(CobolLanguage.INSTANCE) {
    override fun getName() = "Cobol File"

    override fun getDescription() = "Cobol language file"

    override fun getDefaultExtension() = "cbl"

    override fun getIcon() = CobolIcon.FILE

    val INSTANCE: CobolFiletype = CobolFiletype
}