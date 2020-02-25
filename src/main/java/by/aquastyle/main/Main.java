package by.aquastyle.main;

import by.aquastyle.visitors.MethodCallVisitor;
import by.aquastyle.visitors.MethodVisitor;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.DataKey;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.visitor.VoidVisitor;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String pathTest = "src/main/resources/Test.java";

    public static void main(String[] args) {
        try {
            CompilationUnit cu = StaticJavaParser.parse(new File(pathTest));
            //List<Node> nodes = cu.getChildNodes();
            /*cu.findRootNode().walk((Node node) -> {
                System.out.println(node.getMetaModel());
                //node.getDataKeys().forEach(System.out::println);
                node.getData();
            });*/
            VoidVisitorAdapter methodVisitor = new MethodVisitor();
            methodVisitor.visit(cu, null);
            System.out.println("---------------------");
            new MethodCallVisitor().visit(cu, null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
