@file:JsQualifier("PIXI.groupD8")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package PIXI.groupD8

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
import PIXI.GD8Symmetry
import PIXI.Matrix

external var E: GD8Symmetry

external var SE: GD8Symmetry

external var S: GD8Symmetry

external var SW: GD8Symmetry

external var W: GD8Symmetry

external var NW: GD8Symmetry

external var N: GD8Symmetry

external var NE: GD8Symmetry

external var MIRROR_VERTICAL: GD8Symmetry

external var MAIN_DIAGONAL: GD8Symmetry

external var MIRROR_HORIZONTAL: GD8Symmetry

external var REVERSE_DIAGONAL: GD8Symmetry

external fun uX(ind: GD8Symmetry): GD8Symmetry

external fun uY(ind: GD8Symmetry): GD8Symmetry

external fun vX(ind: GD8Symmetry): GD8Symmetry

external fun vY(ind: GD8Symmetry): GD8Symmetry

external fun inv(rotation: GD8Symmetry): GD8Symmetry

external fun add(rotationSecond: GD8Symmetry, rotationFirst: GD8Symmetry): GD8Symmetry

external fun sub(rotationSecond: GD8Symmetry, rotationFirst: GD8Symmetry): GD8Symmetry

external fun rotate180(rotation: Number): Number

external fun isVertical(rotation: GD8Symmetry): Boolean

external fun byDirection(dx: Number, dy: Number): GD8Symmetry

external fun matrixAppendRotationInv(matrix: Matrix, rotation: GD8Symmetry, tx: Number, ty: Number)