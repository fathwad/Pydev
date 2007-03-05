package org.python.pydev.refactoring.ui.model.overridemethods;

import org.python.pydev.refactoring.ast.adapters.FunctionDefAdapter;
import org.python.pydev.refactoring.ui.model.tree.ITreeNode;
import org.python.pydev.refactoring.ui.model.tree.TreeNodeSimple;

public class FunctionTreeNode extends TreeNodeSimple<FunctionDefAdapter> {

	private static final String CLOSEBRACKET = ")";

	private static final String OPENBRACKET = "(";

	public FunctionTreeNode(ITreeNode parent, FunctionDefAdapter adapter) {
		super(parent, adapter);
	}

	@Override
	public String getImageName() {
		return ITreeNode.NODE_METHOD;
	}

	@Override
	public String getLabel() {
		return adapter.getName() + OPENBRACKET + adapter.getSignature() + CLOSEBRACKET;
	}

}