## Gradle Task List

### test 
JUnit Test  

(Output: PROJECT-ROOT/build/reports/tests/test)  

### mergeJUnitReports

Merge JUnit Reports to one xml file

(Output: PROJECT-ROOT/build/test-results/test/xxxx.xml)  

### jacocoTestReport
Generates code coverage report for the test task. (Execute After 'gradlew test')

(Output: PROJECT-ROOT/build/reports/jacoco/test/html)

### findbugs
Run FindBugs analysis for main and test classes
(Output: PROJECT-ROOT/build/reports/findbugs/findbugs.html)

### findbugsMain 
Run FindBugs analysis for main classes

### findbugsTest
Run FindBugs analysis for test classes