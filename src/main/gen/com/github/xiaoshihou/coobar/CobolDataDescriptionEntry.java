// This is a generated file. Not intended for manual editing.
package com.github.xiaoshihou.coobar;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolDataDescriptionEntry extends PsiElement {

  @NotNull
  CobolDataName getDataName();

  @NotNull
  CobolLevelNumber getLevelNumber();

  @NotNull
  CobolLinePrefix getLinePrefix();

  @NotNull
  CobolPictureClause getPictureClause();

  @Nullable
  CobolValueClause getValueClause();

}
