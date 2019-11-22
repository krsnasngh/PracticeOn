package junit;

import org.junit.*;

public class TestClassThree {

    @Before
    public void beforeAll(){
        System.out.println("----- Before Is Running In Test Class Three -----");
    }

    @After
    public void afterAll(){
        System.out.println("----- After Is Running In Test Class Three -----");
    }

    @BeforeClass
    public static void beforeClassOne(){

        System.out.println("----- Before Class 1 Is Running In Class Three -----");
    }

    @BeforeClass
    public static void beforeClassTwo(){

        System.out.println("----- Before Class 2 Is Running In Test Class Three -----");
    }

    @Test
    public void testOne(){
        System.out.println("----- Running Test 1 In Test Class Three -----");
    }

    @Test
    public void testTwo(){
        System.out.println("----- Running Test 2 In Test Class Three -----");
    }

    @AfterClass
    public static void afterClassTwo(){

        System.out.println("----- After Class 2 Is Running In Test Class Three -----");
    }

    @AfterClass
    public static void afterClassOne(){

        System.out.println("----- After Class 1 Is Running In Test Class Three -----");
    }
}
