package Javalette.Absyn; // Java Package generated by the BNF Converter.

public class ELitDoub extends Expr {
  public final Double double_;
  public ELitDoub(Double p1) { double_ = p1; }

  public <R,A> R accept(Javalette.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof Javalette.Absyn.ELitDoub) {
      Javalette.Absyn.ELitDoub x = (Javalette.Absyn.ELitDoub)o;
      return this.double_.equals(x.double_);
    }
    return false;
  }

  public int hashCode() {
    return this.double_.hashCode();
  }


}
