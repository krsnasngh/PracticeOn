package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestClassThree.class,
        TestClassOne.class,
        TestClassTwo.class
})
public class SuiTe {
}
