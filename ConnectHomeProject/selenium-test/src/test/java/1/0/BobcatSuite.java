package 1.0;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.cognifide.qa.bb.junit.Modules;
import com.cognifide.qa.bb.junit.concurrent.ConcurrentSuite;

import 1.0.GuiceModule;

@Modules(GuiceModule.class)
@RunWith(ConcurrentSuite.class)
@Suite.SuiteClasses({WikipediaTest.class})
public class BobcatSuite {

}
