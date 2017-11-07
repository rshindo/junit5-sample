# Memo

https://speakerdeck.com/eyamane/junit5falsewei-jian  
http://junit.org/junit5/docs/current/user-guide/  
https://speakerdeck.com/irof/dousiyoujunit5  
https://qiita.com/opengl-8080/items/40a922bfdd2709aaea1f  

## Modules

JUnit5は３つのサブプロジェクトから構成されており、さらにそれぞれのサブプロジェクトには複数のModuleがある。

* JUnit Platform
* JUnit Jupiter
* JUnit Vintage

### JUnit Platform

JUnitテストを実行するための基盤を提供する。Maven用、Gradle用のプラグイン等がある。

### JUnit Jupiter

テストを記述するAPIを提供。@TestとかAssertionsとか。JUnit Jupiter用のTestEngineも入っている。

### JUnit Vintage

Junit3, JUnit4用のTestEngineを提供。

## Java Versions

1.8以上必須。

## インストール

### IDE

Eclipse 4.7(Oxygen)はJUnit5対応がようやく入った。ただしdependencyにjunit-platform-launcherを入れないと動かない。
IntelliJ IDEAは最新版でもうすでに対応している。

### Maven

必要なものは
* maven-surefire-plugin
* junit-platform-surefire-provider
* junit-jupiter-api
* junit-jupiter-engine

#### maven-surefire-pluginのバージョン

maven-surefire-pluginのバージョンは2.19を使う。2.20でbreaking changeがあったため、2.20で動かすとNoSuchMethodErrorが出てしまう。
https://github.com/junit-team/junit5/issues/809


## 実行してみる

### 基本的なテストの構造

基本的なテストの書き方はJUnit4と同じ。ただしAnnotationsは一新されている。
あと、メソッドはpublicでなくてもOKになった。

| JUnit4       | JUnit5      |
|--------------|-------------|
| @Test        | @Test       |
| @Before      | @BeforeEach |
| @BeforeClass | @BeforeAll  |
| @After       | @AfterEach  |
| @AfterClass  | @AfterAll   |
| @Ignore      | @Disabled   |

### DisplayNames

@DisplayNamesでテスト名を指定できる。ここで付けた名前はreportingのときに表示される。  
→メソッド名の付け方論争に終止符が。。@DisplayNamesで日本語の文章つければよい。

### タグ


### Assert

* assertTrue
* assertEquals

JUnit4と違い、メッセージは引数の最後になっている。

#### assertAll

JUnit5の目玉(?)機能。Assertをグループ化して、あるグループのAssertが失敗しても別のグループのAssertは続行してくれる。  
ただしメッセージは第一引数。。。
assertAllのネストもできるが、reportingが細かく出ない。

#### assertThrows

@Test(expected=...)の代替。そりゃテストの宣言のところでAssertしてるのはおかしいよね。。。  
第一引数に期待される例外を指定して、第二引数にfunctionを書く。戻り値がTになっているので、Exceptionのmessageとかもassertできる。

#### サードパーティのAssertionライブラリについて

サードパーティのAssertionライブラリ（AssertJ, Hamcrest, Truth, etc）はJUnit4と同じように利用可能。
なお、JUnit5はassertThatを提供していない。
（JUnitではassertは最低限のものだけを提供するという思想から？）

#### Assumptions

テストを実行するかどうかをプログラマティックに制御できる。assumtionが成功した場合のみテストを実行し、失敗したら実行しない。

#### Disabled

クラスorメソッドに@Disabledつけると実行しない


### テストクラスのライフサイクル

デフォルトでテストメソッドごとにインスタンスが生成される。（テストごとの独立性と予想外の副作用を避けるため）  
@TestInstance(Lifecycle.PER_CLASS)って書くとテストクラスのインスタンスが１回だけ生成されるようになる。こうすると@BeforeAllと@AfterAllのメソッドを非staticに書けるようになる。










.
