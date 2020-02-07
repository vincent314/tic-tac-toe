@file:JsQualifier("PIXI.interaction")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package PIXI.interaction

import PIXI.*
import PIXI.utils.EventEmitter
import org.w3c.dom.HTMLElement
import org.w3c.dom.Touch
import org.w3c.dom.events.MouseEvent
import org.w3c.dom.pointerevents.PointerEvent
import kotlin.js.Json

external open class InteractionData {
    open var global: Point
    open var target: Sprite
    open var originalEvent: dynamic /* MouseEvent | TouchEvent | PointerEvent */
    open var identifier: Number
    open var isPrimary: Boolean
    open var button: Number
    open var buttons: Number
    open var width: Number
    open var height: Number
    open var tiltX: Number
    open var tiltY: Number
    open var pointerType: String
    open var pressure: Number
    open var rotationAngle: Number
    open var twist: Number
    open var tangentialPressure: Number
    open var pointerId: Number
    open fun getLocalPosition(displayObject: DisplayObject, point: Point = definedExternally, globalPos: Point = definedExternally): Point
    open fun copyEvent(event: Touch)
    open fun copyEvent(event: MouseEvent)
    open fun copyEvent(event: PointerEvent)
    open fun reset()
}

external open class InteractionEvent {
    open var stopped: Boolean
    open var target: DisplayObject
    open var currentTarget: DisplayObject
    open var type: String
    open var data: InteractionData
    open fun stopPropagation()
    open fun reset()
}

external interface `T$20` {
    var autoPreventDefault: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var interactionFrequency: Number?
        get() = definedExternally
        set(value) = definedExternally
    var useSystemTicker: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class InteractionManager(renderer: PIXI.Renderer, options: `T$20` = definedExternally) : EventEmitter {
    open var renderer: AbstractRenderer
    open var autoPreventDefault: Boolean
    open var interactionFrequency: Number
    open var mouse: InteractionData
    open var eventData: Any
    open var interactionDOMElement: HTMLElement
    open var moveWhenInside: Boolean
    open var eventsAdded: Boolean
    open var tickerAdded: Boolean
    open var mouseOverRenderer: Boolean
    open var supportsTouchEvents: Boolean
    open var supportsPointerEvents: Boolean
    open var cursorStyles: Json
    open var currentCursorMode: String
    open var resolution: Number
    open var useSystemTicker: Boolean
    open fun hitTest(globalPoint: Point, root: Container = definedExternally): DisplayObject
    open fun setTargetElement(element: HTMLElement, resolution: Number = definedExternally)
    open fun tickerUpdate(deltaTime: Number)
    open fun update()
    open fun setCursorMode(mode: String)
    open fun mapPositionToPoint(point: Point, x: Number, y: Number)
    open fun processInteractive(interactionEvent: InteractionEvent, displayObject: Container, func: (params: Array<Any>) -> Any = definedExternally, hitTest: Boolean = definedExternally)
    open fun processInteractive(interactionEvent: InteractionEvent, displayObject: Sprite, func: (params: Array<Any>) -> Any = definedExternally, hitTest: Boolean = definedExternally)
    open fun processInteractive(interactionEvent: InteractionEvent, displayObject: TilingSprite, func: (params: Array<Any>) -> Any = definedExternally, hitTest: Boolean = definedExternally)
    open fun destroy()
}
