package pixi

import org.w3c.dom.Node

@JsModule("pixi.js")
@JsNonModule
external class PIXI {
    class Application(options: ApplicationOptions){
        val stage: Stage
        val view: Node
    }
    class Graphics {
        fun beginFill(color: Int)
        fun drawRect(x: Int, y: Int, dx: Int, dy: Int)
        fun endFill()
    }
}
