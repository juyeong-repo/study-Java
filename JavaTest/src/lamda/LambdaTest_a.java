package lamda;

public class LambdaTest_a {

	public static void exec(Operator op) {
		int k = 10;
		int m = 20;
		int value = op.opFunc(k, m);
		System.out.println("OperatorUse¿« exec() k="+k+" ,m= "+m+" ,value= "+value);
	}
}
