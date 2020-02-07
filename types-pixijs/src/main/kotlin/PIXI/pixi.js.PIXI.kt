@file:JsModule("pixi.js")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "PackageName")

package PIXI

import PIXI.accessibility.AccessibilityManager
import PIXI.graphicsUtils.BatchPart
import PIXI.interaction.InteractionManager
import PIXI.resources.Resource
import PIXI.systems.*
import PIXI.utils.EventEmitter
import SharedArrayBuffer
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.svg.SVGElement
import org.w3c.xhr.XMLHttpRequest

external var VERSION: String

external interface `T$0` {
    var autoStart: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var view: HTMLCanvasElement?
        get() = definedExternally
        set(value) = definedExternally
    var transparent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var autoDensity: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var antialias: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var preserveDrawingBuffer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var resolution: Number?
        get() = definedExternally
        set(value) = definedExternally
    var forceCanvas: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var clearBeforeRender: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var forceFXAA: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var powerPreference: String?
        get() = definedExternally
        set(value) = definedExternally
    var sharedTicker: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sharedLoader: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var resizeTo: dynamic /* Window | HTMLElement */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$1` {
    var children: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var texture: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var baseTexture: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Application(options: `T$0` = definedExternally) {
    open var renderer: Renderer
    open var stage: Container
    open fun render()
    open var view: HTMLCanvasElement
    open var screen: Rectangle
    open fun destroy(removeView: Boolean = definedExternally, stageOptions: `T$1` = definedExternally)
    open var resizeTo: dynamic /* Window | HTMLElement */
    open fun resize()
    open var loader: Any
    open fun stop()
    open fun start()
    open var ticker: Ticker

    interface Plugin {
        var init: (params: Any) -> Any
        var destroy: (params: Any) -> Any
    }

    companion object {
        fun registerPlugin(plugin: Plugin)
    }
}

external enum class ENV {
    WEBGL_LEGACY,
    WEBGL,
    WEBGL2
}

external enum class RENDERER_TYPE {
    UNKNOWN,
    WEBGL,
    CANVAS
}

external enum class BLEND_MODES {
    NORMAL,
    ADD,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    NORMAL_NPM,
    ADD_NPM,
    SCREEN_NPM,
    NONE,
    SRC_IN,
    SRC_OUT,
    SRC_ATOP,
    DST_OVER,
    DST_IN,
    DST_OUT,
    DST_ATOP,
    SUBTRACT,
    SRC_OVER,
    ERASE,
    XOR
}

external enum class DRAW_MODES {
    POINTS,
    LINES,
    LINE_LOOP,
    LINE_STRIP,
    TRIANGLES,
    TRIANGLE_STRIP,
    TRIANGLE_FAN
}

external enum class FORMATS {
    RGBA,
    RGB,
    ALPHA,
    LUMINANCE,
    LUMINANCE_ALPHA,
    DEPTH_COMPONENT,
    DEPTH_STENCIL
}

external enum class TARGETS {
    TEXTURE_2D,
    TEXTURE_CUBE_MAP,
    TEXTURE_2D_ARRAY,
    TEXTURE_CUBE_MAP_POSITIVE_X,
    TEXTURE_CUBE_MAP_NEGATIVE_X,
    TEXTURE_CUBE_MAP_POSITIVE_Y,
    TEXTURE_CUBE_MAP_NEGATIVE_Y,
    TEXTURE_CUBE_MAP_POSITIVE_Z,
    TEXTURE_CUBE_MAP_NEGATIVE_Z
}

external enum class TYPES {
    UNSIGNED_BYTE,
    UNSIGNED_SHORT,
    UNSIGNED_SHORT_5_6_5,
    UNSIGNED_SHORT_4_4_4_4,
    UNSIGNED_SHORT_5_5_5_1,
    FLOAT,
    HALF_FLOAT
}

external enum class SCALE_MODES {
    LINEAR,
    NEAREST
}

external enum class WRAP_MODES {
    CLAMP,
    REPEAT,
    MIRRORED_REPEAT
}

external enum class MIPMAP_MODES {
    OFF,
    POW2,
    ON
}

external enum class ALPHA_MODES {
    NO_PREMULTIPLIED_ALPHA,
    PREMULTIPLY_ON_UPLOAD,
    PREMULTIPLIED_ALPHA,
    NPM,
    UNPACK,
    PMA
}

external enum class GC_MODES {
    AUTO,
    MANUAL
}

external enum class PRECISION {
    LOW,
    MEDIUM,
    HIGH
}

external enum class MASK_TYPES {
    NONE,
    SCISSOR,
    STENCIL,
    SPRITE
}

external interface `T$2` {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var view: HTMLCanvasElement?
        get() = definedExternally
        set(value) = definedExternally
    var transparent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var autoDensity: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var antialias: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var resolution: Number?
        get() = definedExternally
        set(value) = definedExternally
    var preserveDrawingBuffer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var clearBeforeRender: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class AbstractRenderer(system: String, options: `T$2` = definedExternally) : EventEmitter {
    open var options: Any
    open var type: Number
    open var screen: Rectangle
    open var view: HTMLCanvasElement
    open var resolution: Number
    open var transparent: Boolean
    open var autoDensity: Boolean
    open var preserveDrawingBuffer: Boolean
    open var clearBeforeRender: Boolean
    open var _backgroundColor: Number
    open var _backgroundColorRgba: Array<Number>
    open var _backgroundColorString: String
    open var _tempDisplayObjectParent: DisplayObject
    open var _lastObjectRendered: DisplayObject
    open var plugins: `T$4`
    open fun initPlugins(staticMap: Any)
    open var width: Number
    open var height: Number
    open fun resize(screenWidth: Number, screenHeight: Number)
    open fun generateTexture(displayObject: DisplayObject, scaleMode: Number, resolution: Number, region: Rectangle = definedExternally): RenderTexture
    open fun destroy(removeView: Boolean = definedExternally)
    open var backgroundColor: Number
}

external interface `T$3` {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var view: HTMLCanvasElement?
        get() = definedExternally
        set(value) = definedExternally
    var transparent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var autoDensity: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var antialias: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var forceFXAA: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var resolution: Number?
        get() = definedExternally
        set(value) = definedExternally
    var clearBeforeRender: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var preserveDrawingBuffer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var powerPreference: String?
        get() = definedExternally
        set(value) = definedExternally
    var context: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$4` {
    var accessibility: AccessibilityManager
    var extract: Extract
    var interaction: InteractionManager
    var prepare: Prepare
}

external open class Renderer(options: `T$3` = definedExternally) : AbstractRenderer {
    override var type: Number
    open var gl: WebGLRenderingContext
    open var globalUniforms: UniformGroup
    open var mask: MaskSystem
    open var context: ContextSystem
    open var state: StateSystem
    open var shader: ShaderSystem
    open var texture: TextureSystem
    open var geometry: GeometrySystem
    open var framebuffer: FramebufferSystem
    open var scissor: ScissorSystem
    open var stencil: StencilSystem
    open var projection: ProjectionSystem
    open var textureGC: TextureGCSystem
    open var filter: FilterSystem
    open var renderTexture: RenderTextureSystem
    open var batch: BatchSystem
    open var renderingToScreen: Boolean
    open fun addSystem(ClassRef: (params: Array<Any>) -> Any, name: String = definedExternally): Renderer
    open fun render(displayObject: DisplayObject, renderTexture: RenderTexture = definedExternally, clear: Boolean = definedExternally, transform: Matrix = definedExternally, skipUpdateTransform: Boolean = definedExternally)
    override fun resize(screenWidth: Number, screenHeight: Number)
    open fun reset(): Renderer
    open fun clear()
    override fun destroy(removeView: Boolean)
    override var plugins: `T$4`
    open var extract: Extract
    override var options: Any
    override var screen: Rectangle
    override var view: HTMLCanvasElement
    override var resolution: Number
    override var transparent: Boolean
    override var autoDensity: Boolean
    override var preserveDrawingBuffer: Boolean
    override var clearBeforeRender: Boolean
    override var _backgroundColor: Number
    override var _backgroundColorRgba: Array<Number>
    override var _backgroundColorString: String
    override var _tempDisplayObjectParent: DisplayObject
    override var _lastObjectRendered: DisplayObject
    override fun initPlugins(staticMap: Any)
    override var width: Number
    override var height: Number
    override fun generateTexture(displayObject: DisplayObject, scaleMode: Number, resolution: Number, region: Rectangle): RenderTexture
    override var backgroundColor: Number

    companion object {
        fun registerPlugin(pluginName: String, ctor: (params: Array<Any>) -> Any)
    }
}

external open class System(renderer: PIXI.Renderer) {
    open var renderer: Renderer
    open fun destroy()
}

external interface `T$5` {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var view: HTMLCanvasElement?
        get() = definedExternally
        set(value) = definedExternally
    var transparent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var autoDensity: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var antialias: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var preserveDrawingBuffer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var clearBeforeRender: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var resolution: Number?
        get() = definedExternally
        set(value) = definedExternally
    var forceCanvas: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var forceFXAA: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var powerPreference: String?
        get() = definedExternally
        set(value) = definedExternally
}

external fun autoDetectRenderer(options: `T$5` = definedExternally): Renderer

external open class AbstractBatchRenderer(renderer: PIXI.Renderer) : ObjectRenderer {
    open var shaderGenerator: BatchShaderGenerator
    open var geometryClass: Any
    open var vertexSize: Number
    open var state: State
    open var size: Number
    open var _shader: Shader
    open var MAX_TEXTURES: Number
    open fun contextChange()
    open fun initFlushBuffers()
    open fun onPrerender()
    override fun render(element: DisplayObject)
    open fun buildDrawCalls(texArray: BatchTextureArray, start: Number, finish: Number)
    open fun bindAndClearTexArray(texArray: BatchTextureArray)
    override fun flush()
    override fun start()
    override fun stop()
    override fun destroy()
    open fun packInterleavedGeometry(element: Sprite, attributeBuffer: ViewableBuffer, indexBuffer: Uint16Array, aIndex: Number, iIndex: Number)
    override var renderer: Renderer

    companion object {
        var _drawCallPool: Array<BatchDrawCall>
        var _textureArrayPool: Array<BatchTextureArray>
    }
}

external open class BatchDrawCall {
    open var data: Any
}

external open class BatchGeometry(_static: Boolean = definedExternally) {
    open var _buffer: Buffer
    open var _indexBuffer: Buffer
}

external interface `T$6` {
    var vertex: String?
        get() = definedExternally
        set(value) = definedExternally
    var fragment: String?
        get() = definedExternally
        set(value) = definedExternally
    var vertexSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var geometryClass: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external open class BatchPluginFactory {
    companion object {
        fun create(options: `T$6` = definedExternally): Any
        var defaultVertexSrc: String
        var defaultFragmentTemplate: String
    }
}

external open class BatchShaderGenerator(vertexSrc: String, fragTemplate: String) {
    open var vertexSrc: String
    open var fragTemplate: String
}

external open class BatchTextureArray {
    open var elements: Array<BaseTexture>
    open var ids: Array<Number>
    open var count: Number
}

external open class ObjectRenderer(renderer: PIXI.Renderer) : System {
    override var renderer: Renderer
    open fun flush()
    override fun destroy()
    open fun start()
    open fun stop()
    open fun render(obj: DisplayObject)
}

external open class Filter(vertexSrc: String = definedExternally, fragmentSrc: String = definedExternally, uniforms: Any = definedExternally) : Shader {
    open var padding: Number
    open var resolution: Number
    open var enabled: Boolean
    open var autoFit: Boolean
    open var legacy: Boolean
    open var state: State
    open fun apply(filterManager: FilterSystem, input: RenderTexture, output: RenderTexture, clear: Boolean, currentState: Any = definedExternally)
    open var blendMode: Number
    override var program: Program
    override var uniforms: Any

    companion object {
        var defaultVertexSrc: String
        var defaultFragmentSrc: String
        var SOURCE_KEY_MAP: Any
    }
}

external open class SpriteMaskFilter(sprite: PIXI.Sprite) : Filter {
    open var maskSprite: Sprite
    open var maskMatrix: Matrix
    open fun apply(filterManager: FilterSystem, input: RenderTexture, output: RenderTexture, clear: Boolean)
    override var padding: Number
    override var resolution: Number
    override var enabled: Boolean
    override var autoFit: Boolean
    override var legacy: Boolean
    override var state: State
    override var blendMode: Number
    override var program: Program
    override var uniforms: Any
}

external var defaultVertex: String

external var defaultFilterVertex: String

external open class Framebuffer(width: Number, height: Number) {
    open var colorTexture: Array<Texture>
    open fun addColorTexture(index: Number = definedExternally, texture: Texture = definedExternally)
    open fun addDepthTexture(texture: Texture = definedExternally)
    open fun enableDepth()
    open fun enableStencil()
    open fun resize(width: Number, height: Number)
    open fun dispose()
}

external open class Attribute(buffer: String, size: Number = definedExternally, normalized: Boolean = definedExternally, type: Number = definedExternally, stride: Number = definedExternally, start: Number = definedExternally) {
    open fun destroy()

    companion object {
        fun from(buffer: String, size: Number = definedExternally, normalized: Boolean = definedExternally, start: Number = definedExternally, type: Number = definedExternally, stride: Number = definedExternally): Attribute
    }
}

external open class Buffer {
    constructor(data: ArrayBuffer, _static: Boolean, index: Boolean)
    constructor(data: SharedArrayBuffer, _static: Boolean, index: Boolean)
    constructor(data: ArrayBufferView, _static: Boolean, index: Boolean)

    open var data: dynamic /* ArrayBuffer | SharedArrayBuffer | ArrayBufferView */
    open fun update(data: ArrayBuffer = definedExternally)
    open fun update(data: SharedArrayBuffer = definedExternally)
    open fun update(data: ArrayBufferView = definedExternally)
    open fun dispose()
    open fun destroy()
    open fun update()

    companion object {
        fun from(data: ArrayBufferView): Buffer
        fun from(data: Array<Number>): Buffer
    }
}

external open class Geometry(buffers: Array<PIXI.Buffer> = definedExternally, attributes: Any = definedExternally) {
    open var glVertexArrayObjects: Any
    open var instanceCount: Number
    open var refCount: Number
    open fun addAttribute(id: String, buffer: Buffer = definedExternally, size: Number = definedExternally, normalized: Boolean = definedExternally, type: Number = definedExternally, stride: Number = definedExternally, start: Number = definedExternally): Geometry
    open fun addAttribute(id: String, buffer: Array<Number> = definedExternally, size: Number = definedExternally, normalized: Boolean = definedExternally, type: Number = definedExternally, stride: Number = definedExternally, start: Number = definedExternally): Geometry
    open fun getAttribute(id: String): Attribute
    open fun getBuffer(id: String): Buffer
    open fun addIndex(buffer: Buffer = definedExternally): Geometry
    open fun addIndex(buffer: Array<Number> = definedExternally): Geometry
    open fun getIndex(): Buffer
    open fun interleave(): Geometry
    open fun dispose()
    open fun destroy()
    open fun clone(): Geometry
    open fun addAttribute(id: String): Geometry
    open fun addIndex(): Geometry

    companion object {
        fun merge(geometries: Array<Geometry>): Geometry
    }
}

external open class ViewableBuffer(size: Number) {
    open var rawBinaryData: ArrayBuffer
    open var uint32View: Uint32Array
    open var float32View: Float32Array
    open var int8View: Int8Array
    open var uint8View: Uint8Array
    open var int16View: Int16Array
    open var uint16View: Uint16Array
    open var int32View: Int32Array
    open fun view(type: String): Any
    open fun destroy()
}

external open class MaskData(maskObject: PIXI.DisplayObject = definedExternally) {
    open var type: MASK_TYPES
    open var autoDetect: Boolean
    open var maskObject: DisplayObject
    open var pooled: Boolean
    open var isMaskData: Boolean
    open var _scissorRect: Rectangle
    open fun reset()
    open fun copyCountersOrReset(maskAbove: MaskData?)
}

external interface `T$7` {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var scaleMode: SCALE_MODES?
        get() = definedExternally
        set(value) = definedExternally
    var resolution: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class BaseRenderTexture(options: `T$7` = definedExternally) : BaseTexture {
    open var _canvasRenderTarget: Any
    open var maskStack: Array<MaskData>
    open var filterStack: Array<Any>
    open fun resize(width: Number, height: Number)
    override fun dispose()
    override fun destroy()
    override var width: Number
    override var height: Number
    override var resolution: Number
    override var mipmap: MIPMAP_MODES
    override var anisotropicLevel: Number
    override var wrapMode: Number
    override var scaleMode: SCALE_MODES
    override var format: FORMATS
    override var type: TYPES
    override var target: TARGETS
    override var alphaMode: ALPHA_MODES
    override var uid: String
    override var touched: Number
    override var isPowerOfTwo: Boolean
    override var dirtyId: Number
    override var dirtyStyleId: Number
    override var cacheId: String
    override var valid: Boolean
    override var textureCacheIds: Array<String>
    override var destroyed: Boolean
    override var resource: Resource
    override var _batchEnabled: Number
    override var _batchLocation: Number
    override var realWidth: Number
    override var realHeight: Number
    override fun setStyle(scaleMode: SCALE_MODES, mipmap: MIPMAP_MODES): BaseTexture
    override fun setSize(width: Number, height: Number, resolution: Number): BaseTexture
    override fun setRealSize(realWidth: Number, realHeight: Number, resolution: Number): BaseTexture
    override fun setResolution(resolution: Number): BaseTexture
    override fun setResource(resource: Resource): BaseTexture
    override fun update()
}

external interface `T$8` {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var scaleMode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var resolution: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class RenderTexture(baseRenderTexture: PIXI.BaseRenderTexture, frame: PIXI.Rectangle = definedExternally) : Texture {
    override var valid: Boolean
    open var filterFrame: Rectangle
    open var filterPoolKey: String
    open fun resize(width: Number, height: Number, resizeBaseTexture: Boolean = definedExternally)
    open fun setResolution(resolution: Number)
    override var noFrame: Boolean
    override var baseTexture: BaseTexture
    override var _frame: Rectangle
    override var trim: Rectangle
    override var requiresUpdate: Boolean
    override var _uvs: TextureUvs
    override var uvMatrix: TextureMatrix
    override var orig: Rectangle
    override var defaultAnchor: Point
    override var _updateID: Number
    override var textureCacheIds: Array<String>
    override fun update()
    override fun onBaseTextureUpdated(baseTexture: BaseTexture)
    override fun destroy(destroyBase: Boolean)
    override fun clone(): Texture
    override fun updateUvs()
    override var resolution: Number
    override var frame: Rectangle
    override var rotate: Number
    override var width: Number
    override var height: Number

    companion object {
        fun create(options: `T$8` = definedExternally): RenderTexture
    }
}

external interface `T$9` {
    var scaleMode: SCALE_MODES?
        get() = definedExternally
        set(value) = definedExternally
}

external open class RenderTexturePool(textureOptions: `T$9` = definedExternally) {
    open var enableFullScreen: Boolean
    open fun createTexture(realWidth: Number, realHeight: Number): RenderTexture
    open fun getOptimalTexture(minWidth: Number, minHeight: Number, resolution: Number = definedExternally): RenderTexture
    open fun getFilterTexture(input: RenderTexture, resolution: Number = definedExternally): RenderTexture
    open fun returnTexture(renderTexture: RenderTexture)
    open fun returnFilterTexture(renderTexture: RenderTexture)
    open fun clear(destroyTextures: Boolean = definedExternally)
    open fun setScreenSize(size: ISize)

    companion object {
        var SCREEN_KEY: String
    }
}

external open class GLProgram(program: WebGLProgram, uniformData: Any) {
    open var program: WebGLProgram
    open var uniformData: Any
    open var uniformGroups: Any
    open fun destroy()
}

external open class Program(vertexSrc: String = definedExternally, fragmentSrc: String = definedExternally, name: String = definedExternally) {
    open var vertexSrc: String
    open var fragmentSrc: String
    open fun extractData(vertexSrc: String = definedExternally, fragmentSrc: String = definedExternally)

    companion object {
        var defaultVertexSrc: String
        var defaultFragmentSrc: String
        fun from(vertexSrc: String = definedExternally, fragmentSrc: String = definedExternally, name: String = definedExternally): Program
    }
}

external open class Shader(program: PIXI.Program = definedExternally, uniforms: Any = definedExternally) {
    open var program: Program
    open var uniforms: Any

    companion object {
        fun from(vertexSrc: String = definedExternally, fragmentSrc: String = definedExternally, uniforms: Any = definedExternally): Shader
    }
}

external open class UniformGroup(uniforms: Any = definedExternally, _static: Boolean = definedExternally) {
    open var uniforms: Any
    open var group: Boolean
    open var dirtyId: Number
    open var id: Number
    open var static: Boolean
}

external open class State {
    open var blend: Boolean
    open var offsets: Boolean
    open var culling: Boolean
    open var depthTest: Boolean
    open var clockwiseFrontFace: Boolean
    open var blendMode: Number
    open var polygonOffset: Number
}

external interface `T$12` {
    var mipmap: MIPMAP_MODES?
        get() = definedExternally
        set(value) = definedExternally
    var anisotropicLevel: Number?
        get() = definedExternally
        set(value) = definedExternally
    var wrapMode: WRAP_MODES?
        get() = definedExternally
        set(value) = definedExternally
    var scaleMode: SCALE_MODES?
        get() = definedExternally
        set(value) = definedExternally
    var format: FORMATS?
        get() = definedExternally
        set(value) = definedExternally
    var type: TYPES?
        get() = definedExternally
        set(value) = definedExternally
    var target: TARGETS?
        get() = definedExternally
        set(value) = definedExternally
    var alphaMode: ALPHA_MODES?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var resolution: Number?
        get() = definedExternally
        set(value) = definedExternally
    var resourceOptions: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external open class BaseTexture : EventEmitter {
    constructor(resource: Resource, options: `T$12`)
    constructor(resource: String, options: `T$12`)
    constructor(resource: HTMLImageElement, options: `T$12`)
    constructor(resource: HTMLCanvasElement, options: `T$12`)
    constructor(resource: HTMLVideoElement, options: `T$12`)

    open var width: Number
    open var height: Number
    open var resolution: Number
    open var mipmap: MIPMAP_MODES
    open var anisotropicLevel: Number
    open var wrapMode: Number
    open var scaleMode: SCALE_MODES
    open var format: FORMATS
    open var type: TYPES
    open var target: TARGETS
    open var alphaMode: ALPHA_MODES
    open var uid: String
    open var touched: Number
    open var isPowerOfTwo: Boolean
    open var dirtyId: Number
    open var dirtyStyleId: Number
    open var cacheId: String
    open var valid: Boolean
    open var textureCacheIds: Array<String>
    open var destroyed: Boolean
    open var resource: Resource
    open var _batchEnabled: Number
    open var _batchLocation: Number
    open var realWidth: Number
    open var realHeight: Number
    open fun setStyle(scaleMode: SCALE_MODES = definedExternally, mipmap: MIPMAP_MODES = definedExternally): BaseTexture
    open fun setSize(width: Number, height: Number, resolution: Number = definedExternally): BaseTexture
    open fun setRealSize(realWidth: Number, realHeight: Number, resolution: Number = definedExternally): BaseTexture
    open fun setResolution(resolution: Number = definedExternally): BaseTexture
    open fun setResource(resource: Resource): BaseTexture
    open fun update()
    open fun destroy()
    open fun dispose()

    companion object {
        fun from(source: String, options: Any = definedExternally, strict: Boolean = definedExternally): BaseTexture
        fun from(source: HTMLImageElement, options: Any = definedExternally, strict: Boolean = definedExternally): BaseTexture
        fun from(source: HTMLCanvasElement, options: Any = definedExternally, strict: Boolean = definedExternally): BaseTexture
        fun from(source: SVGElement, options: Any = definedExternally, strict: Boolean = definedExternally): BaseTexture
        fun from(source: HTMLVideoElement, options: Any = definedExternally, strict: Boolean = definedExternally): BaseTexture
        fun fromBuffer(buffer: Float32Array, width: Number, height: Number, options: Any = definedExternally): BaseTexture
        fun fromBuffer(buffer: Uint8Array, width: Number, height: Number, options: Any = definedExternally): BaseTexture
        fun addToCache(baseTexture: BaseTexture, id: String)
        fun removeFromCache(baseTexture: String): BaseTexture?
        fun removeFromCache(baseTexture: BaseTexture): BaseTexture?
        var _globalBatch: Number
    }
}

external open class CubeTexture : BaseTexture {
    override var width: Number
    override var height: Number
    override var resolution: Number
    override var mipmap: MIPMAP_MODES
    override var anisotropicLevel: Number
    override var wrapMode: Number
    override var scaleMode: SCALE_MODES
    override var format: FORMATS
    override var type: TYPES
    override var target: TARGETS
    override var alphaMode: ALPHA_MODES
    override var uid: String
    override var touched: Number
    override var isPowerOfTwo: Boolean
    override var dirtyId: Number
    override var dirtyStyleId: Number
    override var cacheId: String
    override var valid: Boolean
    override var textureCacheIds: Array<String>
    override var destroyed: Boolean
    override var resource: Resource
    override var _batchEnabled: Number
    override var _batchLocation: Number
    override var realWidth: Number
    override var realHeight: Number
    override fun setStyle(scaleMode: SCALE_MODES, mipmap: MIPMAP_MODES): BaseTexture
    override fun setSize(width: Number, height: Number, resolution: Number): BaseTexture
    override fun setRealSize(realWidth: Number, realHeight: Number, resolution: Number): BaseTexture
    override fun setResolution(resolution: Number): BaseTexture
    override fun setResource(resource: Resource): BaseTexture
    override fun update()
    override fun destroy()
    override fun dispose()

    companion object {
        fun from(resources: String, options: Any = definedExternally): BaseTexture
        fun from(resources: HTMLImageElement, options: Any = definedExternally): BaseTexture
        fun from(resources: HTMLCanvasElement, options: Any = definedExternally): BaseTexture
        fun from(resources: SVGElement, options: Any = definedExternally): BaseTexture
        fun from(resources: HTMLVideoElement, options: Any = definedExternally): BaseTexture
        fun from(resources: Array<String>, options: Any = definedExternally): CubeTexture
        fun from(resources: Array<Resource>, options: Any = definedExternally): CubeTexture
    }
}

external open class GLTexture {
    open var texture: WebGLTexture
    open var width: Number
    open var height: Number
    open var dirtyId: Number
    open var dirtyStyleId: Number
    open var mipmap: Boolean
    open var wrapMode: Number
    open var type: Number
    open var internalFormat: Number
}

external open class Texture(baseTexture: PIXI.BaseTexture, frame: PIXI.Rectangle = definedExternally, orig: PIXI.Rectangle = definedExternally, trim: PIXI.Rectangle = definedExternally, rotate: Number = definedExternally, anchor: PIXI.Point = definedExternally) : EventEmitter {
    open var noFrame: Boolean
    open var baseTexture: BaseTexture
    open var _frame: Rectangle
    open var trim: Rectangle
    open var valid: Boolean
    open var requiresUpdate: Boolean
    open var _uvs: TextureUvs
    open var uvMatrix: TextureMatrix
    open var orig: Rectangle
    open var defaultAnchor: Point
    open var _updateID: Number
    open var textureCacheIds: Array<String>
    open fun update()
    open fun onBaseTextureUpdated(baseTexture: BaseTexture)
    open fun destroy(destroyBase: Boolean = definedExternally)
    open fun clone(): Texture
    open fun updateUvs()
    open var resolution: Number
    open var frame: Rectangle
    open var rotate: Number
    open var width: Number
    open var height: Number

    companion object {
        fun from(source: String, options: Any = definedExternally, strict: Boolean = definedExternally): Texture
        fun from(source: HTMLImageElement, options: Any = definedExternally, strict: Boolean = definedExternally): Texture
        fun from(source: HTMLCanvasElement, options: Any = definedExternally, strict: Boolean = definedExternally): Texture
        fun from(source: HTMLVideoElement, options: Any = definedExternally, strict: Boolean = definedExternally): Texture
        fun from(source: BaseTexture, options: Any = definedExternally, strict: Boolean = definedExternally): Texture
        fun fromBuffer(buffer: Float32Array, width: Number, height: Number, options: Any = definedExternally): Texture
        fun fromBuffer(buffer: Uint8Array, width: Number, height: Number, options: Any = definedExternally): Texture
        fun fromLoader(source: HTMLImageElement, imageUrl: String, name: String = definedExternally): Texture
        fun fromLoader(source: HTMLCanvasElement, imageUrl: String, name: String = definedExternally): Texture
        fun addToCache(texture: Texture, id: String)
        fun removeFromCache(texture: String): Texture?
        fun removeFromCache(texture: Texture): Texture?
        var EMPTY: Texture
        var WHITE: Texture
    }
}

external open class TextureMatrix(texture: PIXI.Texture, clampMargin: Number = definedExternally) {
    open var mapCoord: Matrix
    open var uClampFrame: Float32Array
    open var uClampOffset: Float32Array
    open var _updateID: Number
    open var clampOffset: Number
    open var clampMargin: Number
    open var isSimple: Boolean
    open var texture: Texture
    open fun multiplyUvs(uvs: Float32Array, out: Float32Array = definedExternally): Float32Array
    open fun update(forceUpdate: Boolean = definedExternally): Boolean
}

external open class TextureUvs {
    open var x0: Number
    open var y0: Number
    open var x1: Number
    open var y1: Number
    open var x2: Number
    open var y2: Number
    open var x3: Number
    open var y3: Number
    open fun set(frame: Rectangle, baseFrame: Rectangle, rotate: Number)
}

external open class Quad

external open class QuadUv : Geometry {
    open var vertices: Float32Array
    open var uvs: Float32Array
    open fun map(targetTextureFrame: Rectangle, destinationFrame: Rectangle): Quad
    open fun invalidate(): QuadUv
    override var glVertexArrayObjects: Any
    override var instanceCount: Number
    override var refCount: Number
    override fun addAttribute(id: String, buffer: Buffer, size: Number, normalized: Boolean, type: Number, stride: Number, start: Number): Geometry
    override fun addAttribute(id: String, buffer: Array<Number>, size: Number, normalized: Boolean, type: Number, stride: Number, start: Number): Geometry
    override fun getAttribute(id: String): Attribute
    override fun getBuffer(id: String): Buffer
    override fun addIndex(buffer: Buffer): Geometry
    override fun addIndex(buffer: Array<Number>): Geometry
    override fun getIndex(): Buffer
    override fun interleave(): Geometry
    override fun dispose()
    override fun destroy()
    override fun clone(): Geometry
    override fun addAttribute(id: String): Geometry
    override fun addIndex(): Geometry
}

external open class Bounds {
    open var minX: Number
    open var minY: Number
    open var maxX: Number
    open var maxY: Number
    open fun isEmpty(): Boolean
    open fun clear()
    open fun getRectangle(rect: Rectangle): Rectangle
    open fun addPoint(point: Point)
    open fun addQuad(vertices: Float32Array)
    open fun addFrame(transform: Transform, x0: Number, y0: Number, x1: Number, y1: Number)
    open fun addFrameMatrix(matrix: Matrix, x0: Number, y0: Number, x1: Number, y1: Number)
    open fun addVertexData(vertexData: Float32Array, beginOffset: Number, endOffset: Number)
    open fun addVertices(transform: Transform, vertices: Float32Array, beginOffset: Number, endOffset: Number)
    open fun addVerticesMatrix(matrix: Matrix, vertices: Float32Array, beginOffset: Number, endOffset: Number, padX: Number = definedExternally, padY: Number = definedExternally)
    open fun addBounds(bounds: Bounds)
    open fun addBoundsMask(bounds: Bounds, mask: Bounds)
    open fun addBoundsMatrix(bounds: Bounds, matrix: Matrix)
    open fun addBoundsArea(bounds: Bounds, area: Rectangle)
    open fun pad(paddingX: Number = definedExternally, paddingY: Number = definedExternally)
    open fun addFramePad(x0: Number, y0: Number, x1: Number, y1: Number, padX: Number, padY: Number)
}

external open class Container : DisplayObject {
    fun once(event: String, fn: (displayObject: DisplayObject) -> Unit, context: Any): Container /* this */
    override fun once(event: String, fn: Function<*>, context: Any): Container /* this */
    fun on(event: String, fn: (displayObject: DisplayObject) -> Unit, context: Any): Container /* this */
    override fun on(event: String, fn: Function<*>, context: Any): Container /* this */
    override fun off(event: String, fn: Function<*>, context: Any): Container /* this */
    override fun off(event: String, fn: Function<*>, context: Any): Container /* this */
    open var children: Array<DisplayObject>
    open var sortableChildren: Boolean
    open var sortDirty: Boolean
    open fun onChildrenChange()
    open fun <TChildren : DisplayObject> addChild(vararg child: TChildren): Any
    open fun <T : DisplayObject> addChildAt(child: T, index: Number): T
    open fun swapChildren(child: DisplayObject, child2: DisplayObject)
    open fun getChildIndex(child: DisplayObject): Number
    open fun setChildIndex(child: DisplayObject, index: Number)
    open fun getChildAt(index: Number): DisplayObject
    open fun <TChildren : Array<DisplayObject>> removeChild(vararg child: TChildren): Any
    open fun removeChildAt(index: Number): DisplayObject
    open fun removeChildren(beginIndex: Number = definedExternally, endIndex: Number = definedExternally): Array<DisplayObject>
    open fun sortChildren()
    override fun updateTransform()
    override fun calculateBounds()
    open fun _calculateBounds()
    override fun render(renderer: Renderer)
    open fun renderAdvanced(renderer: Renderer)
    open fun _render(renderer: Renderer)
    open fun destroy(options: `T$1` = definedExternally)
    open var width: Number
    open var height: Number
    open var interactiveChildren: Boolean
    open fun getChildByName(name: String): DisplayObject
    override var accessible: Boolean
    override var accessibleTitle: String
    override var accessibleHint: String
    override var _accessibleActive: Boolean
    override var _accessibleDiv: Boolean
    override var accessibleType: String
    override var accessiblePointerEvents: String
    override var accessibleChildren: Boolean
    override var transform: Transform
    override var alpha: Number
    override var visible: Boolean
    override var renderable: Boolean
    override var parent: Container
    override var worldAlpha: Number
    override var _lastSortedIndex: Number
    override var _zIndex: Number
    override var filterArea: Rectangle
    override var filters: Array<Filter>
    override var _bounds: Bounds
    override var _mask: dynamic /* PIXI.Graphics | PIXI.Sprite | Nothing? */
    override var _destroyed: Boolean
    override var isSprite: Boolean
    override var isMask: Boolean
    override var _tempDisplayObjectParent: DisplayObject
    override fun _recursivePostUpdateTransform()
    override fun getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle
    override fun getLocalBounds(rect: Rectangle): Rectangle
    override fun toGlobal(position: IPoint, point: IPoint, skipUpdate: Boolean): IPoint
    override fun toLocal(position: IPoint, from: DisplayObject, point: IPoint, skipUpdate: Boolean): IPoint
    override fun setParent(container: Container): Container
    override fun setTransform(x: Number, y: Number, scaleX: Number, scaleY: Number, rotation: Number, skewX: Number, skewY: Number, pivotX: Number, pivotY: Number): DisplayObject
    override var x: Number
    override var y: Number
    override var worldTransform: Matrix
    override var localTransform: Matrix
    override var position: IPoint
    override var scale: IPoint
    override var pivot: IPoint
    override var skew: ObservablePoint
    override var rotation: Number
    override var angle: Number
    override var zIndex: Number
    override var worldVisible: Boolean
    override var mask: dynamic /* PIXI.Container | PIXI.MaskData */
    override fun displayObjectUpdateTransform()
    override var interactive: Boolean
    override var hitArea: IHitArea
    override var buttonMode: Boolean
    override var cursor: String
    override var cacheAsBitmap: Boolean
    override var name: String
    override fun getGlobalPosition(point: Point, skipUpdate: Boolean): Point
}

external open class Extract(renderer: PIXI.Renderer) {
    open fun image(target: DisplayObject, format: String = definedExternally, quality: Number = definedExternally): HTMLImageElement
    open fun image(target: RenderTexture, format: String = definedExternally, quality: Number = definedExternally): HTMLImageElement
    open fun base64(target: DisplayObject, format: String = definedExternally, quality: Number = definedExternally): String
    open fun base64(target: RenderTexture, format: String = definedExternally, quality: Number = definedExternally): String
    open fun canvas(target: DisplayObject): HTMLCanvasElement
    open fun canvas(target: RenderTexture): HTMLCanvasElement
    open fun pixels(target: DisplayObject): Uint8Array
    open fun pixels(target: RenderTexture): Uint8Array
    open fun destroy()
}

external interface `T$18` {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var texture: Texture?
        get() = definedExternally
        set(value) = definedExternally
    var color: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alpha: Number?
        get() = definedExternally
        set(value) = definedExternally
    var matrix: Matrix?
        get() = definedExternally
        set(value) = definedExternally
    var alignment: Number?
        get() = definedExternally
        set(value) = definedExternally
    var native: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$19` {
    var texture: Texture?
        get() = definedExternally
        set(value) = definedExternally
    var color: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alpha: Number?
        get() = definedExternally
        set(value) = definedExternally
    var matrix: Matrix?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Graphics(geometry: PIXI.GraphicsGeometry = definedExternally) : Container {
    open var geometry: GraphicsGeometry
    open var shader: Shader
    open var state: State
    open var _fillStyle: FillStyle
    open var _lineStyle: LineStyle
    open var _matrix: Matrix
    open var _holeMode: Boolean
    open var currentPath: Polygon
    override var cacheAsBitmap: Boolean
    open var batches: Array<Any>
    open var batchTint: Number
    open var vertexData: Float32Array
    open var pluginName: String
    open fun clone(): Graphics
    open var blendMode: Number
    open var tint: Number
    open var fill: FillStyle
    open var line: LineStyle
    open fun lineStyle(width: Number = definedExternally, color: Number = definedExternally, alpha: Number = definedExternally, alignment: Number = definedExternally, native: Boolean = definedExternally): Graphics
    open fun lineTextureStyle(options: `T$18` = definedExternally): Graphics
    open fun startPoly()
    open fun finishPoly()
    open fun moveTo(x: Number, y: Number): Graphics
    open fun lineTo(x: Number, y: Number): Graphics
    open fun _initCurve(x: Number = definedExternally, y: Number = definedExternally)
    open fun quadraticCurveTo(cpX: Number, cpY: Number, toX: Number, toY: Number): Graphics
    open fun bezierCurveTo(cpX: Number, cpY: Number, cpX2: Number, cpY2: Number, toX: Number, toY: Number): Graphics
    open fun arcTo(x1: Number, y1: Number, x2: Number, y2: Number, radius: Number): Graphics
    open fun arc(cx: Number, cy: Number, radius: Number, startAngle: Number, endAngle: Number, anticlockwise: Boolean = definedExternally): Graphics
    open fun beginFill(color: Number = definedExternally, alpha: Number = definedExternally): Graphics
    open fun beginTextureFill(options: `T$19` = definedExternally): Graphics
    open fun endFill(): Graphics
    open fun drawRect(x: Number, y: Number, width: Number, height: Number): Graphics
    open fun drawRoundedRect(x: Number, y: Number, width: Number, height: Number, radius: Number): Graphics
    open fun drawCircle(x: Number, y: Number, radius: Number): Graphics
    open fun drawEllipse(x: Number, y: Number, width: Number, height: Number): Graphics
    open fun drawPolygon(path: Array<Number>): Graphics
    open fun drawPolygon(path: Array<Point>): Graphics
    open fun drawPolygon(path: Polygon): Graphics
    open fun drawShape(shape: Circle): Graphics
    open fun drawShape(shape: Ellipse): Graphics
    open fun drawShape(shape: Polygon): Graphics
    open fun drawShape(shape: Rectangle): Graphics
    open fun drawShape(shape: RoundedRectangle): Graphics
    open fun drawStar(x: Number, y: Number, points: Number, radius: Number, innerRadius: Number = definedExternally, rotation: Number = definedExternally): Graphics
    open fun clear(): Graphics
    open fun isFastRect(): Boolean
    override fun _render(renderer: Renderer)
    open fun _populateBatches()
    open fun _renderBatched(renderer: Renderer)
    open fun _renderDirect(renderer: Renderer)
    open fun _renderDrawCallDirect(renderer: Renderer, drawCall: BatchDrawCall)
    open fun _resolveDirectShader(renderer: Renderer)
    override fun _calculateBounds()
    open fun containsPoint(point: Point): Boolean
    open fun calculateTints()
    open fun calculateVertices()
    open fun closePath(): Graphics
    open fun setMatrix(matrix: Matrix): Graphics
    open fun beginHole(): Graphics
    open fun endHole(): Graphics
    override fun destroy(options: `T$1`)
    override var children: Array<DisplayObject>
    override var sortableChildren: Boolean
    override var sortDirty: Boolean
    override fun onChildrenChange()
    override fun <TChildren : DisplayObject> addChild(vararg child: TChildren): Any
    override fun <T : DisplayObject> addChildAt(child: T, index: Number): T
    override fun swapChildren(child: DisplayObject, child2: DisplayObject)
    override fun getChildIndex(child: DisplayObject): Number
    override fun setChildIndex(child: DisplayObject, index: Number)
    override fun getChildAt(index: Number): DisplayObject
    override fun <TChildren : Array<DisplayObject>> removeChild(vararg child: TChildren): Any
    override fun removeChildAt(index: Number): DisplayObject
    override fun removeChildren(beginIndex: Number, endIndex: Number): Array<DisplayObject>
    override fun sortChildren()
    override fun updateTransform()
    override fun calculateBounds()
    override fun render(renderer: Renderer)
    override fun renderAdvanced(renderer: Renderer)
    override var width: Number
    override var height: Number
    override var interactiveChildren: Boolean
    override fun getChildByName(name: String): DisplayObject
    override var accessible: Boolean
    override var accessibleTitle: String
    override var accessibleHint: String
    override var _accessibleActive: Boolean
    override var _accessibleDiv: Boolean
    override var accessibleType: String
    override var accessiblePointerEvents: String
    override var accessibleChildren: Boolean
    override var transform: Transform
    override var alpha: Number
    override var visible: Boolean
    override var renderable: Boolean
    override var parent: Container
    override var worldAlpha: Number
    override var _lastSortedIndex: Number
    override var _zIndex: Number
    override var filterArea: Rectangle
    override var filters: Array<Filter>
    override var _bounds: Bounds
    override var _mask: dynamic /* PIXI.Graphics | PIXI.Sprite | Nothing? */
    override var _destroyed: Boolean
    override var isSprite: Boolean
    override var isMask: Boolean
    override var _tempDisplayObjectParent: DisplayObject
    override fun _recursivePostUpdateTransform()
    override fun getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle
    override fun getLocalBounds(rect: Rectangle): Rectangle
    override fun toGlobal(position: IPoint, point: IPoint, skipUpdate: Boolean): IPoint
    override fun toLocal(position: IPoint, from: DisplayObject, point: IPoint, skipUpdate: Boolean): IPoint
    override fun setParent(container: Container): Container
    override fun setTransform(x: Number, y: Number, scaleX: Number, scaleY: Number, rotation: Number, skewX: Number, skewY: Number, pivotX: Number, pivotY: Number): DisplayObject
    override var x: Number
    override var y: Number
    override var worldTransform: Matrix
    override var localTransform: Matrix
    override var position: IPoint
    override var scale: IPoint
    override var pivot: IPoint
    override var skew: ObservablePoint
    override var rotation: Number
    override var angle: Number
    override var zIndex: Number
    override var worldVisible: Boolean
    override var mask: dynamic /* PIXI.Container | PIXI.MaskData */
    override fun displayObjectUpdateTransform()
    override var interactive: Boolean
    override var hitArea: IHitArea
    override var buttonMode: Boolean
    override var cursor: String
    override var name: String
    override fun getGlobalPosition(point: Point, skipUpdate: Boolean): Point
    open fun lineStyle(): Graphics
}

external open class GraphicsData {
    constructor(shape: Circle, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix)
    constructor(shape: Rectangle, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix)
    constructor(shape: Ellipse, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix)
    constructor(shape: Polygon, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix)

    open var shape: dynamic /* PIXI.Circle | PIXI.Ellipse | PIXI.Polygon | PIXI.Rectangle | PIXI.RoundedRectangle */
    open var lineStyle: LineStyle
    open var fillStyle: FillStyle
    open var matrix: Matrix
    open var type: Number
    open var points: Array<Number>
    open var holes: Array<GraphicsData>
    open fun clone(): GraphicsData
    open fun destroy()
}

external open class GraphicsGeometry : BatchGeometry {
    open var points: Array<Number>
    open var colors: Array<Number>
    open var uvs: Array<Number>
    open var indices: Array<Number>
    open var textureIds: Array<Number>
    open var graphicsData: Array<GraphicsData>
    open var dirty: Number
    open var batchDirty: Number
    open var cacheDirty: Number
    open var clearDirty: Number
    open var drawCalls: Array<Any>
    open var batches: Array<BatchPart>
    open var shapeIndex: Number
    open var _bounds: Bounds
    open var boundsDirty: Number
    open var boundsPadding: Number
    open var closePointEps: Number
    open var bounds: Bounds
    open fun invalidate()
    open fun clear(): GraphicsGeometry
    open fun drawShape(shape: Circle, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix): GraphicsGeometry
    open fun drawShape(shape: Ellipse, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix): GraphicsGeometry
    open fun drawShape(shape: Polygon, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix): GraphicsGeometry
    open fun drawShape(shape: Rectangle, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix): GraphicsGeometry
    open fun drawShape(shape: RoundedRectangle, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix): GraphicsGeometry
    open fun drawHole(shape: Circle, matrix: Matrix): GraphicsGeometry
    open fun drawHole(shape: Ellipse, matrix: Matrix): GraphicsGeometry
    open fun drawHole(shape: Polygon, matrix: Matrix): GraphicsGeometry
    open fun drawHole(shape: Rectangle, matrix: Matrix): GraphicsGeometry
    open fun drawHole(shape: RoundedRectangle, matrix: Matrix): GraphicsGeometry
    open fun destroy(options: `T$1` = definedExternally)
    open fun containsPoint(point: Point): Boolean
    open fun updateBatches()
    open fun _compareStyles(styleA: FillStyle, styleB: FillStyle)
    open fun _compareStyles(styleA: FillStyle, styleB: LineStyle)
    open fun _compareStyles(styleA: LineStyle, styleB: FillStyle)
    open fun _compareStyles(styleA: LineStyle, styleB: LineStyle)
    open fun validateBatching()
    open fun packBatches()
    open fun isBatchable()
    open fun buildDrawCalls()
    open fun packAttributes()
    open fun processFill(data: GraphicsData)
    open fun processLine(data: GraphicsData)
    open fun processHoles(holes: Array<GraphicsData>)
    open fun calculateBounds()
    open fun transformPoints(points: Array<Number>, matrix: Matrix)
    open fun addColors(colors: Array<Number>, color: Number, alpha: Number, size: Number)
    open fun addTextureIds(textureIds: Array<Number>, id: Number, size: Number)
    open fun addUvs(verts: Array<Number>, uvs: Array<Number>, texture: Texture, start: Number, size: Number, matrix: Matrix = definedExternally)
    open fun adjustUvs(uvs: Array<Number>, texture: Texture, start: Number, size: Number)
    override var _buffer: Buffer
    override var _indexBuffer: Buffer

    companion object {
        var BATCHABLE_SIZE: Number
    }
}

external object GRAPHICS_CURVES {
    var adaptive: Boolean
    var maxLength: Number
    var minSegments: Number
    var maxSegments: Number
}

external open class FillStyle {
    open fun clone(): FillStyle
    open fun reset()
    open var color: Number
    open var alpha: Number
    open var texture: String
    open var matrix: String
    open var visible: Boolean
    open fun destroy()
}

external open class LineStyle : FillStyle {
    override fun clone(): LineStyle
    override fun reset()
    open var width: Number
    open var alignment: Number
    open var native: Boolean
    override var color: Number
    override var alpha: Number
    override var texture: String
    override var matrix: String
    override var visible: Boolean
    override fun destroy()
}

external open class Star(x: Number, y: Number, points: Number, radius: Number, innerRadius: Number = definedExternally, rotation: Number = definedExternally) : Polygon {
    override var points: Array<Number>
    override var type: Number
    override var closeStroke: Boolean
    override fun clone(): Polygon
    override fun contains(x: Number, y: Number): Boolean
}

external interface IHitArea {
    fun contains(x: Number, y: Number): Boolean
}

external open class AppLoaderPlugin

external interface ILoaderPlugin {
    var add: ((params: Any) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var pre: loaderMiddleware?
        get() = definedExternally
        set(value) = definedExternally
    var use: loaderMiddleware?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Loader(baseUrl: String = definedExternally, concurrency: Number = definedExternally) : EventEmitter {
    open var baseUrl: String
    open var progress: Number
    open var loading: Boolean
    open var defaultQueryString: String
    open var resources: IResourceDictionary
    open var concurrency: Number
    open fun add(vararg params: Any): Loader /* this */
    open fun add(name: String, url: String, options: ILoaderOptions = definedExternally, cb: Function<*> = definedExternally): Loader /* this */
    open fun add(obj: String, options: ILoaderOptions = definedExternally, cb: Function<*> = definedExternally): Loader /* this */
    open fun add(obj: Any, options: ILoaderOptions = definedExternally, cb: Function<*> = definedExternally): Loader /* this */
    open fun add(obj: Array<Any>, options: ILoaderOptions = definedExternally, cb: Function<*> = definedExternally): Loader /* this */
    open fun pre(fn: Function<*>): Loader /* this */
    open fun use(fn: Function<*>): Loader /* this */
    open fun reset(): Loader /* this */
    open fun load(cb: (loader: Loader, resources: Any) -> Unit = definedExternally): Loader /* this */
    open fun destroy()
    fun on(event: String /* "complete" */, fn: (loader: Loader, obj: Any) -> Unit, context: Any): Loader /* this */
    fun on(event: String /* "error" */, fn: (error: Error, loader: Loader, resource: LoaderResource) -> Unit, context: Any): Loader /* this */
    fun on(event: String, fn: (loader: Loader, resource: LoaderResource) -> Unit, context: Any): Loader /* this */
    fun on(event: String /* "start" */, fn: (loader: Loader) -> Unit, context: Any): Loader /* this */
    fun once(event: String /* "complete" */, fn: (loader: Loader, obj: Any) -> Unit, context: Any): Loader /* this */
    fun once(event: String /* "error" */, fn: (error: Error, loader: Loader, resource: LoaderResource) -> Unit, context: Any): Loader /* this */
    fun once(event: String, fn: (loader: Loader, resource: LoaderResource) -> Unit, context: Any): Loader /* this */
    fun once(event: String /* "start" */, fn: (loader: Loader) -> Unit, context: Any): Loader /* this */
    open fun off(event: String, fn: Function<*> = definedExternally, context: Any = definedExternally): Loader /* this */
    open fun off(event: String, fn: Function<*> = definedExternally, context: Any = definedExternally): Loader /* this */
    open var onStart: Any
    open var onProgress: Any
    open var onError: Any
    open var onLoad: Any
    open var onComplete: Any

    companion object {
        var shared: Any
        fun registerPlugin(plugin: ILoaderPlugin): PIXI.Loader
    }
}

external open class TextureLoader : ILoaderPlugin {
    companion object {
        fun use(resource: LoaderResource, next: (params: Array<Any>) -> Any)
    }
}

external open class LoaderResource {
    open var name: String
    open var url: String
    open var extension: String
    open var data: Any
    open var crossOrigin: dynamic /* Boolean | String */
    open var loadType: Number
    open var xhrType: String
    open var metadata: Any
    open var error: Error
    open var xhr: XMLHttpRequest?
    open var children: Array<LoaderResource>
    open var type: Number
    open var progressChunk: Number
    open var isDataUrl: Boolean
    open var isComplete: Boolean
    open var isLoading: Boolean
    open fun complete()
    open fun abort(message: String = definedExternally)
    open fun load(cb: Function<*> = definedExternally)
    open var texture: Texture
    open var spineAtlas: Any
    open var spineData: Any
    open var spritesheet: Spritesheet?
    open var textures: ITextureDictionary?

    companion object {
        fun setExtensionLoadType(extname: String, loadType: Number)
        fun setExtensionXhrType(extname: String, xhrType: String)
        var EMPTY_GIF: String
    }
}

external interface IPoint {
    var x: Number
    var y: Number
    fun set(x: Number = definedExternally, y: Number = definedExternally)
    fun copyFrom(p: IPoint): IPoint /* this */
    fun copyTo(p: IPoint): IPoint
    fun equals(p: IPoint): Boolean
}

external open class Matrix(a: Number = definedExternally, b: Number = definedExternally, c: Number = definedExternally, d: Number = definedExternally, tx: Number = definedExternally, ty: Number = definedExternally) {
    open var a: Number
    open var b: Number
    open var c: Number
    open var d: Number
    open var tx: Number
    open var ty: Number
    open fun fromArray(array: Array<Number>)
    open fun set(a: Number, b: Number, c: Number, d: Number, tx: Number, ty: Number): Matrix
    open fun toArray(transpose: Boolean, out: Float32Array = definedExternally): Array<Number>
    open fun apply(pos: Point, newPos: Point = definedExternally): Point
    open fun applyInverse(pos: Point, newPos: Point = definedExternally): Point
    open fun translate(x: Number, y: Number): Matrix
    open fun scale(x: Number, y: Number): Matrix
    open fun rotate(angle: Number): Matrix
    open fun append(matrix: Matrix): Matrix
    open fun setTransform(x: Number, y: Number, pivotX: Number, pivotY: Number, scaleX: Number, scaleY: Number, rotation: Number, skewX: Number, skewY: Number): Matrix
    open fun prepend(matrix: Matrix): Matrix
    open fun decompose(transform: Transform): Transform
    open fun invert(): Matrix
    open fun identity(): Matrix
    open fun clone(): Matrix
    open fun copyTo(matrix: Matrix): Matrix
    open fun copyFrom(matrix: Matrix): Matrix

    companion object {
        var IDENTITY: Matrix
        var TEMP_MATRIX: Matrix
    }
}

external open class ObservablePoint(cb: (params: Array<Any>) -> Any, scope: Any, x: Number = definedExternally, y: Number = definedExternally) : IPoint {
    open fun clone(cb: (params: Array<Any>) -> Any = definedExternally, scope: Any = definedExternally): ObservablePoint
    override fun set(x: Number, y: Number): ObservablePoint /* this */
    override fun copyFrom(p: IPoint): ObservablePoint /* this */
    override fun copyTo(p: IPoint): IPoint
    override fun equals(p: IPoint): Boolean
    override var x: Number
    override var y: Number
}

external open class Point(x: Number = definedExternally, y: Number = definedExternally) : IPoint {
    override var x: Number
    override var y: Number
    open fun clone(): Point
    override fun copyFrom(p: IPoint): Point /* this */
    override fun copyTo(p: IPoint): IPoint
    override fun equals(p: IPoint): Boolean
    override fun set(x: Number, y: Number): Point /* this */
}

external open class Transform {
    open var worldTransform: Matrix
    open var localTransform: Matrix
    open var position: ObservablePoint
    open var scale: ObservablePoint
    open var pivot: ObservablePoint
    open var skew: ObservablePoint
    open var _rotation: Number
    open var _cx: Number
    open var _sx: Number
    open var _cy: Number
    open var _sy: Number
    open var _localID: Number
    open var _currentLocalID: Number
    open var _worldID: Number
    open var _parentID: Number
    open fun onChange()
    open fun updateSkew()
    open fun updateLocalTransform()
    open fun updateTransform(parentTransform: Transform)
    open fun setFromMatrix(matrix: Matrix)
    open var rotation: Number

    companion object {
        var IDENTITY: Transform
    }
}

external enum class SHAPES {
    POLY,
    RECT,
    CIRC,
    ELIP,
    RREC
}

external var PI_2: Number

external var RAD_TO_DEG: Number

external var DEG_TO_RAD: Number

external open class Circle(x: Number = definedExternally, y: Number = definedExternally, radius: Number = definedExternally) {
    open var x: Number
    open var y: Number
    open var radius: Number
    open var type: Number
    open fun clone(): Circle
    open fun contains(x: Number, y: Number): Boolean
    open fun getBounds(): Rectangle
}

external open class Ellipse(x: Number = definedExternally, y: Number = definedExternally, halfWidth: Number = definedExternally, halfHeight: Number = definedExternally) {
    open var x: Number
    open var y: Number
    open var width: Number
    open var height: Number
    open var type: Number
    open fun clone(): Ellipse
    open fun contains(x: Number, y: Number): Boolean
    open fun getBounds(): Rectangle
}

external open class Polygon {
    constructor(vararg points: Array<Point>)
    constructor(vararg points: Array<Number>)
    constructor(vararg points: Array<Array<Number>>)

    open var points: Array<Number>
    open var type: Number
    open var closeStroke: Boolean
    open fun clone(): Polygon
    open fun contains(x: Number, y: Number): Boolean
}

external interface ISize {
    var width: Number
    var height: Number
}

external open class Rectangle(x: Number = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally) {
    open var x: Number
    open var y: Number
    open var width: Number
    open var height: Number
    open var type: Number
    open var left: Number
    open var right: Number
    open var top: Number
    open var bottom: Number
    open fun clone(): Rectangle
    open fun copyFrom(rectangle: Rectangle): Rectangle
    open fun copyTo(rectangle: Rectangle): Rectangle
    open fun contains(x: Number, y: Number): Boolean
    open fun pad(paddingX: Number = definedExternally, paddingY: Number = definedExternally): Rectangle
    open fun fit(rectangle: Rectangle): Rectangle
    open fun ceil(resolution: Number = definedExternally, eps: Number = definedExternally): Rectangle
    open fun enlarge(rectangle: Rectangle): Rectangle

    companion object {
        var EMPTY: Rectangle
    }
}

external open class RoundedRectangle(x: Number = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally, radius: Number = definedExternally) {
    open var x: Number
    open var y: Number
    open var width: Number
    open var height: Number
    open var radius: Number
    open var type: Number
    open fun clone(): RoundedRectangle
    open fun contains(x: Number, y: Number): Boolean
}

external interface `T$21` {
    var children: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Mesh : Container {
    constructor(geometry: Geometry, shader: Shader, state: State, drawMode: Number)
    constructor(geometry: Geometry, shader: MeshMaterial, state: State, drawMode: Number)

    open var geometry: Geometry
    open var shader: dynamic /* PIXI.Shader | PIXI.MeshMaterial */
    open var state: State
    open var drawMode: Number
    open var start: Number
    open var size: Number
    open var uvBuffer: Buffer
    open var verticesBuffer: Buffer
    open var material: dynamic /* PIXI.Shader | PIXI.MeshMaterial */
    open var blendMode: Number
    open var roundPixels: Boolean
    open var tint: Number
    open var texture: Texture
    override fun _render(renderer: Renderer)
    open fun _renderDefault(renderer: Renderer)
    open fun _renderToBatch(renderer: Renderer)
    open fun calculateVertices()
    open fun calculateUvs()
    override fun _calculateBounds()
    open fun containsPoint(point: Point): Boolean
    open fun destroy(options: `T$21` = definedExternally)
    override var children: Array<DisplayObject>
    override var sortableChildren: Boolean
    override var sortDirty: Boolean
    override fun onChildrenChange()
    override fun <TChildren : DisplayObject> addChild(vararg child: TChildren): Any
    override fun <T : DisplayObject> addChildAt(child: T, index: Number): T
    override fun swapChildren(child: DisplayObject, child2: DisplayObject)
    override fun getChildIndex(child: DisplayObject): Number
    override fun setChildIndex(child: DisplayObject, index: Number)
    override fun getChildAt(index: Number): DisplayObject
    override fun <TChildren : Array<DisplayObject>> removeChild(vararg child: TChildren): Any
    override fun removeChildAt(index: Number): DisplayObject
    override fun removeChildren(beginIndex: Number, endIndex: Number): Array<DisplayObject>
    override fun sortChildren()
    override fun updateTransform()
    override fun calculateBounds()
    override fun render(renderer: Renderer)
    override fun renderAdvanced(renderer: Renderer)
    override var width: Number
    override var height: Number
    override var interactiveChildren: Boolean
    override fun getChildByName(name: String): DisplayObject
    override var accessible: Boolean
    override var accessibleTitle: String
    override var accessibleHint: String
    override var _accessibleActive: Boolean
    override var _accessibleDiv: Boolean
    override var accessibleType: String
    override var accessiblePointerEvents: String
    override var accessibleChildren: Boolean
    override var transform: Transform
    override var alpha: Number
    override var visible: Boolean
    override var renderable: Boolean
    override var parent: Container
    override var worldAlpha: Number
    override var _lastSortedIndex: Number
    override var _zIndex: Number
    override var filterArea: Rectangle
    override var filters: Array<Filter>
    override var _bounds: Bounds
    override var _mask: dynamic /* PIXI.Graphics | PIXI.Sprite | Nothing? */
    override var _destroyed: Boolean
    override var isSprite: Boolean
    override var isMask: Boolean
    override var _tempDisplayObjectParent: DisplayObject
    override fun _recursivePostUpdateTransform()
    override fun getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle
    override fun getLocalBounds(rect: Rectangle): Rectangle
    override fun toGlobal(position: IPoint, point: IPoint, skipUpdate: Boolean): IPoint
    override fun toLocal(position: IPoint, from: DisplayObject, point: IPoint, skipUpdate: Boolean): IPoint
    override fun setParent(container: Container): Container
    override fun setTransform(x: Number, y: Number, scaleX: Number, scaleY: Number, rotation: Number, skewX: Number, skewY: Number, pivotX: Number, pivotY: Number): DisplayObject
    override var x: Number
    override var y: Number
    override var worldTransform: Matrix
    override var localTransform: Matrix
    override var position: IPoint
    override var scale: IPoint
    override var pivot: IPoint
    override var skew: ObservablePoint
    override var rotation: Number
    override var angle: Number
    override var zIndex: Number
    override var worldVisible: Boolean
    override var mask: dynamic /* PIXI.Container | PIXI.MaskData */
    override fun displayObjectUpdateTransform()
    override var interactive: Boolean
    override var hitArea: IHitArea
    override var buttonMode: Boolean
    override var cursor: String
    override var cacheAsBitmap: Boolean
    override var name: String
    override fun getGlobalPosition(point: Point, skipUpdate: Boolean): Point

    companion object {
        var BATCHABLE_SIZE: Number
    }
}

external open class MeshBatchUvs(uvBuffer: PIXI.Buffer, uvMatrix: PIXI.TextureMatrix) {
    open var uvBuffer: Buffer
    open var uvMatrix: TextureMatrix
    open var data: Float32Array
    open fun update(forceUpdate: Boolean)
}

external open class MeshGeometry : Geometry {
    constructor(vertices: Float32Array, uvs: Float32Array, index: Uint16Array)
    constructor(vertices: Float32Array, uvs: Float32Array, index: Array<Number>)
    constructor(vertices: Float32Array, uvs: Array<Number>, index: Uint16Array)
    constructor(vertices: Float32Array, uvs: Array<Number>, index: Array<Number>)
    constructor(vertices: Array<Number>, uvs: Float32Array, index: Uint16Array)
    constructor(vertices: Array<Number>, uvs: Float32Array, index: Array<Number>)
    constructor(vertices: Array<Number>, uvs: Array<Number>, index: Uint16Array)
    constructor(vertices: Array<Number>, uvs: Array<Number>, index: Array<Number>)

    override var glVertexArrayObjects: Any
    override var instanceCount: Number
    override var refCount: Number
    override fun addAttribute(id: String, buffer: Buffer, size: Number, normalized: Boolean, type: Number, stride: Number, start: Number): Geometry
    override fun addAttribute(id: String, buffer: Array<Number>, size: Number, normalized: Boolean, type: Number, stride: Number, start: Number): Geometry
    override fun getAttribute(id: String): Attribute
    override fun getBuffer(id: String): Buffer
    override fun addIndex(buffer: Buffer): Geometry
    override fun addIndex(buffer: Array<Number>): Geometry
    override fun getIndex(): Buffer
    override fun interleave(): Geometry
    override fun dispose()
    override fun destroy()
    override fun clone(): Geometry
    override fun addAttribute(id: String): Geometry
    override fun addIndex(): Geometry
}

external interface `T$22` {
    var alpha: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tint: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pluginName: String?
        get() = definedExternally
        set(value) = definedExternally
    var program: Program?
        get() = definedExternally
        set(value) = definedExternally
    var uniforms: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external open class MeshMaterial(uSampler: PIXI.Texture, options: `T$22` = definedExternally) : Shader {
    open var uvMatrix: TextureMatrix
    open var batchable: Boolean
    open var pluginName: String
    open var texture: Texture
    open var alpha: Number
    open var tint: Number
    open fun update()
    override var program: Program
    override var uniforms: Any
}

external open class NineSlicePlane(texture: PIXI.Texture, leftWidth: Number = definedExternally, topHeight: Number = definedExternally, rightWidth: Number = definedExternally, bottomHeight: Number = definedExternally) : SimplePlane {
    open var _width: Number
    open var _height: Number
    open fun updateHorizontalVertices()
    open fun updateVerticalVertices()
    override var width: Number
    override var height: Number
    open var leftWidth: Number
    open var rightWidth: Number
    open var topHeight: Number
    open var bottomHeight: Number
    open fun _refresh()
    override fun textureUpdated()
    override var geometry: Geometry
    override var shader: dynamic /* PIXI.Shader | PIXI.MeshMaterial */
    override var state: State
    override var drawMode: Number
    override var start: Number
    override var size: Number
    override var uvBuffer: Buffer
    override var verticesBuffer: Buffer
    override var material: dynamic /* PIXI.Shader | PIXI.MeshMaterial */
    override var blendMode: Number
    override var roundPixels: Boolean
    override var tint: Number
    override var texture: Texture
    override fun _render(renderer: Renderer)
    override fun _renderDefault(renderer: Renderer)
    override fun _renderToBatch(renderer: Renderer)
    override fun calculateVertices()
    override fun calculateUvs()
    override fun _calculateBounds()
    override fun containsPoint(point: Point): Boolean
    override fun destroy(options: `T$21`)
    override var children: Array<DisplayObject>
    override var sortableChildren: Boolean
    override var sortDirty: Boolean
    override fun onChildrenChange()
    override fun <TChildren : DisplayObject> addChild(vararg child: TChildren): Any
    override fun <T : DisplayObject> addChildAt(child: T, index: Number): T
    override fun swapChildren(child: DisplayObject, child2: DisplayObject)
    override fun getChildIndex(child: DisplayObject): Number
    override fun setChildIndex(child: DisplayObject, index: Number)
    override fun getChildAt(index: Number): DisplayObject
    override fun <TChildren : Array<DisplayObject>> removeChild(vararg child: TChildren): Any
    override fun removeChildAt(index: Number): DisplayObject
    override fun removeChildren(beginIndex: Number, endIndex: Number): Array<DisplayObject>
    override fun sortChildren()
    override fun updateTransform()
    override fun calculateBounds()
    override fun render(renderer: Renderer)
    override fun renderAdvanced(renderer: Renderer)
    override var interactiveChildren: Boolean
    override fun getChildByName(name: String): DisplayObject
    override var accessible: Boolean
    override var accessibleTitle: String
    override var accessibleHint: String
    override var _accessibleActive: Boolean
    override var _accessibleDiv: Boolean
    override var accessibleType: String
    override var accessiblePointerEvents: String
    override var accessibleChildren: Boolean
    override var transform: Transform
    override var alpha: Number
    override var visible: Boolean
    override var renderable: Boolean
    override var parent: Container
    override var worldAlpha: Number
    override var _lastSortedIndex: Number
    override var _zIndex: Number
    override var filterArea: Rectangle
    override var filters: Array<Filter>
    override var _bounds: Bounds
    override var _mask: dynamic /* PIXI.Graphics | PIXI.Sprite | Nothing? */
    override var _destroyed: Boolean
    override var isSprite: Boolean
    override var isMask: Boolean
    override var _tempDisplayObjectParent: DisplayObject
    override fun _recursivePostUpdateTransform()
    override fun getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle
    override fun getLocalBounds(rect: Rectangle): Rectangle
    override fun toGlobal(position: IPoint, point: IPoint, skipUpdate: Boolean): IPoint
    override fun toLocal(position: IPoint, from: DisplayObject, point: IPoint, skipUpdate: Boolean): IPoint
    override fun setParent(container: Container): Container
    override fun setTransform(x: Number, y: Number, scaleX: Number, scaleY: Number, rotation: Number, skewX: Number, skewY: Number, pivotX: Number, pivotY: Number): DisplayObject
    override var x: Number
    override var y: Number
    override var worldTransform: Matrix
    override var localTransform: Matrix
    override var position: IPoint
    override var scale: IPoint
    override var pivot: IPoint
    override var skew: ObservablePoint
    override var rotation: Number
    override var angle: Number
    override var zIndex: Number
    override var worldVisible: Boolean
    override var mask: dynamic /* PIXI.Container | PIXI.MaskData */
    override fun displayObjectUpdateTransform()
    override var interactive: Boolean
    override var hitArea: IHitArea
    override var buttonMode: Boolean
    override var cursor: String
    override var cacheAsBitmap: Boolean
    override var name: String
    override fun getGlobalPosition(point: Point, skipUpdate: Boolean): Point
}

external open class SimpleMesh(texture: PIXI.Texture = definedExternally, vertices: Float32Array = definedExternally, uvs: Float32Array = definedExternally, indices: Uint16Array = definedExternally, drawMode: Number = definedExternally) : Mesh {
    open var autoUpdate: Boolean
    open var vertices: Float32Array
    override var geometry: Geometry
    override var shader: dynamic /* PIXI.Shader | PIXI.MeshMaterial */
    override var state: State
    override var drawMode: Number
    override var start: Number
    override var size: Number
    override var uvBuffer: Buffer
    override var verticesBuffer: Buffer
    override var material: dynamic /* PIXI.Shader | PIXI.MeshMaterial */
    override var blendMode: Number
    override var roundPixels: Boolean
    override var tint: Number
    override var texture: Texture
    override fun _render(renderer: Renderer)
    override fun _renderDefault(renderer: Renderer)
    override fun _renderToBatch(renderer: Renderer)
    override fun calculateVertices()
    override fun calculateUvs()
    override fun _calculateBounds()
    override fun containsPoint(point: Point): Boolean
    override fun destroy(options: `T$21`)
    override var children: Array<DisplayObject>
    override var sortableChildren: Boolean
    override var sortDirty: Boolean
    override fun onChildrenChange()
    override fun <TChildren : DisplayObject> addChild(vararg child: TChildren): Any
    override fun <T : DisplayObject> addChildAt(child: T, index: Number): T
    override fun swapChildren(child: DisplayObject, child2: DisplayObject)
    override fun getChildIndex(child: DisplayObject): Number
    override fun setChildIndex(child: DisplayObject, index: Number)
    override fun getChildAt(index: Number): DisplayObject
    override fun <TChildren : Array<DisplayObject>> removeChild(vararg child: TChildren): Any
    override fun removeChildAt(index: Number): DisplayObject
    override fun removeChildren(beginIndex: Number, endIndex: Number): Array<DisplayObject>
    override fun sortChildren()
    override fun updateTransform()
    override fun calculateBounds()
    override fun render(renderer: Renderer)
    override fun renderAdvanced(renderer: Renderer)
    override var width: Number
    override var height: Number
    override var interactiveChildren: Boolean
    override fun getChildByName(name: String): DisplayObject
    override var accessible: Boolean
    override var accessibleTitle: String
    override var accessibleHint: String
    override var _accessibleActive: Boolean
    override var _accessibleDiv: Boolean
    override var accessibleType: String
    override var accessiblePointerEvents: String
    override var accessibleChildren: Boolean
    override var transform: Transform
    override var alpha: Number
    override var visible: Boolean
    override var renderable: Boolean
    override var parent: Container
    override var worldAlpha: Number
    override var _lastSortedIndex: Number
    override var _zIndex: Number
    override var filterArea: Rectangle
    override var filters: Array<Filter>
    override var _bounds: Bounds
    override var _mask: dynamic /* PIXI.Graphics | PIXI.Sprite | Nothing? */
    override var _destroyed: Boolean
    override var isSprite: Boolean
    override var isMask: Boolean
    override var _tempDisplayObjectParent: DisplayObject
    override fun _recursivePostUpdateTransform()
    override fun getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle
    override fun getLocalBounds(rect: Rectangle): Rectangle
    override fun toGlobal(position: IPoint, point: IPoint, skipUpdate: Boolean): IPoint
    override fun toLocal(position: IPoint, from: DisplayObject, point: IPoint, skipUpdate: Boolean): IPoint
    override fun setParent(container: Container): Container
    override fun setTransform(x: Number, y: Number, scaleX: Number, scaleY: Number, rotation: Number, skewX: Number, skewY: Number, pivotX: Number, pivotY: Number): DisplayObject
    override var x: Number
    override var y: Number
    override var worldTransform: Matrix
    override var localTransform: Matrix
    override var position: IPoint
    override var scale: IPoint
    override var pivot: IPoint
    override var skew: ObservablePoint
    override var rotation: Number
    override var angle: Number
    override var zIndex: Number
    override var worldVisible: Boolean
    override var mask: dynamic /* PIXI.Container | PIXI.MaskData */
    override fun displayObjectUpdateTransform()
    override var interactive: Boolean
    override var hitArea: IHitArea
    override var buttonMode: Boolean
    override var cursor: String
    override var cacheAsBitmap: Boolean
    override var name: String
    override fun getGlobalPosition(point: Point, skipUpdate: Boolean): Point
}

external open class SimplePlane(texture: PIXI.Texture, verticesX: Number, verticesY: Number) : Mesh {
    open fun textureUpdated()
    override var geometry: Geometry
    override var shader: dynamic /* PIXI.Shader | PIXI.MeshMaterial */
    override var state: State
    override var drawMode: Number
    override var start: Number
    override var size: Number
    override var uvBuffer: Buffer
    override var verticesBuffer: Buffer
    override var material: dynamic /* PIXI.Shader | PIXI.MeshMaterial */
    override var blendMode: Number
    override var roundPixels: Boolean
    override var tint: Number
    override var texture: Texture
    override fun _render(renderer: Renderer)
    override fun _renderDefault(renderer: Renderer)
    override fun _renderToBatch(renderer: Renderer)
    override fun calculateVertices()
    override fun calculateUvs()
    override fun _calculateBounds()
    override fun containsPoint(point: Point): Boolean
    override fun destroy(options: `T$21`)
    override var children: Array<DisplayObject>
    override var sortableChildren: Boolean
    override var sortDirty: Boolean
    override fun onChildrenChange()
    override fun <TChildren : DisplayObject> addChild(vararg child: TChildren): Any
    override fun <T : DisplayObject> addChildAt(child: T, index: Number): T
    override fun swapChildren(child: DisplayObject, child2: DisplayObject)
    override fun getChildIndex(child: DisplayObject): Number
    override fun setChildIndex(child: DisplayObject, index: Number)
    override fun getChildAt(index: Number): DisplayObject
    override fun <TChildren : Array<DisplayObject>> removeChild(vararg child: TChildren): Any
    override fun removeChildAt(index: Number): DisplayObject
    override fun removeChildren(beginIndex: Number, endIndex: Number): Array<DisplayObject>
    override fun sortChildren()
    override fun updateTransform()
    override fun calculateBounds()
    override fun render(renderer: Renderer)
    override fun renderAdvanced(renderer: Renderer)
    override var width: Number
    override var height: Number
    override var interactiveChildren: Boolean
    override fun getChildByName(name: String): DisplayObject
    override var accessible: Boolean
    override var accessibleTitle: String
    override var accessibleHint: String
    override var _accessibleActive: Boolean
    override var _accessibleDiv: Boolean
    override var accessibleType: String
    override var accessiblePointerEvents: String
    override var accessibleChildren: Boolean
    override var transform: Transform
    override var alpha: Number
    override var visible: Boolean
    override var renderable: Boolean
    override var parent: Container
    override var worldAlpha: Number
    override var _lastSortedIndex: Number
    override var _zIndex: Number
    override var filterArea: Rectangle
    override var filters: Array<Filter>
    override var _bounds: Bounds
    override var _mask: dynamic /* PIXI.Graphics | PIXI.Sprite | Nothing? */
    override var _destroyed: Boolean
    override var isSprite: Boolean
    override var isMask: Boolean
    override var _tempDisplayObjectParent: DisplayObject
    override fun _recursivePostUpdateTransform()
    override fun getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle
    override fun getLocalBounds(rect: Rectangle): Rectangle
    override fun toGlobal(position: IPoint, point: IPoint, skipUpdate: Boolean): IPoint
    override fun toLocal(position: IPoint, from: DisplayObject, point: IPoint, skipUpdate: Boolean): IPoint
    override fun setParent(container: Container): Container
    override fun setTransform(x: Number, y: Number, scaleX: Number, scaleY: Number, rotation: Number, skewX: Number, skewY: Number, pivotX: Number, pivotY: Number): DisplayObject
    override var x: Number
    override var y: Number
    override var worldTransform: Matrix
    override var localTransform: Matrix
    override var position: IPoint
    override var scale: IPoint
    override var pivot: IPoint
    override var skew: ObservablePoint
    override var rotation: Number
    override var angle: Number
    override var zIndex: Number
    override var worldVisible: Boolean
    override var mask: dynamic /* PIXI.Container | PIXI.MaskData */
    override fun displayObjectUpdateTransform()
    override var interactive: Boolean
    override var hitArea: IHitArea
    override var buttonMode: Boolean
    override var cursor: String
    override var cacheAsBitmap: Boolean
    override var name: String
    override fun getGlobalPosition(point: Point, skipUpdate: Boolean): Point
}

external open class SimpleRope(texture: PIXI.Texture, points: Array<PIXI.Point>, textureScale: Number = definedExternally) : Mesh {
    open var autoUpdate: Boolean
    override var geometry: Geometry
    override var shader: dynamic /* PIXI.Shader | PIXI.MeshMaterial */
    override var state: State
    override var drawMode: Number
    override var start: Number
    override var size: Number
    override var uvBuffer: Buffer
    override var verticesBuffer: Buffer
    override var material: dynamic /* PIXI.Shader | PIXI.MeshMaterial */
    override var blendMode: Number
    override var roundPixels: Boolean
    override var tint: Number
    override var texture: Texture
    override fun _render(renderer: Renderer)
    override fun _renderDefault(renderer: Renderer)
    override fun _renderToBatch(renderer: Renderer)
    override fun calculateVertices()
    override fun calculateUvs()
    override fun _calculateBounds()
    override fun containsPoint(point: Point): Boolean
    override fun destroy(options: `T$21`)
    override var children: Array<DisplayObject>
    override var sortableChildren: Boolean
    override var sortDirty: Boolean
    override fun onChildrenChange()
    override fun <TChildren : DisplayObject> addChild(vararg child: TChildren): Any
    override fun <T : DisplayObject> addChildAt(child: T, index: Number): T
    override fun swapChildren(child: DisplayObject, child2: DisplayObject)
    override fun getChildIndex(child: DisplayObject): Number
    override fun setChildIndex(child: DisplayObject, index: Number)
    override fun getChildAt(index: Number): DisplayObject
    override fun <TChildren : Array<DisplayObject>> removeChild(vararg child: TChildren): Any
    override fun removeChildAt(index: Number): DisplayObject
    override fun removeChildren(beginIndex: Number, endIndex: Number): Array<DisplayObject>
    override fun sortChildren()
    override fun updateTransform()
    override fun calculateBounds()
    override fun render(renderer: Renderer)
    override fun renderAdvanced(renderer: Renderer)
    override var width: Number
    override var height: Number
    override var interactiveChildren: Boolean
    override fun getChildByName(name: String): DisplayObject
    override var accessible: Boolean
    override var accessibleTitle: String
    override var accessibleHint: String
    override var _accessibleActive: Boolean
    override var _accessibleDiv: Boolean
    override var accessibleType: String
    override var accessiblePointerEvents: String
    override var accessibleChildren: Boolean
    override var transform: Transform
    override var alpha: Number
    override var visible: Boolean
    override var renderable: Boolean
    override var parent: Container
    override var worldAlpha: Number
    override var _lastSortedIndex: Number
    override var _zIndex: Number
    override var filterArea: Rectangle
    override var filters: Array<Filter>
    override var _bounds: Bounds
    override var _mask: dynamic /* PIXI.Graphics | PIXI.Sprite | Nothing? */
    override var _destroyed: Boolean
    override var isSprite: Boolean
    override var isMask: Boolean
    override var _tempDisplayObjectParent: DisplayObject
    override fun _recursivePostUpdateTransform()
    override fun getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle
    override fun getLocalBounds(rect: Rectangle): Rectangle
    override fun toGlobal(position: IPoint, point: IPoint, skipUpdate: Boolean): IPoint
    override fun toLocal(position: IPoint, from: DisplayObject, point: IPoint, skipUpdate: Boolean): IPoint
    override fun setParent(container: Container): Container
    override fun setTransform(x: Number, y: Number, scaleX: Number, scaleY: Number, rotation: Number, skewX: Number, skewY: Number, pivotX: Number, pivotY: Number): DisplayObject
    override var x: Number
    override var y: Number
    override var worldTransform: Matrix
    override var localTransform: Matrix
    override var position: IPoint
    override var scale: IPoint
    override var pivot: IPoint
    override var skew: ObservablePoint
    override var rotation: Number
    override var angle: Number
    override var zIndex: Number
    override var worldVisible: Boolean
    override var mask: dynamic /* PIXI.Container | PIXI.MaskData */
    override fun displayObjectUpdateTransform()
    override var interactive: Boolean
    override var hitArea: IHitArea
    override var buttonMode: Boolean
    override var cursor: String
    override var cacheAsBitmap: Boolean
    override var name: String
    override fun getGlobalPosition(point: Point, skipUpdate: Boolean): Point
}

external open class RopeGeometry(width: Number = definedExternally, points: Array<PIXI.Point> = definedExternally, textureScale: Number = definedExternally) : MeshGeometry {
    open var points: Array<Point>
    open var width: Number
    open var textureScale: Number
    open fun updateVertices()
    override var glVertexArrayObjects: Any
    override var instanceCount: Number
    override var refCount: Number
    override fun addAttribute(id: String, buffer: Buffer, size: Number, normalized: Boolean, type: Number, stride: Number, start: Number): Geometry
    override fun addAttribute(id: String, buffer: Array<Number>, size: Number, normalized: Boolean, type: Number, stride: Number, start: Number): Geometry
    override fun getAttribute(id: String): Attribute
    override fun getBuffer(id: String): Buffer
    override fun addIndex(buffer: Buffer): Geometry
    override fun addIndex(buffer: Array<Number>): Geometry
    override fun getIndex(): Buffer
    override fun interleave(): Geometry
    override fun dispose()
    override fun destroy()
    override fun clone(): Geometry
    override fun addAttribute(id: String): Geometry
    override fun addIndex(): Geometry
}

external interface `T$23` {
    var vertices: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var position: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rotation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var uvs: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var tint: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class ParticleContainer(maxSize: Number = definedExternally, properties: `T$23` = definedExternally, batchSize: Number = definedExternally, autoResize: Boolean = definedExternally) : Container {
    override var interactiveChildren: Boolean
    open var blendMode: Number
    open var autoResize: Boolean
    open var roundPixels: Boolean
    open var baseTexture: BaseTexture
    open fun setProperties(properties: Any)
    open var tint: Number
    override fun destroy(options: `T$1`)
    override var children: Array<DisplayObject>
    override var sortableChildren: Boolean
    override var sortDirty: Boolean
    override fun <TChildren : DisplayObject> addChild(vararg child: TChildren): Any
    override fun <T : DisplayObject> addChildAt(child: T, index: Number): T
    override fun swapChildren(child: DisplayObject, child2: DisplayObject)
    override fun getChildIndex(child: DisplayObject): Number
    override fun setChildIndex(child: DisplayObject, index: Number)
    override fun getChildAt(index: Number): DisplayObject
    override fun <TChildren : Array<DisplayObject>> removeChild(vararg child: TChildren): Any
    override fun removeChildAt(index: Number): DisplayObject
    override fun removeChildren(beginIndex: Number, endIndex: Number): Array<DisplayObject>
    override fun sortChildren()
    override fun calculateBounds()
    override fun _calculateBounds()
    override fun renderAdvanced(renderer: Renderer)
    override fun _render(renderer: Renderer)
    override var width: Number
    override var height: Number
    override fun getChildByName(name: String): DisplayObject
    override var accessible: Boolean
    override var accessibleTitle: String
    override var accessibleHint: String
    override var _accessibleActive: Boolean
    override var _accessibleDiv: Boolean
    override var accessibleType: String
    override var accessiblePointerEvents: String
    override var accessibleChildren: Boolean
    override var transform: Transform
    override var alpha: Number
    override var visible: Boolean
    override var renderable: Boolean
    override var parent: Container
    override var worldAlpha: Number
    override var _lastSortedIndex: Number
    override var _zIndex: Number
    override var filterArea: Rectangle
    override var filters: Array<Filter>
    override var _bounds: Bounds
    override var _mask: dynamic /* PIXI.Graphics | PIXI.Sprite | Nothing? */
    override var _destroyed: Boolean
    override var isSprite: Boolean
    override var isMask: Boolean
    override var _tempDisplayObjectParent: DisplayObject
    override fun _recursivePostUpdateTransform()
    override fun getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle
    override fun getLocalBounds(rect: Rectangle): Rectangle
    override fun toGlobal(position: IPoint, point: IPoint, skipUpdate: Boolean): IPoint
    override fun toLocal(position: IPoint, from: DisplayObject, point: IPoint, skipUpdate: Boolean): IPoint
    override fun setParent(container: Container): Container
    override fun setTransform(x: Number, y: Number, scaleX: Number, scaleY: Number, rotation: Number, skewX: Number, skewY: Number, pivotX: Number, pivotY: Number): DisplayObject
    override var x: Number
    override var y: Number
    override var worldTransform: Matrix
    override var localTransform: Matrix
    override var position: IPoint
    override var scale: IPoint
    override var pivot: IPoint
    override var skew: ObservablePoint
    override var rotation: Number
    override var angle: Number
    override var zIndex: Number
    override var worldVisible: Boolean
    override var mask: dynamic /* PIXI.Container | PIXI.MaskData */
    override fun displayObjectUpdateTransform()
    override var interactive: Boolean
    override var hitArea: IHitArea
    override var buttonMode: Boolean
    override var cursor: String
    override var cacheAsBitmap: Boolean
    override var name: String
    override fun getGlobalPosition(point: Point, skipUpdate: Boolean): Point
}

external open class ParticleRenderer(renderer: PIXI.Renderer) {
    open var shader: Shader
    open var state: State
    open fun render(container: ParticleContainer)
    open fun uploadVertices(children: Array<DisplayObject>, startIndex: Number, amount: Number, array: Array<Number>, stride: Number, offset: Number)
    open fun uploadPosition(children: Array<DisplayObject>, startIndex: Number, amount: Number, array: Array<Number>, stride: Number, offset: Number)
    open fun uploadRotation(children: Array<DisplayObject>, startIndex: Number, amount: Number, array: Array<Number>, stride: Number, offset: Number)
    open fun uploadUvs(children: Array<DisplayObject>, startIndex: Number, amount: Number, array: Array<Number>, stride: Number, offset: Number)
    open fun uploadTint(children: Array<DisplayObject>, startIndex: Number, amount: Number, array: Array<Number>, stride: Number, offset: Number)
    open fun destroy()
}

external open class BasePrepare(renderer: PIXI.AbstractRenderer) {
    open var limiter: dynamic /* PIXI.CountLimiter | PIXI.TimeLimiter */
    open var renderer: AbstractRenderer
    open var uploadHookHelper: Any
    open fun upload(item: (params: Array<Any>) -> Any, done: (params: Array<Any>) -> Any = definedExternally)
    open fun upload(item: DisplayObject, done: (params: Array<Any>) -> Any = definedExternally)
    open fun upload(item: Container, done: (params: Array<Any>) -> Any = definedExternally)
    open fun upload(item: BaseTexture, done: (params: Array<Any>) -> Any = definedExternally)
    open fun upload(item: Texture, done: (params: Array<Any>) -> Any = definedExternally)
    open fun upload(item: Graphics, done: (params: Array<Any>) -> Any = definedExternally)
    open fun upload(item: Text, done: (params: Array<Any>) -> Any = definedExternally)
    open fun registerFindHook(addHook: (params: Array<Any>) -> Any): BasePrepare /* this */
    open fun registerUploadHook(uploadHook: (params: Array<Any>) -> Any): BasePrepare /* this */
    open fun add(item: DisplayObject): BasePrepare /* this */
    open fun add(item: Container): BasePrepare /* this */
    open fun add(item: BaseTexture): BasePrepare /* this */
    open fun add(item: Texture): BasePrepare /* this */
    open fun add(item: Graphics): BasePrepare /* this */
    open fun add(item: Text): BasePrepare /* this */
    open fun add(item: Any): BasePrepare /* this */
    open fun destroy()
}

external open class CountLimiter(maxItemsPerFrame: Number) {
    open fun beginFrame()
    open fun allowedToUpload(): Boolean
}

external open class Prepare(renderer: PIXI.Renderer) : BasePrepare {
    override var limiter: dynamic /* PIXI.CountLimiter | PIXI.TimeLimiter */
    override var renderer: AbstractRenderer
    override var uploadHookHelper: Any
    override fun upload(item: (params: Array<Any>) -> Any, done: (params: Array<Any>) -> Any)
    override fun upload(item: DisplayObject, done: (params: Array<Any>) -> Any)
    override fun upload(item: Container, done: (params: Array<Any>) -> Any)
    override fun upload(item: BaseTexture, done: (params: Array<Any>) -> Any)
    override fun upload(item: Texture, done: (params: Array<Any>) -> Any)
    override fun upload(item: Graphics, done: (params: Array<Any>) -> Any)
    override fun upload(item: Text, done: (params: Array<Any>) -> Any)
    override fun registerFindHook(addHook: (params: Array<Any>) -> Any): Prepare /* this */
    override fun registerUploadHook(uploadHook: (params: Array<Any>) -> Any): Prepare /* this */
    override fun add(item: DisplayObject): Prepare /* this */
    override fun add(item: Container): Prepare /* this */
    override fun add(item: BaseTexture): Prepare /* this */
    override fun add(item: Texture): Prepare /* this */
    override fun add(item: Graphics): Prepare /* this */
    override fun add(item: Text): Prepare /* this */
    override fun add(item: Any): Prepare /* this */
    override fun destroy()
}

external open class TimeLimiter(maxMilliseconds: Number) {
    open fun beginFrame()
    open fun allowedToUpload(): Boolean
}

external open class Runner(name: String) {
    open fun emit(vararg params: Any): Runner
    open fun add(item: Any): Runner
    open fun remove(item: Any): Runner
    open fun contains(item: Any)
    open fun removeAll(): Runner
    open fun destroy()
    open var empty: Boolean
    open var name: String
    open fun dispatch()
    open fun run()
}

external open class Sprite(texture: PIXI.Texture = definedExternally) : Container {
    open var blendMode: Number
    open var shader: dynamic /* PIXI.Filter | PIXI.Shader */
    open var _cachedTint: Number
    open var pluginName: String
    override var isSprite: Boolean
    open fun calculateVertices()
    open fun calculateTrimmedVertices()
    override fun _render(renderer: Renderer)
    override fun _calculateBounds()
    override fun getLocalBounds(rect: Rectangle): Rectangle
    open fun containsPoint(point: Point): Boolean
    override fun destroy(options: `T$1`)
    open var roundPixels: Boolean
    override var width: Number
    override var height: Number
    open var anchor: ObservablePoint
    open var tint: Number
    open var texture: Texture
    override var children: Array<DisplayObject>
    override var sortableChildren: Boolean
    override var sortDirty: Boolean
    override fun onChildrenChange()
    override fun <TChildren : DisplayObject> addChild(vararg child: TChildren): Any
    override fun <T : DisplayObject> addChildAt(child: T, index: Number): T
    override fun swapChildren(child: DisplayObject, child2: DisplayObject)
    override fun getChildIndex(child: DisplayObject): Number
    override fun setChildIndex(child: DisplayObject, index: Number)
    override fun getChildAt(index: Number): DisplayObject
    override fun <TChildren : Array<DisplayObject>> removeChild(vararg child: TChildren): Any
    override fun removeChildAt(index: Number): DisplayObject
    override fun removeChildren(beginIndex: Number, endIndex: Number): Array<DisplayObject>
    override fun sortChildren()
    override fun updateTransform()
    override fun calculateBounds()
    override fun render(renderer: Renderer)
    override fun renderAdvanced(renderer: Renderer)
    override var interactiveChildren: Boolean
    override fun getChildByName(name: String): DisplayObject
    override var accessible: Boolean
    override var accessibleTitle: String
    override var accessibleHint: String
    override var _accessibleActive: Boolean
    override var _accessibleDiv: Boolean
    override var accessibleType: String
    override var accessiblePointerEvents: String
    override var accessibleChildren: Boolean
    override var transform: Transform
    override var alpha: Number
    override var visible: Boolean
    override var renderable: Boolean
    override var parent: Container
    override var worldAlpha: Number
    override var _lastSortedIndex: Number
    override var _zIndex: Number
    override var filterArea: Rectangle
    override var filters: Array<Filter>
    override var _bounds: Bounds
    override var _mask: dynamic /* PIXI.Graphics | PIXI.Sprite | Nothing? */
    override var _destroyed: Boolean
    override var isMask: Boolean
    override var _tempDisplayObjectParent: DisplayObject
    override fun _recursivePostUpdateTransform()
    override fun getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle
    override fun toGlobal(position: IPoint, point: IPoint, skipUpdate: Boolean): IPoint
    override fun toLocal(position: IPoint, from: DisplayObject, point: IPoint, skipUpdate: Boolean): IPoint
    override fun setParent(container: Container): Container
    override fun setTransform(x: Number, y: Number, scaleX: Number, scaleY: Number, rotation: Number, skewX: Number, skewY: Number, pivotX: Number, pivotY: Number): DisplayObject
    override var x: Number
    override var y: Number
    override var worldTransform: Matrix
    override var localTransform: Matrix
    override var position: IPoint
    override var scale: IPoint
    override var pivot: IPoint
    override var skew: ObservablePoint
    override var rotation: Number
    override var angle: Number
    override var zIndex: Number
    override var worldVisible: Boolean
    override var mask: dynamic /* PIXI.Container | PIXI.MaskData */
    override fun displayObjectUpdateTransform()
    override var interactive: Boolean
    override var hitArea: IHitArea
    override var buttonMode: Boolean
    override var cursor: String
    override var cacheAsBitmap: Boolean
    override var name: String
    override fun getGlobalPosition(point: Point, skipUpdate: Boolean): Point

    companion object {
        fun from(source: String, options: Any = definedExternally): Sprite
        fun from(source: Texture, options: Any = definedExternally): Sprite
        fun from(source: HTMLCanvasElement, options: Any = definedExternally): Sprite
        fun from(source: HTMLVideoElement, options: Any = definedExternally): Sprite
    }
}

external open class AnimatedSprite : Sprite {
    constructor(textures: Array<Texture>, autoUpdate: Boolean)
    constructor(textures: Array<FrameObject>, autoUpdate: Boolean)

    open var animationSpeed: Number
    open var loop: Boolean
    open var updateAnchor: Boolean
    open var onComplete: (params: Any) -> Any
    open var onFrameChange: (params: Any) -> Any
    open var onLoop: (params: Any) -> Any
    open var playing: Boolean
    open fun stop()
    open fun play()
    open fun gotoAndStop(frameNumber: Number)
    open fun gotoAndPlay(frameNumber: Number)
    override fun destroy(options: `T$1`)
    open var totalFrames: Number
    open var textures: Array<Texture>
    open var currentFrame: Number
    override var blendMode: Number
    override var shader: dynamic /* PIXI.Filter | PIXI.Shader */
    override var _cachedTint: Number
    override var pluginName: String
    override var isSprite: Boolean
    override fun calculateVertices()
    override fun calculateTrimmedVertices()
    override fun _render(renderer: Renderer)
    override fun _calculateBounds()
    override fun getLocalBounds(rect: Rectangle): Rectangle
    override fun containsPoint(point: Point): Boolean
    override var roundPixels: Boolean
    override var width: Number
    override var height: Number
    override var anchor: ObservablePoint
    override var tint: Number
    override var texture: Texture
    override var children: Array<DisplayObject>
    override var sortableChildren: Boolean
    override var sortDirty: Boolean
    override fun onChildrenChange()
    override fun <TChildren : DisplayObject> addChild(vararg child: TChildren): Any
    override fun <T : DisplayObject> addChildAt(child: T, index: Number): T
    override fun swapChildren(child: DisplayObject, child2: DisplayObject)
    override fun getChildIndex(child: DisplayObject): Number
    override fun setChildIndex(child: DisplayObject, index: Number)
    override fun getChildAt(index: Number): DisplayObject
    override fun <TChildren : Array<DisplayObject>> removeChild(vararg child: TChildren): Any
    override fun removeChildAt(index: Number): DisplayObject
    override fun removeChildren(beginIndex: Number, endIndex: Number): Array<DisplayObject>
    override fun sortChildren()
    override fun updateTransform()
    override fun calculateBounds()
    override fun render(renderer: Renderer)
    override fun renderAdvanced(renderer: Renderer)
    override var interactiveChildren: Boolean
    override fun getChildByName(name: String): DisplayObject
    override var accessible: Boolean
    override var accessibleTitle: String
    override var accessibleHint: String
    override var _accessibleActive: Boolean
    override var _accessibleDiv: Boolean
    override var accessibleType: String
    override var accessiblePointerEvents: String
    override var accessibleChildren: Boolean
    override var transform: Transform
    override var alpha: Number
    override var visible: Boolean
    override var renderable: Boolean
    override var parent: Container
    override var worldAlpha: Number
    override var _lastSortedIndex: Number
    override var _zIndex: Number
    override var filterArea: Rectangle
    override var filters: Array<Filter>
    override var _bounds: Bounds
    override var _mask: dynamic /* PIXI.Graphics | PIXI.Sprite | Nothing? */
    override var _destroyed: Boolean
    override var isMask: Boolean
    override var _tempDisplayObjectParent: DisplayObject
    override fun _recursivePostUpdateTransform()
    override fun getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle
    override fun toGlobal(position: IPoint, point: IPoint, skipUpdate: Boolean): IPoint
    override fun toLocal(position: IPoint, from: DisplayObject, point: IPoint, skipUpdate: Boolean): IPoint
    override fun setParent(container: Container): Container
    override fun setTransform(x: Number, y: Number, scaleX: Number, scaleY: Number, rotation: Number, skewX: Number, skewY: Number, pivotX: Number, pivotY: Number): DisplayObject
    override var x: Number
    override var y: Number
    override var worldTransform: Matrix
    override var localTransform: Matrix
    override var position: IPoint
    override var scale: IPoint
    override var pivot: IPoint
    override var skew: ObservablePoint
    override var rotation: Number
    override var angle: Number
    override var zIndex: Number
    override var worldVisible: Boolean
    override var mask: dynamic /* PIXI.Container | PIXI.MaskData */
    override fun displayObjectUpdateTransform()
    override var interactive: Boolean
    override var hitArea: IHitArea
    override var buttonMode: Boolean
    override var cursor: String
    override var cacheAsBitmap: Boolean
    override var name: String
    override fun getGlobalPosition(point: Point, skipUpdate: Boolean): Point
    interface FrameObject {
        var texture: Texture
        var time: Number
    }

    companion object {
        fun fromFrames(frames: Array<String>): AnimatedSprite
        fun fromImages(images: Array<String>): AnimatedSprite
    }
}

external open class TilingSprite(texture: PIXI.Texture, width: Number = definedExternally, height: Number = definedExternally) : Sprite {
    open var tileTransform: Transform
    open var uvMatrix: TextureMatrix
    override var pluginName: String
    open var uvRespectAnchor: Boolean
    open var clampMargin: Number
    open var tileScale: ObservablePoint
    open var tilePosition: ObservablePoint
    override fun _render(renderer: Renderer)
    override fun _calculateBounds()
    override fun getLocalBounds(rect: Rectangle): Rectangle
    override fun containsPoint(point: Point): Boolean
    override fun destroy(options: `T$1`)
    override var width: Number
    override var height: Number
    override var blendMode: Number
    override var shader: dynamic /* PIXI.Filter | PIXI.Shader */
    override var _cachedTint: Number
    override var isSprite: Boolean
    override fun calculateVertices()
    override fun calculateTrimmedVertices()
    override var roundPixels: Boolean
    override var anchor: ObservablePoint
    override var tint: Number
    override var texture: Texture
    override var children: Array<DisplayObject>
    override var sortableChildren: Boolean
    override var sortDirty: Boolean
    override fun onChildrenChange()
    override fun <TChildren : DisplayObject> addChild(vararg child: TChildren): Any
    override fun <T : DisplayObject> addChildAt(child: T, index: Number): T
    override fun swapChildren(child: DisplayObject, child2: DisplayObject)
    override fun getChildIndex(child: DisplayObject): Number
    override fun setChildIndex(child: DisplayObject, index: Number)
    override fun getChildAt(index: Number): DisplayObject
    override fun <TChildren : Array<DisplayObject>> removeChild(vararg child: TChildren): Any
    override fun removeChildAt(index: Number): DisplayObject
    override fun removeChildren(beginIndex: Number, endIndex: Number): Array<DisplayObject>
    override fun sortChildren()
    override fun updateTransform()
    override fun calculateBounds()
    override fun render(renderer: Renderer)
    override fun renderAdvanced(renderer: Renderer)
    override var interactiveChildren: Boolean
    override fun getChildByName(name: String): DisplayObject
    override var accessible: Boolean
    override var accessibleTitle: String
    override var accessibleHint: String
    override var _accessibleActive: Boolean
    override var _accessibleDiv: Boolean
    override var accessibleType: String
    override var accessiblePointerEvents: String
    override var accessibleChildren: Boolean
    override var transform: Transform
    override var alpha: Number
    override var visible: Boolean
    override var renderable: Boolean
    override var parent: Container
    override var worldAlpha: Number
    override var _lastSortedIndex: Number
    override var _zIndex: Number
    override var filterArea: Rectangle
    override var filters: Array<Filter>
    override var _bounds: Bounds
    override var _mask: dynamic /* PIXI.Graphics | PIXI.Sprite | Nothing? */
    override var _destroyed: Boolean
    override var isMask: Boolean
    override var _tempDisplayObjectParent: DisplayObject
    override fun _recursivePostUpdateTransform()
    override fun getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle
    override fun toGlobal(position: IPoint, point: IPoint, skipUpdate: Boolean): IPoint
    override fun toLocal(position: IPoint, from: DisplayObject, point: IPoint, skipUpdate: Boolean): IPoint
    override fun setParent(container: Container): Container
    override fun setTransform(x: Number, y: Number, scaleX: Number, scaleY: Number, rotation: Number, skewX: Number, skewY: Number, pivotX: Number, pivotY: Number): DisplayObject
    override var x: Number
    override var y: Number
    override var worldTransform: Matrix
    override var localTransform: Matrix
    override var position: IPoint
    override var scale: IPoint
    override var pivot: IPoint
    override var skew: ObservablePoint
    override var rotation: Number
    override var angle: Number
    override var zIndex: Number
    override var worldVisible: Boolean
    override var mask: dynamic /* PIXI.Container | PIXI.MaskData */
    override fun displayObjectUpdateTransform()
    override var interactive: Boolean
    override var hitArea: IHitArea
    override var buttonMode: Boolean
    override var cursor: String
    override var cacheAsBitmap: Boolean
    override var name: String
    override fun getGlobalPosition(point: Point, skipUpdate: Boolean): Point

    companion object {
        fun from(source: Number, options: Any = definedExternally): Sprite
        fun from(source: String, options: Any = definedExternally): Sprite
        fun from(source: Texture, options: Any = definedExternally): Sprite
        fun from(source: HTMLCanvasElement, options: Any = definedExternally): Sprite
        fun from(source: HTMLVideoElement, options: Any = definedExternally): Sprite
        fun fromFrame(): Sprite
        fun fromImage(): Sprite
        fun from(source: String, width: Number, height: Number): TilingSprite
        fun from(source: Texture, width: Number, height: Number): TilingSprite
        fun from(source: HTMLCanvasElement, width: Number, height: Number): TilingSprite
        fun from(source: HTMLVideoElement, width: Number, height: Number): TilingSprite
        fun fromFrame(frameId: String, width: Number, height: Number): TilingSprite
        fun fromImage(imageId: String, width: Number, height: Number, options: Any = definedExternally): TilingSprite
    }
}

external open class TilingSpriteRenderer(renderer: PIXI.Renderer) : ObjectRenderer {
    open var state: State
    open fun render(ts: TilingSprite)
    override fun render(obj: DisplayObject)
    override var renderer: Renderer
    override fun flush()
    override fun destroy()
    override fun start()
    override fun stop()
}

external open class Spritesheet(baseTexture: PIXI.BaseTexture, data: Any, resolutionFilename: String = definedExternally) {
    open var baseTexture: BaseTexture
    open var textures: Any
    open var animations: Any
    open var data: Any
    open var resolution: Number
    open fun parse(callback: (params: Array<Any>) -> Any)
    open fun destroy(destroyBase: Boolean = definedExternally)

    companion object {
        var BATCH_SIZE: Number
    }
}

external open class SpritesheetLoader : ILoaderPlugin {
    companion object {
        fun use(resource: LoaderResource, next: (params: Array<Any>) -> Any)
        fun getResourcePath(resource: LoaderResource, baseUrl: String)
    }
}

external open class Text : Sprite {
    constructor(text: String, style: Any, canvas: HTMLCanvasElement)
    constructor(text: String, style: TextStyle, canvas: HTMLCanvasElement)

    open var canvas: HTMLCanvasElement
    open var context: CanvasRenderingContext2D
    open var _resolution: Number
    override fun getLocalBounds(rect: Rectangle): Rectangle
    override fun _calculateBounds()
    override fun destroy(options: `T$1`)
    override var width: Number
    override var height: Number
    open var style: dynamic /* Any | PIXI.TextStyle */
    open var text: String
    open var resolution: Number
    override var blendMode: Number
    override var shader: dynamic /* PIXI.Filter | PIXI.Shader */
    override var _cachedTint: Number
    override var pluginName: String
    override var isSprite: Boolean
    override fun calculateVertices()
    override fun calculateTrimmedVertices()
    override fun containsPoint(point: Point): Boolean
    override var roundPixels: Boolean
    override var anchor: ObservablePoint
    override var tint: Number
    override var texture: Texture
    override var children: Array<DisplayObject>
    override var sortableChildren: Boolean
    override var sortDirty: Boolean
    override fun onChildrenChange()
    override fun <TChildren : DisplayObject> addChild(vararg child: TChildren): Any
    override fun <T : DisplayObject> addChildAt(child: T, index: Number): T
    override fun swapChildren(child: DisplayObject, child2: DisplayObject)
    override fun getChildIndex(child: DisplayObject): Number
    override fun setChildIndex(child: DisplayObject, index: Number)
    override fun getChildAt(index: Number): DisplayObject
    override fun <TChildren : Array<DisplayObject>> removeChild(vararg child: TChildren): Any
    override fun removeChildAt(index: Number): DisplayObject
    override fun removeChildren(beginIndex: Number, endIndex: Number): Array<DisplayObject>
    override fun sortChildren()
    override fun updateTransform()
    override fun calculateBounds()
    override fun render(renderer: Renderer)
    override fun renderAdvanced(renderer: Renderer)
    override var interactiveChildren: Boolean
    override fun getChildByName(name: String): DisplayObject
    override var accessible: Boolean
    override var accessibleTitle: String
    override var accessibleHint: String
    override var _accessibleActive: Boolean
    override var _accessibleDiv: Boolean
    override var accessibleType: String
    override var accessiblePointerEvents: String
    override var accessibleChildren: Boolean
    override var transform: Transform
    override var alpha: Number
    override var visible: Boolean
    override var renderable: Boolean
    override var parent: Container
    override var worldAlpha: Number
    override var _lastSortedIndex: Number
    override var _zIndex: Number
    override var filterArea: Rectangle
    override var filters: Array<Filter>
    override var _bounds: Bounds
    override var _mask: dynamic /* PIXI.Graphics | PIXI.Sprite | Nothing? */
    override var _destroyed: Boolean
    override var isMask: Boolean
    override var _tempDisplayObjectParent: DisplayObject
    override fun _recursivePostUpdateTransform()
    override fun getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle
    override fun toGlobal(position: IPoint, point: IPoint, skipUpdate: Boolean): IPoint
    override fun toLocal(position: IPoint, from: DisplayObject, point: IPoint, skipUpdate: Boolean): IPoint
    override fun setParent(container: Container): Container
    override fun setTransform(x: Number, y: Number, scaleX: Number, scaleY: Number, rotation: Number, skewX: Number, skewY: Number, pivotX: Number, pivotY: Number): DisplayObject
    override var x: Number
    override var y: Number
    override var worldTransform: Matrix
    override var localTransform: Matrix
    override var position: IPoint
    override var scale: IPoint
    override var pivot: IPoint
    override var skew: ObservablePoint
    override var rotation: Number
    override var angle: Number
    override var zIndex: Number
    override var worldVisible: Boolean
    override var mask: dynamic /* PIXI.Container | PIXI.MaskData */
    override fun displayObjectUpdateTransform()
    override var interactive: Boolean
    override var hitArea: IHitArea
    override var buttonMode: Boolean
    override var cursor: String
    override var cacheAsBitmap: Boolean
    override var name: String
    override fun getGlobalPosition(point: Point, skipUpdate: Boolean): Point
}

external interface IFontMetrics {
    var ascent: Number
    var descent: Number
    var fontSize: Number
}

external open class TextMetrics(text: String, style: PIXI.TextStyle, width: Number, height: Number, lines: Array<String>, lineWidths: Array<Number>, lineHeight: Number, maxLineWidth: Number, fontProperties: Any) {
    open var text: String
    open var style: TextStyle
    open var width: Number
    open var height: Number
    open var lines: Array<String>
    open var lineWidths: Array<Number>
    open var lineHeight: Number
    open var maxLineWidth: Number
    open var fontProperties: IFontMetrics

    companion object {
        fun measureText(text: String, style: TextStyle, wordWrap: Boolean = definedExternally, canvas: HTMLCanvasElement = definedExternally): TextMetrics
        fun canBreakWords(token: String, breakWords: Boolean): Boolean
        fun canBreakChars(char: String, nextChar: String, token: String, index: Number, breakWords: Boolean): Boolean
        fun wordWrapSplit(token: String): Array<String>
        fun measureFont(font: String): IFontMetrics
        fun clearMetrics(font: String = definedExternally)
        var METRICS_STRING: String
        var BASELINE_SYMBOL: String
        var BASELINE_MULTIPLIER: Number
    }
}

external interface `T$24` {
    var align: String?
        get() = definedExternally
        set(value) = definedExternally
    var breakWords: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var dropShadow: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var dropShadowAlpha: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dropShadowAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dropShadowBlur: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dropShadowColor: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var dropShadowDistance: Number?
        get() = definedExternally
        set(value) = definedExternally
    var fill: dynamic /* String | Array<String> | Number | Array<Number> | CanvasGradient | CanvasPattern */
        get() = definedExternally
        set(value) = definedExternally
    var fillGradientType: Number?
        get() = definedExternally
        set(value) = definedExternally
    var fillGradientStops: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var fontFamily: dynamic /* String | Array<String> */
        get() = definedExternally
        set(value) = definedExternally
    var fontSize: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var fontStyle: String?
        get() = definedExternally
        set(value) = definedExternally
    var fontVariant: String?
        get() = definedExternally
        set(value) = definedExternally
    var fontWeight: String?
        get() = definedExternally
        set(value) = definedExternally
    var leading: Number?
        get() = definedExternally
        set(value) = definedExternally
    var letterSpacing: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineJoin: String?
        get() = definedExternally
        set(value) = definedExternally
    var miterLimit: Number?
        get() = definedExternally
        set(value) = definedExternally
    var padding: Number?
        get() = definedExternally
        set(value) = definedExternally
    var stroke: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var strokeThickness: Number?
        get() = definedExternally
        set(value) = definedExternally
    var trim: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var textBaseline: String?
        get() = definedExternally
        set(value) = definedExternally
    var whiteSpace: String?
        get() = definedExternally
        set(value) = definedExternally
    var wordWrap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var wordWrapWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class TextStyle(style: `T$24` = definedExternally) {
    open fun clone(): TextStyle
    open fun reset()
    open var align: String
    open var breakWords: Boolean
    open var dropShadow: Boolean
    open var dropShadowAlpha: Number
    open var dropShadowAngle: Number
    open var dropShadowBlur: Number
    open var dropShadowColor: dynamic /* String | Number */
    open var dropShadowDistance: Number
    open var fill: dynamic /* String | Array<String> | Number | Array<Number> | CanvasGradient | CanvasPattern */
    open var fillGradientType: Number
    open var fillGradientStops: Array<Number>
    open var fontFamily: dynamic /* String | Array<String> */
    open var fontSize: dynamic /* Number | String */
    open var fontStyle: String
    open var fontVariant: String
    open var fontWeight: String
    open var letterSpacing: Number
    open var lineHeight: Number
    open var leading: Number
    open var lineJoin: String
    open var miterLimit: Number
    open var padding: Number
    open var stroke: dynamic /* String | Number */
    open var strokeThickness: Number
    open var textBaseline: String
    open var trim: Boolean
    open var whiteSpace: String
    open var wordWrap: Boolean
    open var wordWrapWidth: Number
    open fun toFontString(): String
}

external object TEXT_GRADIENT {
    var LINEAR_VERTICAL: Number
    var LINEAR_HORIZONTAL: Number
}

external open class BitmapFontLoader : ILoaderPlugin {
    companion object {
        fun parse(resource: LoaderResource, texture: Texture)
        fun add()
        fun use(resource: LoaderResource, next: (params: Array<Any>) -> Any)
    }
}

external interface `T$25` {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$26` {
    var font: `T$25`
    var align: String?
        get() = definedExternally
        set(value) = definedExternally
    var tint: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$27` {
    @nativeGetter
    operator fun get(key: String): Texture?

    @nativeSetter
    operator fun set(key: String, value: Texture)
}

external open class BitmapText(text: String, style: `T$26`) : Container {
    open var dirty: Boolean
    open var roundPixels: Boolean
    open fun getLocalBounds(): Rectangle
    open var tint: Number
    open var align: String
    open var anchor: dynamic /* PIXI.Point | Number */
    open var font: Any
    open var text: String
    open var maxWidth: Number
    open var maxLineHeight: Number
    open var textWidth: Number
    open var letterSpacing: Number
    open var textHeight: Number
    override var children: Array<DisplayObject>
    override var sortableChildren: Boolean
    override var sortDirty: Boolean
    override fun onChildrenChange()
    override fun <TChildren : DisplayObject> addChild(vararg child: TChildren): Any
    override fun <T : DisplayObject> addChildAt(child: T, index: Number): T
    override fun swapChildren(child: DisplayObject, child2: DisplayObject)
    override fun getChildIndex(child: DisplayObject): Number
    override fun setChildIndex(child: DisplayObject, index: Number)
    override fun getChildAt(index: Number): DisplayObject
    override fun <TChildren : Array<DisplayObject>> removeChild(vararg child: TChildren): Any
    override fun removeChildAt(index: Number): DisplayObject
    override fun removeChildren(beginIndex: Number, endIndex: Number): Array<DisplayObject>
    override fun sortChildren()
    override fun calculateBounds()
    override fun _calculateBounds()
    override fun render(renderer: Renderer)
    override fun renderAdvanced(renderer: Renderer)
    override fun _render(renderer: Renderer)
    override fun destroy(options: `T$1`)
    override var width: Number
    override var height: Number
    override var interactiveChildren: Boolean
    override fun getChildByName(name: String): DisplayObject
    override var accessible: Boolean
    override var accessibleTitle: String
    override var accessibleHint: String
    override var _accessibleActive: Boolean
    override var _accessibleDiv: Boolean
    override var accessibleType: String
    override var accessiblePointerEvents: String
    override var accessibleChildren: Boolean
    override var transform: Transform
    override var alpha: Number
    override var visible: Boolean
    override var renderable: Boolean
    override var parent: Container
    override var worldAlpha: Number
    override var _lastSortedIndex: Number
    override var _zIndex: Number
    override var filterArea: Rectangle
    override var filters: Array<Filter>
    override var _bounds: Bounds
    override var _mask: dynamic /* PIXI.Graphics | PIXI.Sprite | Nothing? */
    override var _destroyed: Boolean
    override var isSprite: Boolean
    override var isMask: Boolean
    override var _tempDisplayObjectParent: DisplayObject
    override fun _recursivePostUpdateTransform()
    override fun getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle
    override fun toGlobal(position: IPoint, point: IPoint, skipUpdate: Boolean): IPoint
    override fun toLocal(position: IPoint, from: DisplayObject, point: IPoint, skipUpdate: Boolean): IPoint
    override fun setParent(container: Container): Container
    override fun setTransform(x: Number, y: Number, scaleX: Number, scaleY: Number, rotation: Number, skewX: Number, skewY: Number, pivotX: Number, pivotY: Number): DisplayObject
    override var x: Number
    override var y: Number
    override var worldTransform: Matrix
    override var localTransform: Matrix
    override var position: IPoint
    override var scale: IPoint
    override var pivot: IPoint
    override var skew: ObservablePoint
    override var rotation: Number
    override var angle: Number
    override var zIndex: Number
    override var worldVisible: Boolean
    override var mask: dynamic /* PIXI.Container | PIXI.MaskData */
    override fun displayObjectUpdateTransform()
    override var interactive: Boolean
    override var hitArea: IHitArea
    override var buttonMode: Boolean
    override var cursor: String
    override var cacheAsBitmap: Boolean
    override var name: String
    override fun getGlobalPosition(point: Point, skipUpdate: Boolean): Point

    companion object {
        fun registerFont(xml: XMLDocument, textures: `T$27`): Any
        fun registerFont(xml: XMLDocument, textures: Texture): Any
        fun registerFont(xml: XMLDocument, textures: Array<Texture>): Any
    }
}

external open class Ticker {
    open var autoStart: Boolean
    open var deltaTime: Number
    open var deltaMS: Number
    open var elapsedMS: Number
    open var lastTime: Number
    open var speed: Number
    open var started: Boolean
    open fun add(fn: (params: Array<Any>) -> Any, context: Any = definedExternally, priority: Number = definedExternally): Ticker
    open fun addOnce(fn: (params: Array<Any>) -> Any, context: Any = definedExternally, priority: Number = definedExternally): Ticker
    open fun remove(fn: (params: Array<Any>) -> Any, context: Any = definedExternally): Ticker
    open var count: Any
    open fun start()
    open fun stop()
    open fun destroy()
    open fun update(currentTime: Number = definedExternally)
    open var FPS: Number
    open var minFPS: Number
    open var maxFPS: Number

    companion object {
        var shared: Ticker
        var system: Ticker
    }
}

external open class TickerPlugin

external enum class UPDATE_PRIORITY {
    INTERACTION,
    HIGH,
    NORMAL,
    LOW,
    UTILITY
}

external var DATA_URI: dynamic /* RegExp | String */

external open class DisplayObject : EventEmitter {
    fun on(event: String /* "pointerdown" | "pointercancel" | "pointerup" | "pointertap" | "pointerupoutside" | "pointermove" | "pointerover" | "pointerout" | "touchstart" | "touchcancel" | "touchend" | "touchendoutside" | "touchmove" | "tap" | "rightdown" | "mousedown" | "rightup" | "mouseup" | "rightclick" | "click" | "rightupoutside" | "mouseupoutside" | "mousemove" | "mouseover" | "mouseout" | "added" | "removed" */, fn: (event: PIXI.interaction.InteractionEvent) -> Unit, context: Any): DisplayObject /* this */
    override fun on(event: String, fn: Function<*>, context: Any): DisplayObject /* this */
    override fun on(event: Any, fn: Function<*>, context: Any): DisplayObject /* this */
    fun once(event: String /* "pointerdown" | "pointercancel" | "pointerup" | "pointertap" | "pointerupoutside" | "pointermove" | "pointerover" | "pointerout" | "touchstart" | "touchcancel" | "touchend" | "touchendoutside" | "touchmove" | "tap" | "rightdown" | "mousedown" | "rightup" | "mouseup" | "rightclick" | "click" | "rightupoutside" | "mouseupoutside" | "mousemove" | "mouseover" | "mouseout" | "added" | "removed" */, fn: (event: PIXI.interaction.InteractionEvent) -> Unit, context: Any): DisplayObject /* this */
    override fun once(event: String, fn: Function<*>, context: Any): DisplayObject /* this */
    override fun once(event: Any, fn: Function<*>, context: Any): DisplayObject /* this */
    open fun removeListener(event: String /* "pointerdown" | "pointercancel" | "pointerup" | "pointertap" | "pointerupoutside" | "pointermove" | "pointerover" | "pointerout" | "touchstart" | "touchcancel" | "touchend" | "touchendoutside" | "touchmove" | "tap" | "rightdown" | "mousedown" | "rightup" | "mouseup" | "rightclick" | "click" | "rightupoutside" | "mouseupoutside" | "mousemove" | "mouseover" | "mouseout" | "added" | "removed" */, fn: (event: PIXI.interaction.InteractionEvent) -> Unit = definedExternally, context: Any = definedExternally): DisplayObject /* this */
    open fun removeListener(event: String, fn: Function<*> = definedExternally, context: Any = definedExternally): DisplayObject /* this */
    open fun removeListener(event: Any, fn: Function<*> = definedExternally, context: Any = definedExternally): DisplayObject /* this */
    override fun removeAllListeners(event: String): DisplayObject /* this */
    override fun removeAllListeners(event: Any): DisplayObject /* this */
    open fun off(event: String /* "pointerdown" | "pointercancel" | "pointerup" | "pointertap" | "pointerupoutside" | "pointermove" | "pointerover" | "pointerout" | "touchstart" | "touchcancel" | "touchend" | "touchendoutside" | "touchmove" | "tap" | "rightdown" | "mousedown" | "rightup" | "mouseup" | "rightclick" | "click" | "rightupoutside" | "mouseupoutside" | "mousemove" | "mouseover" | "mouseout" | "added" | "removed" */, fn: (event: PIXI.interaction.InteractionEvent) -> Unit = definedExternally, context: Any = definedExternally): DisplayObject /* this */
    open fun off(event: String, fn: Function<*> = definedExternally, context: Any = definedExternally): DisplayObject /* this */
    open fun off(event: Any, fn: Function<*> = definedExternally, context: Any = definedExternally): DisplayObject /* this */
    fun addListener(event: String /* "pointerdown" | "pointercancel" | "pointerup" | "pointertap" | "pointerupoutside" | "pointermove" | "pointerover" | "pointerout" | "touchstart" | "touchcancel" | "touchend" | "touchendoutside" | "touchmove" | "tap" | "rightdown" | "mousedown" | "rightup" | "mouseup" | "rightclick" | "click" | "rightupoutside" | "mouseupoutside" | "mousemove" | "mouseover" | "mouseout" | "added" | "removed" */, fn: (event: PIXI.interaction.InteractionEvent) -> Unit, context: Any): DisplayObject /* this */
    override fun addListener(event: String, fn: Function<*>, context: Any): DisplayObject /* this */
    override fun addListener(event: Any, fn: Function<*>, context: Any): DisplayObject /* this */
    override fun removeAllListeners(): DisplayObject /* this */
    open var accessible: Boolean
    open var accessibleTitle: String
    open var accessibleHint: String
    open var _accessibleActive: Boolean
    open var _accessibleDiv: Boolean
    open var accessibleType: String
    open var accessiblePointerEvents: String
    open var accessibleChildren: Boolean
    open var transform: Transform
    open var alpha: Number
    open var visible: Boolean
    open var renderable: Boolean
    open var parent: Container
    open var worldAlpha: Number
    open var _lastSortedIndex: Number
    open var _zIndex: Number
    open var filterArea: Rectangle
    open var filters: Array<Filter>
    open var _bounds: Bounds
    open var _mask: dynamic /* PIXI.Graphics | PIXI.Sprite | Nothing? */
    open var _destroyed: Boolean
    open var isSprite: Boolean
    open var isMask: Boolean
    open var _tempDisplayObjectParent: DisplayObject
    open fun updateTransform()
    open fun calculateBounds()
    open fun _recursivePostUpdateTransform()
    open fun getBounds(skipUpdate: Boolean = definedExternally, rect: Rectangle = definedExternally): Rectangle
    open fun getLocalBounds(rect: Rectangle = definedExternally): Rectangle
    open fun toGlobal(position: IPoint, point: IPoint = definedExternally, skipUpdate: Boolean = definedExternally): IPoint
    open fun toLocal(position: IPoint, from: DisplayObject = definedExternally, point: IPoint = definedExternally, skipUpdate: Boolean = definedExternally): IPoint
    open fun render(renderer: Renderer)
    open fun setParent(container: Container): Container
    open fun setTransform(x: Number = definedExternally, y: Number = definedExternally, scaleX: Number = definedExternally, scaleY: Number = definedExternally, rotation: Number = definedExternally, skewX: Number = definedExternally, skewY: Number = definedExternally, pivotX: Number = definedExternally, pivotY: Number = definedExternally): DisplayObject
    open fun destroy()
    open var x: Number
    open var y: Number
    open var worldTransform: Matrix
    open var localTransform: Matrix
    open var position: IPoint
    open var scale: IPoint
    open var pivot: IPoint
    open var skew: ObservablePoint
    open var rotation: Number
    open var angle: Number
    open var zIndex: Number
    open var worldVisible: Boolean
    open var mask: dynamic /* PIXI.Container | PIXI.MaskData */
    open fun displayObjectUpdateTransform()
    open var interactive: Boolean
    open var hitArea: IHitArea
    open var buttonMode: Boolean
    open var cursor: String
    open var cacheAsBitmap: Boolean
    open var name: String
    open fun getGlobalPosition(point: Point = definedExternally, skipUpdate: Boolean = definedExternally): Point

    companion object {
        fun mixin(source: Any)
    }
}


external interface IResourceDictionary {
    @nativeGetter
    operator fun get(index: String): LoaderResource?

    @nativeSetter
    operator fun set(index: String, value: LoaderResource)
}

external interface ITextureDictionary {
    @nativeGetter
    operator fun get(index: String): Texture?

    @nativeSetter
    operator fun set(index: String, value: Texture)
}

external interface `T$30` {
    var loadElement: dynamic /* HTMLImageElement | HTMLAudioElement | HTMLVideoElement */
        get() = definedExternally
        set(value) = definedExternally
    var skipSource: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mimeType: dynamic /* String | Array<String> */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ILoaderOptions {
    var crossOrigin: dynamic /* Boolean | String */
        get() = definedExternally
        set(value) = definedExternally
    var loadType: Number?
        get() = definedExternally
        set(value) = definedExternally
    var xhrType: String?
        get() = definedExternally
        set(value) = definedExternally
    var metadata: `T$30`?
        get() = definedExternally
        set(value) = definedExternally
}
