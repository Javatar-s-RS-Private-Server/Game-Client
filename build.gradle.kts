plugins {
    java
    application
    id("org.openjfx.javafxplugin") version "0.0.10"
}

group = "com.javatar"
version = "1.0-SNAPSHOT"

javafx {
    version = "15.0.1"
    modules(
        "javafx.base",
        "javafx.graphics",
        "javafx.controls",
        "javafx.fxml",
        "javafx.web"
    )
}

application {
    /*applicationDefaultJvmArgs = listOf(
        "1",
        "live",
        "live",
        "highmem",
        "members",
        "english",
        "game0"
    )*/
    mainClass.set("com.javatar.jagex.Client")
}

dependencies {

}