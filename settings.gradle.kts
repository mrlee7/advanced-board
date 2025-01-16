plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "advanced-board"

include("common")
include("service")
include("service:article")
include("service:article-read")
include("service:comment")
include("service:hot-article")
include("service:like")
include("service:view")