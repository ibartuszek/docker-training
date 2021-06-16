FROM tomcat8-jdk8:latest

LABEL "Maintainer"="istvan.bartuszek@gmail.com"

COPY sample.war /opt/tomcat/webapps/sample.war

#Set Catalina HOME and JAVA_OPTS
ENV CATALINA_BASE /opt/tomcat
ENV PATH $PATH:$CATALINA_BASE/bin
ENV JAVA_OPTS="-Xms1024m -Xmx1024m -Xss8192k -XX:PermSize=500m -XX:CMSInitiatingOccupancyFraction=50 -XX:+ExplicitGCInvokesConcurrent -XX:+CMSClassUnloadingEnabled -XX:+UseConcMarkSweepGC -XX:+UseParNewGC -XX:NewRatio=1 -XX:SurvivorRatio=1  -Dorg.apache.cxf.JDKBugHacks.imageIO=false"

#Expose this a port to the host machine.
EXPOSE 8080
EXPOSE 8009

# mounts:
VOLUME "/opt/tomcat/webapps"
VOLUME "/opt/tomcat/logs"

#The WORKDIR instruction sets the working directory for any RUN, CMD, ENTRYPOINT, COPY and ADD instructions that follow it in the Dockerfile.
WORKDIR /opt/tomcat

# Launch Tomcat
CMD ["/opt/tomcat/bin/catalina.sh", "run"]
