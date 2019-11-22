package junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RunnerClass {

    public static void main(String[] args) {
        Result res = JUnitCore.runClasses(SuiTe.class);
    }
}
