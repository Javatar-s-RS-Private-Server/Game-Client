plugins {
    java
    application
}

group = "com.javatar"
version = "1.0-SNAPSHOT"

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
    mainClass.set("Client")
}

dependencies {

}