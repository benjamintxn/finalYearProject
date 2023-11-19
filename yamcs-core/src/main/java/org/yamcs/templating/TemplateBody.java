package org.yamcs.templating;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TemplateBody {

    private List<Statement> statements = new ArrayList<>();

    public void addStatement(Statement statement) {
        statements.add(statement);
    }

    public String render(Map<String, Object> vars) {
        var buf = new StringBuilder();
        for (var statement : statements) {
            statement.render(buf, vars);
        }
        return buf.toString();
    }
}
