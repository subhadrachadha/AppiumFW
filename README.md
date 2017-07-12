# AppiumFW

SETUP- JAVA,Android,Maven,Appium. Also export there homepath in bash_profile
Setup Appium as described-http://appium.io/getting-started.html


# HOMEPATH
#export ANDROID_HOME=/Users/abc/Library/Android/sdk                                                     
#export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/                    
#export M2_HOME=/Users/abc/Softwares/apache-maven-3.2.5                                                       
#export PATH=${PATH}:$M2_HOME/bin:$JAVA_HOME/bin                                              

# Run the below command for downloading maven dependencies-
mvn clean install 

# Start Appium server
appium &

# Run testNg.xml under src/test/resources
