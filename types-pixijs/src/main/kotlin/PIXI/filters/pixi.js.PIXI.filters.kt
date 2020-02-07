@file:JsQualifier("PIXI.filters")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package PIXI.filters

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
import PIXI.State
import PIXI.systems.FilterSystem
import PIXI.RenderTexture
import PIXI.Program
import PIXI.Filter
import PIXI.Point
import PIXI.Texture

external open class AlphaFilter(alpha: Number = definedExternally) : Filter {
    open var alpha: Number
    override var padding: Number
    override var resolution: Number
    override var enabled: Boolean
    override var autoFit: Boolean
    override var legacy: Boolean
    override var state: State
    override fun apply(filterManager: FilterSystem, input: RenderTexture, output: RenderTexture, clear: Boolean, currentState: Any)
    override var blendMode: Number
    override var program: Program
    override var uniforms: Any
}

external open class BlurFilter(strength: Number = definedExternally, quality: Number = definedExternally, resolution: Number = definedExternally, kernelSize: Number = definedExternally) : Filter {
    open fun apply(filterManager: FilterSystem, input: RenderTexture, output: RenderTexture)
    open var blur: Number
    open var quality: Number
    open var blurX: Number
    open var blurY: Number
    override var blendMode: Number
    open var repeatEdgePixels: Boolean
    override var padding: Number
    override var resolution: Number
    override var enabled: Boolean
    override var autoFit: Boolean
    override var legacy: Boolean
    override var state: State
    override var program: Program
    override var uniforms: Any
}

external open class BlurFilterPass(horizontal: Boolean, strength: Number, quality: Number, resolution: Number, kernelSize: Number = definedExternally) : Filter {
    open var blur: Number
    open var quality: Number
    override var padding: Number
    override var resolution: Number
    override var enabled: Boolean
    override var autoFit: Boolean
    override var legacy: Boolean
    override var state: State
    override fun apply(filterManager: FilterSystem, input: RenderTexture, output: RenderTexture, clear: Boolean, currentState: Any)
    override var blendMode: Number
    override var program: Program
    override var uniforms: Any
}

external open class ColorMatrixFilter : Filter {
    open fun _loadMatrix(matrix: Array<Number>, multiply: Boolean)
    open fun brightness(b: Number, multiply: Boolean)
    open fun greyscale(scale: Number, multiply: Boolean)
    open fun blackAndWhite(multiply: Boolean)
    open fun hue(rotation: Number, multiply: Boolean)
    open fun contrast(amount: Number, multiply: Boolean)
    open fun saturate(amount: Number, multiply: Boolean)
    open fun desaturate()
    open fun negative(multiply: Boolean)
    open fun sepia(multiply: Boolean)
    open fun technicolor(multiply: Boolean)
    open fun polaroid(multiply: Boolean)
    open fun toBGR(multiply: Boolean)
    open fun kodachrome(multiply: Boolean)
    open fun browni(multiply: Boolean)
    open fun vintage(multiply: Boolean)
    open fun colorTone(desaturation: Number, toned: Number, lightColor: String, darkColor: String, multiply: Boolean)
    open fun night(intensity: Number, multiply: Boolean)
    open fun predator(amount: Number, multiply: Boolean)
    open fun lsd(multiply: Boolean)
    open fun reset()
    open var matrix: Array<Number>
    open var alpha: Number
    override var padding: Number
    override var resolution: Number
    override var enabled: Boolean
    override var autoFit: Boolean
    override var legacy: Boolean
    override var state: State
    override fun apply(filterManager: FilterSystem, input: RenderTexture, output: RenderTexture, clear: Boolean, currentState: Any)
    override var blendMode: Number
    override var program: Program
    override var uniforms: Any
}

external open class DisplacementFilter(sprite: PIXI.Sprite, scale: Number = definedExternally) : Filter {
    open var scale: Point
    open fun apply(filterManager: FilterSystem, input: RenderTexture, output: RenderTexture, clear: Boolean)
    open var map: Texture
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

external open class FXAAFilter : Filter {
    override var padding: Number
    override var resolution: Number
    override var enabled: Boolean
    override var autoFit: Boolean
    override var legacy: Boolean
    override var state: State
    override fun apply(filterManager: FilterSystem, input: RenderTexture, output: RenderTexture, clear: Boolean, currentState: Any)
    override var blendMode: Number
    override var program: Program
    override var uniforms: Any
}

external open class NoiseFilter(noise: Number = definedExternally, seed: Number = definedExternally) : Filter {
    open var noise: Number
    open var seed: Number
    override var padding: Number
    override var resolution: Number
    override var enabled: Boolean
    override var autoFit: Boolean
    override var legacy: Boolean
    override var state: State
    override fun apply(filterManager: FilterSystem, input: RenderTexture, output: RenderTexture, clear: Boolean, currentState: Any)
    override var blendMode: Number
    override var program: Program
    override var uniforms: Any
}