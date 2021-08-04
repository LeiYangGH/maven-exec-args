# maven-exec-args
experiments with exec-maven-plugin, exec:exec and exec:java, with arguments.

# app
```bash
com.Main
-n ly -g F
```

# exec:exec

```bash
mvn exec:exec -Dinput.name=mvnn
```
exec:java -Dinput.name=mvnn
```xml
  <plugin>
    <groupId>org.codehaus.mojo</groupId>
    <artifactId>exec-maven-plugin</artifactId>
    <version>1.2.1</version>
    <executions>
      <execution>
        <goals>
          <goal>java</goal>
        </goals>
      </execution>
    </executions>
    <configuration>
      <includePluginDependencies>true</includePluginDependencies>
      <mainClass>com.Main</mainClass>
      <arguments>
        <argument>-n</argument>
        <argument>${input.name}</argument>
        <argument>-g</argument>
        <argument>${input.gener}</argument>
      </arguments>
    </configuration>
  </plugin>
```

# exec:java

