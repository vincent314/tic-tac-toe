package pixi

external interface ApplicationOptions {
    var antialias: Boolean
    var backgroundColor: Int
}

fun ApplicationOptions(): ApplicationOptions = js("{}")
