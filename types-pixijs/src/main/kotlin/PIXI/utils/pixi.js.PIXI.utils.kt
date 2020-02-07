@file:JsQualifier("PIXI.utils")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package PIXI.utils

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

external fun skipHello()

external fun sayHello(type: String)

external fun isWebGLSupported(): Boolean

external fun hex2rgb(hex: Number, out: Array<Number> = definedExternally): Array<Number>

external fun hex2string(hex: Number): String

external fun string2hex(The: String): Number

external fun rgb2hex(rgb: Array<Number>): Number

external var premultiplyBlendMode: Array<Array<Number>>

external fun correctBlendMode(blendMode: Number, premultiplied: Boolean): Number

external fun premultiplyRgba(rgb: Float32Array, alpha: Number, out: Float32Array = definedExternally, premultiply: Boolean = definedExternally): Float32Array

external fun premultiplyRgba(rgb: Array<Number>, alpha: Number, out: Float32Array = definedExternally, premultiply: Boolean = definedExternally): Float32Array

external fun premultiplyTint(tint: Number, alpha: Number): Number

external fun premultiplyTintToRgba(tint: Number, alpha: Number, out: Float32Array = definedExternally, premultiply: Boolean = definedExternally): Float32Array

external fun createIndicesForQuads(size: Number, outBuffer: Uint16Array = definedExternally): dynamic /* Uint16Array | Uint32Array */

external fun createIndicesForQuads(size: Number, outBuffer: Uint32Array = definedExternally): dynamic /* Uint16Array | Uint32Array */

external fun nextPow2(v: Number): Number

external fun isPow2(v: Number): Boolean

external fun log2(v: Number): Number

external fun removeItems(arr: Array<Any>, startIdx: Number, removeCount: Number)

external fun sign(n: Number): Number

external fun uid(): Number

external interface `T$28` {
    var device: Boolean
    var tablet: Boolean
    var phone: Boolean
    var ipod: Boolean
}

external interface `T$29` {
    var device: Boolean
    var tablet: Boolean
    var phone: Boolean
}

external object isMobile {
    var any: Boolean
    var tablet: Boolean
    var phone: Boolean
    var apple: `T$28`
    var android: `T$29`
    var amazon: `T$29`
    var windows: `T$29`
}

external fun earcut(vertices: Array<Number>, holes: Array<Number> = definedExternally, dimensions: Number = definedExternally): Array<Number>

external var url: Any

external fun deprecation(version: String, message: String, ignoreDepth: Number = definedExternally)

external open class CanvasRenderTarget(width: Number, height: Number, resolution: Number = definedExternally) {
    open var canvas: HTMLCanvasElement
    open var context: CanvasRenderingContext2D
    open fun resize(width: Number, height: Number)
    open fun destroy()
    open var width: Number
    open var height: Number
}

external var ProgramCache: Any

external var TextureCache: Any

external var BaseTextureCache: Any

external fun destroyTextureCache()

external fun clearTextureCache()

external fun trimCanvas(canvas: HTMLCanvasElement): Any

external interface DecomposedDataUri {
    var mediaType: String
    var subType: String
    var charset: String
    var encoding: String
    var data: String
}

external fun decomposeDataUri(dataUri: String): DecomposedDataUri?

external fun getResolutionOfUrl(url: String, defaultValue: Number = definedExternally): Number

external fun createIndicesForQuads(size: Number): dynamic /* Uint16Array | Uint32Array */

external open class EventEmitter {
    open fun eventNames(): Array<dynamic /* String | Any */>
    open fun listeners(event: String): Array<Function<*>>
    open fun listeners(event: Any): Array<Function<*>>
    open fun listenerCount(event: String): Number
    open fun listenerCount(event: Any): Number
    open fun emit(event: String, vararg args: Any): Boolean
    open fun emit(event: Any, vararg args: Any): Boolean
    open fun on(event: String, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun on(event: Any, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun once(event: String, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun once(event: Any, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun removeListener(event: String, fn: Function<*> = definedExternally, context: Any = definedExternally, once: Boolean = definedExternally): EventEmitter /* this */
    open fun removeListener(event: Any, fn: Function<*> = definedExternally, context: Any = definedExternally, once: Boolean = definedExternally): EventEmitter /* this */
    open fun removeAllListeners(event: String = definedExternally): EventEmitter /* this */
    open fun removeAllListeners(event: Any = definedExternally): EventEmitter /* this */
    open fun off(event: String, fn: Function<*> = definedExternally, context: Any = definedExternally, once: Boolean = definedExternally): EventEmitter /* this */
    open fun off(event: Any, fn: Function<*> = definedExternally, context: Any = definedExternally, once: Boolean = definedExternally): EventEmitter /* this */
    open fun addListener(event: String, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun addListener(event: Any, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun removeAllListeners(): EventEmitter /* this */
}
