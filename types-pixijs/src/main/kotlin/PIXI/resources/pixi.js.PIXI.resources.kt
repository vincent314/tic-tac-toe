@file:JsQualifier("PIXI.resources")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package PIXI.resources

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
import PIXI.BaseTexture
import PIXI.Renderer
import PIXI.GLTexture
import PIXI.ALPHA_MODES
import PIXI.ISize

external interface `T$13` {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class ArrayResource : Resource {
    constructor(source: Number, options: `T$13`)
    constructor(source: Array<Any>, options: `T$13`)
    open var items: Array<BaseTexture>
    open var itemDirtyIds: Array<Number>
    open var length: Number
    open fun addResourceAt(resource: Resource, index: Number): ArrayResource
    override fun upload(renderer: Renderer, texture: BaseTexture, glTexture: GLTexture): Boolean
    override var _width: Number
    override var _height: Number
    override var destroyed: Boolean
    override var internal: Boolean
    override fun bind(baseTexture: BaseTexture)
    override fun unbind(baseTexture: BaseTexture)
    override fun resize(width: Number, height: Number)
    override var valid: Boolean
    override fun update()
    override fun load(): Promise<Unit>
    override var width: Number
    override var height: Number
    override fun style(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
    override fun dispose()
    override fun destroy()
}

external open class BaseImageResource : Resource {
    constructor(source: HTMLImageElement)
    constructor(source: HTMLCanvasElement)
    constructor(source: HTMLVideoElement)
    constructor(source: SVGElement)
    open var source: dynamic /* HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | SVGElement */
    open fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLImageElement = definedExternally): Boolean
    open fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLCanvasElement = definedExternally): Boolean
    open fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLVideoElement = definedExternally): Boolean
    open fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: SVGElement = definedExternally): Boolean
    override fun update()
    override var _width: Number
    override var _height: Number
    override var destroyed: Boolean
    override var internal: Boolean
    override fun bind(baseTexture: BaseTexture)
    override fun unbind(baseTexture: BaseTexture)
    override fun resize(width: Number, height: Number)
    override var valid: Boolean
    override fun load(): Promise<Unit>
    override var width: Number
    override var height: Number
    override fun style(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
    override fun dispose()
    override fun destroy()
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean

    companion object {
        fun crossOrigin(element: HTMLElement, url: String, crossorigin: Boolean = definedExternally)
        fun crossOrigin(element: HTMLElement, url: String, crossorigin: String = definedExternally)
        fun crossOrigin(element: HTMLElement, url: String)
    }
}

external interface `T$14` {
    var width: Number
    var height: Number
}

external open class BufferResource : Resource {
    constructor(source: Float32Array, options: `T$14`)
    constructor(source: Uint8Array, options: `T$14`)
    constructor(source: Uint32Array, options: `T$14`)
    open var data: dynamic /* Float32Array | Uint8Array | Uint32Array */
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
    override var _width: Number
    override var _height: Number
    override var destroyed: Boolean
    override var internal: Boolean
    override fun bind(baseTexture: BaseTexture)
    override fun unbind(baseTexture: BaseTexture)
    override fun resize(width: Number, height: Number)
    override var valid: Boolean
    override fun update()
    override fun load(): Promise<Unit>
    override var width: Number
    override var height: Number
    override fun style(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
    override fun dispose()
    override fun destroy()

    companion object {
        fun test(source: Any): Boolean
    }
}

external open class CanvasResource(source: HTMLCanvasElement) : BaseImageResource {
    override var source: dynamic /* HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | SVGElement */
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLImageElement): Boolean
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLCanvasElement): Boolean
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLVideoElement): Boolean
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: SVGElement): Boolean
    override fun update()
    override fun dispose()
    override var _width: Number
    override var _height: Number
    override var destroyed: Boolean
    override var internal: Boolean
    override fun bind(baseTexture: BaseTexture)
    override fun unbind(baseTexture: BaseTexture)
    override fun resize(width: Number, height: Number)
    override var valid: Boolean
    override fun load(): Promise<Unit>
    override var width: Number
    override var height: Number
    override fun style(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
    override fun destroy()
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean

    companion object {
        fun test(source: HTMLCanvasElement): Boolean
        fun test(source: Any): Boolean
    }
}

external open class CubeResource(source: Array<dynamic /* String | PIXI.resources.Resource */> = definedExternally, options: `T$13` = definedExternally) : ArrayResource {
    open fun upload(): Boolean
    override var items: Array<BaseTexture>
    override var itemDirtyIds: Array<Number>
    override var length: Number
    override fun dispose()
    override fun addResourceAt(resource: Resource, index: Number): ArrayResource
    override fun bind(baseTexture: BaseTexture)
    override fun unbind(baseTexture: BaseTexture)
    override fun load(): Promise<Unit>
    override var _width: Number
    override var _height: Number
    override var destroyed: Boolean
    override var internal: Boolean
    override fun resize(width: Number, height: Number)
    override var valid: Boolean
    override fun update()
    override var width: Number
    override var height: Number
    override fun style(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
    override fun destroy()

    companion object {
        var SIDES: Number
    }
}

external open class DepthResource : BufferResource {
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
    override var data: dynamic /* Float32Array | Uint8Array | Uint32Array */
    override fun dispose()
    override var _width: Number
    override var _height: Number
    override var destroyed: Boolean
    override var internal: Boolean
    override fun bind(baseTexture: BaseTexture)
    override fun unbind(baseTexture: BaseTexture)
    override fun resize(width: Number, height: Number)
    override var valid: Boolean
    override fun update()
    override fun load(): Promise<Unit>
    override var width: Number
    override var height: Number
    override fun style(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
    override fun destroy()
}

external open class ImageBitmapResource(source: ImageBitmap) : BaseImageResource {
    override var source: dynamic /* HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | SVGElement */
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLImageElement): Boolean
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLCanvasElement): Boolean
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLVideoElement): Boolean
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: SVGElement): Boolean
    override fun update()
    override fun dispose()
    override var _width: Number
    override var _height: Number
    override var destroyed: Boolean
    override var internal: Boolean
    override fun bind(baseTexture: BaseTexture)
    override fun unbind(baseTexture: BaseTexture)
    override fun resize(width: Number, height: Number)
    override var valid: Boolean
    override fun load(): Promise<Unit>
    override var width: Number
    override var height: Number
    override fun style(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
    override fun destroy()
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean

    companion object {
        fun test(source: ImageBitmap): Boolean
    }
}

external open class ImageResource : BaseImageResource {
    constructor(source: HTMLImageElement)
    constructor(source: String)
    open var url: String
    open var preserveBitmap: Boolean
    open var createBitmap: Boolean
    open var alphaMode: ALPHA_MODES?
    open var bitmap: ImageBitmap
    open fun load(createBitmap: Boolean = definedExternally): Promise<Unit>
    open fun process(): Promise<Unit>
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
    override var source: dynamic /* HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | SVGElement */
    override fun update()
    override fun dispose()
    override var _width: Number
    override var _height: Number
    override var destroyed: Boolean
    override var internal: Boolean
    override fun bind(baseTexture: BaseTexture)
    override fun unbind(baseTexture: BaseTexture)
    override fun resize(width: Number, height: Number)
    override var valid: Boolean
    override var width: Number
    override var height: Number
    override fun style(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
    override fun destroy()
}

external open class Resource(width: Number = definedExternally, height: Number = definedExternally) {
    open var _width: Number
    open var _height: Number
    open var destroyed: Boolean
    open var internal: Boolean
    open fun bind(baseTexture: BaseTexture)
    open fun unbind(baseTexture: BaseTexture)
    open fun resize(width: Number, height: Number)
    open var valid: Boolean
    open fun update()
    open fun load(): Promise<Unit>
    open var width: Number
    open var height: Number
    open fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
    open fun style(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
    open fun dispose()
    open fun destroy()
}

external interface `T$15` {
    var scale: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var autoLoad: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class SVGResource(source: String, options: `T$15` = definedExternally) : BaseImageResource {
    open var svg: String
    open var scale: Number
    open var _overrideWidth: Number
    open var _overrideHeight: Number
    override var source: dynamic /* HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | SVGElement */
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLImageElement): Boolean
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLCanvasElement): Boolean
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLVideoElement): Boolean
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: SVGElement): Boolean
    override fun update()
    override fun dispose()
    override var _width: Number
    override var _height: Number
    override var destroyed: Boolean
    override var internal: Boolean
    override fun bind(baseTexture: BaseTexture)
    override fun unbind(baseTexture: BaseTexture)
    override fun resize(width: Number, height: Number)
    override var valid: Boolean
    override fun load(): Promise<Unit>
    override var width: Number
    override var height: Number
    override fun style(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
    override fun destroy()
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean

    companion object {
        fun getSize(svgString: String): ISize
        fun test(source: Any, extension: String)
        var SVG_SIZE: dynamic /* RegExp | String */
    }
}

external interface `T$16` {
    var autoLoad: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var autoPlay: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var updateFPS: Number?
        get() = definedExternally
        set(value) = definedExternally
    var crossorigin: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VideoResource : BaseImageResource {
    constructor(source: HTMLVideoElement, options: `T$16`)
    constructor(source: Any, options: `T$16`)
    constructor(source: String, options: `T$16`)
    constructor(source: Array<dynamic /* String | Any */>, options: `T$16`)
    open var autoPlay: Boolean
    open fun update(deltaTime: Number = definedExternally)
    override fun load(): Promise<Unit>
    open var autoUpdate: Boolean
    open var updateFPS: Number
    override var source: dynamic /* HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | SVGElement */
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLImageElement): Boolean
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLCanvasElement): Boolean
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLVideoElement): Boolean
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: SVGElement): Boolean
    override fun dispose()
    override var _width: Number
    override var _height: Number
    override var destroyed: Boolean
    override var internal: Boolean
    override fun bind(baseTexture: BaseTexture)
    override fun unbind(baseTexture: BaseTexture)
    override fun resize(width: Number, height: Number)
    override var valid: Boolean
    override var width: Number
    override var height: Number
    override fun style(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
    override fun destroy()
    override fun upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean

    companion object {
        fun test(source: Any, extension: String): Boolean
        var TYPES: Array<String>
    }
}

external var INSTALLED: Array<Any>

external interface `T$17` {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var autoLoad: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var scale: Number?
        get() = definedExternally
        set(value) = definedExternally
    var createBitmap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var crossorigin: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var autoPlay: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var updateFPS: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external fun autoDetectResource(source: String, options: `T$17` = definedExternally): Resource

external fun autoDetectResource(source: Any, options: `T$17` = definedExternally): Resource
