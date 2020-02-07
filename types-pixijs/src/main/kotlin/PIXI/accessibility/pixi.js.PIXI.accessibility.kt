@file:JsQualifier("PIXI.accessibility")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package PIXI.accessibility

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
import PIXI.AbstractRenderer
import PIXI.Rectangle

external open class AccessibilityManager(renderer: PIXI.Renderer) {
    open var debug: Boolean
    open var renderer: AbstractRenderer
    open var isActive: Boolean
    open var isMobileAccessibility: Boolean
    open fun updateDebugHTML(div: HTMLDivElement)
    open fun capHitArea(hitArea: Rectangle)
    open fun destroy()
}