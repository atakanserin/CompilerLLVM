package Javalette.Absyn; // Java Package generated by the BNF Converter.

public class ELitTrue extends Expr {
  public ELitTrue() { }

  public <R,A> R accept(Javalette.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof Javalette.Absyn.ELitTrue) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}