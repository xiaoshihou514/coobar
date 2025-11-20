// This is a generated file. Not intended for manual editing.
package com.github.xiaoshihou.coobar.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.xiaoshihou.coobar.CobolTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.xiaoshihou.coobar.*;

public class CobolProgramIdParagraphImpl extends ASTWrapperPsiElement implements CobolProgramIdParagraph {

  public CobolProgramIdParagraphImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitProgramIdParagraph(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CobolLinePrefix getLinePrefix() {
    return findNotNullChildByClass(CobolLinePrefix.class);
  }

  @Override
  @NotNull
  public CobolProgramName getProgramName() {
    return findNotNullChildByClass(CobolProgramName.class);
  }

}
