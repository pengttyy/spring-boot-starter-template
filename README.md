# spring-boot-starter-template
spring-boot-starter模板代码，用于生成maven项目骨架
1. 在根目录下执行`archetype:create-from-project`
2. 将target/generated-sources/archetype/src/main/resources/META-INF/maven/archetype-metadata.xml文件内容替换为archetype-metadata-backup.xml中的**内容**
3. 在target/generated-sources/archetype下执行mvn install将项目骨架安装到本地仓库
4. 使用，在IDEA中添加自定义archetype,添加就能自动生成项目模板