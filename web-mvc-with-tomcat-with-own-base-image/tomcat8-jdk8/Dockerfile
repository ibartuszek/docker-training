FROM ubuntu:16.04 as BASE

LABEL "Maintainer"="istvan.bartuszek@gmail.com"

# Download latest version of tomcat 8.x
# http://apache.rediris.es/tomcat/tomcat-8/
ENV TOMCAT_VERSION 8.5.65

RUN apt-get update && apt-get -y upgrade \
    # && apt-get -y install software-properties-common \
    && apt install -y wget \
    && apt-get -y install curl \
    && apt-get -y install vim \
    && apt-get install openjdk-8-jre -y

ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64

RUN wget --no-cookies http://apache.rediris.es/tomcat/tomcat-8/v${TOMCAT_VERSION}/bin/apache-tomcat-${TOMCAT_VERSION}.tar.gz -O /tmp/tomcat.tgz \
    && tar xzvf /tmp/tomcat.tgz -C /opt \
    && mv /opt/apache-tomcat-${TOMCAT_VERSION} /opt/tomcat \
    && chmod +x -R /opt/tomcat/bin \
    && rm /tmp/tomcat.tgz \
    && rm -rf /opt/tomcat/webapps/examples \
    && rm -rf /opt/tomcat/webapps/docs \
    && rm -rf /opt/tomcat/webapps/ROOT

