@file:Suppress("SpellCheckingInspection")

/*
 * Copyright 2019 Louis Cognault Ayeva Derman. Use of this source code is governed by the Apache 2.0 license.
 */

listOf(
    ":activities",
    ":alertdialog",
    ":alertdialog-appcompat",
    ":alertdialog-appcompat-coroutines",
    ":appctx",
    ":arch-lifecycle",
    ":arch-room",
    ":bitflags",
    ":bundle",
    ":checkedlazy",
    ":collections",
    ":dimensions",
    ":exceptions",
    ":experimental",
    ":fragmentargs",
    ":fragments",
    ":initprovider",
    ":intents",
    ":lifecycle-coroutines",
    ":mainhandler",
    ":mainthread",
    ":material-colors",
    ":material-lists",
    ":permissions",
    ":preferences",
    ":resources",
    ":snackbar",
    ":stetho-init",
    ":systemservices",
    ":toast",
    ":typesaferecyclerview",
    ":views",
    ":views-coroutines",
    ":views-appcompat",
    ":views-cardview",
    ":views-dsl",
    ":views-dsl-appcompat",
    ":views-dsl-constraintlayout",
    ":views-dsl-coordinatorlayout",
    ":views-dsl-ide-preview",
    ":views-dsl-material",
    ":views-dsl-recyclerview",
    ":views-material",
    ":views-recyclerview",
    ":views-selectable",
    ":views-selectable-appcompat",
    ":views-selectable-constraintlayout"
).forEach { include(":modules$it") }
include(":sample")
include(":tests")
enableFeaturePreview("GRADLE_METADATA")
