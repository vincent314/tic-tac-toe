@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package org.vince.tictactoe

import PIXI.DisplayObject
import PIXI.`T$0`
import kotlin.browser.document


actual fun draw(game: Game) {
    val app = PIXI.Application((js("{}") as `T$0`).apply {
        antialias = true
        backgroundColor = 0xDE3249
    })

    document.body?.appendChild(app.view)

    val graphics = PIXI.Graphics()

    graphics.beginFill(0xFEEB77)
    graphics.drawRect(50, 50, 100, 100)
    graphics.endFill()

    app.stage.addChild(graphics as DisplayObject)
}
