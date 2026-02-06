# java-ac4y-base

Base utilities and services for Ac4y projects.

## Overview

This library provides core utility classes for Ac4y applications including:

- **GUID/UUID generation** - `GUIDHandler`
- **String manipulation** - `StringHandler`, `Ac4yStringHandler`
- **Date handling** - `DateHandler`
- **XML processing** - `XMLHandler`, `JDOMXMLHander`, `XSLHandler`
- **JSON handling** - `GsonCap`
- **JAXB support** - `JaxbCap`
- **File operations** - `SEQFileHandler`
- **Environment handling** - `Ac4yEnvironmentHandler`
- **HTTP services** - `Ac4yHttpService`
- **Error handling** - `ErrorHandler`, `Ac4yException`
- **Process management** - `Ac4yProcess`, `Ac4yProcessContext`
- **Property handling** - `ExternalPropertyHandler`

## Installation

Add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>ac4y</groupId>
    <artifactId>ac4y-base</artifactId>
    <version>1.0.0</version>
</dependency>
```

### GitHub Packages Configuration

Add the GitHub Packages repository to your `pom.xml`:

```xml
<repositories>
    <repository>
        <id>github</id>
        <name>GitHub Packages</name>
        <url>https://maven.pkg.github.com/ac4y/*</url>
    </repository>
</repositories>
```

Configure authentication in `~/.m2/settings.xml`:

```xml
<servers>
    <server>
        <id>github</id>
        <username>YOUR_GITHUB_USERNAME</username>
        <password>YOUR_GITHUB_TOKEN</password>
    </server>
</servers>
```

Note: Your GitHub token must have `read:packages` scope.

## Building

```bash
mvn clean install
```

## Testing

```bash
mvn test
```

## License

This project is part of the Ac4y ecosystem.

