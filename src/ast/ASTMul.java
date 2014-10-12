package ast;

import semantics.Visitor;

public class ASTMul implements ASTNode {

	public final ASTNode l, r;
	
	public ASTMul(ASTNode l, ASTNode r) {
		this.l = l;
		this.r = r;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) throws Exception {
		return visitor.visit(this);
	}

}
