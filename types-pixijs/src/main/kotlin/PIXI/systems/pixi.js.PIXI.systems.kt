@file:JsQualifier("PIXI.systems")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package PIXI.systems

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
import PIXI.ObjectRenderer
import PIXI.BatchTextureArray
import PIXI.BaseTexture
import PIXI.Renderer
import PIXI.System
import PIXI.Quad
import PIXI.QuadUv
import PIXI.Rectangle
import PIXI.UniformGroup
import PIXI.DisplayObject
import PIXI.Filter
import PIXI.RenderTexture
import PIXI.Matrix
import PIXI.Sprite
import PIXI.Framebuffer
import PIXI.Buffer
import PIXI.Geometry
import PIXI.Shader
import PIXI.Program
import PIXI.MaskData
import PIXI.SpriteMaskFilter
import PIXI.Graphics
import PIXI.GLProgram
import PIXI.State
import PIXI.GC_MODES
import PIXI.Texture

external open class BatchSystem(renderer: PIXI.Renderer) : System {
    open var emptyRenderer: ObjectRenderer
    open var currentRenderer: ObjectRenderer
    open fun setObjectRenderer(objectRenderer: ObjectRenderer)
    open fun flush()
    open fun reset()
    open fun copyBoundTextures(arr: Any, maxTextures: Any)
    open fun boundArray(texArray: BatchTextureArray, boundTextures: Array<BaseTexture>, batchId: Number, maxTextures: Number)
    override var renderer: Renderer
    override fun destroy()
}

external interface `T$10` {
    var drawBuffers: Any
    var depthTexture: Any
    var floatTexture: Any
    var loseContext: Any
    var vertexArrayObject: Any
    var anisotropicFiltering: Any
}

external open class ContextSystem(renderer: PIXI.Renderer) : System {
    open var webGLVersion: Number
    open var extensions: `T$10`
    open var isLost: Boolean
    open fun contextChange(gl: WebGLRenderingContext)
    open fun initFromContext(gl: WebGLRenderingContext)
    open fun initFromOptions(options: Any)
    open fun createContext(canvas: HTMLCanvasElement, options: Any): WebGLRenderingContext
    open fun getExtensions()
    open fun handleContextLost(event: WebGLContextEvent)
    open fun handleContextRestored()
    open fun postrender()
    open fun validateContext(gl: WebGLRenderingContext)
    override var renderer: Renderer
    override fun destroy()
}

external open class FilterSystem(renderer: PIXI.Renderer) : System {
    open var defaultFilterStack: Array<Any>
    open var texturePool: Any
    open var statePool: Array<Any>
    open var quad: Quad
    open var quadUv: QuadUv
    open var tempRect: Rectangle
    open var activeState: Any
    open var globalUniforms: UniformGroup
    open fun push(target: DisplayObject, filters: Array<Filter>)
    open fun pop()
    open fun applyFilter(filter: Filter, input: RenderTexture, output: RenderTexture, clear: Boolean)
    open fun calculateSpriteMatrix(outputMatrix: Matrix, sprite: Sprite): Matrix
    override fun destroy()
    open fun getOptimalFilterTexture(minWidth: Number, minHeight: Number, resolution: Number = definedExternally): RenderTexture
    open fun getFilterTexture(input: RenderTexture = definedExternally, resolution: Number = definedExternally): RenderTexture
    open fun returnFilterTexture(renderTexture: RenderTexture)
    open fun emptyPool()
    open fun resize()
    override var renderer: Renderer
}

external open class FramebufferSystem(renderer: PIXI.Renderer) : System {
    open var managedFramebuffers: Array<Framebuffer>
    open var unknownFramebuffer: Any
    open fun contextChange()
    open fun bind(framebuffer: Framebuffer, frame: Rectangle = definedExternally)
    open fun setViewport(x: Number, y: Number, width: Number, height: Number)
    open var size: Any
    open fun clear(r: Number, g: Number, b: Number, a: Number)
    open fun initFramebuffer(framebuffer: Framebuffer)
    open fun resizeFramebuffer(framebuffer: Framebuffer)
    open fun updateFramebuffer(framebuffer: Framebuffer)
    open fun disposeFramebuffer(framebuffer: Framebuffer, contextLost: Boolean = definedExternally)
    open fun disposeAll(contextLost: Boolean = definedExternally)
    open fun reset()
    override var renderer: Renderer
    override fun destroy()
}

external interface `T$11` {
    @nativeGetter
    operator fun get(key: Number): Buffer?
    @nativeSetter
    operator fun set(key: Number, value: Buffer)
}

external open class GeometrySystem(renderer: PIXI.Renderer) : System {
    open var hasVao: Boolean
    open var hasInstance: Boolean
    open var canUseUInt32ElementIndex: Boolean
    open var boundBuffers: `T$11`
    open var managedGeometries: Any
    open var managedBuffers: Any
    open fun contextChange()
    open fun bind(geometry: Geometry, shader: Shader = definedExternally)
    open fun reset()
    open fun updateBuffers()
    open fun checkCompatibility(geometry: Geometry, program: Program)
    open fun getSignature(geometry: Geometry, program: Program): String
    open fun initGeometryVao(geometry: Geometry, program: Program)
    open fun disposeBuffer(buffer: Buffer, contextLost: Boolean = definedExternally)
    open fun disposeGeometry(geometry: Geometry, contextLost: Boolean = definedExternally)
    open fun disposeAll(contextLost: Boolean = definedExternally)
    open fun activateVao(geometry: Geometry, program: Program)
    open fun draw(type: Number, size: Number = definedExternally, start: Number = definedExternally, instanceCount: Number = definedExternally)
    open fun unbind()
    override var renderer: Renderer
    override fun destroy()
}

external open class AbstractMaskSystem(renderer: PIXI.Renderer) : System {
    open var maskStack: Array<MaskData>
    open fun getStackLength(): Number
    open fun setMaskStack(maskStack: Array<MaskData>)
    override fun destroy()
    override var renderer: Renderer
}

external open class MaskSystem(renderer: PIXI.Renderer) : System {
    open var scissorRenderTarget: DisplayObject
    open var enableScissor: Boolean
    open var alphaMaskPool: Array<SpriteMaskFilter>
    open var maskDataPool: Array<MaskData>
    open var alphaMaskIndex: Number
    open fun setMaskStack(maskStack: Array<MaskData>)
    open fun push(target: DisplayObject, maskData: MaskData)
    open fun push(target: DisplayObject, maskData: Sprite)
    open fun push(target: DisplayObject, maskData: Graphics)
    open fun push(target: DisplayObject, maskData: DisplayObject)
    open fun pop(target: DisplayObject)
    open fun detect(maskData: MaskData)
    open fun pushSpriteMask(maskData: MaskData)
    open fun popSpriteMask()
    override var renderer: Renderer
    override fun destroy()
}

external open class ScissorSystem(renderer: PIXI.Renderer) : System {
    open fun push(maskData: MaskData)
    open fun pop()
    override var renderer: Renderer
    override fun destroy()
}

external open class StencilSystem(renderer: PIXI.Renderer) : System {
    open fun push(maskData: MaskData)
    open fun pop(maskObject: DisplayObject)
    override var renderer: Renderer
    override fun destroy()
}

external open class ProjectionSystem(renderer: PIXI.Renderer) : System {
    open var destinationFrame: Rectangle
    open var sourceFrame: Rectangle
    open var defaultFrame: Rectangle
    open var projectionMatrix: Matrix
    open var transform: Matrix
    open fun update(destinationFrame: Rectangle, sourceFrame: Rectangle, resolution: Number, root: Boolean)
    open fun calculateProjection(destinationFrame: Rectangle, sourceFrame: Rectangle, resolution: Number, root: Boolean)
    open fun setTransform(matrix: Matrix)
    override var renderer: Renderer
    override fun destroy()
}

external open class RenderTextureSystem(renderer: PIXI.Renderer) : System {
    open var clearColor: Array<Number>
    open var defaultMaskStack: Array<Graphics>
    open var current: RenderTexture
    open var sourceFrame: Rectangle
    open var destinationFrame: Rectangle
    open fun bind(renderTexture: RenderTexture = definedExternally, sourceFrame: Rectangle = definedExternally, destinationFrame: Rectangle = definedExternally)
    open fun clear(clearColor: Array<Number> = definedExternally): Renderer
    open fun reset()
    override var renderer: Renderer
    override fun destroy()
}

external open class ShaderSystem(renderer: PIXI.Renderer) : System {
    open var gl: WebGLRenderingContext
    open fun bind(shader: Shader, dontSync: Boolean): GLProgram
    open fun setUniforms(uniforms: Any)
    open fun syncUniformGroup(group: Any, syncData: Any)
    open fun getglProgram(): GLProgram
    open fun reset()
    override fun destroy()
    override var renderer: Renderer
}

external open class StateSystem(renderer: PIXI.Renderer) : System {
    open var gl: WebGLRenderingContext
    open var stateId: Number
    open var polygonOffset: Number
    open var blendMode: Number
    open var _blendEq: Boolean
    open var map: Array<(params: Any) -> Any>
    open var checks: Array<(params: Any) -> Any>
    open var defaultState: State
    open fun set(state: Any)
    open fun forceState(state: Any)
    open fun setBlend(value: Boolean)
    open fun setOffset(value: Boolean)
    open fun setDepthTest(value: Boolean)
    open fun setCullFace(value: Boolean)
    open fun setFrontFace(value: Boolean)
    open fun setBlendMode(value: Number)
    open fun setPolygonOffset(value: Number, scale: Number)
    open fun reset()
    open fun updateCheck(func: (params: Array<Any>) -> Any, value: Boolean)
    override var renderer: Renderer
    override fun destroy()
}

external open class TextureGCSystem(renderer: PIXI.Renderer) : System {
    open var count: Number
    open var checkCount: Number
    open var maxIdle: Number
    open var checkCountMax: Number
    open var mode: GC_MODES
    open fun postrender()
    open fun run()
    open fun unload(displayObject: DisplayObject)
    override var renderer: Renderer
    override fun destroy()
}

external open class TextureSystem(renderer: PIXI.Renderer) : System {
    open var boundTextures: Array<BaseTexture>
    open var currentLocation: Number
    open var managedTextures: Array<BaseTexture>
    open var unknownTexture: BaseTexture
    open fun contextChange()
    open fun bind(texture: Texture, location: Number = definedExternally)
    open fun bind(texture: BaseTexture, location: Number = definedExternally)
    open fun reset()
    open fun unbind(texture: Texture)
    open fun unbind(texture: BaseTexture)
    override var renderer: Renderer
    override fun destroy()
}