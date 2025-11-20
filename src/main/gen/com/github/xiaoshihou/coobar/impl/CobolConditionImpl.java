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

public class CobolConditionImpl extends ASTWrapperPsiElement implements CobolCondition {

  public CobolConditionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitCondition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CobolComparisonOperator getComparisonOperator() {
    return findNotNullChildByClass(CobolComparisonOperator.class);
  }

  @Override
  @NotNull
  public CobolIdentifierRef getIdentifierRef() {
    return findNotNullChildByClass(CobolIdentifierRef.class);
  }

  @Override
  @NotNull
  public CobolLiteral getLiteral() {
    return findNotNullChildByClass(CobolLiteral.class);
  }

}
