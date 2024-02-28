FROM 2.414.2-lts-jdk17.latest

ENV JAVA_OPTS=-Djenkins.install.runSetupWizard=false

COPY plugins.txt /usr/share/jenkins/ref/

RUN python3

RUN python3-pip

RUN jenkins-plugin-cli /usr/share/jenkins/ref
