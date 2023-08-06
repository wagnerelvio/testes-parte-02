package br.com.welc.testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
//@SuiteClasses({ClienteServiceTest.class, TestesJunit.class})
//@SuiteClasses({PrimeiroTeste.class, SegundoTeste.class})
@SuiteClasses({ClienteServiceTest.class, ContratoServiceTest.class})
public class AllTest {

}
