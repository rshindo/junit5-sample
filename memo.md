# Memo

## インストール

### IDE

EclipseでJunit5を動かすにはMarketplaceでプラグインを別途入れる必要がある

### Maven

必要なものは
* maven-surefire-plugin
* junit-platform-surefire-provider
* junit-jupiter-api
* junit-jupiter-engine

#### maven-surefire-pluginのバージョン

maven-surefire-pluginのバージョンは2.19を使う。2.20でbreaking changeがあったため、2.20で動かすとNoSuchMethodErrorが出てしまう。
