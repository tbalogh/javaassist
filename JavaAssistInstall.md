# Development environment

1. **JDK**: java fordító és futtatókörnyezet.
2. **Maven**: Java build rendszer.
3. **Chromedriver**: Driver amely a chrome böngésző UI alapú elérését, lekérdezését és vezérlését teszi lehetőve.
4. **Selenium server**: Lehetővé teszi a WebDriver-ek távoli elérését, azaz a teszt kód képes más számítógépen futni mint ahol a böngésző fut. (a selenium server együttműködik a webdriverekkel)
5. **IntelliJ IDEA**: A fejlesztőkörnyezet java alapú projektekhez. (A program valójában szöveges fájlok sorozata. Miben más ebben fejleszteni mint egy notepadben?)
6. **Git**: Verziókövető program mely lehetővé teszi a programunk változásainak követését. Több szempontból elengedhetetlen a szoftverfejlesztéshez. 



# Setup java (jdk)

1. Download java jdk: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
2. Setup environment variables: https://www.mkyong.com/java/how-to-set-java_home-on-windows-10/
*  Setup JAVA_HOME
*  Add JAVA_HOME to PATH
3. Check jdk setup correctly. Open **new** terminal/command prompt and type the following commands:
```
java -version

javac -version
```
* Common mistake: Not a new terminal/command prompt opened
* You should see the similar outputs to the followings:
```
java version "1.8.0_74"
Java(TM) SE Runtime Environment (build 1.8.0_74-b02)
Java HotSpot(TM) 64-Bit Server VM (build 25.74-b02, mixed mode)

javac 1.8.0_74
```

* Also you will find java in the following locations: "C:\Program Files\Java"



# Setup Maven:

Some help for the setup: https://maven.apache.org/guides/getting-started/windows-prerequisites.html

1. Download maven from http://xenia.sote.hu/ftp/mirrors/www.apache.org/maven/maven-3/3.5.3/binaries/apache-maven-3.5.3-bin.zip
2. Create a directory "C:\Users\<your_user_name>\programs" and extract the downloaded zip into "C:\Users\<your_user_name>\programs\"
3. Add to the path "C:\Users\<your_user_name>\programs\apache-maven-3.5.3\bin"
4. Check maven setup correctly. Open **new** terminal/command prompt and type the following commands:
```
mvn --help
```
* Common mistake: Not a new terminal/command prompt opened and the new environment variables not be parsed.


# Setup IntelliJ IDEA

1. Download from: https://www.jetbrains.com/idea/download
2. Install with default settings.
3. Open after installation and skip the "import previous settings" window.

## toughts:
* live templates - sout
* globalis menu es projekt menu pl.: altalaban 8-as javat hasznalj, de ehhez a projekthez 6-osat



# Setup Selenium
--------------

1. Download from: https://goo.gl/rW9Yvk
2. Copy downloaded jar to the "C:\Users\<your_user_name>\programs" folder. **Chrome will ask to keep or discard. Choose keep!**
3. Check selenium setup correctly. Open **new** terminal/command prompt and type the following commands:
```
java -jar "C:\Users\<your_user_name>\programs\selenium-server-standalone-3.10.0"
```
* You should see similar to the followings (**The last line the most important**):
```
22:33:23.183 INFO - Selenium build info: version: '3.7.1', revision: '8a0099a'
22:33:23.184 INFO - Launching a standalone Selenium Server
2018-03-08 22:33:23.233:INFO::main: Logging initialized @525ms to org.seleniumhq.jetty9.util.log.StdErrLog
2018-03-08 22:33:23.596:INFO:osjs.AbstractConnector:main: Started ServerConnector@4abdb505{HTTP/1.1,[http/1.1]}{0.0.0.0:4444}
2018-03-08 22:33:23.596:INFO:osjs.Server:main: Started @889ms
22:33:23.596 INFO - Selenium Server is up and running
```

# Setup Chromedriver

1. Download from: https://chromedriver.storage.googleapis.com/index.html?path=2.36/
2. Extract the program and copy to the "C:\Users\<your_user_name>\programs" folder
3. Check chromedriver setup correctly. Double-click on "C:\Users\<your_user_name>\programs\chromedriver.exe" and a window terminal will open.

* In order to Chromedriver work with Selenium you must add "C:\Users\<your_user_name>\programs\chromedriver.exe" to the PATH.
* Alternatively you can start Selenium 
java -Dwebdriver.chrome.driver="C:\Users\testuser\Downloads\chromedriver.exe" -jar "C:\Users\testuser\Downloads\selenium-server-standalone-3.10.0 (3).jar"



# Create new project


Beszelni a projekt ablakrol. 
Annyira nem jol strukturalt. A java egy altalanos celu programozasi nyelv, fokent webes rendszerek (backend)
hasznalt, de nyelvelemzo szoftvertol kezdve sok mindenre jo. Tovabba limitaltan kepes mas nyelvekkel 
egyuttmukodni. Emiatt is van az, hogy a framework pluginok nagyon sok latszik


Java project vs Maven project az IntelliJ-ben: (c#-ban console application, ASP.NET, .NET verzio )
.idea mappa es a <projektnev>.iml fajllal nem kell foglalkozni.

Sima java projekt eseteben nem ad semmit nekunk az ide, csak le tudja forditani. nincs dependencia kezeles, test feladat futtatasa
 



task: LocalMaven-t megmutatni illetve hogy automatikusan feloldott egy csomo fuggoseget
 <repositories>
        <repository>
            <id>central</id>
            <layout>default</layout>
            <url>http://repo1.maven.org/maven2/</url>
        </repository>
    </repositories>

    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>2.53.1</version>
        </dependency>
    </dependencies>