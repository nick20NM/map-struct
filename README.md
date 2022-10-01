swagger ui -> http://localhost:8080/swagger-ui.html

h2 db -> http://localhost:8080/h2

add in application.properties file for swagger ui -> spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER

add below dependencies & plugin in pom.xml file ->

        <dependency>
    		<groupId>org.mapstruct</groupId>
    		<artifactId>mapstruct</artifactId>
    		<version>1.4.2.Final</version>
    	</dependency>
    	<dependency>
    		<groupId>io.springfox</groupId>
    		<artifactId>springfox-swagger2</artifactId>
    		<version>2.9.2</version>
    	</dependency>
    	<dependency>
    		<groupId>io.springfox</groupId>
    		<artifactId>springfox-swagger-ui</artifactId>
    		<version>2.9.2</version>
    	</dependency>

            <plugin>
    			<groupId>org.apache.maven.plugins</groupId>
    			<artifactId>maven-compiler-plugin</artifactId>
    			<version>3.5.1</version>
    			<configuration>
    				<source>1.8</source>
    				<target>1.8</target>
    				<annotationProcessorPaths>
    					<path>
    						<groupId>org.projectlombok</groupId>
    						<artifactId>lombok</artifactId>
    						<version>1.18.10</version>
    					</path>
    					<path>
    						<groupId>org.projectlombok</groupId>
    						<artifactId>lombok-mapstruct-binding</artifactId>
    						<version>0.2.0</version>
    					</path>
    					<path>
    						<groupId>org.mapstruct</groupId>
    						<artifactId>mapstruct-processor</artifactId>
    						<version>1.4.2.Final</version>
    					</path>
    				</annotationProcessorPaths>
    			</configuration>
    		</plugin>
