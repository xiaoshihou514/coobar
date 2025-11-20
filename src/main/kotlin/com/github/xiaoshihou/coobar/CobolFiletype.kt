package com.github.xiaoshihou.coobar

import com.intellij.openapi.fileTypes.LanguageFileType;

import javax.swing.*;

class CobolFileType private constructor() : LanguageFileType(CobolLanguage.INSTANCE) {
    override fun getName() = "Cobol File"

    override fun getDescription() = "Cobol language file"

    override fun getDefaultExtension() = "cbl"

    override fun getIcon() = PluginIcons.FILE

    companion object {
        val INSTANCE: CobolFileType = CobolFileType()
    }
}