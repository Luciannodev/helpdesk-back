import groovy.xml.dom.DOMCategory.attributes

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
	java
	id("org.springframework.boot") version "2.7.8"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("jvm") version "1.5.32"
	kotlin("plugin.spring") version "1.5.32"
}


group = "br.com.zezinho"
version = "0.0.1-SNAPSHOT"

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
	maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("io.jsonwebtoken:jjwt-api:0.11.5")
	implementation("io.jsonwebtoken:jjwt-impl:0.11.5")
	implementation("io.jsonwebtoken:jjwt-jackson:0.11.5")
	implementation("mysql:mysql-connector-java:8.0.28")
	implementation("com.h2database:h2:1.4.200")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	annotationProcessor("org.projectlombok:lombok")
}




