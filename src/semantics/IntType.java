package semantics;

public class IntType implements IType {

	@Override
	public VType getType() {
		return VType.STRING;
	}
	
	public String toString() {
		return "String";
	}
}
