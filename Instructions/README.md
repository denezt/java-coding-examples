# Creating Executable Java Archives

### Written for Maven

``` xml
<build>
  <plugins>
    <plugin>
      <!-- Build an executable JAR -->
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-jar-plugin</artifactId>
      <version>3.1.0</version>
      <configuration>
        <archive>
          <manifest>
            <addClasspath>true</addClasspath>
            <classpathPrefix>lib/</classpathPrefix>
            <mainClass>com.mypackage.MyClass</mainClass>
          </manifest>
        </archive>
      </configuration>
    </plugin>
  </plugins>
</build>
```

### Written for Ant 

``` xml
<jar destfile="build/main/checksites.jar">
  <fileset dir="build/main/classes"/>
  <zipfileset includes="**/*.class" src="lib/main/some.jar"/>
  <manifest>
    <attribute name="Main-Class" value="com.acme.checksites.Main"/>
  </manifest>
</jar>

```

### Written for Gradle

``` gradle
plugins {
    id 'java'
}

jar {
    manifest {
        attributes(
                'Main-Class': 'com.mypackage.MyClass'
        )
    }
}
```
