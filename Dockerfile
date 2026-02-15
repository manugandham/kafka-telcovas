FROM tomcat:8.0.20-jre8
# Dummy text to test 
COPY target/kafka-telcovas*.war /usr/local/tomcat/webapps/kafka-telcovas
