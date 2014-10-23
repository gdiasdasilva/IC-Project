package ast;

import semantics.IValue;
import semantics.IntValue;
import semantics.Visitor;

public class ASTNum implements ASTNode {
	
	public final IValue iVal;

	public ASTNum(int iVal) {
		this.iVal = new IntValue(iVal);
	}

	@Override
	public IValue accept(Visitor<IValue> visitor) throws Exception {
		return visitor.visit(this);
	}

}
