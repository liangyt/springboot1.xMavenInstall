#### maven 插件 portable-config-maven-plugin

1.添加插件依赖：
```apple js
<plugin>
    <groupId>com.juvenxu.portable-config-maven-plugin</groupId>
    <artifactId>portable-config-maven-plugin</artifactId>
    <version>1.1.5</version>
    <executions>
        <execution>
            <goals>
                <goal>replace-package</goal>
            </goals>
        </execution>
    </executions>
    <configuration>
        <!-- 这里添加的变量，就是profiles 里面需要使用到的文件路径对应的属性值 -->
        <portableConfig>${portableConfig}</portableConfig>
    </configuration>
</plugin>
```
2.prodfiles 配置:
```apple js
<profiles>
    <!-- mvn install -DskipTest 命令运行使用这个配置-->
    <profile>
        <id>test</id>
        <properties>
            <portableConfig>src/main/portable/test.xml</portableConfig>
        </properties>
        <activation>
            <!-- 默认使用的配置 -->
            <activeByDefault>true</activeByDefault>
        </activation>
    </profile>
    <!-- mvn install -DskipTest -Pproduct 命令运行使用这个配置-->
    <profile>
        <id>product</id>
        <properties>
            <portableConfig>src/main/portable/product.xml</portableConfig>
        </properties>
    </profile>
</profiles>
```