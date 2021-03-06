/*
 * Copyright 2011 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.javascript.jscomp.parsing.parser.trees;

import com.google.javascript.jscomp.parsing.parser.util.SourceRange;

/**
 * Creates a MemberLookupExpressionTree that represents a member lookup expression. Has an
 * isOptionalChain field to indicate whether it is part of an optional chain e.g. `a?.[1]`
 */
public class MemberLookupExpressionTree extends ParseTree {

  public final ParseTree operand;
  public final ParseTree memberExpression;
  public final boolean isOptionalChain;

  public MemberLookupExpressionTree(
      SourceRange location,
      ParseTree operand,
      ParseTree memberExpression,
      boolean isOptionalChain) {
    super(ParseTreeType.MEMBER_LOOKUP_EXPRESSION, location);

    this.operand = operand;
    this.memberExpression = memberExpression;
    this.isOptionalChain = isOptionalChain;
  }

  public boolean getIsOptionalChain() {
    return this.isOptionalChain;
  }
}
