# This is a standalone wiremock application can be used for simple API testing

## How to run
mvn clean install
mvn compile exec:java -Dexec.mainClass=com.wiremock.runner.WireMockStandalone
