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

public class CobolParagraphBodyImpl extends ASTWrapperPsiElement implements CobolParagraphBody {

  public CobolParagraphBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitParagraphBody(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CobolSentence> getSentenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolSentence.class);
  }

}
