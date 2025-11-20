// This is a generated file. Not intended for manual editing.
package com.github.xiaoshihou.coobar;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolProgram extends PsiElement {

  @Nullable
  CobolDataDivision getDataDivision();

  @NotNull
  CobolIdentificationDivision getIdentificationDivision();

  @NotNull
  CobolProcedureDivision getProcedureDivision();

}
