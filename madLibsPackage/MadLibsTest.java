package madLibsPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// More assertion examples can be found 
// https://courses.cs.washington.edu/courses/cse143/11wi/eclipse-tutorial/junit.shtml
class MadLibsTest {

	MadLibs madlibs = new MadLibs();
	@Test
	void testCustomWords() {
		assertEquals("This is a bug, delete this quote", madlibs.GetCustomWordByIndex(0), "Failed to return custom word");
		madlibs.AddCustomWord("Github saved this and no one knew to fork this repo");
		assertEquals("Github saved this and no one knew to fork this repo", "Github saved this and no one knew to fork this repo");
	}

}
