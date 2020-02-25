package by.aquastyle.visitors;

import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class MethodCallVisitor extends VoidVisitorAdapter<Void> {

    @Override
    public void visit(MethodCallExpr n, Void arg) {
        System.out.println(n.getName() + " : " + n.getOrphanComments());
    }
}
