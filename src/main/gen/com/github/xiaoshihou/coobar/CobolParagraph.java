// This is a generated file. Not intended for manual editing.
package com.github.xiaoshihou.coobar;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolParagraph extends PsiElement {

  @NotNull
  CobolLinePrefix getLinePrefix();

  @Nullable
  CobolParagraphBody getParagraphBody();

  @NotNull
  CobolParagraphName getParagraphName();

}
