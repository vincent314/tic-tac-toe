@file:JsQualifier("PIXI.graphicsUtils")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package PIXI.graphicsUtils

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import PIXI.FillStyle
import PIXI.LineStyle
import PIXI.BatchDrawCall

external open class BatchPart {
    open fun begin(style: FillStyle, startIndex: Number, attribStart: Number)
    open fun begin(style: LineStyle, startIndex: Number, attribStart: Number)
    open fun end(endIndex: Number, endAttrib: Number)
}

external var FILL_COMMANDS: Any

external var BATCH_POOL: Array<BatchPart>

external var DRAW_CALL_POOL: Array<BatchDrawCall>