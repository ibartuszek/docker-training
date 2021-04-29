FROM ubuntu:latest
LABEL "Maintainer"="istvan.bartuszek@gmail.com"

RUN apt update \
    && apt install -y wget \
    && wget https://download.java.net/openjdk/jdk11/ri/openjdk-11+28_linux-x64_bin.tar.gz -O /tmp/openjdk-11+28_linux-x64_bin.tar.gz \
    && mkdir /usr/lib/jvm \
    && tar xfvz /tmp/openjdk-11+28_linux-x64_bin.tar.gz --directory /usr/lib/jvm \
    && rm -f /tmp/openjdk-11+28_linux-x64_bin.tar.gz

ENV JAVA_HOME=/usr/lib/jvm/jdk-11/ PATH="/usr/lib/jvm/jdk-11/bin:$PATH"

CMD ["java", "--version"]