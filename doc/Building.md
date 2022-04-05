## Building instructions

To build the plugins and create an update site, simply clone this repository, and execute the clean and verify maven phases in the root of the project. I.e.:

```
https://github.com/SOM-Research/asyncapi-toolkit.git
cd asyncapi-toolkit
mvn clean verify
```

To also create a pre-packaged product ready to be unzipped and executed, run:

```
mvn clean verify -P build-products
```

To deploy the created update sites in the `gh-pages` branch of GitHub, run:

```
mvn clean deploy
```

In order to authenticate in GitHub, a proper `~/.m2/settings.xml` file should be created with a personal access token:

```
<settings>
    <servers> 
        <server>
            <id>github</id>
            <password>HERE_THE_TOKEN</password>
        </server>
    </servers>
</settings>
```


## Preparing a new release

In order to prepare a new release, it is necessary to change the version of all plugins, features, and pom.xml files at a time. To do this, simply execute (where x.x.x must be replaced by the desired version number):

```
mvn clean tycho-versions:set-version -DnewVersion=x.x.x-SNAPSHOT
```
