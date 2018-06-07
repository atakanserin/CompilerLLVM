package Javalette.Absyn; // Java Package generated by the BNF Converter.

public abstract class RelOp implements java.io.Serializable {
  public abstract <R,A> R accept(RelOp.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(Javalette.Absyn.LTH p, A arg);
    public R visit(Javalette.Absyn.LE p, A arg);
    public R visit(Javalette.Absyn.GTH p, A arg);
    public R visit(Javalette.Absyn.GE p, A arg);
    public R visit(Javalette.Absyn.EQU p, A arg);
    public R visit(Javalette.Absyn.NE p, A arg);

  }

}