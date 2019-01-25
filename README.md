# spring-boot-starter-template
spring-boot-starter模板代码，用于生成maven项目骨架
1. 在根目录下执行`archetype:create-from-project`
2. 将target/generated-sources/archetype/src/main/resources/META-INF/maven/archetype-metadata.xml文件内容替换为archetype-metadata-backup.xml中的**内容**
3. 在target/generated-sources/archetype下执行mvn install将项目骨架安装到本地仓库
4. 使用，在IDEA中添加自定义archetype,添加就能自动生成项目模板
5. 如果需要团队共享，则需要将jar(target/generated-sources/archetype/target/project-archetype-1.0.RELEASE.jar)包上传到私服`mvn deploy:deploy-file -DgroupId=com.pengttyy -DartifactId=project-archetype -Dversion=1.0.RELEASE -Dpackaging=jar -Dfile=project-archetype-1.0.RELEASE.jar -Durl=https://api.bintray.com/maven/pengttyy/maven-repo/project-archetype/;publish=1 -DrepositoryId=bintray-pengttyy-maven-repo`

**注意上传私服需要在setting.xml中配置用户名和密码**
