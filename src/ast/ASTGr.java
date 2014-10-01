package ast;

import semantics.CodeBlock;
import semantics.Visitor;

public class ASTGr implements ASTNode {
	
	public final ASTNode l, r;

	public ASTGr(ASTNode l, ASTNode r) {
		this.l = l;
		this.r = r;
	}

	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void compile(CodeBlock c) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

}
