package gof.designpatterns._03_behavioral._03_interpreter._02_after;

import java.util.Map;

public class VariableExpression implements PostfixExpression {

  private Character variable;

  public VariableExpression(Character variable) {
    this.variable = variable;
  }

  @Override
  public int interpret(Map<Character, Integer> context) {
    return context.get(variable);
  }
}
