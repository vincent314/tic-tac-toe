@file:JsQualifier("PIXI.settings")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package PIXI.settings

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
import PIXI.MIPMAP_MODES
import PIXI.GC_MODES
import PIXI.WRAP_MODES
import PIXI.SCALE_MODES
import PIXI.PRECISION

external var PREFER_ENV: Number

external var STRICT_TEXTURE_CACHE: Boolean

external var SORTABLE_CHILDREN: Boolean

external var UPLOADS_PER_FRAME: Number

external var MIPMAP_TEXTURES: MIPMAP_MODES

external var ANISOTROPIC_LEVEL: Number

external var RESOLUTION: Number

external var FILTER_RESOLUTION: Number

external var SPRITE_MAX_TEXTURES: Number

external var SPRITE_BATCH_SIZE: Number

external object RENDER_OPTIONS {
    var view: HTMLCanvasElement
    var resolution: Number
    var antialias: Boolean
    var forceFXAA: Boolean
    var autoDensity: Boolean
    var transparent: Boolean
    var backgroundColor: Number
    var clearBeforeRender: Boolean
    var preserveDrawingBuffer: Boolean
    var width: Number
    var height: Number
    var legacy: Boolean
}

external var GC_MODE: GC_MODES

external var GC_MAX_IDLE: Number

external var GC_MAX_CHECK_COUNT: Number

external var WRAP_MODE: WRAP_MODES

external var SCALE_MODE: SCALE_MODES

external var PRECISION_VERTEX: PRECISION

external var PRECISION_FRAGMENT: PRECISION

external var CAN_UPLOAD_SAME_BUFFER: Boolean

external var CREATE_IMAGE_BITMAP: Boolean

external var ROUND_PIXELS: Boolean

external var TARGET_FPMS: Number

external var RETINA_PREFIX: RegExp

external var FAIL_IF_MAJOR_PERFORMANCE_CAVEAT: Boolean